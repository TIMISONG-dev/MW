package uniconteam.magicworld;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;import com.itsaky.androidide.logsender.LogSender;

public class MwPlayMainActivity extends AppCompatActivity {
    private ImageView mwLogoImg;
	private Button mwPlayButton;
	private Button mwBattleFieldButton;
	private ObjectAnimator mwLogoObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwLogoObjAnimationScaleY = new ObjectAnimator();
	private ObjectAnimator mwPlayButtonObjAnimationScaleX = new ObjectAnimator();
	private ObjectAnimator mwPlayButtonObjAnimationScaleY = new ObjectAnimator();
	private TimerTask mwTimerTask;
	private Timer _mwTimerTask  = new Timer();
	private Intent mwIntent = new Intent();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogSender.startLogging(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mwplaymain);
		initialize(savedInstanceState);
		initializeLogic();
    }
	private void initialize(Bundle savedInstanceState) {
		if (Build.VERSION.SDK_INT >= 21) { getWindow().setNavigationBarColor(Color.parseColor("#5C8368"));}
		mwLogoImg = findViewById(R.id.mwLogoImg);
		mwPlayButton = findViewById(R.id.mwPlayButton);
		mwBattleFieldButton = findViewById(R.id.mwBattleFieldButton);
		mwLogoImg.setScaleX((float)(5.0d));
		mwLogoImg.setScaleY((float)(5.0d));
	}
	private void initializeLogic(){
		mwTimerTask = new TimerTask(){
		  @Override
		  public void run(){
		      runOnUiThread(new Runnable(){
		          @Override
		          public void run(){
    mwLogoObjAnimationScaleX.setTarget(mwLogoImg);
	mwLogoObjAnimationScaleX.setPropertyName("scaleX");
    mwLogoObjAnimationScaleX.setFloatValues((float)(0.9d));
	mwLogoObjAnimationScaleX.setDuration(100);
	mwLogoObjAnimationScaleX.start();
	mwLogoObjAnimationScaleY.setTarget(mwLogoImg);
	mwLogoObjAnimationScaleY.setPropertyName("scaleY");
	mwLogoObjAnimationScaleY.setFloatValues((float)(0.9d));
	mwLogoObjAnimationScaleY.setDuration(100);
	mwLogoObjAnimationScaleY.start();
	    mwTimerTask = new TimerTask(){
		  @Override
		  public void run(){
		      runOnUiThread(new Runnable(){
		        @Override
		        public void run(){
		mwLogoObjAnimationScaleX.setTarget(mwLogoImg);
		mwLogoObjAnimationScaleX.setPropertyName("scaleX");
		mwLogoObjAnimationScaleX.setFloatValues((float)(1.1d));
		mwLogoObjAnimationScaleX.setDuration(200);
		mwLogoObjAnimationScaleX.start();
		mwLogoObjAnimationScaleY.setTarget(mwLogoImg);
		mwLogoObjAnimationScaleY.setPropertyName("scaleY");
		mwLogoObjAnimationScaleY.setFloatValues((float)(1.1d));
		mwLogoObjAnimationScaleY.setDuration(200);
		mwLogoObjAnimationScaleY.start();
		    mwTimerTask = new TimerTask(){
				@Override
				public void run(){
					runOnUiThread(new Runnable(){
						@Override
						public void run(){
							mwLogoObjAnimationScaleX.setTarget(mwLogoImg);
							mwLogoObjAnimationScaleX.setPropertyName("scaleX");
							mwLogoObjAnimationScaleX.setFloatValues((float)(1.0d));
							mwLogoObjAnimationScaleX.setDuration(250);
							mwLogoObjAnimationScaleX.start();
							mwLogoObjAnimationScaleY.setTarget(mwLogoImg);
							mwLogoObjAnimationScaleY.setPropertyName("scaleY");
							mwLogoObjAnimationScaleY.setFloatValues((float)(1.0d));
							mwLogoObjAnimationScaleY.setDuration(250);
							mwLogoObjAnimationScaleY.start();
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
   _mwTimerTask.schedule(mwTimerTask, 500);
   
		mwPlayButton.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View view){
					mwTimerTask = new TimerTask(){
						@Override
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwPlayButtonObjAnimationScaleX.setTarget(mwPlayButton);
										mwPlayButtonObjAnimationScaleX.setPropertyName("scaleX");
										mwPlayButtonObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwPlayButtonObjAnimationScaleX.setDuration(100);
										mwPlayButtonObjAnimationScaleX.start();
										mwPlayButtonObjAnimationScaleY.setTarget(mwPlayButton);
										mwPlayButtonObjAnimationScaleY.setPropertyName("scaleY");
										mwPlayButtonObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwPlayButtonObjAnimationScaleY.setDuration(100);
										mwPlayButtonObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											@Override
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwPlayButtonObjAnimationScaleX.setTarget(mwPlayButton);
															mwPlayButtonObjAnimationScaleX.setPropertyName("scaleX");
															mwPlayButtonObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwPlayButtonObjAnimationScaleX.setDuration(200);
															mwPlayButtonObjAnimationScaleX.start();
															mwPlayButtonObjAnimationScaleY.setTarget(mwPlayButton);
															mwPlayButtonObjAnimationScaleY.setPropertyName("scaleY");
															mwPlayButtonObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwPlayButtonObjAnimationScaleY.setDuration(200);
															mwPlayButtonObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																@Override
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwPlayButtonObjAnimationScaleX.setTarget(mwPlayButton);
																				mwPlayButtonObjAnimationScaleX.setPropertyName("scaleX");
																				mwPlayButtonObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwPlayButtonObjAnimationScaleX.setDuration(250);
																				mwPlayButtonObjAnimationScaleX.start();
																				mwPlayButtonObjAnimationScaleY.setTarget(mwPlayButton);
																				mwPlayButtonObjAnimationScaleY.setPropertyName("scaleY");
																				mwPlayButtonObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwPlayButtonObjAnimationScaleY.setDuration(250);
																				mwPlayButtonObjAnimationScaleY.start();
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
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 250);
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
			});
			mwBattleFieldButton.setOnClickListener(new View.OnClickListener(){
				@Override
				public void onClick(View view){
					mwIntent.setClass(getApplicationContext(), MwBFMapActivity.class);
					startActivity(mwIntent);
				}
			});
   }
}