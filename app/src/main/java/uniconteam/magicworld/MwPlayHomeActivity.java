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
	private ObjectAnimator mwBlock1ObjAnimationScaleX = new ObjectAnimator(); // Animator Block Tab 1-20 \/
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
    
    public static String mwItemTab1d;
    public static String mwItemTab2d;
    public static String mwItemTab3d;
    
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
        
        MwPlayHomeActivity.mwItemTab1d = mwPlayData.getString("mwItemTab1d", "");
        MwPlayHomeActivity.mwItemTab2d = mwPlayData.getString("mwItemTab2d", "");
        MwPlayHomeActivity.mwItemTab3d = mwPlayData.getString("mwItemTab3d", ""); 
        mwInventory.mwDataInventory();

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
        mwItemTab1 = findViewById(R.id.mwItemTab1); // LinearLayout item tab 1
        mwItemTab2 = findViewById(R.id.mwItemTab2); // LinearLayout item tab 2
        mwItemTab3 = findViewById(R.id.mwItemTab3); // LinearLayout item tab 3
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
        mwItemId1 = findViewById(R.id.mwItemId1);
        mwItemId2 = findViewById(R.id.mwItemId2);
        mwItemId3 = findViewById(R.id.mwItemId3);
        mwTutorialBoxLinear = findViewById(R.id.mwTutorialBoxLinear); // Tutorial box
        mwTutorialBoxText = findViewById(R.id.mwTutorialBoxText); // Tutorial text
        mwTutorialBoxIcon = findViewById(R.id.mwTutorialBoxIcon); // Tutorial icon
        mwCloseBoxLinear = findViewById(R.id.mwCloseBoxLinear); // Close icon

        MwConsortium mwConsortium = new MwConsortium(); // MwConsortium - MW engine - initialize
        MwPlayMainActivity.mwActivity = "mwHome";
        MwHouseMenu alert = new MwHouseMenu(); // MwHouseMenu - menu for houses

        // Design
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, 
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(Color.parseColor("#FF3DBFFF"));
        }
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
                    
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwCloseBoxLinear;
                            mwAnimDataXThr1 = mwCloseBoxAnimationScaleX;
                            mwAnimDataYThr1 = mwCloseBoxAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                             
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwCloseBoxLinear;
                                mwAnimDataXThr2 = mwCloseBoxAnimationScaleX;
                                mwAnimDataYThr2 = mwCloseBoxAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwCloseBoxLinear;
                                    mwAnimDataXThr3 = mwCloseBoxAnimationScaleX;
                                    mwAnimDataYThr3 = mwCloseBoxAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        
        mwJewelryBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwJewelryBoxLinear;
                            mwAnimDataXThr1 = mwJewelryBoxAnimationScaleX;
                            mwAnimDataYThr1 = mwJewelryBoxAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwJewelryBoxLinear;
                                mwAnimDataXThr2 = mwJewelryBoxAnimationScaleX;
                                mwAnimDataYThr2 = mwJewelryBoxAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwJewelryBoxLinear;
                                    mwAnimDataXThr3 = mwJewelryBoxAnimationScaleX;
                                    mwAnimDataYThr3 = mwJewelryBoxAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwWinBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View viww) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwWinBoxLinear;
                            mwAnimDataXThr1 = mwWinBoxAnimationScaleX;
                            mwAnimDataYThr1 = mwWinBoxAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwWinBoxLinear;
                                mwAnimDataXThr2 = mwWinBoxAnimationScaleX;
                                mwAnimDataYThr2 = mwWinBoxAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwWinBoxLinear;
                                    mwAnimDataXThr3 = mwWinBoxAnimationScaleX;
                                    mwAnimDataYThr3 = mwWinBoxAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwTutorialBoxLinear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwTutorialLevel += 1;
                        mwTutorial.mwTutorialData();
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwTutorialBoxLinear;
                            mwAnimDataXThr1 = mwTutorialBoxAnimationScaleX;
                            mwAnimDataYThr1 = mwTutorialBoxAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwTutorialBoxLinear;
                                mwAnimDataXThr2 = mwTutorialBoxAnimationScaleX;
                                mwAnimDataYThr2 = mwTutorialBoxAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwTutorialBoxLinear;
                                    mwAnimDataXThr3 = mwTutorialBoxAnimationScaleX;
                                    mwAnimDataYThr3 = mwTutorialBoxAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab1;
                            mwAnimDataXThr1 = mwBlock1ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock1ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                            alert.showDialog(MwPlayHomeActivity.this, mwAnimObjDataThr1.getResources().getResourceEntryName(mwAnimObjDataThr1.getId()));
                            
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab1;
                                mwAnimDataXThr2 = mwBlock1ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock1ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                                alert.showDialog(MwPlayHomeActivity.this, mwAnimObjDataThr2.getResources().getResourceEntryName(mwAnimObjDataThr2.getId()));
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab1;
                                    mwAnimDataXThr3 = mwBlock1ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock1ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                    alert.showDialog(MwPlayHomeActivity.this, mwAnimObjDataThr3.getResources().getResourceEntryName(mwAnimObjDataThr3.getId()));
                                }
                            }
                        }
                    }
                });
        mwBlockTab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab2;
                            mwAnimDataXThr1 = mwBlock2ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock2ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab2;
                                mwAnimDataXThr2 = mwBlock2ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock2ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab2;
                                    mwAnimDataXThr3 = mwBlock2ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock2ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab3;
                            mwAnimDataXThr1 = mwBlock3ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock3ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab3;
                                mwAnimDataXThr2 = mwBlock3ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock3ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab3;
                                    mwAnimDataXThr3 = mwBlock3ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock3ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab4;
                            mwAnimDataXThr1 = mwBlock4ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock4ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab4;
                                mwAnimDataXThr2 = mwBlock4ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock4ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab4;
                                    mwAnimDataXThr3 = mwBlock4ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock4ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab5;
                            mwAnimDataXThr1 = mwBlock5ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock5ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab5;
                                mwAnimDataXThr2 = mwBlock5ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock5ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab5;
                                    mwAnimDataXThr3 = mwBlock5ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock5ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab6;
                            mwAnimDataXThr1 = mwBlock6ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock6ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab6;
                                mwAnimDataXThr2 = mwBlock6ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock6ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab6;
                                    mwAnimDataXThr3 = mwBlock6ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock6ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab7;
                            mwAnimDataXThr1 = mwBlock7ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock7ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab7;
                                mwAnimDataXThr2 = mwBlock7ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock7ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab7;
                                    mwAnimDataXThr3 = mwBlock7ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock7ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab8;
                            mwAnimDataXThr1 = mwBlock8ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock8ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab8;
                                mwAnimDataXThr2 = mwBlock8ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock8ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab8;
                                    mwAnimDataXThr3 = mwBlock8ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock8ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab9;
                            mwAnimDataXThr1 = mwBlock9ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock9ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab9;
                                mwAnimDataXThr2 = mwBlock9ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock9ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab9;
                                    mwAnimDataXThr3 = mwBlock9ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock9ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab10;
                            mwAnimDataXThr1 = mwBlock10ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock10ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab10;
                                mwAnimDataXThr2 = mwBlock10ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock10ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab10;
                                    mwAnimDataXThr3 = mwBlock10ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock10ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab11;
                            mwAnimDataXThr1 = mwBlock11ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock11ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab11;
                                mwAnimDataXThr2 = mwBlock11ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock11ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab11;
                                    mwAnimDataXThr3 = mwBlock11ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock11ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab12;
                            mwAnimDataXThr1 = mwBlock12ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock12ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab12;
                                mwAnimDataXThr2 = mwBlock12ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock12ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab12;
                                    mwAnimDataXThr3 = mwBlock12ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock12ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab13.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab13;
                            mwAnimDataXThr1 = mwBlock13ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock13ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab13;
                                mwAnimDataXThr2 = mwBlock13ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock13ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab13;
                                    mwAnimDataXThr3 = mwBlock13ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock13ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab14.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab14;
                            mwAnimDataXThr1 = mwBlock14ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock14ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab14;
                                mwAnimDataXThr2 = mwBlock14ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock14ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab14;
                                    mwAnimDataXThr3 = mwBlock14ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock14ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab15;
                            mwAnimDataXThr1 = mwBlock15ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock15ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab15;
                                mwAnimDataXThr2 = mwBlock15ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock15ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab15;
                                    mwAnimDataXThr3 = mwBlock15ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock15ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab16;
                            mwAnimDataXThr1 = mwBlock16ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock16ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab16;
                                mwAnimDataXThr2 = mwBlock16ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock16ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab16;
                                    mwAnimDataXThr3 = mwBlock16ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock16ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab17.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab17;
                            mwAnimDataXThr1 = mwBlock17ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock17ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab17;
                                mwAnimDataXThr2 = mwBlock17ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock17ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab17;
                                    mwAnimDataXThr3 = mwBlock17ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock17ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab18.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab18;
                            mwAnimDataXThr1 = mwBlock18ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock18ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab18;
                                mwAnimDataXThr2 = mwBlock18ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock18ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab18;
                                    mwAnimDataXThr3 = mwBlock18ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock18ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab19.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab19;
                            mwAnimDataXThr1 = mwBlock19ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock19ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab19;
                                mwAnimDataXThr2 = mwBlock19ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock19ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab19;
                                    mwAnimDataXThr3 = mwBlock19ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock19ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwBlockTab20.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBlockTab20;
                            mwAnimDataXThr1 = mwBlock20ObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBlock20ObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBlockTab20;
                                mwAnimDataXThr2 = mwBlock20ObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBlock20ObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBlockTab20;
                                    mwAnimDataXThr3 = mwBlock20ObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBlock20ObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
        mwItemTab1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                        mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                        mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                        mwItemSelected = "1";
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwItemTab1;
                            mwAnimDataXThr1 = mwItemTab1AnimationScaleX;
                            mwAnimDataYThr1 = mwItemTab1AnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwItemTab1;
                                mwAnimDataXThr2 = mwItemTab1AnimationScaleX;
                                mwAnimDataYThr2 = mwItemTab1AnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwItemTab1;
                                    mwAnimDataXThr3 = mwItemTab1AnimationScaleX;
                                    mwAnimDataYThr3 = mwItemTab1AnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
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
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwItemTab2;
                            mwAnimDataXThr1 = mwItemTab2AnimationScaleX;
                            mwAnimDataYThr1 = mwItemTab2AnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwItemTab2;
                                mwAnimDataXThr2 = mwItemTab2AnimationScaleX;
                                mwAnimDataYThr2 = mwItemTab2AnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwItemTab2;
                                    mwAnimDataXThr3 = mwItemTab2AnimationScaleX;
                                    mwAnimDataYThr3 = mwItemTab2AnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
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
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwItemTab3;
                            mwAnimDataXThr1 = mwItemTab3AnimationScaleX;
                            mwAnimDataYThr1 = mwItemTab3AnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwItemTab3;
                                mwAnimDataXThr2 = mwItemTab3AnimationScaleX;
                                mwAnimDataYThr2 = mwItemTab3AnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwItemTab3;
                                    mwAnimDataXThr3 = mwItemTab3AnimationScaleX;
                                    mwAnimDataYThr3 = mwItemTab3AnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                }
                            }
                        }
                    }
                });
    }
}
