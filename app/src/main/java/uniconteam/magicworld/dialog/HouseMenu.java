package uniconteam.magicworld;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import uniconteam.magicworld.HomeActivity;

public class HouseMenu {
    
    LinearLayout houseTab1;
    LinearLayout houseTab2;
    LinearLayout houseTab3;
    HorizontalScrollView scrollTabs;
    ImageView closeIcon;
    ImageView houseIcon1;
    ImageView houseIcon2;
    ImageView houseIcon3;
    public TextView menuHint;
    public TextView houseLevel;
    TextView houseFunc1;
    
    int clickCount = 0;
        
    public void showDialog(Activity activity, String msg){
        
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.housemenu);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        TextView text = (TextView) dialog.findViewById(R.id.mwHouseId);
        text.setText(msg);

        dialog.show();
        
        houseTab1 = dialog.findViewById(R.id.mwHouseTab1);
        houseTab2 = dialog.findViewById(R.id.mwHouseTab2);
        houseTab3 = dialog.findViewById(R.id.mwHouseTab3);
        closeIcon = dialog.findViewById(R.id.mwCloseIcon);
        scrollTabs = dialog.findViewById(R.id.mwScrollTabs);
        menuHint = dialog.findViewById(R.id.mwMenuHint);
        houseLevel = dialog.findViewById(R.id.mwHouseLevel);
        houseIcon1 = dialog.findViewById(R.id.mwHouseIcon1);
        houseIcon2 = dialog.findViewById(R.id.mwHouseIcon2);
        houseIcon3 = dialog.findViewById(R.id.mwHouseIcon3);
        houseFunc1 = dialog.findViewById(R.id.mwHouseFunc1);
        
        if(Build.VERSION.SDK_INT >= 21) { houseTab1.setElevation(8f); }
        if(Build.VERSION.SDK_INT >= 21) { houseTab2.setElevation(8f); }
        if(Build.VERSION.SDK_INT >= 21) { houseTab3.setElevation(8f); }
        scrollTabs.setHorizontalScrollBarEnabled(false);
        
        ObjectAnimator houseTab1objX = new ObjectAnimator();
        ObjectAnimator houseTab1objY = new ObjectAnimator();
        ObjectAnimator houseTab2objX = new ObjectAnimator();
        ObjectAnimator houseTab2objY = new ObjectAnimator();
        
        Houses houses = new Houses();
        Inventory inventory = new Inventory();
        HomeActivity home = new HomeActivity();
        
        String houseLevelText = "LvL " + HomeActivity.coinHouseLevel;
        houseLevel.setText(houseLevelText);
        
        // Functions of houses
        if(msg.equals("CoinHouse")){
            houseIcon1.setImageResource(R.drawable.magicworld_opt_coinhouse_getcoin);
            houseIcon2.setImageResource(R.drawable.magicworld_opt_coinhouse_getupgrade);
            houseIcon3.setImageResource(R.drawable.magicworld_opt_coinhouse_getdestroy);
            houseFunc1.setText("Get coins");
        }
        if(msg.equals("GardenHouse")){
            houseIcon1.setImageResource(R.drawable.magicworld_opt_garden_getfunction);
            houseIcon2.setImageResource(R.drawable.magicworld_opt_garden_getupgrade);
            houseIcon3.setImageResource(R.drawable.magicworld_opt_garden_getdestroy);
            houseFunc1.setText("Come in");
        }
        if(msg.equals("Workshop")){
            houseIcon1.setImageResource(R.drawable.magicworld_opt_workshop_getfunction);
            houseIcon2.setImageResource(R.drawable.magicworld_opt_workshop_getupgrade);
            houseIcon3.setImageResource(R.drawable.magicworld_opt_workshop_getdestroy);
            houseFunc1.setText("New Work");
        }
        if(msg.equals("Mine")){
            houseIcon1.setImageResource(R.drawable.magicworld_opt_mine_getfunction);
            houseIcon2.setImageResource(R.drawable.magicworld_opt_mine_getupgrade);
            houseIcon3.setImageResource(R.drawable.magicworld_opt_mine_getdestroy);
            houseFunc1.setText("Let's go");
        }
        
        closeIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
            }
        });
        houseTab1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       // mwConsortium.mwThreads(
                           //     houseTab1, houseTab1objX, houseTab1objY, 1.1f, 0.9f, 1.0f);
                    //    mwConsortium.mwClick();
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
                    }
                });
        houseTab2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // mwConsortium.mwThreads(houseTab2, houseTab2objX, houseTab2objY, 1.1f, 0.9f, 1.0f);
                // mwConsortium.mwClick();
                    
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
            }    
        });
        houseTab3.setOnClickListener(new View.OnClickListener(){
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