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
import uniconteam.magicworld.engine.MwConsortium2;

public class HomeActivity extends AppCompatActivity {
    public static TimerTask timerTask;
    public static Timer _timerTask = new Timer();
    public static String itemSelected;
    public static int tutorialLevel;
    
    public ObjectAnimator[] objectX = new ObjectAnimator[12];
    public ObjectAnimator[] objectY = new ObjectAnimator[12];
    
    public static int jewelryBoxCoinData;
    public static int jewelryBoxLevelData;
    public static int gemBoxData;
    
    public static HomeBinding binding;
    
    // Data of inventory cells
    public static String itemTab1d;
    public static String itemTab2d;
    public static String itemTab3d;
    
    // Data for 20 blocks
    public static String[] blocksTab = new String[21];
    
    public static int coinHouseLevel;
    public static int gardenHouseLevel;
    public static int workshopLevel;
    
    HouseMenu houseMenu = new HouseMenu(); // MwHouseMenu - menu for houses
    public UpgradeMenu upgMenu = new UpgradeMenu();
    ShopMenu shopMenu = new ShopMenu();
    Houses houses = new Houses();
    Inventory inventory = new Inventory();
    Tutorial tutorial = new Tutorial();
    
    MwConsortium2 m2 = new MwConsortium2();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = HomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialize(savedInstanceState);

        // Fix the object animators
        for(int i = 0; i < 12; i++){
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
            default:
                itemSelected = "1";
            case "1":
                binding.mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                binding.mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
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
                view -> m2.mwClick(binding.mwJewelryBoxLinear, objectX[1], objectY[1], 1.1f, 0.9f, 1.0f, _timerTask, timerTask));
        binding.mwGemBoxLinear.setOnClickListener(
                viww -> m2.mwClick(binding.mwGemBoxLinear, objectX[2], objectY[2], 1.1f, 0.9f, 1.0f, _timerTask, timerTask));
        binding.mwTutorialBoxLinear.setOnClickListener(
                view -> {
                    tutorialLevel += 1;
                    tutorial.tutorialData();
                    m2.mwClick(binding.mwTutorialBoxLinear, objectX[3], objectY[3], 1.1f, 0.9f, 1.0f, _timerTask, timerTask);
                });
        /*
        // Blocks
        blockTab1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab1, block1objX, block1objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[1] != "") {
                            houseMenu.showDialog(HomeActivity.this, blocksTab[1]);
                        }
                        setUpHouse(1);
                    }
                });
        blockTab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab2, block2objX, block2objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[2] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[2]);
                        }
                        setUpHouse(2);
                    }
                });
        blockTab3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab3, block3objX, block3objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[3] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[3]);
                        }
                        setUpHouse(3);
                    }
                });
        blockTab4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab4, block4objX, block4objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[4] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[4]);
                        }
                        setUpHouse(4);
                    }
                });
        blockTab5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab5, block5objX, block5objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[5] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[5]);
                        }
                        setUpHouse(5);
                    }
                });
        blockTab6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab6, block6objX, block6objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[6] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[6]);
                        }
                        setUpHouse(6);
                    }
                });
        blockTab7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab7, block7objX, block7objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[7] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[7]);
                        }
                        setUpHouse(7);
                    }
                });
        blockTab8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab8, block8objX, block8objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[8] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[8]);
                        }
                        setUpHouse(8);
                    }
                });
        blockTab9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab9, block9objX, block9objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[9] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[9]);
                        }
                        setUpHouse(9);
                    }
                });
        blockTab10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab10, block10objX, block10objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[10] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[10]);
                        }
                        setUpHouse(10);
                    }
                });
        blockTab11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab11, block11objX, block11objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[11] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[11]);
                        }
                        setUpHouse(11);
                    }
                });
        blockTab12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab12, block12objX, block12objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[12] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[12]);
                        }
                        setUpHouse(12);
                    }
                });
        blockTab13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab13, block13objX, block13objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[13] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[13]);
                        }
                        setUpHouse(13);
                    }
                });
        blockTab14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab14, block14objX, block14objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[14] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[14]);
                        }
                        setUpHouse(14);
                    }
                });
        blockTab15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab15, block15objX, block15objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[15] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[15]);
                        }
                        setUpHouse(15);
                    }
                });
        blockTab16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab16, block16objX, block16objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[16] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[16]);
                        }
                        setUpHouse(16);
                    }
                });
        blockTab17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab17, block17objX, block17objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[17] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[17]);
                        }
                        setUpHouse(17);
                    }
                });
        blockTab18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab18, block18objX, block18objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[18] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[18]);
                        }
                        setUpHouse(18);
                    }
                });
        blockTab19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab19, block19objX, block19objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[19] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[19]);
                        }
                        setUpHouse(19);
                    }
                });
        blockTab20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab20, block20objX, block20objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[20] != "") {
                                houseMenu.showDialog(HomeActivity.this,blocksTab[20]);
                        }
                        setUpHouse(20);
                    }
                });
        // Shop
        shopTab.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    mwConsortium.mwClick();
                    mwConsortium.mwThreads(shopTab, shopBoxObjX, shopBoxObjY, 1.1f, 0.9f, 1.0f);
                    shopMenu.showShopMenu(HomeActivity.this, jewelryBoxCoinData, jewelryBoxLevelData);
                }
            }
        );
        // Items
        itemTab1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        itemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                        itemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        itemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                        itemSelected = "1";
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(itemTab1, itemTab1objX, itemTab1objY, 1.1f, 0.9f, 1.0f);
                    }
                });
        itemTab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        itemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                        itemTab2.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        itemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                        itemSelected = "2";
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(itemTab2, itemTab2objX, itemTab2objY, 1.1f, 0.9f, 1.0f);
                    }
                });
        itemTab3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        itemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                        itemTab3.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        itemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                        itemSelected = "3";
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(itemTab3, itemTab3objX, itemTab3objY, 1.1f, 0.9f, 1.0f);
                    }
                }); 
        */
    }
}