package uniconteam.magicworld;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;
import uniconteam.magicworld.MwPlayHomeActivity;

public class MwPlayHomeActivity extends AppCompatActivity {
    // all objects
	public LinearLayout mwDataBoxLinear;
	public TextView mwDataBoxCoinCount;
	public TextView mwDataBoxLevelCount;
	public LinearLayout mwWinBoxLinear;
	public TextView mwWinBoxCupCount;
	public LinearLayout mwItemBoxLinear;
	public LinearLayout mwItemTab1;
	public LinearLayout mwItemTab2;
	public LinearLayout mwItemTab3;
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
    private TimerTask mwTimerTask;
    private Timer _mwTimerTask = new Timer();
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
    private ObjectAnimator mwDataBoxAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwDataBoxAnimationScaleY = new ObjectAnimator();
    private ObjectAnimator mwWinBoxAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwWinBoxAnimationScaleY = new ObjectAnimator();
    public View mwAnimObjData;
    public String mwItemSelected;
    public ImageView mwAnimImageData;
    public Boolean mwAnimRule = true;
    public Boolean mwAnimCirclesRule = true;
    public ObjectAnimator mwAnimDataX = new ObjectAnimator();
    public ObjectAnimator mwAnimDataY = new ObjectAnimator();
    
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.mwplayhome);
			initialize(savedInstanceState);
		}
        @Override
        protected void onResume(){
            super.onResume();
            SharedPreferences mwPlayData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
            mwItemSelected = mwPlayData.getString("mwItemSelected","");
            if (mwItemSelected.equals("1")){
            mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
            mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
            mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
            } 
            else {
            if(mwItemSelected.equals("2")){
            mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
            mwItemTab2.setBackgroundResource(R.drawable.mw_selectedbox_layout);
            mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
            }
            else {
            if(mwItemSelected.equals("3")){
            mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
            mwItemTab3.setBackgroundResource(R.drawable.mw_selectedbox_layout);
            mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
              }
                else {
                    mwItemSelected = "1";
                    mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                    mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                    mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                }
            }
          }
        }
        @Override
        protected void onPause(){
            super.onPause();
            SharedPreferences mwPlayData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
            SharedPreferences.Editor mwEditData = mwPlayData.edit();
            mwEditData.putString("mwItemSelected", mwItemSelected.toString());
            mwEditData.apply();
        }
    
	public void initialize (Bundle savedInstanceState) {
        // All objects id
		mwDataBoxLinear = findViewById(R.id.mwDataBoxLinear); // LinearLayout with coins and levels
		mwDataBoxCoinCount = findViewById(R.id.mwDataBoxCoinCount); // TextView coin count
		mwDataBoxLevelCount = findViewById(R.id.mwDataBoxLevelCount); // TextView level count
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
        
        // Design
		if (Build.VERSION.SDK_INT >= 21) { getWindow().setNavigationBarColor(Color.parseColor("#FF61CBFF"));}
		if(Build.VERSION.SDK_INT >= 21) { getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
		getWindow().setStatusBarColor(Color.parseColor("#FF3DBFFF"));}
		if(Build.VERSION.SDK_INT >= 21) { mwDataBoxLinear.setElevation(10f); }
		if(Build.VERSION.SDK_INT >= 21) { mwWinBoxLinear.setElevation(10f); }
		if(Build.VERSION.SDK_INT >= 21) { mwItemBoxLinear.setElevation(10f); }
		if(Build.VERSION.SDK_INT >= 21) { mwItemTab1.setElevation(10f); }
		if(Build.VERSION.SDK_INT >= 21) { mwItemTab2.setElevation(10f); }
		if(Build.VERSION.SDK_INT >= 21) { mwItemTab3.setElevation(10f); }
		mwDataBoxCoinCount.setTypeface(Typeface.createFromAsset(getAssets(),"mwFonts/magicworld_google_sans_regular.tmp"), Typeface.NORMAL);
		mwDataBoxLevelCount.setTypeface(Typeface.createFromAsset(getAssets(),"mwFonts/magicworld_google_sans_regular.tmp"), Typeface.NORMAL);
		mwWinBoxCupCount.setTypeface(Typeface.createFromAsset(getAssets(),"mwFonts/magicworld_google_sans_regular.tmp"), Typeface.NORMAL);
        
        // Onclick  functions
        mwDataBoxLinear.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View viww){
                    if (mwAnimRule){
                    mwAnimObjData = mwDataBoxLinear;
                    mwAnimDataX = mwDataBoxAnimationScaleX;
                    mwAnimDataY = mwDataBoxAnimationScaleY;
                    MwClickXY();
                  }
                }
        });
        mwWinBoxLinear.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View viww){
                    if (mwAnimRule){
                    mwAnimObjData = mwWinBoxLinear;
                    mwAnimDataX = mwWinBoxAnimationScaleX;
                    mwAnimDataY = mwWinBoxAnimationScaleY;
                    MwClickXY();
                  }
                }
        });
        mwBlockTab1.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab1;
                    mwAnimImageData = mwBlockTab1;   
                    mwAnimDataX = mwBlock1ObjAnimationScaleX;
                    mwAnimDataY = mwBlock1ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                  }
                }
       });
        mwBlockTab2.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab2;
                    mwAnimImageData = mwBlockTab2;   
                    mwAnimDataX = mwBlock2ObjAnimationScaleX;
                    mwAnimDataY = mwBlock2ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
                }
      });
        mwBlockTab3.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab3;
                    mwAnimImageData = mwBlockTab3;
                    mwAnimDataX = mwBlock3ObjAnimationScaleX;
                    mwAnimDataY = mwBlock3ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
        mwBlockTab4.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab4;
                    mwAnimImageData = mwBlockTab4;
                    mwAnimDataX = mwBlock4ObjAnimationScaleX;
                    mwAnimDataY = mwBlock4ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
        mwBlockTab5.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab5;
                    mwAnimImageData = mwBlockTab5;
                    mwAnimDataX = mwBlock5ObjAnimationScaleX;
                    mwAnimDataY = mwBlock5ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
        mwBlockTab6.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab6;
                    mwAnimImageData = mwBlockTab6;
                    mwAnimDataX = mwBlock6ObjAnimationScaleX;
                    mwAnimDataY = mwBlock6ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwBlockTab7.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab7;
                    mwAnimImageData = mwBlockTab7;
                    mwAnimDataX = mwBlock7ObjAnimationScaleX;
                    mwAnimDataY = mwBlock7ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwBlockTab8.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab8;
                    mwAnimImageData = mwBlockTab8;
                    mwAnimDataX = mwBlock8ObjAnimationScaleX;
                    mwAnimDataY = mwBlock8ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwBlockTab9.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab9;
                    mwAnimImageData = mwBlockTab9;
                    mwAnimDataX = mwBlock9ObjAnimationScaleX;
                    mwAnimDataY = mwBlock9ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwBlockTab10.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab10;
                    mwAnimImageData = mwBlockTab10;
                    mwAnimDataX = mwBlock10ObjAnimationScaleX;
                    mwAnimDataY = mwBlock10ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
        mwBlockTab11.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab11;
                    mwAnimImageData = mwBlockTab11;
                    mwAnimDataX = mwBlock11ObjAnimationScaleX;
                    mwAnimDataY = mwBlock11ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
        mwBlockTab12.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab12;
                    mwAnimImageData = mwBlockTab12;
                    mwAnimDataX = mwBlock12ObjAnimationScaleX;
                    mwAnimDataY = mwBlock12ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwBlockTab13.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab13;
                    mwAnimImageData = mwBlockTab13;
                    mwAnimDataX = mwBlock13ObjAnimationScaleX;
                    mwAnimDataY = mwBlock13ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwBlockTab14.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab14;
                    mwAnimImageData = mwBlockTab14;
                    mwAnimDataX = mwBlock14ObjAnimationScaleX;
                    mwAnimDataY = mwBlock14ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwBlockTab15.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab15;
                    mwAnimImageData = mwBlockTab15;
                    mwAnimDataX = mwBlock15ObjAnimationScaleX;
                    mwAnimDataY = mwBlock15ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
        mwBlockTab16.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab16;
                    mwAnimImageData = mwBlockTab16;
                    mwAnimDataX = mwBlock16ObjAnimationScaleX;
                    mwAnimDataY = mwBlock16ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
        mwBlockTab17.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab17;
                    mwAnimImageData = mwBlockTab17;
                    mwAnimDataX = mwBlock17ObjAnimationScaleX;
                    mwAnimDataY = mwBlock17ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
        mwBlockTab18.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab18;
                    mwAnimImageData = mwBlockTab18;
                    mwAnimDataX = mwBlock18ObjAnimationScaleX;
                    mwAnimDataY = mwBlock18ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwBlockTab19.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab19;
                    mwAnimImageData = mwBlockTab19;
                    mwAnimDataX = mwBlock19ObjAnimationScaleX;
                    mwAnimDataY = mwBlock19ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwBlockTab20.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab20;
                    mwAnimImageData = mwBlockTab20;
                    mwAnimDataX = mwBlock20ObjAnimationScaleX;
                    mwAnimDataY = mwBlock20ObjAnimationScaleY;
                    MwClickXY();
                    MwClickCircles();
                   }
       }
    });
       mwItemTab1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   if(mwAnimRule) {
                mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                mwAnimObjData = mwItemTab1;
                mwItemSelected = "1";       
                MwClickXY();
              }
        }
     });
        mwItemTab2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mwAnimRule){
                mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                mwItemTab2.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);
                mwAnimObjData = mwItemTab2;
                mwItemSelected = "2";
                MwClickXY();
               }
        }
     });
       mwItemTab3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mwAnimRule){
                mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
                mwItemTab3.setBackgroundResource(R.drawable.mw_selectedbox_layout);
                mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
                mwAnimObjData = mwItemTab3;
                mwItemSelected = "3";      
                MwClickXY();
               }
        }
     });
   }
    
   public void MwClickXY(){
        // Animations ScaleX, ScaleY
            mwAnimRule = false;
        mwTimerTask = new TimerTask(){
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          mwAnimDataX.setTarget(mwAnimObjData);
          mwAnimDataX.setPropertyName("scaleX");
          mwAnimDataX.setFloatValues(1.1f);
          mwAnimDataX.setDuration(100);
          mwAnimDataX.start();
          mwAnimDataY.setTarget(mwAnimObjData);
          mwAnimDataY.setPropertyName("scaleY");
          mwAnimDataY.setFloatValues(1.1f);
          mwAnimDataY.setDuration(100);
          mwAnimDataY.start();
          mwTimerTask = new TimerTask(){
           public void run(){
            runOnUiThread(new Runnable(){
              @Override
              public void run(){
               mwAnimDataX.setTarget(mwAnimObjData);
               mwAnimDataX.setPropertyName("scaleX");
               mwAnimDataX.setFloatValues(0.9f);
               mwAnimDataX.setDuration(200);
               mwAnimDataX.start();
               mwAnimDataY.setTarget(mwAnimObjData);
               mwAnimDataY.setPropertyName("scaleY");
               mwAnimDataY.setFloatValues(0.9f);
               mwAnimDataY.setDuration(200);
               mwAnimDataY.start();
               mwTimerTask = new TimerTask(){
                public void run(){
                 runOnUiThread(new Runnable(){
                   @Override
                   public void run(){
                    mwAnimDataX.setTarget(mwAnimObjData);
                    mwAnimDataX.setPropertyName("scaleX");
                    mwAnimDataX.setFloatValues(1.0f);
                    mwAnimDataX.setDuration(250);
                    mwAnimDataX.start();
                    mwAnimDataY.setTarget(mwAnimObjData);
                    mwAnimDataY.setPropertyName("scaleY");
                    mwAnimDataY.setFloatValues(1.0f);
                    mwAnimDataY.setDuration(250);
                    mwAnimDataY.start();
                    mwTimerTask = new TimerTask(){
                    public void run(){
                    runOnUiThread(new Runnable(){
                    @Override
                    public void run(){
                    mwAnimRule = true;
                   }
                  });
                }
               };
               _mwTimerTask.schedule(mwTimerTask, 250);                                                
                   }
                  });
                }
               };
               _mwTimerTask.schedule(mwTimerTask, 200);
              }
             });
           }
          };
          _mwTimerTask.schedule(mwTimerTask, 100);
         }
        });
      }
     };
     _mwTimerTask.schedule(mwTimerTask, 0);
   };
    public void MwClickCircles(){
      // Animations img
      mwTimerTask = new TimerTask(){
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_1));
          mwTimerTask = new TimerTask(){
           public void run(){
            runOnUiThread(new Runnable(){
              public void run(){
               mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_2));
               mwTimerTask = new TimerTask(){
                public void run(){
                 runOnUiThread(new Runnable(){
                   public void run(){
                    mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_3));
                    mwTimerTask = new TimerTask(){
                     public void run(){
                      runOnUiThread(new Runnable(){
                        public void run(){
                         mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_4));
                         mwTimerTask = new TimerTask(){
                          public void run(){
                           runOnUiThread(new Runnable(){
                             public void run(){
                              mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_5));
                              mwTimerTask = new TimerTask(){
                               public void run(){
                                runOnUiThread(new Runnable(){
                                  public void run(){
                                   mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_4));
                                   mwTimerTask = new TimerTask(){
                                    public void run(){
                                     runOnUiThread(new Runnable(){
                                       public void run(){
                                        mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_3));
                                        mwTimerTask = new TimerTask(){
                                         public void run(){
                                          runOnUiThread(new Runnable(){
                                            public void run(){
                                             mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_2));
                                             mwTimerTask = new TimerTask(){
                                              public void run(){
                                               runOnUiThread(new Runnable(){
                                                 public void run(){
                                                  mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_1));
                                                  mwTimerTask = new TimerTask(){
                                                   public void run(){
                                                    runOnUiThread(new Runnable(){
                                                      public void run(){
                                                       mwAnimImageData.setImageDrawable(getDrawable(R.drawable.magicworld_block_grass));
                                                      }
                                                     });
                                                   }
                                                  };
                                                  _mwTimerTask.schedule(mwTimerTask, 30);
                                                 }
                                                });
                                              }
                                             };
                                             _mwTimerTask.schedule(mwTimerTask, 30);
                                            }
                                           });
                                         }
                                        };
                                        _mwTimerTask.schedule(mwTimerTask, 30);
                                       }
                                      });
                                    }
                                   };
                                   _mwTimerTask.schedule(mwTimerTask, 30);
                                  }
                                 });
                               }
                              };
                              _mwTimerTask.schedule(mwTimerTask, 30);
                             }
                            });
                          }
                         };
                         _mwTimerTask.schedule(mwTimerTask, 30);
                        }
                       });
                     }
                    };
                    _mwTimerTask.schedule(mwTimerTask, 30);
                   }
                  });
                }
               };
               _mwTimerTask.schedule(mwTimerTask, 30);
              }
             });
           }
          };
          _mwTimerTask.schedule(mwTimerTask, 30);
         }
        });
      }
     };
     _mwTimerTask.schedule(mwTimerTask, 30);
   }
}