package uniconteam.magicworld;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
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
import uniconteam.magicworld.MwPlayHomeActivity;
import uniconteam.magicworld.MwPlayMainActivity;
import uniconteam.magicworld.MwTutorial;

public class MwPlayHomeActivity extends AppCompatActivity {
    
    // all objects
    public LinearLayout mwCloseBoxLinear;
	public LinearLayout mwJewelryBoxLinear;
	public TextView mwJewelryBoxCoinCount;
	public TextView mwJewelryBoxLevelCount;
	public LinearLayout mwWinBoxLinear;
	public TextView mwWinBoxCupCount;
	public LinearLayout mwItemBoxLinear;
	public static LinearLayout mwItemTab1;
	public static LinearLayout mwItemTab2;
	public static LinearLayout mwItemTab3;
    public static ImageView mwItemId1;
    public static ImageView mwItemId2;
    public static ImageView mwItemId3;
    public ImageView mwBlockTab1;
    public ImageView mwBlockTab2;
    public ImageView mwBlockTab3;
    public ImageView mwBlockTab4;
    public ImageView mwBlockTab5;
	public ImageView mwBlockTab6; // Comments about this objects in «// All objects id»
    public ImageView mwBlockTab7;
    public ImageView mwBlockTab8;
    public ImageView mwBlockTab9;
    public ImageView mwBlockTab10;
	public ImageView mwBlockTab11;
    public ImageView mwBlockTab12;
    public ImageView mwBlockTab13;
    public ImageView mwBlockTab14;
    public ImageView mwBlockTab15;
	public ImageView mwBlockTab16;
    public ImageView mwBlockTab17;
    public ImageView mwBlockTab18;
    public ImageView mwBlockTab19;
    public ImageView mwBlockTab20;
    public static TextView mwTutorialBoxText;
    public LinearLayout mwTutorialBoxLinear;
    public ImageView mwTutorialBoxIcon;
    public static TimerTask mwTimerTask;
    public static Timer _mwTimerTask = new Timer();
	private ObjectAnimator mwBlock1ObjAnimationScaleX = new ObjectAnimator(); // Animators \/
	private ObjectAnimator mwBlock1ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock2ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock2ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock3ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock3ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock4ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock4ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock5ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock5ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock6ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock6ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock7ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock7ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock8ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock8ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock9ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock9ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock10ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock10ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock11ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock11ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock12ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock12ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock13ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock13ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock14ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock14ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock15ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock15ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock16ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock16ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock17ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock17ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock18ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock18ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock19ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock19ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwBlock20ObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock20ObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwItemTab1AnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwItemTab1AnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwItemTab2AnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwItemTab2AnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwItemTab3AnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwItemTab3AnimationScaleY = new ObjectAnimator();
    private ObjectAnimator mwJewelryBoxAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwJewelryBoxAnimationScaleY = new ObjectAnimator();
    private ObjectAnimator mwWinBoxAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwWinBoxAnimationScaleY = new ObjectAnimator();
    private ObjectAnimator mwTutorialBoxAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwTutorialBoxAnimationScaleY = new ObjectAnimator();
    private ObjectAnimator mwCloseBoxAnimationScaleX = new ObjectAnimator();
    private ObjectAnimator mwCloseBoxAnimationScaleY = new ObjectAnimator();
    public static String mwItemSelected;
    public static int mwTutorialLevel;
    
    public static TimerTask mwTimerTaskThr1;
	public static Timer _mwTimerTaskThr1  = new Timer();
    public static View mwAnimObjDataThr1; // View for mwClick
    public static float mwAnimFloats1Thr1; // Floats for mwClick 1-3 \/
    public static float mwAnimFloats2Thr1;
    public static float mwAnimFloats3Thr1;
    public static ObjectAnimator mwAnimDataXThr1 = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public static ObjectAnimator mwAnimDataYThr1 = new ObjectAnimator();
    public static Boolean mwAnimRuleThr1 = true; // Bool for allowing or denying mwClick
    public static ImageView mwAnimImageDataThr1;
    
    public static TimerTask mwTimerTaskThr2;
	public static Timer _mwTimerTaskThr2  = new Timer();
    public static View mwAnimObjDataThr2; // View for mwClick
    public static float mwAnimFloats1Thr2; // Floats for mwClick 1-3 \/
    public static float mwAnimFloats2Thr2;
    public static float mwAnimFloats3Thr2;
    public static ObjectAnimator mwAnimDataXThr2 = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public static ObjectAnimator mwAnimDataYThr2 = new ObjectAnimator();
    public static Boolean mwAnimRuleThr2 = true; // Bool for allowing or denying mwClick
    public static ImageView mwAnimImageDataThr2;
    
    public static TimerTask mwTimerTaskThr3;
	public static Timer _mwTimerTaskThr3  = new Timer();
    public static View mwAnimObjDataThr3; // View for mwClick
    public static float mwAnimFloats1Thr3; // Floats for mwClick 1-3 \/
    public static float mwAnimFloats2Thr3;
    public static float mwAnimFloats3Thr3;
    public static ObjectAnimator mwAnimDataXThr3 = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public static ObjectAnimator mwAnimDataYThr3 = new ObjectAnimator();
    public static Boolean mwAnimRuleThr3 = true; // Bool for allowing or denying mwClick
    public static ImageView mwAnimImageDataThr3;
    
    // Data of inventory cells
    public static String mwItemTab1d;
    public static String mwItemTab2d;
    public static String mwItemTab3d;
    
    // Data for 20 blocks
    public static String[] mwBlockTab = new String[21];
    
    MwTutorial mwTutorial = new MwTutorial();
    MwHouseMenu mwHouseMenu = new MwHouseMenu();
    MwHouseMain mwHouseMain = new MwHouseMain();
    MwInventory mwInventory = new MwInventory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mwplayhome);
        initialize(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences mwPlayData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        
        // Getting data of inventory from SharedPreferences
        mwItemTab1d = mwPlayData.getString("mwItemTab1d", "");
        mwItemTab2d = mwPlayData.getString("mwItemTab2d", "");
        mwItemTab3d = mwPlayData.getString("mwItemTab3d", ""); 
        
        // Inventory display
        mwInventory.mwDataInventory();

        // Getting data of blocks from SharedPreferences
        for (int i = 1; i < 21; i++) {
            String key = "mwBlockTab" + i + "d";
            mwBlockTab[i] = mwPlayData.getString(key, "");
        }
        
        // Which cell of inventory selected
        mwItemSelected = mwPlayData.getString("mwItemSelected", "");
        if (mwItemSelected.equals("1")) {
            mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
            mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
            mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
        } else {
            if (mwItemSelected.equals("2")) {
                mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                mwItemTab2.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
            } else {
                if (mwItemSelected.equals("3")) {
                    mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                    mwItemTab3.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                    mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                } else {
                    mwItemSelected = "1";
                    mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                    mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                    mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                }
            }
        }
        
        // Tutorial of MW
        mwTutorialLevel = mwPlayData.getInt("mwTutorialLevel", 0);
        if (mwTutorialLevel == 0) {
            mwTutorialLevel = 1;
            mwTutorial.mwTutorialData();
        } else {
            mwTutorial.mwTutorialData();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Save data
        SharedPreferences mwPlayData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor mwEditData = mwPlayData.edit();
        mwEditData.putString("mwItemSelected", mwItemSelected.toString());
        if(mwItemTab1d == ""){
            mwEditData.putString("mwItemTab1d", mwItemTab1d.toString());
        }
        if(mwItemTab2d == ""){
            mwEditData.putString("mwItemTab2d", mwItemTab2d.toString());
        }
        if(mwItemTab3d == ""){
            mwEditData.putString("mwItemTab3d", mwItemTab3d.toString());
        }
        mwEditData.apply();
    }

    public void initialize(Bundle savedInstanceState) {
        // All objects id
        mwJewelryBoxLinear = findViewById(R.id.mwJewelryBoxLinear); // LinearLayout with coins and levels
        mwJewelryBoxCoinCount = findViewById(R.id.mwJewelryBoxCoinCount); // TextView coin count
        mwJewelryBoxLevelCount = findViewById(R.id.mwJewelryBoxLevelCount); // TextView level count
        mwWinBoxCupCount = findViewById(R.id.mwWinBoxCupCount); // TextView cup count
        mwWinBoxLinear = findViewById(R.id.mwWinBoxLinear); // LinearLayout with cups
        mwItemBoxLinear = findViewById(R.id.mwItemBoxLinear); // LinearLayout with item tabs
        mwItemTab1 = findViewById(R.id.mwItemTab1); // LinearLayout item tab 1-3 \/
        mwItemTab2 = findViewById(R.id.mwItemTab2);
        mwItemTab3 = findViewById(R.id.mwItemTab3);
        mwBlockTab1 = findViewById(R.id.mwBlockTab1); // ImageView block tab 1-20 \/
        mwBlockTab2 = findViewById(R.id.mwBlockTab2);
        mwBlockTab3 = findViewById(R.id.mwBlockTab3);
        mwBlockTab4 = findViewById(R.id.mwBlockTab4);
        mwBlockTab5 = findViewById(R.id.mwBlockTab5);
        mwBlockTab6 = findViewById(R.id.mwBlockTab6);
        mwBlockTab7 = findViewById(R.id.mwBlockTab7);
        mwBlockTab8 = findViewById(R.id.mwBlockTab8);
        mwBlockTab9 = findViewById(R.id.mwBlockTab9);
        mwBlockTab10 = findViewById(R.id.mwBlockTab10);
        mwBlockTab11 = findViewById(R.id.mwBlockTab11);
        mwBlockTab12 = findViewById(R.id.mwBlockTab12);
        mwBlockTab13 = findViewById(R.id.mwBlockTab13);
        mwBlockTab14 = findViewById(R.id.mwBlockTab14);
        mwBlockTab15 = findViewById(R.id.mwBlockTab15);
        mwBlockTab16 = findViewById(R.id.mwBlockTab16);
        mwBlockTab17 = findViewById(R.id.mwBlockTab17);
        mwBlockTab18 = findViewById(R.id.mwBlockTab18);
        mwBlockTab19 = findViewById(R.id.mwBlockTab19);
        mwBlockTab20 = findViewById(R.id.mwBlockTab20);
        mwItemId1 = findViewById(R.id.mwItemId1); // ImageView item tab 1-3 \/
        mwItemId2 = findViewById(R.id.mwItemId2);
        mwItemId3 = findViewById(R.id.mwItemId3);
        mwTutorialBoxLinear = findViewById(R.id.mwTutorialBoxLinear); // Tutorial box
        mwTutorialBoxText = findViewById(R.id.mwTutorialBoxText); // Tutorial text
        mwTutorialBoxIcon = findViewById(R.id.mwTutorialBoxIcon); // Tutorial icon
        mwCloseBoxLinear = findViewById(R.id.mwCloseBoxLinear); // Close icon

        MwConsortium mwConsortium = new MwConsortium(); // MwConsortium - MW engine - initialize
        MwPlayMainActivity.mwActivity = "mwHome";
        MwHouseMenu alert = new MwHouseMenu(); // MwHouseMenu - menu for houses

        // Transporant navbar
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, 
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        
        // Shadows
        if (Build.VERSION.SDK_INT >= 21) {
            mwCloseBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mwJewelryBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mwTutorialBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mwWinBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mwItemBoxLinear.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mwItemTab1.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mwItemTab2.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mwItemTab3.setElevation(8f);
        }
        
        // Fonts
        mwJewelryBoxCoinCount.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        mwJewelryBoxLevelCount.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        mwWinBoxCupCount.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        mwTutorialBoxText.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        
        // Onclick  functions
        mwCloseBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    
                        mwTimerTask =
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
                    _mwTimerTask.schedule(mwTimerTask, 500);
                    
                    mwConsortium.mwClick();
                    mwConsortium.mwThreads(mwCloseBoxLinear, mwCloseBoxAnimationScaleX, mwCloseBoxAnimationScaleY);
                    }
                });
        
        mwJewelryBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwJewelryBoxLinear, mwJewelryBoxAnimationScaleX, mwJewelryBoxAnimationScaleY);
                    }
                });
        mwWinBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View viww) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwWinBoxLinear, mwWinBoxAnimationScaleX, mwWinBoxAnimationScaleY);
                    }
                });
        mwTutorialBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwTutorialLevel += 1;
                        mwTutorial.mwTutorialData();
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwTutorialBoxLinear, mwTutorialBoxAnimationScaleX, mwTutorialBoxAnimationScaleY);
                    }
                });
        // Blocks
        mwBlockTab1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab1, mwBlock1ObjAnimationScaleX, mwBlock1ObjAnimationScaleY);
                        if (mwBlockTab[1] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[1]);
                        }
                    }
                });
        mwBlockTab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab2, mwBlock2ObjAnimationScaleX, mwBlock2ObjAnimationScaleY);
                        if (mwBlockTab[2] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[2]);
                        }
                    }
                });
        mwBlockTab3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab3, mwBlock3ObjAnimationScaleX, mwBlock3ObjAnimationScaleY);
                        if (mwBlockTab[3] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[3]);
                        }
                    }
                });
        mwBlockTab4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab4, mwBlock4ObjAnimationScaleX, mwBlock4ObjAnimationScaleY);
                        if (mwBlockTab[4] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[4]);
                        }
                    }
                });
        mwBlockTab5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab5, mwBlock5ObjAnimationScaleX, mwBlock5ObjAnimationScaleY);
                        if (mwBlockTab[5] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[5]);
                        }
                    }
                });
        mwBlockTab6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab6, mwBlock6ObjAnimationScaleX, mwBlock6ObjAnimationScaleY);
                        if (mwBlockTab[6] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[6]);
                        }
                    }
                });
        mwBlockTab7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab7, mwBlock7ObjAnimationScaleX, mwBlock7ObjAnimationScaleY);
                        if (mwBlockTab[7] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[7]);
                        }
                    }
                });
        mwBlockTab8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab8, mwBlock8ObjAnimationScaleX, mwBlock8ObjAnimationScaleY);
                        if (mwBlockTab[8] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[8]);
                        }
                    }
                });
        mwBlockTab9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab9, mwBlock9ObjAnimationScaleX, mwBlock9ObjAnimationScaleY);
                        if (mwBlockTab[9] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[9]);
                        }
                    }
                });
        mwBlockTab10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab10, mwBlock10ObjAnimationScaleX, mwBlock10ObjAnimationScaleY);
                        if (mwBlockTab[10] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[10]);
                        }
                    }
                });
        mwBlockTab11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab11, mwBlock11ObjAnimationScaleX, mwBlock11ObjAnimationScaleY);
                        if (mwBlockTab[11] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[11]);
                        }
                    }
                });
        mwBlockTab12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab12, mwBlock12ObjAnimationScaleX, mwBlock12ObjAnimationScaleY);
                        if (mwBlockTab[12] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[12]);
                        }
                    }
                });
        mwBlockTab13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab13, mwBlock13ObjAnimationScaleX, mwBlock13ObjAnimationScaleY);
                        if (mwBlockTab[13] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[13]);
                        }
                    }
                });
        mwBlockTab14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab14, mwBlock14ObjAnimationScaleX, mwBlock14ObjAnimationScaleY);
                        if (mwBlockTab[14] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[14]);
                        }
                    }
                });
        mwBlockTab15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab15, mwBlock15ObjAnimationScaleX, mwBlock15ObjAnimationScaleY);
                        if (mwBlockTab[15] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[15]);
                        }
                    }
                });
        mwBlockTab16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab16, mwBlock16ObjAnimationScaleX, mwBlock16ObjAnimationScaleY);
                        if (mwBlockTab[16] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[16]);
                        }
                    }
                });
        mwBlockTab17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab17, mwBlock17ObjAnimationScaleX, mwBlock17ObjAnimationScaleY);
                        if (mwBlockTab[17] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[17]);
                        }
                    }
                });
        mwBlockTab18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab18, mwBlock18ObjAnimationScaleX, mwBlock18ObjAnimationScaleY);
                        if (mwBlockTab[18] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[18]);
                        }
                    }
                });
        mwBlockTab19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab19, mwBlock19ObjAnimationScaleX, mwBlock19ObjAnimationScaleY);
                        if (mwBlockTab[19] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[19]);
                        }
                    }
                });
        mwBlockTab20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwBlockTab20, mwBlock20ObjAnimationScaleX, mwBlock20ObjAnimationScaleY);
                        if (mwBlockTab[20] != "") {
                                alert.showDialog(MwPlayHomeActivity.this,mwBlockTab[20]);
                        }
                    }
                });
        // Items
        mwItemTab1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                        mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                        mwItemSelected = "1";
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwItemTab1, mwItemTab1AnimationScaleX, mwItemTab1AnimationScaleY);
                    }
                });
        mwItemTab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                        mwItemTab2.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                        mwItemSelected = "2";
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwItemTab2, mwItemTab2AnimationScaleX, mwItemTab2AnimationScaleY);
                    }
                });
        mwItemTab3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                        mwItemTab3.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                        mwItemSelected = "3";
                        mwConsortium.mwClick();
                        mwConsortium.mwThreads(mwItemTab3, mwItemTab3AnimationScaleX, mwItemTab3AnimationScaleY);
                    }
                });
    }
}