package uniconteam.magicworld;

import android.animation.ObjectAnimator;
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
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity {
    
    // all objects
    public LinearLayout closeBoxLinear;
	public LinearLayout jewelryBoxLinear;
	public TextView jewelryBoxCoinCount;
	public TextView jewelryBoxLevelCount;
	public LinearLayout winBoxLinear;
	public TextView winBoxCupCount;
	public LinearLayout itemBoxLinear;
	public static LinearLayout itemTab1;
	public static LinearLayout itemTab2;
	public static LinearLayout itemTab3;
    public static ImageView itemId1;
    public static ImageView itemId2;
    public static ImageView itemId3;
    public ImageView blockTab1;
    public ImageView blockTab2;
    public ImageView blockTab3;
    public ImageView blockTab4;
    public ImageView blockTab5;
	public ImageView blockTab6; // Comments about this objects in «// All objects id»
    public ImageView blockTab7;
    public ImageView blockTab8;
    public ImageView blockTab9;
    public ImageView blockTab10;
	public ImageView blockTab11;
    public ImageView blockTab12;
    public ImageView blockTab13;
    public ImageView blockTab14;
    public ImageView blockTab15;
	public ImageView blockTab16;
    public ImageView blockTab17;
    public ImageView blockTab18;
    public ImageView blockTab19;
    public ImageView blockTab20;
    public static TextView tutorialBoxText;
    public LinearLayout tutorialBoxLinear;
    public ImageView tutorialBoxIcon;
    public static TimerTask timerTask;
    public static Timer _timerTask = new Timer();
	private ObjectAnimator block1objX = new ObjectAnimator(); // Animators \/
	private ObjectAnimator block1objY = new ObjectAnimator();
	private ObjectAnimator block2objX = new ObjectAnimator();
	private ObjectAnimator block2objY = new ObjectAnimator();
	private ObjectAnimator block3objX = new ObjectAnimator();
	private ObjectAnimator block3objY = new ObjectAnimator();
	private ObjectAnimator block4objX = new ObjectAnimator();
	private ObjectAnimator block4objY = new ObjectAnimator();
	private ObjectAnimator block5objX = new ObjectAnimator();
	private ObjectAnimator block5objY = new ObjectAnimator();
	private ObjectAnimator block6objX = new ObjectAnimator();
	private ObjectAnimator block6objY = new ObjectAnimator();
	private ObjectAnimator block7objX = new ObjectAnimator();
	private ObjectAnimator block7objY = new ObjectAnimator();
	private ObjectAnimator block8objX = new ObjectAnimator();
	private ObjectAnimator block8objY = new ObjectAnimator();
	private ObjectAnimator block9objX = new ObjectAnimator();
	private ObjectAnimator block9objY = new ObjectAnimator();
	private ObjectAnimator block10objX = new ObjectAnimator();
	private ObjectAnimator block10objY = new ObjectAnimator();
	private ObjectAnimator block11objX = new ObjectAnimator();
	private ObjectAnimator block11objY = new ObjectAnimator();
	private ObjectAnimator block12objX = new ObjectAnimator();
	private ObjectAnimator block12objY = new ObjectAnimator();
	private ObjectAnimator block13objX = new ObjectAnimator();
	private ObjectAnimator block13objY = new ObjectAnimator();
	private ObjectAnimator block14objX = new ObjectAnimator();
	private ObjectAnimator block14objY = new ObjectAnimator();
	private ObjectAnimator block15objX = new ObjectAnimator();
	private ObjectAnimator block15objY = new ObjectAnimator();
	private ObjectAnimator block16objX = new ObjectAnimator();
	private ObjectAnimator block16objY = new ObjectAnimator();
	private ObjectAnimator block17objX = new ObjectAnimator();
	private ObjectAnimator block17objY = new ObjectAnimator();
	private ObjectAnimator block18objX = new ObjectAnimator();
	private ObjectAnimator block18objY = new ObjectAnimator();
	private ObjectAnimator block19objX = new ObjectAnimator();
	private ObjectAnimator block19objY = new ObjectAnimator();
	private ObjectAnimator block20objX = new ObjectAnimator();
	private ObjectAnimator block20objY = new ObjectAnimator();
	private ObjectAnimator itemTab1objX = new ObjectAnimator();
	private ObjectAnimator itemTab1objY = new ObjectAnimator();
	private ObjectAnimator itemTab2objX = new ObjectAnimator();
	private ObjectAnimator itemTab2objY = new ObjectAnimator();
	private ObjectAnimator itemTab3objX = new ObjectAnimator();
	private ObjectAnimator itemTab3objY = new ObjectAnimator();
    private ObjectAnimator jewelryBoxObjX = new ObjectAnimator();
	private ObjectAnimator jewelryBoxObjY = new ObjectAnimator();
    private ObjectAnimator winBoxObjX = new ObjectAnimator();
	private ObjectAnimator winBoxObjY = new ObjectAnimator();
    private ObjectAnimator tutorialBoxObjX = new ObjectAnimator();
	private ObjectAnimator tutorialBoxObjY = new ObjectAnimator();
    private ObjectAnimator closeBoxObjX = new ObjectAnimator();
    private ObjectAnimator closeBoxObjY = new ObjectAnimator();
    public static String itemSelected;
    public static int tutorialLevel;
    
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
    
    Tutorial tutorial = new Tutorial();
    HouseMenu houseMenu = new HouseMenu();
    HouseMain houseMain = new HouseMain();
    Inventory inventory = new Inventory();

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
        
        // Inventory display
        inventory.dataInventory();

        // Getting data of blocks from SharedPreferences
        for (int i = 1; i < 21; i++) {
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
        for (int i = 1; i < 21; i++) {
            String blocks = "blockTab" + i + "d";
            editData.putString(blocks, blocksTab[i]);
        }
        editData.apply();
    }

    public void initialize(Bundle savedInstanceState) {
        // All objects id
        jewelryBoxLinear = findViewById(R.id.mwJewelryBoxLinear); // LinearLayout with coins and levels
        jewelryBoxCoinCount = findViewById(R.id.mwJewelryBoxCoinCount); // TextView coin count
        jewelryBoxLevelCount = findViewById(R.id.mwJewelryBoxLevelCount); // TextView level count
        winBoxCupCount = findViewById(R.id.mwWinBoxCupCount); // TextView cup count
        winBoxLinear = findViewById(R.id.mwWinBoxLinear); // LinearLayout with cups
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

        MwConsortium mwConsortium = new MwConsortium(); // MwConsortium - MW engine - initialize
        MenuActivity.mwActivity = "mwHome";
        HouseMenu alert = new HouseMenu(); // MwHouseMenu - menu for houses

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
            winBoxLinear.setElevation(8f);
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
        
        // Fonts
        jewelryBoxCoinCount.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        jewelryBoxLevelCount.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        winBoxCupCount.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        tutorialBoxText.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        
        // Onclick  functions
        closeBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    
                        timerTask =
                           new TimerTask() {
                              @Override
                                public void run() {
                                   runOnUiThread(
                                      new Runnable() {
                                          @Override
                                            public void run() {
                                        finish();
                                }
                           });
                        }
                    };
                    _timerTask.schedule(timerTask, 500);
                    
                    mwConsortium.mwClick();
                    mwConsortium.mwThreads(closeBoxLinear, closeBoxObjX, closeBoxObjY, 1.1f, 0.9f, 1.0f);
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
        winBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View viww) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(winBoxLinear, winBoxObjX, winBoxObjY, 1.1f, 0.9f, 1.0f);
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
                        if(itemSelected == "1"){
                            blocksTab[1] = itemTab1d;
                            itemTab1d = "";
                        } else {
                            if(itemSelected == "2"){
                                blocksTab[1] = itemTab2d;
                                itemTab2d = "";
                            } else {
                                if(itemSelected == "3"){
                                    blocksTab[1] = itemTab3d;
                                    itemTab3d = "";
                                }
                            }
                        }
                        if (blocksTab[1] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[1]);
                        }
                    }
                });
        blockTab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab2, block2objX, block2objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[2] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[2]);
                        }
                    }
                });
        blockTab3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab3, block3objX, block3objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[3] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[3]);
                        }
                    }
                });
        blockTab4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab4, block4objX, block4objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[4] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[4]);
                        }
                    }
                });
        blockTab5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab5, block5objX, block5objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[5] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[5]);
                        }
                    }
                });
        blockTab6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab6, block6objX, block6objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[6] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[6]);
                        }
                    }
                });
        blockTab7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab7, block7objX, block7objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[7] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[7]);
                        }
                    }
                });
        blockTab8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab8, block8objX, block8objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[8] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[8]);
                        }
                    }
                });
        blockTab9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab9, block9objX, block9objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[9] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[9]);
                        }
                    }
                });
        blockTab10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab10, block10objX, block10objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[10] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[10]);
                        }
                    }
                });
        blockTab11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab11, block11objX, block11objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[11] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[11]);
                        }
                    }
                });
        blockTab12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab12, block12objX, block12objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[12] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[12]);
                        }
                    }
                });
        blockTab13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab13, block13objX, block13objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[13] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[13]);
                        }
                    }
                });
        blockTab14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab14, block14objX, block14objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[14] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[14]);
                        }
                    }
                });
        blockTab15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab15, block15objX, block15objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[15] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[15]);
                        }
                    }
                });
        blockTab16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab16, block16objX, block16objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[16] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[16]);
                        }
                    }
                });
        blockTab17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab17, block17objX, block17objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[17] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[17]);
                        }
                    }
                });
        blockTab18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab18, block18objX, block18objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[18] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[18]);
                        }
                    }
                });
        blockTab19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab19, block19objX, block19objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[19] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[19]);
                        }
                    }
                });
        blockTab20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(blockTab20, block20objX, block20objY, 1.1f, 0.9f, 1.0f);
                        if (blocksTab[20] != "") {
                                alert.showDialog(HomeActivity.this,blocksTab[20]);
                        }
                    }
                });
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