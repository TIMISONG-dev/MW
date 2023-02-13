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
	public ImageView mwBlockTab6;
    private ImageView mwBlockTab7;
    private ImageView mwBlockTab8;
    private ImageView mwBlockTab9;
    private ImageView mwBlockTab10;
	private ImageView mwBlockTab11;
    private ImageView mwBlockTab12;
    private ImageView mwBlockTab13;
    private ImageView mwBlockTab14;
    private ImageView mwBlockTab15;
	private ImageView mwBlockTab16;
    private ImageView mwBlockTab17;
    private ImageView mwBlockTab18;
    private ImageView mwBlockTab19;
    private ImageView mwBlockTab20;
    private TimerTask mwTimerTask;
    private Timer _mwTimerTask = new Timer();
	private ObjectAnimator mwBlock1ObjAnimationScaleX = new ObjectAnimator();
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
	private ObjectAnimator mwBlock11bjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwBlock11bjAnimationScaleY = new ObjectAnimator();
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
	private ObjectAnimator mwDataBoxAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwDataBoxAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwItemTab1AnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwItemTab1AnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwItemTab2AnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwItemTab2AnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwItemTab3AnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwItemTab3AnimationScaleY = new ObjectAnimator();
    private Intent mwIntent = new Intent();
    
    public View mwAnimObjData;
    Boolean mwAnimRule = true;
    public ObjectAnimator mwAnimDataX = new ObjectAnimator();
    public ObjectAnimator mwAnimDataY = new ObjectAnimator();
    
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.mwplayhome);
			initialize(savedInstanceState);
			}
    
	public void initialize (Bundle savedInstanceState) {
		mwDataBoxLinear = findViewById(R.id.mwDataBoxLinear);
		mwDataBoxCoinCount = findViewById(R.id.mwDataBoxCoinCount);
		mwDataBoxLevelCount = findViewById(R.id.mwDataBoxLevelCount);
		mwWinBoxCupCount = findViewById(R.id.mwWinBoxCupCount);
		mwWinBoxLinear = findViewById(R.id.mwWinBoxLinear);
		mwItemBoxLinear = findViewById(R.id.mwItemBoxLinear);
		mwItemTab1 = findViewById(R.id.mwItemTab1);
		mwItemTab2 = findViewById(R.id.mwItemTab2);
		mwItemTab3 = findViewById(R.id.mwItemTab3);
        mwBlockTab1 = findViewById(R.id.mwBlockTab1);
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
        
        mwBlockTab1.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab1;
                    mwAnimDataX = mwBlock1ObjAnimationScaleX;
                    mwAnimDataY = mwBlock1ObjAnimationScaleY;
                    MwClick();
                  }
       }
    });
        mwBlockTab2.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab2;
                    mwAnimDataX = mwBlock2ObjAnimationScaleX;
                    mwAnimDataY = mwBlock2ObjAnimationScaleY;
                    MwClick();
                   }
       }
    });
        mwBlockTab3.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab3;
                    mwAnimDataX = mwBlock3ObjAnimationScaleX;
                    mwAnimDataY = mwBlock3ObjAnimationScaleY;
                    MwClick();
                   }
       }
    });
        mwBlockTab4.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab4;
                    mwAnimDataX = mwBlock4ObjAnimationScaleX;
                    mwAnimDataY = mwBlock4ObjAnimationScaleY;
                    MwClick();
                   }
       }
    });
        mwBlockTab5.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab5;
                    mwAnimDataX = mwBlock5ObjAnimationScaleX;
                    mwAnimDataY = mwBlock5ObjAnimationScaleY;
                    MwClick();
                   }
       }
    });
        mwBlockTab6.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab6;
                    mwAnimDataX = mwBlock6ObjAnimationScaleX;
                    mwAnimDataY = mwBlock6ObjAnimationScaleY;
                    MwClick();
                   }
       }
    });
       mwBlockTab7.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab7;
                    mwAnimDataX = mwBlock7ObjAnimationScaleX;
                    mwAnimDataY = mwBlock7ObjAnimationScaleY;
                    MwClick();
                   }
       }
    });
       mwBlockTab8.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab8;
                    mwAnimDataX = mwBlock8ObjAnimationScaleX;
                    mwAnimDataY = mwBlock8ObjAnimationScaleY;
                    MwClick();
                   }
       }
    });
       mwBlockTab9.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab9;
                    mwAnimDataX = mwBlock9ObjAnimationScaleX;
                    mwAnimDataY = mwBlock9ObjAnimationScaleY;
                    MwClick();
                   }
       }
    });
       mwBlockTab10.setOnClickListener(new View.OnClickListener() { 
                @Override
                public void onClick(View view) {
                    if (mwAnimRule){
                    mwAnimObjData = mwBlockTab10;
                    mwAnimDataX = mwBlock10ObjAnimationScaleX;
                    mwAnimDataY = mwBlock10ObjAnimationScaleY;
                    MwClick();
                   }
       }
    });
   }
    
   public void MwClick(){
            mwAnimRule = false;
        mwTimerTask = new TimerTask(){
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          mwAnimDataX.setTarget(mwAnimObjData);
          mwAnimDataX.setPropertyName("scaleX");
          mwAnimDataX.setFloatValues((float)(1.1d));
          mwAnimDataX.setDuration(100);
          mwAnimDataX.start();
          mwAnimDataY.setTarget(mwAnimObjData);
          mwAnimDataY.setPropertyName("scaleY");
          mwAnimDataY.setFloatValues((float)(1.1d));
          mwAnimDataY.setDuration(100);
          mwAnimDataY.start();
          mwTimerTask = new TimerTask(){
           public void run(){
            runOnUiThread(new Runnable(){
              @Override
              public void run(){
               mwAnimDataX.setTarget(mwAnimObjData);
               mwAnimDataX.setPropertyName("scaleX");
               mwAnimDataX.setFloatValues((float)(0.9d));
               mwAnimDataX.setDuration(200);
               mwAnimDataX.start();
               mwAnimDataY.setTarget(mwAnimObjData);
               mwAnimDataY.setPropertyName("scaleY");
               mwAnimDataY.setFloatValues((float)(0.9d));
               mwAnimDataY.setDuration(200);
               mwAnimDataY.start();
               mwTimerTask = new TimerTask(){
                public void run(){
                 runOnUiThread(new Runnable(){
                   @Override
                   public void run(){
                    mwAnimDataX.setTarget(mwAnimObjData);
                    mwAnimDataX.setPropertyName("scaleX");
                    mwAnimDataX.setFloatValues((float)(1.0d));
                    mwAnimDataX.setDuration(250);
                    mwAnimDataX.start();
                    mwAnimDataY.setTarget(mwAnimObjData);
                    mwAnimDataY.setPropertyName("scaleY");
                    mwAnimDataY.setFloatValues((float)(1.0d));
                    mwAnimDataY.setDuration(250);
                    mwAnimDataY.start();
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
     _mwTimerTask.schedule(mwTimerTask, 0);
   };
}