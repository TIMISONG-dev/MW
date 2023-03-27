package uniconteam.magicworld;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;
import com.itsaky.androidide.logsender.LogSender;
import uniconteam.magicworld.MwBattleFieldActivity;
import uniconteam.magicworld.MwConsortium;
import uniconteam.magicworld.MwPlayHomeActivity;
import uniconteam.magicworld.MwPlayMainActivity;

public class MwPlayMainActivity extends AppCompatActivity {
    // All objects
    public ImageView mwLogoImg; // Image logo magic world
    public Button mwPlayButton; // Play button
    public Button mwBattleFieldButton; // Battlefield button
    public static ObjectAnimator mwLogoObjAnimationScaleX = new ObjectAnimator(); // Logo animation ScaleX, ScaleY
    public static ObjectAnimator mwLogoObjAnimationScaleY = new ObjectAnimator();
    public static ObjectAnimator mwPlayButtonObjAnimationScaleX = new ObjectAnimator(); // Play button animation ScaleX, ScaleY
    public static ObjectAnimator mwPlayButtonObjAnimationScaleY = new ObjectAnimator();
    public static ObjectAnimator mwBattleFieldButtonObjAnimationScaleX = new ObjectAnimator(); // Battlefield button animation ScaleX, ScaleY
    public static ObjectAnimator mwBattleFieldButtonObjAnimationScaleY = new ObjectAnimator();
    private Intent mwIntent = new Intent(); // Intent for launching new activity
    public static TimerTask mwTimerTask;
    public static Timer _mwTimerTask = new Timer();

    public static TimerTask mwTimerTaskThr1;
    public static Timer _mwTimerTaskThr1 = new Timer();
    public static View mwAnimObjDataThr1; // View for mwClick
    public static float mwAnimFloats1Thr1; // Floats for mwClick 1-3 \/
    public static float mwAnimFloats2Thr1;
    public static float mwAnimFloats3Thr1;
    public static ObjectAnimator mwAnimDataXThr1 = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public static ObjectAnimator mwAnimDataYThr1 = new ObjectAnimator();
    public static Boolean mwAnimRuleThr1 = true; // Bool for allowing or denying mwClick

    public static TimerTask mwTimerTaskThr2;
    public static Timer _mwTimerTaskThr2 = new Timer();
    public static View mwAnimObjDataThr2; // View for mwClick
    public static float mwAnimFloats1Thr2; // Floats for mwClick 1-3 \/
    public static float mwAnimFloats2Thr2;
    public static float mwAnimFloats3Thr2;
    public static ObjectAnimator mwAnimDataXThr2 = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public static ObjectAnimator mwAnimDataYThr2 = new ObjectAnimator();
    public static Boolean mwAnimRuleThr2 = true; // Bool for allowing or denying mwClick

    public static TimerTask mwTimerTaskThr3;
    public static Timer _mwTimerTaskThr3 = new Timer();
    public static View mwAnimObjDataThr3; // View for mwClick
    public static float mwAnimFloats1Thr3; // Floats for mwClick 1-3 \/
    public static float mwAnimFloats2Thr3;
    public static float mwAnimFloats3Thr3;
    public static ObjectAnimator mwAnimDataXThr3 = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public static ObjectAnimator mwAnimDataYThr3 = new ObjectAnimator();
    public static Boolean mwAnimRuleThr3 = true; // Bool for allowing or denying mwClick
    public static String mwActivity;

    public LinearLayout mwVersionTab;
    public LinearLayout mwCompTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mwplaymain);
        initialize(savedInstanceState);
        initializeLogic();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mwActivity = "mwMain";
    }

    private void initialize(Bundle savedInstanceState) {
        // Design, detect objects id, set Logo image ScaleX, ScaleY
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(Color.parseColor("#5C8368"));
        }
        mwLogoImg = findViewById(R.id.mwLogoImg);
        mwPlayButton = findViewById(R.id.mwPlayButton);
        mwBattleFieldButton = findViewById(R.id.mwBattleFieldButton);
        mwLogoImg.setScaleX((float) (5.0d));
        mwLogoImg.setScaleY((float) (5.0d));
        mwVersionTab = findViewById(R.id.mwVersionTab);
        mwCompTab = findViewById(R.id.mwCompTab);
        mwPlayButton.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        mwBattleFieldButton.setTypeface(Typeface.createFromAsset(getAssets(), "mwFonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        
        if (Build.VERSION.SDK_INT >= 21) {
            mwVersionTab.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            mwCompTab.setElevation(8f);
        }
    }

    private void initializeLogic() {

        MwConsortium mwConsortium = new MwConsortium();
        // Onclick functions
        mwTimerTask =
                new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(
                                new Runnable() {
                                    @Override
                                    public void run() {
                                        if (mwAnimRuleThr1) {
                                            mwAnimObjDataThr1 = mwLogoImg;
                                            mwAnimFloats1Thr1 = 0.9f;
                                            mwAnimFloats2Thr1 = 1.1f;
                                            mwAnimFloats3Thr1 = 1.0f;
                                            mwAnimDataXThr1 = mwLogoObjAnimationScaleX;
                                            mwAnimDataYThr1 = mwLogoObjAnimationScaleY;
                                            mwConsortium.mwClick();
                                        } else {
                                            if (mwAnimRuleThr2) {
                                                mwAnimObjDataThr2 = mwLogoImg;
                                                mwAnimFloats1Thr2 = 0.9f;
                                                mwAnimFloats2Thr2 = 1.1f;
                                                mwAnimFloats3Thr2 = 1.0f;
                                                mwAnimDataXThr2 = mwLogoObjAnimationScaleX;
                                                mwAnimDataYThr2 = mwLogoObjAnimationScaleY;
                                                mwConsortium.mwClick();
                                            } else {
                                                if (mwAnimRuleThr3) {
                                                    mwAnimObjDataThr3 = mwLogoImg;
                                                    mwAnimFloats1Thr3 = 0.9f;
                                                    mwAnimFloats2Thr3 = 1.1f;
                                                    mwAnimFloats3Thr3 = 1.0f;
                                                    mwAnimDataXThr3 = mwLogoObjAnimationScaleX;
                                                    mwAnimDataYThr3 = mwLogoObjAnimationScaleY;
                                                    mwConsortium.mwClick();
                                                }
                                            }
                                        }
                                    }
                                });
                    }
                };
        _mwTimerTask.schedule(mwTimerTask, 500);

        mwPlayButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwPlayButton;
                            mwAnimDataXThr1 = mwPlayButtonObjAnimationScaleX;
                            mwAnimDataYThr1 = mwPlayButtonObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                            mwTimerTask =
                                    new TimerTask() {
                                        @Override
                                        public void run() {
                                            runOnUiThread(
                                                    new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            mwIntent.setClass(
                                                                    getApplicationContext(),
                                                                    MwPlayHomeActivity.class);
                                                            startActivity(mwIntent);
                                                        }
                                                    });
                                        }
                                    };
                            _mwTimerTask.schedule(mwTimerTask, 250);
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwPlayButton;
                                mwAnimDataXThr2 = mwPlayButtonObjAnimationScaleX;
                                mwAnimDataYThr2 = mwPlayButtonObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                                mwTimerTask =
                                        new TimerTask() {
                                            @Override
                                            public void run() {
                                                runOnUiThread(
                                                        new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                mwIntent.setClass(
                                                                        getApplicationContext(),
                                                                        MwPlayHomeActivity.class);
                                                                startActivity(mwIntent);
                                                            }
                                                        });
                                            }
                                        };
                                _mwTimerTask.schedule(mwTimerTask, 250);
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwPlayButton;
                                    mwAnimDataXThr3 = mwPlayButtonObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwPlayButtonObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                    mwTimerTask =
                                            new TimerTask() {
                                                @Override
                                                public void run() {
                                                    runOnUiThread(
                                                            new Runnable() {
                                                                @Override
                                                                public void run() {
                                                                    mwIntent.setClass(
                                                                            getApplicationContext(),
                                                                            MwPlayHomeActivity
                                                                                    .class);
                                                                    startActivity(mwIntent);
                                                                }
                                                            });
                                                }
                                            };
                                    _mwTimerTask.schedule(mwTimerTask, 250);
                                }
                            }
                        }
                    }
                });
        mwBattleFieldButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mwAnimRuleThr1) {
                            mwAnimObjDataThr1 = mwBattleFieldButton;
                            mwAnimDataXThr1 = mwBattleFieldButtonObjAnimationScaleX;
                            mwAnimDataYThr1 = mwBattleFieldButtonObjAnimationScaleY;
                            mwAnimFloats1Thr1 = 1.1f;
                            mwAnimFloats2Thr1 = 0.9f;
                            mwAnimFloats3Thr1 = 1.0f;
                            mwConsortium.mwClick();
                            mwTimerTask =
                                    new TimerTask() {
                                        @Override
                                        public void run() {
                                            runOnUiThread(
                                                    new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            mwIntent.setClass(
                                                                    getApplicationContext(),
                                                                    MwBattleFieldActivity.class);
                                                            startActivity(mwIntent);
                                                        }
                                                    });
                                        }
                                    };
                            _mwTimerTask.schedule(mwTimerTask, 250);
                        } else {
                            if (mwAnimRuleThr2) {
                                mwAnimObjDataThr2 = mwBattleFieldButton;
                                mwAnimDataXThr2 = mwBattleFieldButtonObjAnimationScaleX;
                                mwAnimDataYThr2 = mwBattleFieldButtonObjAnimationScaleY;
                                mwAnimFloats1Thr2 = 1.1f;
                                mwAnimFloats2Thr2 = 0.9f;
                                mwAnimFloats3Thr2 = 1.0f;
                                mwConsortium.mwClick();
                                mwTimerTask =
                                        new TimerTask() {
                                            @Override
                                            public void run() {
                                                runOnUiThread(
                                                        new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                mwIntent.setClass(
                                                                        getApplicationContext(),
                                                                        MwBattleFieldActivity
                                                                                .class);
                                                                startActivity(mwIntent);
                                                            }
                                                        });
                                            }
                                        };
                                _mwTimerTask.schedule(mwTimerTask, 250);
                            } else {
                                if (mwAnimRuleThr3) {
                                    mwAnimObjDataThr3 = mwBattleFieldButton;
                                    mwAnimDataXThr3 = mwBattleFieldButtonObjAnimationScaleX;
                                    mwAnimDataYThr3 = mwBattleFieldButtonObjAnimationScaleY;
                                    mwAnimFloats1Thr3 = 1.1f;
                                    mwAnimFloats2Thr3 = 0.9f;
                                    mwAnimFloats3Thr3 = 1.0f;
                                    mwConsortium.mwClick();
                                    mwTimerTask =
                                            new TimerTask() {
                                                @Override
                                                public void run() {
                                                    runOnUiThread(
                                                            new Runnable() {
                                                                @Override
                                                                public void run() {
                                                                    mwIntent.setClass(
                                                                            getApplicationContext(),
                                                                            MwBattleFieldActivity
                                                                                    .class);
                                                                    startActivity(mwIntent);
                                                                }
                                                            });
                                                }
                                            };
                                    _mwTimerTask.schedule(mwTimerTask, 250);
                                }
                            }
                        }
                    }
                });
    }
}
