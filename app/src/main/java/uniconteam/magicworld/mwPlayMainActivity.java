package uniconteam.magicworld;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;
import com.itsaky.androidide.logsender.LogSender;
import uniconteam.magicworld.MwBattleFieldActivity;

public class MwPlayMainActivity extends AppCompatActivity {
    // All objects
    private ImageView mwLogoImg; // Image logo magic world
	private Button mwPlayButton; // Play button
	private Button mwBattleFieldButton; // Battlefield button
	private ObjectAnimator mwLogoObjAnimationScaleX = new ObjectAnimator(); // Logo animation ScaleX, ScaleY
	private ObjectAnimator mwLogoObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwPlayButtonObjAnimationScaleX = new ObjectAnimator(); // Play button animation ScaleX, ScaleY
	private ObjectAnimator mwPlayButtonObjAnimationScaleY = new ObjectAnimator();
    private ObjectAnimator mwBattleFieldButtonObjAnimationScaleX = new ObjectAnimator(); // Battlefield button animation ScaleX, ScaleY
    private ObjectAnimator mwBattleFieldButtonObjAnimationScaleY = new ObjectAnimator();
	private TimerTask mwTimerTask;
	private Timer _mwTimerTask  = new Timer();
	private Intent mwIntent = new Intent(); // Intent for launching new activity
    
    public View mwAnimObjData; // View for mwClick
    public float mwAnimFloats1; // Floats for mwClick 1-3 \/
    public float mwAnimFloats2;
    public float mwAnimFloats3;
    public ObjectAnimator mwAnimDataX = new ObjectAnimator(); // Animator for mwClick ScaleX, ScaleY
    public ObjectAnimator mwAnimDataY = new ObjectAnimator();
    public Boolean mwAnimRule; // Bool for allowing or denying mwClick
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mwplaymain);
		initialize(savedInstanceState);
		initializeLogic();
    }
	private void initialize(Bundle savedInstanceState) {
        // Design, detect objects id, set Logo image ScaleX, ScaleY
		if (Build.VERSION.SDK_INT >= 21) { getWindow().setNavigationBarColor(Color.parseColor("#5C8368"));}
        mwAnimRule = true;
        if (mwAnimRule){
		mwLogoImg = findViewById(R.id.mwLogoImg);
		mwPlayButton = findViewById(R.id.mwPlayButton);
		mwBattleFieldButton = findViewById(R.id.mwBattleFieldButton);
		mwLogoImg.setScaleX((float)(5.0d));
		mwLogoImg.setScaleY((float)(5.0d));
       }
	}
	private void initializeLogic(){
        // Onclick functions
        mwTimerTask = new TimerTask(){
                        @Override
            public void run(){
                            runOnUiThread(new Runnable(){
                                @Override
                                public void run(){
                            if (mwAnimRule){
                                mwAnimObjData = mwLogoImg;
                                mwAnimFloats1 = 0.9f;
                                mwAnimFloats2 = 1.1f;
                                mwAnimFloats3 = 1.0f;
                                mwAnimDataX = mwLogoObjAnimationScaleX;
                                mwAnimDataY = mwLogoObjAnimationScaleY;
                                mwClick();
                                }
                            }
                         });
                       }
                    };
                    _mwTimerTask.schedule(mwTimerTask, 500);
   
		mwPlayButton.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View view){
                    if (mwAnimRule){
                   mwAnimObjData = mwPlayButton;
                   mwAnimDataX = mwPlayButtonObjAnimationScaleX;
                   mwAnimDataY = mwPlayButtonObjAnimationScaleY;
                   mwAnimFloats1 = 1.1f;
                   mwAnimFloats2 = 0.9f;
                   mwAnimFloats3 = 1.0f; 
                    mwClick();
                    mwTimerTask = new TimerTask(){
                        @Override
            public void run(){
                            runOnUiThread(new Runnable(){
                                @Override
                                public void run(){
                                mwIntent.setClass(getApplicationContext(), MwPlayHomeActivity.class);
								startActivity(mwIntent);
                            }
                         });
                       }
                    };
                    _mwTimerTask.schedule(mwTimerTask, 250);
                        }
			    }
			});
			mwBattleFieldButton.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View view){
                    if (mwAnimRule){
				   mwAnimObjData = mwBattleFieldButton;
                   mwAnimDataX = mwBattleFieldButtonObjAnimationScaleX;
                   mwAnimDataY = mwBattleFieldButtonObjAnimationScaleY;
                   mwAnimFloats1 = 1.1f;
                   mwAnimFloats2 = 0.9f;
                   mwAnimFloats3 = 1.0f; 
                    mwClick();
                    mwTimerTask = new TimerTask(){
                        @Override
            public void run(){
                            runOnUiThread(new Runnable(){
                                @Override
                                public void run(){
                                mwIntent.setClass(getApplicationContext(), MwBattleFieldActivity.class);
								startActivity(mwIntent);
                            }
                         });
                       }
                    };
                    _mwTimerTask.schedule(mwTimerTask, 250);
                        }
				}
			});
   }
    public void mwClick(){
        // Animation ScaleX, ScaleY
        mwAnimRule = false;
       mwTimerTask = new TimerTask(){
						@Override
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwAnimDataX.setTarget(mwAnimObjData);
										mwAnimDataX.setPropertyName("scaleX");
										mwAnimDataX.setFloatValues(mwAnimFloats1);
										mwAnimDataX.setDuration(100);
										mwAnimDataX.start();
										mwAnimDataY.setTarget(mwAnimObjData);
										mwAnimDataY.setPropertyName("scaleY");
										mwAnimDataY.setFloatValues(mwAnimFloats1);
										mwAnimDataY.setDuration(100);
										mwAnimDataY.start();
										mwTimerTask = new TimerTask(){
											@Override
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwAnimDataX.setTarget(mwAnimObjData);
															mwAnimDataX.setPropertyName("scaleX");
															mwAnimDataX.setFloatValues(mwAnimFloats2);
															mwAnimDataX.setDuration(200);
															mwAnimDataX.start();
															mwAnimDataY.setTarget(mwAnimObjData);
															mwAnimDataY.setPropertyName("scaleY");
															mwAnimDataY.setFloatValues(mwAnimFloats2);
															mwAnimDataY.setDuration(200);
															mwAnimDataY.start();
															mwTimerTask = new TimerTask(){
																@Override
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwAnimDataX.setTarget(mwAnimObjData);
																				mwAnimDataX.setPropertyName("scaleX");
																				mwAnimDataX.setFloatValues(mwAnimFloats3);
																				mwAnimDataX.setDuration(250);
																				mwAnimDataX.start();
																				mwAnimDataY.setTarget(mwAnimObjData);
																				mwAnimDataY.setPropertyName("scaleY");
																				mwAnimDataY.setFloatValues(mwAnimFloats3);
																				mwAnimDataY.setDuration(250);
																				mwAnimDataY.start();
                                                                                mwAnimRule = true;
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
				}
}