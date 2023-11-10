package uniconteam.magicworld.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

import kotlin.jvm.Throws;
import uniconteam.magicworld.R;
import uniconteam.magicworld.component.Houses;
import uniconteam.magicworld.component.Inventory;
import uniconteam.magicworld.component.Tutorial;
import uniconteam.magicworld.databinding.HomeBinding;
import uniconteam.magicworld.dialog.HouseMenu;
import uniconteam.magicworld.dialog.ShopMenu;
import uniconteam.magicworld.dialog.UpgradeMenu;
import uniconteam.magicworld.engine.MwConsortium;

public class HomeActivity extends AppCompatActivity {
    public static TimerTask timerTask;
    public static Timer _timerTask = new Timer();
    public static String itemSelected;
    public static int tutorialLevel;
    
    public ObjectAnimator[] objectX = new ObjectAnimator[28];
    public ObjectAnimator[] objectY = new ObjectAnimator[28];
    
    public static int jewelryBoxCoinData;
    public static int jewelryBoxLevelData;
    public static int gemBoxData;
    
    public static HomeBinding binding;
    
    // Data of inventory cells
    public static String itemTab1d;
    public static String itemTab2d;
    public static String itemTab3d;
    
    // Data for 20 blocks
    public static String[] blocksTab = new String[27];
    
    public static int coinHouseLevel;
    public static int gardenHouseLevel;
    public static int workshopLevel;
    
    HouseMenu houseMenu = new HouseMenu(); // MwHouseMenu - menu for houses
    public UpgradeMenu upgMenu = new UpgradeMenu();
    ShopMenu shopMenu = new ShopMenu();
    Houses houses = new Houses();
    Inventory inventory = new Inventory();
    Tutorial tutorial = new Tutorial();
    
    MwConsortium mwc = new MwConsortium();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = HomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize(savedInstanceState);

        for(int i = 0; i < 28; i++){
            objectX[i] = new ObjectAnimator();
            objectY[i] = new ObjectAnimator();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences playData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        
        // Getting data of inventory from SharedPreferences
        itemTab1d = playData.getString("itemTab1d", "");
        itemTab2d = playData.getString("itemTab2d", "");
        itemTab3d = playData.getString("itemTab3d", ""); 
        
        // Getting data of coins, levels, cups
        jewelryBoxCoinData = playData.getInt("magicCoin", 0);
        jewelryBoxLevelData = playData.getInt("magicLevel", 0);
        gemBoxData = playData.getInt("magicGem", 0);
        
        // Getting data of level houses
        coinHouseLevel = playData.getInt("coinHouseLevel", 0);
        gardenHouseLevel = playData.getInt("gardenHouseLevel", 0);
        workshopLevel = playData.getInt("workshopLevel", 0);

        // Inventory display
        inventory.dataInventory();
        
        binding.mwJewelryBoxCoinCount.setText(Integer.toString(jewelryBoxCoinData));
        binding.mwJewelryBoxLevelCount.setText(Integer.toString(jewelryBoxLevelData));
        binding.mwGemBoxCount.setText(Integer.toString(gemBoxData));

        timerTask =
                new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(
                                () -> {
                                    binding.mwJewelryBoxCoinCount.setText(
                                            Integer.toString(jewelryBoxCoinData));
                                    binding.mwJewelryBoxLevelCount.setText(
                                            Integer.toString(jewelryBoxLevelData));
                                    binding.mwGemBoxCount.setText(Integer.toString(gemBoxData));
                                });
                    }
                };
        _timerTask.scheduleAtFixedRate(timerTask, 250, 250);

        // Getting data of blocks from SharedPreferences
        for (int i = 1; i <= 20; i++) {
            String blocks = "blockTab" + i + "d";
            blocksTab[i] = playData.getString(blocks, "");
        }
        
        // Which cell of inventory selected
        itemSelected = playData.getString("itemSelected", "");
        switch(itemSelected) {
            case "1":
                binding.mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                binding.mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                binding.mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                break;
            case "2":
                binding.mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                binding.mwItemTab2.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                binding.mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                break;
            case "3":
                binding.mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                binding.mwItemTab3.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                binding.mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                break;
        }
        
        // Tutorial of MW
        tutorialLevel = playData.getInt("tutorialLevel", 0);
        if (tutorialLevel == 0) {
            tutorialLevel = 1;
            tutorial.tutorialData();
        } else {
            tutorial.tutorialData();
        }
        // Setup all houses
        houses.dataHouses();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Save data
        SharedPreferences playData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor editData = playData.edit();
        editData.putString("itemSelected", itemSelected);
        if(itemTab1d.isEmpty()){
            editData.putString("itemTab1d", itemTab1d);
        }
        if(itemTab2d.isEmpty()){
            editData.putString("itemTab2d", itemTab2d);
        }
        if(itemTab3d.isEmpty()){
            editData.putString("itemTab3d", itemTab3d);
        }
        for (int i = 1; i <= 20; i++) {
            String blocks = "blockTab" + i + "d";
            editData.putString(blocks, blocksTab[i]);
        }
        editData.putInt("magicCoin", jewelryBoxCoinData);
        editData.putInt("magicLevel", jewelryBoxLevelData);
        editData.putInt("magicCup", gemBoxData);
        editData.putInt("coinHouseLevel", coinHouseLevel);
        editData.putInt("gardenHouseLevel", gardenHouseLevel);
        editData.putInt("workshopLevel", workshopLevel);
        editData.apply();
    }

    void setUpHouse(int block) {

        if (itemSelected.equals("1") && (itemTab1d.endsWith("House") || itemTab1d.equals("Workshop") || itemTab1d.equals("Mine"))) {
            blocksTab[block] = itemTab1d;
            itemTab1d = "";
        } else {
            if (itemSelected.equals("2") && (itemTab2d.endsWith("House") || itemTab2d.equals("Workshop") || itemTab2d.equals("Mine"))) {
                blocksTab[block] = itemTab2d;
                itemTab2d = "";
            } else {
                if (itemSelected.equals("3") && (itemTab3d.endsWith("House") || itemTab3d.equals("Workshop") || itemTab3d.equals("Mine"))) {
                    blocksTab[block] = itemTab3d;
                    itemTab3d = "";
                }
            }
        }
        inventory.dataInventory();
        houses.dataHouses();
    }

    public void initialize(Bundle savedInstanceState) {
        
        MenuActivity.mwActivity = "mwHome";

        // Transporant navbar
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, 
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        
        // Shadows
        if (Build.VERSION.SDK_INT >= 21) {
            binding.mwCloseBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            binding.mwJewelryBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            binding.mwTutorialBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            binding.mwGemBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            binding.mwItemBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            binding.mwItemTab1.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            binding.mwItemTab2.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            binding.mwItemTab3.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            binding.mwShopTab.setElevation(8f);
        }

        // Fonts
        binding.mwJewelryBoxCoinCount.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        binding.mwJewelryBoxLevelCount.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        binding.mwGemBoxCount.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        binding.mwTutorialBoxText.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);

        // Onclick  functions
        binding.mwCloseBoxLinear.setOnClickListener(view -> finish());

        binding.mwJewelryBoxLinear.setOnClickListener(
                view -> mwc.mwClick(binding.mwJewelryBoxLinear, objectX[1], objectY[1], 1.1f, 0.9f, 1.0f, _timerTask, timerTask));
        binding.mwGemBoxLinear.setOnClickListener(
                view -> mwc.mwClick(binding.mwGemBoxLinear, objectX[2], objectY[2], 1.1f, 0.9f, 1.0f, _timerTask, timerTask));
        binding.mwTutorialBoxLinear.setOnClickListener(
                view -> {
                    tutorialLevel += 1;
                    tutorial.tutorialData();
                    mwc.mwClick(binding.mwTutorialBoxLinear, objectX[3], objectY[3], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                });
        
        // Blocks
        binding.mwBlockTab1.setOnClickListener(
            view -> {
                        mwc.mwClick(binding.mwBlockTab1, objectX[4], objectY[4], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[1] != "") {
                            houseMenu.showDialog(HomeActivity.this, blocksTab[1]);
                        }
                        setUpHouse(1);
            });
        binding.mwBlockTab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(view, objectX[5], objectY[5], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[2] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[2]);
                        }
                        setUpHouse(2);
                    }
                });
        binding.mwBlockTab3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab3, objectX[6], objectY[6], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[3] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[3]);
                        }
                        setUpHouse(3);
                    }
                });
        binding.mwBlockTab4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab4, objectX[7], objectY[7], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[4] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[4]);
                        }
                        setUpHouse(4);
                    }
                });
        binding.mwBlockTab5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab5, objectX[8], objectY[8], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[5] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[5]);
                        }
                        setUpHouse(5);
                    }
                });
        binding.mwBlockTab6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab6, objectX[9], objectY[9], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[6] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[6]);
                        }
                        setUpHouse(6);
                    }
                });
        binding.mwBlockTab7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab7, objectX[10], objectY[10], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[7] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[7]);
                        }
                        setUpHouse(7);
                    }
                });
        binding.mwBlockTab8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab8, objectX[11], objectY[11], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[8] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[8]);
                        }
                        setUpHouse(8);
                    }
                });
        binding.mwBlockTab9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab9, objectX[12], objectY[12], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[9] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[9]);
                        }
                        setUpHouse(9);
                    }
                });
        binding.mwBlockTab10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab10, objectX[13], objectY[13], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[10] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[10]);
                        }
                        setUpHouse(10);
                    }
                });
        binding.mwBlockTab11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab11, objectX[14], objectY[14], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[11] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[11]);
                        }
                        setUpHouse(11);
                    }
                });
        binding.mwBlockTab12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab12, objectX[15], objectY[15], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[12] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[12]);
                        }
                        setUpHouse(12);
                    }
                });
        binding.mwBlockTab13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab13, objectX[16], objectY[16], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[13] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[13]);
                        }
                        setUpHouse(13);
                    }
                });
        binding.mwBlockTab14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab14, objectX[17], objectY[17], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[14] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[14]);
                        }
                        setUpHouse(14);
                    }
                });
        binding.mwBlockTab15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab15, objectX[18], objectY[18], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[15] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[15]);
                        }
                        setUpHouse(15);
                    }
                });
        binding.mwBlockTab16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab16, objectX[19], objectY[19], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[16] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[16]);
                        }
                        setUpHouse(16);
                    }
                });
        binding.mwBlockTab17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab17, objectX[20], objectY[20], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[17] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[17]);
                        }
                        setUpHouse(17);
                    }
                });
        binding.mwBlockTab18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab18, objectX[21], objectY[21], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[18] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[18]);
                        }
                        setUpHouse(18);
                    }
                });
        binding.mwBlockTab19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab19, objectX[22], objectY[22], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[19] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[19]);
                        }
                        setUpHouse(19);
                    }
                });
        binding.mwBlockTab20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwc.mwClick(binding.mwBlockTab20, objectX[23], objectY[23], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                        if (blocksTab[20] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[20]);
                        }
                        setUpHouse(20);
                    }
                });
        // Shop
        binding.mwShopTab.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    mwc.mwClick(binding.mwShopTab, objectX[24], objectY[24], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                    shopMenu.showShopMenu(HomeActivity.this, jewelryBoxCoinData, jewelryBoxLevelData);
                }
            }
        );
        // Items
        binding.mwItemTab1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        binding.mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                        binding.mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        binding.mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                        itemSelected = "1";
                        mwc.mwClick(binding.mwItemTab1, objectX[25], objectY[25], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                    }
                });
        binding.mwItemTab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        binding.mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                        binding.mwItemTab2.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        binding.mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                        itemSelected = "2";
                        mwc.mwClick(binding.mwItemTab2, objectX[26], objectY[26], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                    }
                });
        binding.mwItemTab3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        binding.mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                        binding.mwItemTab3.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        binding.mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                        itemSelected = "3";
                        mwc.mwClick(binding.mwItemTab3, objectX[27], objectY[27], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                    }
                });
    }
}