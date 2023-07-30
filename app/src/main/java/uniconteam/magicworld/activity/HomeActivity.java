package uniconteam.magicworld;

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

public class HomeActivity extends AppCompatActivity {
    
    // all objects
    public LinearLayout closeBoxLinear;
	public LinearLayout jewelryBoxLinear;
	public TextView jewelryBoxCoinCount;
    public static int jewelryBoxCoinData;
	public TextView jewelryBoxLevelCount;
    public static int jewelryBoxLevelData;
	public LinearLayout gemBoxLinear;
	public TextView gemBoxCount;
    public static int gemBoxData;
	public LinearLayout itemBoxLinear;
	public static LinearLayout itemTab1;
	public static LinearLayout itemTab2;
	public static LinearLayout itemTab3;
    public static ImageView itemId1;
    public static ImageView itemId2;
    public static ImageView itemId3;
    public static ImageView blockTab1;
    public static ImageView blockTab2;
    public static ImageView blockTab3;
    public static ImageView blockTab4;
    public static ImageView blockTab5;
	public static ImageView blockTab6; // Comments about this objects in «// All objects id»
    public static ImageView blockTab7;
    public static ImageView blockTab8;
    public static ImageView blockTab9;
    public static ImageView blockTab10;
	public static ImageView blockTab11;
    public static ImageView blockTab12;
    public static ImageView blockTab13;
    public static ImageView blockTab14;
    public static ImageView blockTab15;
	public static ImageView blockTab16;
    public static ImageView blockTab17;
    public static ImageView blockTab18;
    public static ImageView blockTab19;
    public static ImageView blockTab20;
    public static TextView tutorialBoxText;
    public LinearLayout tutorialBoxLinear;
    public ImageView tutorialBoxIcon;
    public static TimerTask timerTask;
    public static Timer _timerTask = new Timer();
    ObjectAnimator block1objX = new ObjectAnimator(); // Animators \/
    ObjectAnimator block1objY = new ObjectAnimator();
	ObjectAnimator block2objX = new ObjectAnimator();
	ObjectAnimator block2objY = new ObjectAnimator();
	ObjectAnimator block3objX = new ObjectAnimator();
	ObjectAnimator block3objY = new ObjectAnimator();
	ObjectAnimator block4objX = new ObjectAnimator();
	ObjectAnimator block4objY = new ObjectAnimator();
	ObjectAnimator block5objX = new ObjectAnimator();
	ObjectAnimator block5objY = new ObjectAnimator();
	ObjectAnimator block6objX = new ObjectAnimator();
	ObjectAnimator block6objY = new ObjectAnimator();
	ObjectAnimator block7objX = new ObjectAnimator();
	ObjectAnimator block7objY = new ObjectAnimator();
    ObjectAnimator block8objX = new ObjectAnimator();
	ObjectAnimator block8objY = new ObjectAnimator();
	ObjectAnimator block9objX = new ObjectAnimator();
	ObjectAnimator block9objY = new ObjectAnimator();
	ObjectAnimator block10objX = new ObjectAnimator();
	ObjectAnimator block10objY = new ObjectAnimator();
	ObjectAnimator block11objX = new ObjectAnimator();
	ObjectAnimator block11objY = new ObjectAnimator();
	ObjectAnimator block12objX = new ObjectAnimator();
	ObjectAnimator block12objY = new ObjectAnimator();
	ObjectAnimator block13objX = new ObjectAnimator();
	ObjectAnimator block13objY = new ObjectAnimator();
	ObjectAnimator block14objX = new ObjectAnimator();
	ObjectAnimator block14objY = new ObjectAnimator();
	ObjectAnimator block15objX = new ObjectAnimator();
	ObjectAnimator block15objY = new ObjectAnimator();
	ObjectAnimator block16objX = new ObjectAnimator();
	ObjectAnimator block16objY = new ObjectAnimator();
    ObjectAnimator block17objX = new ObjectAnimator();
	ObjectAnimator block17objY = new ObjectAnimator();
	ObjectAnimator block18objX = new ObjectAnimator();
	ObjectAnimator block18objY = new ObjectAnimator();
	ObjectAnimator block19objX = new ObjectAnimator();
	ObjectAnimator block19objY = new ObjectAnimator();
	ObjectAnimator block20objX = new ObjectAnimator();
	ObjectAnimator block20objY = new ObjectAnimator();
	ObjectAnimator itemTab1objX = new ObjectAnimator();
	ObjectAnimator itemTab1objY = new ObjectAnimator();
	ObjectAnimator itemTab2objX = new ObjectAnimator();
	ObjectAnimator itemTab2objY = new ObjectAnimator();
	ObjectAnimator itemTab3objX = new ObjectAnimator();
	ObjectAnimator itemTab3objY = new ObjectAnimator();
    ObjectAnimator jewelryBoxObjX = new ObjectAnimator();
	ObjectAnimator jewelryBoxObjY = new ObjectAnimator();
    ObjectAnimator gemBoxObjX = new ObjectAnimator();
	ObjectAnimator gemBoxObjY = new ObjectAnimator();
    ObjectAnimator tutorialBoxObjX = new ObjectAnimator();
    ObjectAnimator tutorialBoxObjY = new ObjectAnimator();
    ObjectAnimator closeBoxObjX = new ObjectAnimator();
    ObjectAnimator closeBoxObjY = new ObjectAnimator();
    ObjectAnimator shopBoxObjX = new ObjectAnimator();
    ObjectAnimator shopBoxObjY = new ObjectAnimator();
    public static String itemSelected;
    public static int tutorialLevel;
    LinearLayout shopTab;
    
    public static TimerTask timerTaskThr1;
	public static Timer _timerTaskThr1  = new Timer();
    public static View animObjDataThr1; // View for mwClick
    public static float animFloats1Thr1; // Floats for mwClick 1-3 \/
    public static float animFloats2Thr1;
    public static float animFloats3Thr1;
    public static ObjectAnimator animDataXThr1 = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public static ObjectAnimator animDataYThr1 = new ObjectAnimator();
    public static Boolean animRuleThr1 = true; // Bool for allowing or denying mwClick
    public static ImageView animImageDataThr1;
    
    public static TimerTask timerTaskThr2;
	public static Timer _timerTaskThr2  = new Timer();
    public static View animObjDataThr2; // View for mwClick
    public static float animFloats1Thr2; // Floats for mwClick 1-3 \/
    public static float animFloats2Thr2;
    public static float animFloats3Thr2;
    public static ObjectAnimator animDataXThr2 = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public static ObjectAnimator animDataYThr2 = new ObjectAnimator();
    public static Boolean animRuleThr2 = true; // Bool for allowing or denying mwClick
    public static ImageView animImageDataThr2;
    
    public static TimerTask timerTaskThr3;
	public static Timer _timerTaskThr3  = new Timer();
    public static View animObjDataThr3; // View for mwClick
    public static float animFloats1Thr3; // Floats for mwClick 1-3 \/
    public static float animFloats2Thr3;
    public static float animFloats3Thr3;
    public static ObjectAnimator animDataXThr3 = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public static ObjectAnimator animDataYThr3 = new ObjectAnimator();
    public static Boolean animRuleThr3 = true; // Bool for allowing or denying mwClick
    public static ImageView animImageDataThr3;
    
    // Data of inventory cells
    public static String itemTab1d;
    public static String itemTab2d;
    public static String itemTab3d;
    
    // Data for 20 blocks
    public static String[] blocksTab = new String[21];
    
    public static int coinHouseLevel;
    public static int gardenHouseLevel;
    public static int workshopLevel;
    
    MwConsortium mwConsortium = new MwConsortium(); // MwConsortium - MW engine - initialize
    HouseMenu houseMenu = new HouseMenu(); // MwHouseMenu - menu for houses
    public UpgradeMenu upgMenu = new UpgradeMenu();
    ShopMenu shopMenu = new ShopMenu();
    Houses houses = new Houses();
    Inventory inventory = new Inventory();
    Tutorial tutorial = new Tutorial();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        initialize(savedInstanceState);
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
        
        jewelryBoxCoinCount.setText(Integer.toString(jewelryBoxCoinData));
        jewelryBoxLevelCount.setText(Integer.toString(jewelryBoxLevelData));
        gemBoxCount.setText(Integer.toString(gemBoxData));

        timerTask =
                new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(
                                () -> {
                                    jewelryBoxCoinCount.setText(
                                            Integer.toString(jewelryBoxCoinData));
                                    jewelryBoxLevelCount.setText(
                                            Integer.toString(jewelryBoxLevelData));
                                    gemBoxCount.setText(Integer.toString(gemBoxData));
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
        if (itemSelected.equals("1")) {
            itemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
            itemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
            itemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
        } else {
            if (itemSelected.equals("2")) {
                itemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                itemTab2.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                itemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
            } else {
                if (itemSelected.equals("3")) {
                    itemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                    itemTab3.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                    itemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                } else {
                    itemSelected = "1";
                    itemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                    itemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                    itemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                }
            }
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
        editData.putString("itemSelected", itemSelected.toString());
        if(itemTab1d == ""){
            editData.putString("itemTab1d", itemTab1d.toString());
        }
        if(itemTab2d == ""){
            editData.putString("itemTab2d", itemTab2d.toString());
        }
        if(itemTab3d == ""){
            editData.putString("itemTab3d", itemTab3d.toString());
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
        // All objects id
        gemBoxCount = findViewById(R.id.mwGemBoxCount); // TextView cup count
        jewelryBoxLinear = findViewById(R.id.mwJewelryBoxLinear);
        jewelryBoxCoinCount = findViewById(R.id.mwJewelryBoxCoinCount);
        jewelryBoxLevelCount = findViewById(R.id.mwJewelryBoxLevelCount);
        gemBoxLinear = findViewById(R.id.mwGemBoxLinear); // LinearLayout with cups
        itemBoxLinear = findViewById(R.id.mwItemBoxLinear); // LinearLayout with item tabs
        itemTab1 = findViewById(R.id.mwItemTab1); // LinearLayout item tab 1-3 \/
        itemTab2 = findViewById(R.id.mwItemTab2);
        itemTab3 = findViewById(R.id.mwItemTab3);
        blockTab1 = findViewById(R.id.mwBlockTab1); // ImageView block tab 1-20 \/
        blockTab2 = findViewById(R.id.mwBlockTab2);
        blockTab3 = findViewById(R.id.mwBlockTab3);
        blockTab4 = findViewById(R.id.mwBlockTab4);
        blockTab5 = findViewById(R.id.mwBlockTab5);
        blockTab6 = findViewById(R.id.mwBlockTab6);
        blockTab7 = findViewById(R.id.mwBlockTab7);
        blockTab8 = findViewById(R.id.mwBlockTab8);
        blockTab9 = findViewById(R.id.mwBlockTab9);
        blockTab10 = findViewById(R.id.mwBlockTab10);
        blockTab11 = findViewById(R.id.mwBlockTab11);
        blockTab12 = findViewById(R.id.mwBlockTab12);
        blockTab13 = findViewById(R.id.mwBlockTab13);
        blockTab14 = findViewById(R.id.mwBlockTab14);
        blockTab15 = findViewById(R.id.mwBlockTab15);
        blockTab16 = findViewById(R.id.mwBlockTab16);
        blockTab17 = findViewById(R.id.mwBlockTab17);
        blockTab18 = findViewById(R.id.mwBlockTab18);
        blockTab19 = findViewById(R.id.mwBlockTab19);
        blockTab20 = findViewById(R.id.mwBlockTab20);
        itemId1 = findViewById(R.id.mwItemId1); // ImageView item tab 1-3 \/
        itemId2 = findViewById(R.id.mwItemId2);
        itemId3 = findViewById(R.id.mwItemId3);
        tutorialBoxLinear = findViewById(R.id.mwTutorialBoxLinear); // Tutorial box
        tutorialBoxText = findViewById(R.id.mwTutorialBoxText); // Tutorial text
        tutorialBoxIcon = findViewById(R.id.mwTutorialBoxIcon); // Tutorial icon
        closeBoxLinear = findViewById(R.id.mwCloseBoxLinear); // Close icon
        shopTab = findViewById(R.id.mwShopTab);
        
        MenuActivity.mwActivity = "mwHome";

        // Transporant navbar
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, 
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        
        // Shadows
        if (Build.VERSION.SDK_INT >= 21) {
            closeBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            jewelryBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            tutorialBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            gemBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            itemBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            itemTab1.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            itemTab2.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            itemTab3.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            shopTab.setElevation(8f);
        }

        // Fonts
        jewelryBoxCoinCount.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        jewelryBoxLevelCount.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        gemBoxCount.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        tutorialBoxText.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);

        // Onclick  functions
        closeBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                            finish();
                    }
                });

        jewelryBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(jewelryBoxLinear, jewelryBoxObjX, jewelryBoxObjY, 1.1f, 0.9f, 1.0f);
                    }
                });
        gemBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View viww) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(gemBoxLinear, gemBoxObjX, gemBoxObjY, 1.1f, 0.9f, 1.0f);
                    }
                });
        tutorialBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tutorialLevel += 1;
                        tutorial.tutorialData();
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(tutorialBoxLinear, tutorialBoxObjX, tutorialBoxObjY, 1.1f, 0.9f, 1.0f);
                    }
                });
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
    }
}