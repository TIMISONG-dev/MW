package timisongdev.magicworld.dialog;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;
import timisongdev.magicworld.R;
import timisongdev.magicworld.activity.HomeActivity;
import timisongdev.magicworld.component.Houses;
import timisongdev.magicworld.component.Inventory;
import timisongdev.magicworld.databinding.HousemenuBinding;
import timisongdev.magicworld.engine.MwConsortium;

public class HouseMenu {
    
    public TextView menuHint;
    public TextView houseLevel;
    
    int clickCount = 0;
    
    HousemenuBinding binding;
    MwConsortium mwc = new MwConsortium();
    
    TimerTask timerTask;
    Timer _timerTask = new Timer();
    
    ObjectAnimator[] objX = new ObjectAnimator[3];
    ObjectAnimator[] objY = new ObjectAnimator[3];
        
    public void showDialog(Activity activity, String msg){
        
        for(int i = 0; i < 3; i++){
            objX[i] = new ObjectAnimator();
            objY[i] = new ObjectAnimator();
        }
        
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        binding = HousemenuBinding.inflate(dialog.getLayoutInflater());
        dialog.setContentView(binding.getRoot());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        TextView text = (TextView) dialog.findViewById(R.id.mwHouseId);
        text.setText(msg);

        dialog.show();

        binding.mwHouseTab1.setElevation(8f);
        binding.mwHouseTab2.setElevation(8f);
        binding.mwHouseTab3.setElevation(8f);
        binding.mwScrollTabs.setHorizontalScrollBarEnabled(false);
        
        Houses houses = new Houses();
        Inventory inventory = new Inventory();
        HomeActivity home = new HomeActivity();
        
        String houseLevelText = "LvL " + HomeActivity.coinHouseLevel;
        binding.mwHouseLevel.setText(houseLevelText);
        
        // Functions of houses
        if(msg.equals("CoinHouse")){
            binding.mwHouseIcon1.setImageResource(R.drawable.magicworld_opt_coinhouse_getcoin);
            binding.mwHouseIcon2.setImageResource(R.drawable.magicworld_opt_coinhouse_getupgrade);
            binding.mwHouseIcon3.setImageResource(R.drawable.magicworld_opt_coinhouse_getdestroy);
            binding.mwHouseFunc1.setText("Get coins");
        }
        if(msg.equals("GardenHouse")){
            binding.mwHouseIcon1.setImageResource(R.drawable.magicworld_opt_garden_getfunction);
            binding.mwHouseIcon2.setImageResource(R.drawable.magicworld_opt_garden_getupgrade);
            binding.mwHouseIcon3.setImageResource(R.drawable.magicworld_opt_garden_getdestroy);
            binding.mwHouseFunc1.setText("Come in");
        }
        if(msg.equals("Workshop")){
            binding.mwHouseIcon1.setImageResource(R.drawable.magicworld_opt_workshop_getfunction);
            binding.mwHouseIcon2.setImageResource(R.drawable.magicworld_opt_workshop_getupgrade);
            binding.mwHouseIcon3.setImageResource(R.drawable.magicworld_opt_workshop_getdestroy);
            binding.mwHouseFunc1.setText("New Work");
        }
        if(msg.equals("Mine")){
            binding.mwHouseIcon1.setImageResource(R.drawable.magicworld_opt_mine_getfunction);
            binding.mwHouseIcon2.setImageResource(R.drawable.magicworld_opt_mine_getupgrade);
            binding.mwHouseIcon3.setImageResource(R.drawable.magicworld_opt_mine_getdestroy);
            binding.mwHouseFunc1.setText("Let's go");
        }
        
        binding.mwCloseIcon.setOnClickListener(view -> dialog.dismiss());
        binding.mwHouseTab1.setOnClickListener(view -> {
                     mwc.mwClick(binding.mwHouseTab1, objX[1], objY[1], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                    // ClickEngine (beta) for 1 level of coinhouse
                    if (HomeActivity.coinHouseLevel == 1) {
                        if (clickCount <= 14) {
                            HomeActivity.jewelryBoxCoinData++;
                        } else {
                            if (clickCount <= 20) {
                                HomeActivity.jewelryBoxCoinData =
                                        HomeActivity.jewelryBoxCoinData + 12;
                            } else {
                                clickCount = 0;
                            }
                        }
                    }
                    clickCount++;
                });
        binding.mwHouseTab2.setOnClickListener(view -> {
                mwc.mwClick(binding.mwHouseTab2, objX[2], objY[2], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);

                for(int i = 1; i <= 20; i++){
                    if(HomeActivity.blocksTab[i].equals("Workshop")){
                        if(i == 20){
                            home.upgMenu.showUpgradeMenu(activity);
                        }
                    } else {
                        if(i == 20){
                            Toast toast = Toast.makeText(activity, "you haven't workshop", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                }
        });
        binding.mwHouseTab3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                for(int i = 1; i <= 20; i++){
                    if(HomeActivity.blocksTab[i].equals("CoinHouse")){
                        if(HomeActivity.itemSelected.equals("1") && HomeActivity.itemTab1d == ""){
                            HomeActivity.itemTab1d = HomeActivity.blocksTab[i];
                        } else {
                            if(HomeActivity.itemSelected.equals("2") && HomeActivity.itemTab2d == ""){
                                HomeActivity.itemTab2d = HomeActivity.blocksTab[i];
                            } else {
                                if(HomeActivity.itemSelected.equals("3") && HomeActivity.itemTab3d == ""){
                                    HomeActivity.itemTab3d = HomeActivity.blocksTab[i];
                                } else {
                                    HomeActivity.itemTab1d = HomeActivity.blocksTab[i];
                                }
                            }
                        }   
                        HomeActivity.blocksTab[i] = "";
                        inventory.dataInventory();   
                        dialog.dismiss();
                        houses.dataHouses();             
                        break;
                    }
                }
            }
        });
    }
}