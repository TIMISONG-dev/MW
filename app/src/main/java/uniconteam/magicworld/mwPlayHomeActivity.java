package uniconteam.magicworld;

import android.animation.ObjectAnimator;
import android.content.Context;
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

public class mwPlayHomeActivity extends AppCompatActivity {
		
	private LinearLayout mwDataBoxLinear;
	private TextView mwDataBoxCoinCount;
	private TextView mwDataBoxLevelCount;
	private LinearLayout mwWinBoxLinear;
	private TextView mwWinBoxCupCount;
	private LinearLayout mwItemBoxLinear;
	private LinearLayout mwItemTab1;
	private LinearLayout mwItemTab2;
	private LinearLayout mwItemTab3;
    private ImageView mwBlockTab1;
    private ImageView mwBlockTab2;
    private ImageView mwBlockTab3;
    private ImageView mwBlockTab4;
    private ImageView mwBlockTab5;
	private ImageView mwBlockTab6;
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
	
	SharedPreferences mwItemTabSelected;
	
	public static final String mwMainData = "mwItemTabSelected";
	
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.mwplayhome);
			initialize(savedInstanceState);
			mwItemTabSelected = getSharedPreferences(mwMainData, Context.MODE_PRIVATE);
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
        
		mwDataBoxLinear.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View view){
				mwTimerTask = new TimerTask(){
					public void run(){
						runOnUiThread(new Runnable(){
							@Override
							public void run(){
								mwDataBoxAnimationScaleX.setTarget(mwDataBoxLinear);
								mwDataBoxAnimationScaleX.setPropertyName("scaleX");
								mwDataBoxAnimationScaleX.setFloatValues((float)(1.1d));
								mwDataBoxAnimationScaleX.setDuration(100);
								mwDataBoxAnimationScaleX.start();
								mwDataBoxAnimationScaleY.setTarget(mwDataBoxLinear);
								mwDataBoxAnimationScaleY.setPropertyName("scaleY");
								mwDataBoxAnimationScaleY.setFloatValues((float)(1.1d));
								mwDataBoxAnimationScaleY.setDuration(100);
								mwDataBoxAnimationScaleY.start();
								mwTimerTask = new TimerTask(){
									public void run(){
										runOnUiThread(new Runnable(){
											@Override
											public void run(){
												mwDataBoxAnimationScaleX.setTarget(mwDataBoxLinear);
												mwDataBoxAnimationScaleX.setPropertyName("scaleX");
												mwDataBoxAnimationScaleX.setFloatValues((float)(0.9d));
												mwDataBoxAnimationScaleX.setDuration(200);
												mwDataBoxAnimationScaleX.start();
												mwDataBoxAnimationScaleY.setTarget(mwDataBoxLinear);
												mwDataBoxAnimationScaleY.setPropertyName("scaleY");
												mwDataBoxAnimationScaleY.setFloatValues((float)(0.9d));
												mwDataBoxAnimationScaleY.setDuration(200);
												mwDataBoxAnimationScaleY.start();
												mwTimerTask = new TimerTask(){
													public void run(){
														runOnUiThread(new Runnable(){
															@Override
															public void run(){
																mwDataBoxAnimationScaleX.setTarget(mwDataBoxLinear);
																mwDataBoxAnimationScaleX.setPropertyName("scaleX");
																mwDataBoxAnimationScaleX.setFloatValues((float)(1.0d));
																mwDataBoxAnimationScaleX.setDuration(250);
																mwDataBoxAnimationScaleX.start();
																mwDataBoxAnimationScaleY.setTarget(mwDataBoxLinear);
																mwDataBoxAnimationScaleY.setPropertyName("scaleY");
																mwDataBoxAnimationScaleY.setFloatValues((float)(1.0d));
																mwDataBoxAnimationScaleY.setDuration(250);
																mwDataBoxAnimationScaleY.start();
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
		
        mwBlockTab1.setOnClickListener(new View.OnClickListener() {	
                @Override
                public void onClick(View view) {
					
					// Animation ScaleXY
					
				    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
								@Override
								public void run(){
									mwBlock1ObjAnimationScaleX.setTarget(mwBlockTab1);
									mwBlock1ObjAnimationScaleX.setPropertyName("scaleX");
									mwBlock1ObjAnimationScaleX.setFloatValues((float)(1.1d));
									mwBlock1ObjAnimationScaleX.setDuration(100);
									mwBlock1ObjAnimationScaleX.start();
									mwBlock1ObjAnimationScaleY.setTarget(mwBlockTab1);
									mwBlock1ObjAnimationScaleY.setPropertyName("scaleY");
									mwBlock1ObjAnimationScaleY.setFloatValues((float)(1.1d));
									mwBlock1ObjAnimationScaleY.setDuration(100);
									mwBlock1ObjAnimationScaleY.start();
									mwTimerTask = new TimerTask(){
										public void run(){
											runOnUiThread(new Runnable(){
												@Override
												public void run(){
													mwBlock1ObjAnimationScaleX.setTarget(mwBlockTab1);
													mwBlock1ObjAnimationScaleX.setPropertyName("scaleX");
													mwBlock1ObjAnimationScaleX.setFloatValues((float)(0.9d));
													mwBlock1ObjAnimationScaleX.setDuration(200);
													mwBlock1ObjAnimationScaleX.start();
													mwBlock1ObjAnimationScaleY.setTarget(mwBlockTab1);
													mwBlock1ObjAnimationScaleY.setPropertyName("scaleY");
													mwBlock1ObjAnimationScaleY.setFloatValues((float)(0.9d));
													mwBlock1ObjAnimationScaleY.setDuration(200);
													mwBlock1ObjAnimationScaleY.start();
													mwTimerTask = new TimerTask(){
														public void run(){
															runOnUiThread(new Runnable(){
																@Override
																public void run(){
																	mwBlock1ObjAnimationScaleX.setTarget(mwBlockTab1);
																	mwBlock1ObjAnimationScaleX.setPropertyName("scaleX");
																	mwBlock1ObjAnimationScaleX.setFloatValues((float)(1.0d));
																	mwBlock1ObjAnimationScaleX.setDuration(250);
																	mwBlock1ObjAnimationScaleX.start();
																	mwBlock1ObjAnimationScaleY.setTarget(mwBlockTab1);
																	mwBlock1ObjAnimationScaleY.setPropertyName("scaleY");
																	mwBlock1ObjAnimationScaleY.setFloatValues((float)(1.0d));
																	mwBlock1ObjAnimationScaleY.setDuration(250);
																	mwBlock1ObjAnimationScaleY.start();
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
					
					// Image changes
					
                    mwTimerTask = new TimerTask(){
                    public void run(){
                        runOnUiThread(new Runnable(){
                            @Override
                            public void run(){
                                mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
                                mwTimerTask = new TimerTask(){
                                    public void run(){
                                        runOnUiThread(new Runnable(){
                                            public void run(){
                                                mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
												mwTimerTask = new TimerTask(){
													public void run(){
														runOnUiThread(new Runnable(){
															public void run(){
																mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																mwTimerTask = new TimerTask(){
																	public void run(){
																		runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																							public void run(){
																								mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																								mwTimerTask = new TimerTask(){
																									public void run(){
																										runOnUiThread(new Runnable(){
																											public void run(){
																												mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																												mwTimerTask = new TimerTask(){
																													public void run(){
																														runOnUiThread(new Runnable(){
																															public void run(){
																																mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																mwTimerTask = new TimerTask(){
																																	public void run(){
																																		runOnUiThread(new Runnable(){
																																			public void run(){
																																				mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																				mwTimerTask = new TimerTask(){
																																					public void run(){
																																						runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																											public void run(){
																																												mwBlockTab1.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																											}
																																										});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																					}
																																				};
																																				_mwTimerTask.schedule(mwTimerTask, 50);
																																			}
																																		});
																																	}
																																};
																																_mwTimerTask.schedule(mwTimerTask, 50);
																															}
																														});
																													}
																												};
																												_mwTimerTask.schedule(mwTimerTask, 50);
																											}
																										});
																									}
																								};
																								_mwTimerTask.schedule(mwTimerTask, 50);
																							}
																						});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																	}
																};
																_mwTimerTask.schedule(mwTimerTask, 50);
															}
														});
													}
												};
												_mwTimerTask.schedule(mwTimerTask, 50);
                                            }
                                        });
                                    }
                                };
                                _mwTimerTask.schedule(mwTimerTask, 50);
                            }
                        });
                     }
                  };
                  _mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
			
		mwBlockTab2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
					
					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlock2ObjAnimationScaleX.setTarget(mwBlockTab2);
										mwBlock2ObjAnimationScaleX.setPropertyName("scaleX");
										mwBlock2ObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwBlock2ObjAnimationScaleX.setDuration(100);
										mwBlock2ObjAnimationScaleX.start();
										mwBlock2ObjAnimationScaleY.setTarget(mwBlockTab2);
										mwBlock2ObjAnimationScaleY.setPropertyName("scaleY");
										mwBlock2ObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwBlock2ObjAnimationScaleY.setDuration(100);
										mwBlock2ObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwBlock2ObjAnimationScaleX.setTarget(mwBlockTab2);
															mwBlock2ObjAnimationScaleX.setPropertyName("scaleX");
															mwBlock2ObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwBlock2ObjAnimationScaleX.setDuration(200);
															mwBlock2ObjAnimationScaleX.start();
															mwBlock2ObjAnimationScaleY.setTarget(mwBlockTab2);
															mwBlock2ObjAnimationScaleY.setPropertyName("scaleY");
															mwBlock2ObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwBlock2ObjAnimationScaleY.setDuration(200);
															mwBlock2ObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwBlock2ObjAnimationScaleX.setTarget(mwBlockTab2);
																				mwBlock2ObjAnimationScaleX.setPropertyName("scaleX");
																				mwBlock2ObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwBlock2ObjAnimationScaleX.setDuration(250);
																				mwBlock2ObjAnimationScaleX.start();
																				mwBlock2ObjAnimationScaleY.setTarget(mwBlockTab2);
																				mwBlock2ObjAnimationScaleY.setPropertyName("scaleY");
																				mwBlock2ObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwBlock2ObjAnimationScaleY.setDuration(250);
																				mwBlock2ObjAnimationScaleY.start();
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
					
                    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														public void run(){
															mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																								public void run(){
																									mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																									mwTimerTask = new TimerTask(){
																										public void run(){
																											runOnUiThread(new Runnable(){
																													public void run(){
																														mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																														mwTimerTask = new TimerTask(){
																															public void run(){
																																runOnUiThread(new Runnable(){
																																		public void run(){
																																			mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																																			mwTimerTask = new TimerTask(){
																																				public void run(){
																																					runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																												public void run(){
																																													mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																													mwTimerTask = new TimerTask(){
																																														public void run(){
																																															runOnUiThread(new Runnable(){
																																																	public void run(){
																																																		mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																																		mwTimerTask = new TimerTask(){
																																																			public void run(){
																																																				runOnUiThread(new Runnable(){
																																																						public void run(){
																																																							mwBlockTab2.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																																						}
																																																					});
																																																			}
																																																		};
																																																		_mwTimerTask.schedule(mwTimerTask, 50);
																																																	}
																																																});
																																														}
																																													};
																																													_mwTimerTask.schedule(mwTimerTask, 50);
																																												}
																																											});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																				}
																																			};
																																			_mwTimerTask.schedule(mwTimerTask, 50);
																																		}
																																	});
																															}
																														};
																														_mwTimerTask.schedule(mwTimerTask, 50);
																													}
																												});
																										}
																									};
																									_mwTimerTask.schedule(mwTimerTask, 50);
																								}
																							});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 50);
														}
													});
											}
										};
										_mwTimerTask.schedule(mwTimerTask, 50);
									}
								});
						}
					};
					_mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
		mwBlockTab3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
					
					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlock3ObjAnimationScaleX.setTarget(mwBlockTab3);
										mwBlock3ObjAnimationScaleX.setPropertyName("scaleX");
										mwBlock3ObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwBlock3ObjAnimationScaleX.setDuration(100);
										mwBlock3ObjAnimationScaleX.start();
										mwBlock3ObjAnimationScaleY.setTarget(mwBlockTab3);
										mwBlock3ObjAnimationScaleY.setPropertyName("scaleY");
										mwBlock3ObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwBlock3ObjAnimationScaleY.setDuration(100);
										mwBlock3ObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwBlock3ObjAnimationScaleX.setTarget(mwBlockTab3);
															mwBlock3ObjAnimationScaleX.setPropertyName("scaleX");
															mwBlock3ObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwBlock3ObjAnimationScaleX.setDuration(200);
															mwBlock3ObjAnimationScaleX.start();
															mwBlock3ObjAnimationScaleY.setTarget(mwBlockTab3);
															mwBlock3ObjAnimationScaleY.setPropertyName("scaleY");
															mwBlock3ObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwBlock3ObjAnimationScaleY.setDuration(200);
															mwBlock3ObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwBlock3ObjAnimationScaleX.setTarget(mwBlockTab3);
																				mwBlock3ObjAnimationScaleX.setPropertyName("scaleX");
																				mwBlock3ObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwBlock3ObjAnimationScaleX.setDuration(250);
																				mwBlock3ObjAnimationScaleX.start();
																				mwBlock3ObjAnimationScaleY.setTarget(mwBlockTab3);
																				mwBlock3ObjAnimationScaleY.setPropertyName("scaleY");
																				mwBlock3ObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwBlock3ObjAnimationScaleY.setDuration(250);
																				mwBlock3ObjAnimationScaleY.start();
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
					
                    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														public void run(){
															mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																								public void run(){
																									mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																									mwTimerTask = new TimerTask(){
																										public void run(){
																											runOnUiThread(new Runnable(){
																													public void run(){
																														mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																														mwTimerTask = new TimerTask(){
																															public void run(){
																																runOnUiThread(new Runnable(){
																																		public void run(){
																																			mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																																			mwTimerTask = new TimerTask(){
																																				public void run(){
																																					runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																												public void run(){
																																													mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																													mwTimerTask = new TimerTask(){
																																														public void run(){
																																															runOnUiThread(new Runnable(){
																																																	public void run(){
																																																		mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																																		mwTimerTask = new TimerTask(){
																																																			public void run(){
																																																				runOnUiThread(new Runnable(){
																																																						public void run(){
																																																							mwBlockTab3.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																																						}
																																																					});
																																																			}
																																																		};
																																																		_mwTimerTask.schedule(mwTimerTask, 50);
																																																	}
																																																});
																																														}
																																													};
																																													_mwTimerTask.schedule(mwTimerTask, 50);
																																												}
																																											});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																				}
																																			};
																																			_mwTimerTask.schedule(mwTimerTask, 50);
																																		}
																																	});
																															}
																														};
																														_mwTimerTask.schedule(mwTimerTask, 50);
																													}
																												});
																										}
																									};
																									_mwTimerTask.schedule(mwTimerTask, 50);
																								}
																							});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 50);
														}
													});
											}
										};
										_mwTimerTask.schedule(mwTimerTask, 50);
									}
								});
						}
					};
					_mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
		mwBlockTab4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
					
					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlock4ObjAnimationScaleX.setTarget(mwBlockTab4);
										mwBlock4ObjAnimationScaleX.setPropertyName("scaleX");
										mwBlock4ObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwBlock4ObjAnimationScaleX.setDuration(100);
										mwBlock4ObjAnimationScaleX.start();
										mwBlock4ObjAnimationScaleY.setTarget(mwBlockTab4);
										mwBlock4ObjAnimationScaleY.setPropertyName("scaleY");
										mwBlock4ObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwBlock4ObjAnimationScaleY.setDuration(100);
										mwBlock4ObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwBlock4ObjAnimationScaleX.setTarget(mwBlockTab4);
															mwBlock4ObjAnimationScaleX.setPropertyName("scaleX");
															mwBlock4ObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwBlock4ObjAnimationScaleX.setDuration(200);
															mwBlock4ObjAnimationScaleX.start();
															mwBlock4ObjAnimationScaleY.setTarget(mwBlockTab4);
															mwBlock4ObjAnimationScaleY.setPropertyName("scaleY");
															mwBlock4ObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwBlock4ObjAnimationScaleY.setDuration(200);
															mwBlock4ObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwBlock4ObjAnimationScaleX.setTarget(mwBlockTab4);
																				mwBlock4ObjAnimationScaleX.setPropertyName("scaleX");
																				mwBlock4ObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwBlock4ObjAnimationScaleX.setDuration(250);
																				mwBlock4ObjAnimationScaleX.start();
																				mwBlock4ObjAnimationScaleY.setTarget(mwBlockTab4);
																				mwBlock4ObjAnimationScaleY.setPropertyName("scaleY");
																				mwBlock4ObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwBlock4ObjAnimationScaleY.setDuration(250);
																				mwBlock4ObjAnimationScaleY.start();
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
					
                    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														public void run(){
															mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																								public void run(){
																									mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																									mwTimerTask = new TimerTask(){
																										public void run(){
																											runOnUiThread(new Runnable(){
																													public void run(){
																														mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																														mwTimerTask = new TimerTask(){
																															public void run(){
																																runOnUiThread(new Runnable(){
																																		public void run(){
																																			mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																																			mwTimerTask = new TimerTask(){
																																				public void run(){
																																					runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																												public void run(){
																																													mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																													mwTimerTask = new TimerTask(){
																																														public void run(){
																																															runOnUiThread(new Runnable(){
																																																	public void run(){
																																																		mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																																		mwTimerTask = new TimerTask(){
																																																			public void run(){
																																																				runOnUiThread(new Runnable(){
																																																						public void run(){
																																																							mwBlockTab4.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																																						}
																																																					});
																																																			}
																																																		};
																																																		_mwTimerTask.schedule(mwTimerTask, 50);
																																																	}
																																																});
																																														}
																																													};
																																													_mwTimerTask.schedule(mwTimerTask, 50);
																																												}
																																											});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																				}
																																			};
																																			_mwTimerTask.schedule(mwTimerTask, 50);
																																		}
																																	});
																															}
																														};
																														_mwTimerTask.schedule(mwTimerTask, 50);
																													}
																												});
																										}
																									};
																									_mwTimerTask.schedule(mwTimerTask, 50);
																								}
																							});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 50);
														}
													});
											}
										};
										_mwTimerTask.schedule(mwTimerTask, 50);
									}
								});
						}
					};
					_mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
		mwBlockTab5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
					
					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlock5ObjAnimationScaleX.setTarget(mwBlockTab5);
										mwBlock5ObjAnimationScaleX.setPropertyName("scaleX");
										mwBlock5ObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwBlock5ObjAnimationScaleX.setDuration(100);
										mwBlock5ObjAnimationScaleX.start();
										mwBlock5ObjAnimationScaleY.setTarget(mwBlockTab5);
										mwBlock5ObjAnimationScaleY.setPropertyName("scaleY");
										mwBlock5ObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwBlock5ObjAnimationScaleY.setDuration(100);
										mwBlock5ObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwBlock5ObjAnimationScaleX.setTarget(mwBlockTab5);
															mwBlock5ObjAnimationScaleX.setPropertyName("scaleX");
															mwBlock5ObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwBlock5ObjAnimationScaleX.setDuration(200);
															mwBlock5ObjAnimationScaleX.start();
															mwBlock5ObjAnimationScaleY.setTarget(mwBlockTab5);
															mwBlock5ObjAnimationScaleY.setPropertyName("scaleY");
															mwBlock5ObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwBlock5ObjAnimationScaleY.setDuration(200);
															mwBlock5ObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwBlock5ObjAnimationScaleX.setTarget(mwBlockTab5);
																				mwBlock5ObjAnimationScaleX.setPropertyName("scaleX");
																				mwBlock5ObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwBlock5ObjAnimationScaleX.setDuration(250);
																				mwBlock5ObjAnimationScaleX.start();
																				mwBlock5ObjAnimationScaleY.setTarget(mwBlockTab5);
																				mwBlock5ObjAnimationScaleY.setPropertyName("scaleY");
																				mwBlock5ObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwBlock5ObjAnimationScaleY.setDuration(250);
																				mwBlock5ObjAnimationScaleY.start();
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
					
                    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														public void run(){
															mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																								public void run(){
																									mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																									mwTimerTask = new TimerTask(){
																										public void run(){
																											runOnUiThread(new Runnable(){
																													public void run(){
																														mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																														mwTimerTask = new TimerTask(){
																															public void run(){
																																runOnUiThread(new Runnable(){
																																		public void run(){
																																			mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																																			mwTimerTask = new TimerTask(){
																																				public void run(){
																																					runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																												public void run(){
																																													mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																													mwTimerTask = new TimerTask(){
																																														public void run(){
																																															runOnUiThread(new Runnable(){
																																																	public void run(){
																																																		mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																																		mwTimerTask = new TimerTask(){
																																																			public void run(){
																																																				runOnUiThread(new Runnable(){
																																																						public void run(){
																																																							mwBlockTab5.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																																						}
																																																					});
																																																			}
																																																		};
																																																		_mwTimerTask.schedule(mwTimerTask, 50);
																																																	}
																																																});
																																														}
																																													};
																																													_mwTimerTask.schedule(mwTimerTask, 50);
																																												}
																																											});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																				}
																																			};
																																			_mwTimerTask.schedule(mwTimerTask, 50);
																																		}
																																	});
																															}
																														};
																														_mwTimerTask.schedule(mwTimerTask, 50);
																													}
																												});
																										}
																									};
																									_mwTimerTask.schedule(mwTimerTask, 50);
																								}
																							});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 50);
														}
													});
											}
										};
										_mwTimerTask.schedule(mwTimerTask, 50);
									}
								});
						}
					};
					_mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
		mwBlockTab6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlock6ObjAnimationScaleX.setTarget(mwBlockTab6);
										mwBlock6ObjAnimationScaleX.setPropertyName("scaleX");
										mwBlock6ObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwBlock6ObjAnimationScaleX.setDuration(100);
										mwBlock6ObjAnimationScaleX.start();
										mwBlock6ObjAnimationScaleY.setTarget(mwBlockTab6);
										mwBlock6ObjAnimationScaleY.setPropertyName("scaleY");
										mwBlock6ObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwBlock6ObjAnimationScaleY.setDuration(100);
										mwBlock6ObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwBlock6ObjAnimationScaleX.setTarget(mwBlockTab6);
															mwBlock6ObjAnimationScaleX.setPropertyName("scaleX");
															mwBlock6ObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwBlock6ObjAnimationScaleX.setDuration(200);
															mwBlock6ObjAnimationScaleX.start();
															mwBlock6ObjAnimationScaleY.setTarget(mwBlockTab6);
															mwBlock6ObjAnimationScaleY.setPropertyName("scaleY");
															mwBlock6ObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwBlock6ObjAnimationScaleY.setDuration(200);
															mwBlock6ObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwBlock6ObjAnimationScaleX.setTarget(mwBlockTab6);
																				mwBlock6ObjAnimationScaleX.setPropertyName("scaleX");
																				mwBlock6ObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwBlock6ObjAnimationScaleX.setDuration(250);
																				mwBlock6ObjAnimationScaleX.start();
																				mwBlock6ObjAnimationScaleY.setTarget(mwBlockTab6);
																				mwBlock6ObjAnimationScaleY.setPropertyName("scaleY");
																				mwBlock6ObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwBlock6ObjAnimationScaleY.setDuration(250);
																				mwBlock6ObjAnimationScaleY.start();
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

                    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														public void run(){
															mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																								public void run(){
																									mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																									mwTimerTask = new TimerTask(){
																										public void run(){
																											runOnUiThread(new Runnable(){
																													public void run(){
																														mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																														mwTimerTask = new TimerTask(){
																															public void run(){
																																runOnUiThread(new Runnable(){
																																		public void run(){
																																			mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																																			mwTimerTask = new TimerTask(){
																																				public void run(){
																																					runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																												public void run(){
																																													mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																													mwTimerTask = new TimerTask(){
																																														public void run(){
																																															runOnUiThread(new Runnable(){
																																																	public void run(){
																																																		mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																																		mwTimerTask = new TimerTask(){
																																																			public void run(){
																																																				runOnUiThread(new Runnable(){
																																																						public void run(){
																																																							mwBlockTab6.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																																						}
																																																					});
																																																			}
																																																		};
																																																		_mwTimerTask.schedule(mwTimerTask, 50);
																																																	}
																																																});
																																														}
																																													};
																																													_mwTimerTask.schedule(mwTimerTask, 50);
																																												}
																																											});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																				}
																																			};
																																			_mwTimerTask.schedule(mwTimerTask, 50);
																																		}
																																	});
																															}
																														};
																														_mwTimerTask.schedule(mwTimerTask, 50);
																													}
																												});
																										}
																									};
																									_mwTimerTask.schedule(mwTimerTask, 50);
																								}
																							});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 50);
														}
													});
											}
										};
										_mwTimerTask.schedule(mwTimerTask, 50);
									}
								});
						}
					};
					_mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
		mwBlockTab7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlock7ObjAnimationScaleX.setTarget(mwBlockTab7);
										mwBlock7ObjAnimationScaleX.setPropertyName("scaleX");
										mwBlock7ObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwBlock7ObjAnimationScaleX.setDuration(100);
										mwBlock7ObjAnimationScaleX.start();
										mwBlock7ObjAnimationScaleY.setTarget(mwBlockTab7);
										mwBlock7ObjAnimationScaleY.setPropertyName("scaleY");
										mwBlock7ObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwBlock7ObjAnimationScaleY.setDuration(100);
										mwBlock7ObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwBlock7ObjAnimationScaleX.setTarget(mwBlockTab7);
															mwBlock7ObjAnimationScaleX.setPropertyName("scaleX");
															mwBlock7ObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwBlock7ObjAnimationScaleX.setDuration(200);
															mwBlock7ObjAnimationScaleX.start();
															mwBlock7ObjAnimationScaleY.setTarget(mwBlockTab7);
															mwBlock7ObjAnimationScaleY.setPropertyName("scaleY");
															mwBlock7ObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwBlock7ObjAnimationScaleY.setDuration(200);
															mwBlock7ObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwBlock7ObjAnimationScaleX.setTarget(mwBlockTab7);
																				mwBlock7ObjAnimationScaleX.setPropertyName("scaleX");
																				mwBlock7ObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwBlock7ObjAnimationScaleX.setDuration(250);
																				mwBlock7ObjAnimationScaleX.start();
																				mwBlock7ObjAnimationScaleY.setTarget(mwBlockTab7);
																				mwBlock7ObjAnimationScaleY.setPropertyName("scaleY");
																				mwBlock7ObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwBlock7ObjAnimationScaleY.setDuration(250);
																				mwBlock7ObjAnimationScaleY.start();
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

                    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														public void run(){
															mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																								public void run(){
																									mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																									mwTimerTask = new TimerTask(){
																										public void run(){
																											runOnUiThread(new Runnable(){
																													public void run(){
																														mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																														mwTimerTask = new TimerTask(){
																															public void run(){
																																runOnUiThread(new Runnable(){
																																		public void run(){
																																			mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																																			mwTimerTask = new TimerTask(){
																																				public void run(){
																																					runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																												public void run(){
																																													mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																													mwTimerTask = new TimerTask(){
																																														public void run(){
																																															runOnUiThread(new Runnable(){
																																																	public void run(){
																																																		mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																																		mwTimerTask = new TimerTask(){
																																																			public void run(){
																																																				runOnUiThread(new Runnable(){
																																																						public void run(){
																																																							mwBlockTab7.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																																						}
																																																					});
																																																			}
																																																		};
																																																		_mwTimerTask.schedule(mwTimerTask, 50);
																																																	}
																																																});
																																														}
																																													};
																																													_mwTimerTask.schedule(mwTimerTask, 50);
																																												}
																																											});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																				}
																																			};
																																			_mwTimerTask.schedule(mwTimerTask, 50);
																																		}
																																	});
																															}
																														};
																														_mwTimerTask.schedule(mwTimerTask, 50);
																													}
																												});
																										}
																									};
																									_mwTimerTask.schedule(mwTimerTask, 50);
																								}
																							});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 50);
														}
													});
											}
										};
										_mwTimerTask.schedule(mwTimerTask, 50);
									}
								});
						}
					};
					_mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
		mwBlockTab8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlock8ObjAnimationScaleX.setTarget(mwBlockTab8);
										mwBlock8ObjAnimationScaleX.setPropertyName("scaleX");
										mwBlock8ObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwBlock8ObjAnimationScaleX.setDuration(100);
										mwBlock8ObjAnimationScaleX.start();
										mwBlock8ObjAnimationScaleY.setTarget(mwBlockTab8);
										mwBlock8ObjAnimationScaleY.setPropertyName("scaleY");
										mwBlock8ObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwBlock8ObjAnimationScaleY.setDuration(100);
										mwBlock8ObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwBlock8ObjAnimationScaleX.setTarget(mwBlockTab8);
															mwBlock8ObjAnimationScaleX.setPropertyName("scaleX");
															mwBlock8ObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwBlock8ObjAnimationScaleX.setDuration(200);
															mwBlock8ObjAnimationScaleX.start();
															mwBlock8ObjAnimationScaleY.setTarget(mwBlockTab8);
															mwBlock8ObjAnimationScaleY.setPropertyName("scaleY");
															mwBlock8ObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwBlock8ObjAnimationScaleY.setDuration(200);
															mwBlock8ObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwBlock8ObjAnimationScaleX.setTarget(mwBlockTab8);
																				mwBlock8ObjAnimationScaleX.setPropertyName("scaleX");
																				mwBlock8ObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwBlock8ObjAnimationScaleX.setDuration(250);
																				mwBlock8ObjAnimationScaleX.start();
																				mwBlock8ObjAnimationScaleY.setTarget(mwBlockTab8);
																				mwBlock8ObjAnimationScaleY.setPropertyName("scaleY");
																				mwBlock8ObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwBlock8ObjAnimationScaleY.setDuration(250);
																				mwBlock8ObjAnimationScaleY.start();
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

                    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														public void run(){
															mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																								public void run(){
																									mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																									mwTimerTask = new TimerTask(){
																										public void run(){
																											runOnUiThread(new Runnable(){
																													public void run(){
																														mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																														mwTimerTask = new TimerTask(){
																															public void run(){
																																runOnUiThread(new Runnable(){
																																		public void run(){
																																			mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																																			mwTimerTask = new TimerTask(){
																																				public void run(){
																																					runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																												public void run(){
																																													mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																													mwTimerTask = new TimerTask(){
																																														public void run(){
																																															runOnUiThread(new Runnable(){
																																																	public void run(){
																																																		mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																																		mwTimerTask = new TimerTask(){
																																																			public void run(){
																																																				runOnUiThread(new Runnable(){
																																																						public void run(){
																																																							mwBlockTab8.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																																						}
																																																					});
																																																			}
																																																		};
																																																		_mwTimerTask.schedule(mwTimerTask, 50);
																																																	}
																																																});
																																														}
																																													};
																																													_mwTimerTask.schedule(mwTimerTask, 50);
																																												}
																																											});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																				}
																																			};
																																			_mwTimerTask.schedule(mwTimerTask, 50);
																																		}
																																	});
																															}
																														};
																														_mwTimerTask.schedule(mwTimerTask, 50);
																													}
																												});
																										}
																									};
																									_mwTimerTask.schedule(mwTimerTask, 50);
																								}
																							});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 50);
														}
													});
											}
										};
										_mwTimerTask.schedule(mwTimerTask, 50);
									}
								});
						}
					};
					_mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
		mwBlockTab9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlock9ObjAnimationScaleX.setTarget(mwBlockTab9);
										mwBlock9ObjAnimationScaleX.setPropertyName("scaleX");
										mwBlock9ObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwBlock9ObjAnimationScaleX.setDuration(100);
										mwBlock9ObjAnimationScaleX.start();
										mwBlock9ObjAnimationScaleY.setTarget(mwBlockTab9);
										mwBlock9ObjAnimationScaleY.setPropertyName("scaleY");
										mwBlock9ObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwBlock9ObjAnimationScaleY.setDuration(100);
										mwBlock9ObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwBlock9ObjAnimationScaleX.setTarget(mwBlockTab9);
															mwBlock9ObjAnimationScaleX.setPropertyName("scaleX");
															mwBlock9ObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwBlock9ObjAnimationScaleX.setDuration(200);
															mwBlock9ObjAnimationScaleX.start();
															mwBlock9ObjAnimationScaleY.setTarget(mwBlockTab9);
															mwBlock9ObjAnimationScaleY.setPropertyName("scaleY");
															mwBlock9ObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwBlock9ObjAnimationScaleY.setDuration(200);
															mwBlock9ObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwBlock9ObjAnimationScaleX.setTarget(mwBlockTab9);
																				mwBlock9ObjAnimationScaleX.setPropertyName("scaleX");
																				mwBlock9ObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwBlock9ObjAnimationScaleX.setDuration(250);
																				mwBlock9ObjAnimationScaleX.start();
																				mwBlock9ObjAnimationScaleY.setTarget(mwBlockTab9);
																				mwBlock9ObjAnimationScaleY.setPropertyName("scaleY");
																				mwBlock9ObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwBlock9ObjAnimationScaleY.setDuration(250);
																				mwBlock9ObjAnimationScaleY.start();
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

                    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														public void run(){
															mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																								public void run(){
																									mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																									mwTimerTask = new TimerTask(){
																										public void run(){
																											runOnUiThread(new Runnable(){
																													public void run(){
																														mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																														mwTimerTask = new TimerTask(){
																															public void run(){
																																runOnUiThread(new Runnable(){
																																		public void run(){
																																			mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																																			mwTimerTask = new TimerTask(){
																																				public void run(){
																																					runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																												public void run(){
																																													mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																													mwTimerTask = new TimerTask(){
																																														public void run(){
																																															runOnUiThread(new Runnable(){
																																																	public void run(){
																																																		mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																																		mwTimerTask = new TimerTask(){
																																																			public void run(){
																																																				runOnUiThread(new Runnable(){
																																																						public void run(){
																																																							mwBlockTab9.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																																						}
																																																					});
																																																			}
																																																		};
																																																		_mwTimerTask.schedule(mwTimerTask, 50);
																																																	}
																																																});
																																														}
																																													};
																																													_mwTimerTask.schedule(mwTimerTask, 50);
																																												}
																																											});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																				}
																																			};
																																			_mwTimerTask.schedule(mwTimerTask, 50);
																																		}
																																	});
																															}
																														};
																														_mwTimerTask.schedule(mwTimerTask, 50);
																													}
																												});
																										}
																									};
																									_mwTimerTask.schedule(mwTimerTask, 50);
																								}
																							});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 50);
														}
													});
											}
										};
										_mwTimerTask.schedule(mwTimerTask, 50);
									}
								});
						}
					};
					_mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
		mwBlockTab10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlock10ObjAnimationScaleX.setTarget(mwBlockTab10);
										mwBlock10ObjAnimationScaleX.setPropertyName("scaleX");
										mwBlock10ObjAnimationScaleX.setFloatValues((float)(1.1d));
										mwBlock10ObjAnimationScaleX.setDuration(100);
										mwBlock10ObjAnimationScaleX.start();
										mwBlock10ObjAnimationScaleY.setTarget(mwBlockTab10);
										mwBlock10ObjAnimationScaleY.setPropertyName("scaleY");
										mwBlock10ObjAnimationScaleY.setFloatValues((float)(1.1d));
										mwBlock10ObjAnimationScaleY.setDuration(100);
										mwBlock10ObjAnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwBlock10ObjAnimationScaleX.setTarget(mwBlockTab10);
															mwBlock10ObjAnimationScaleX.setPropertyName("scaleX");
															mwBlock10ObjAnimationScaleX.setFloatValues((float)(0.9d));
															mwBlock10ObjAnimationScaleX.setDuration(200);
															mwBlock10ObjAnimationScaleX.start();
															mwBlock10ObjAnimationScaleY.setTarget(mwBlockTab10);
															mwBlock10ObjAnimationScaleY.setPropertyName("scaleY");
															mwBlock10ObjAnimationScaleY.setFloatValues((float)(0.9d));
															mwBlock10ObjAnimationScaleY.setDuration(200);
															mwBlock10ObjAnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwBlock10ObjAnimationScaleX.setTarget(mwBlockTab10);
																				mwBlock10ObjAnimationScaleX.setPropertyName("scaleX");
																				mwBlock10ObjAnimationScaleX.setFloatValues((float)(1.0d));
																				mwBlock10ObjAnimationScaleX.setDuration(250);
																				mwBlock10ObjAnimationScaleX.start();
																				mwBlock10ObjAnimationScaleY.setTarget(mwBlockTab10);
																				mwBlock10ObjAnimationScaleY.setPropertyName("scaleY");
																				mwBlock10ObjAnimationScaleY.setFloatValues((float)(1.0d));
																				mwBlock10ObjAnimationScaleY.setDuration(250);
																				mwBlock10ObjAnimationScaleY.start();
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

                    mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														public void run(){
															mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			public void run(){
																				mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																				mwTimerTask = new TimerTask(){
																					public void run(){
																						runOnUiThread(new Runnable(){
																								public void run(){
																									mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																									mwTimerTask = new TimerTask(){
																										public void run(){
																											runOnUiThread(new Runnable(){
																													public void run(){
																														mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_5));
																														mwTimerTask = new TimerTask(){
																															public void run(){
																																runOnUiThread(new Runnable(){
																																		public void run(){
																																			mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_4));
																																			mwTimerTask = new TimerTask(){
																																				public void run(){
																																					runOnUiThread(new Runnable(){
																																							public void run(){
																																								mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_3));
																																								mwTimerTask = new TimerTask(){
																																									public void run(){
																																										runOnUiThread(new Runnable(){
																																												public void run(){
																																													mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_2));
																																													mwTimerTask = new TimerTask(){
																																														public void run(){
																																															runOnUiThread(new Runnable(){
																																																	public void run(){
																																																		mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_animation_click_1));
																																																		mwTimerTask = new TimerTask(){
																																																			public void run(){
																																																				runOnUiThread(new Runnable(){
																																																						public void run(){
																																																							mwBlockTab10.setImageDrawable(getResources().getDrawable(R.drawable.magicworld_block_grass));
																																																						}
																																																					});
																																																			}
																																																		};
																																																		_mwTimerTask.schedule(mwTimerTask, 50);
																																																	}
																																																});
																																														}
																																													};
																																													_mwTimerTask.schedule(mwTimerTask, 50);
																																												}
																																											});
																																									}
																																								};
																																								_mwTimerTask.schedule(mwTimerTask, 50);
																																							}
																																						});
																																				}
																																			};
																																			_mwTimerTask.schedule(mwTimerTask, 50);
																																		}
																																	});
																															}
																														};
																														_mwTimerTask.schedule(mwTimerTask, 50);
																													}
																												});
																										}
																									};
																									_mwTimerTask.schedule(mwTimerTask, 50);
																								}
																							});
																					}
																				};
																				_mwTimerTask.schedule(mwTimerTask, 50);
																			}
																		});
																}
															};
															_mwTimerTask.schedule(mwTimerTask, 50);
														}
													});
											}
										};
										_mwTimerTask.schedule(mwTimerTask, 50);
									}
								});
						}
					};
					_mwTimerTask.schedule(mwTimerTask, 50);
                }
            });
			
		mwItemTab1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
					
					mwItemTab1.setBackgroundResource(R.drawable.mw_selectedbox_layout);
					mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
					mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);

					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwItemTab1AnimationScaleX.setTarget(mwItemTab1);
										mwItemTab1AnimationScaleX.setPropertyName("scaleX");
										mwItemTab1AnimationScaleX.setFloatValues((float)(1.1d));
										mwItemTab1AnimationScaleX.setDuration(100);
										mwItemTab1AnimationScaleX.start();
										mwItemTab1AnimationScaleY.setTarget(mwItemTab1);
										mwItemTab1AnimationScaleY.setPropertyName("scaleY");
										mwItemTab1AnimationScaleY.setFloatValues((float)(1.1d));
										mwItemTab1AnimationScaleY.setDuration(100);
										mwItemTab1AnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwItemTab1AnimationScaleX.setTarget(mwItemTab1);
															mwItemTab1AnimationScaleX.setPropertyName("scaleX");
															mwItemTab1AnimationScaleX.setFloatValues((float)(0.9d));
															mwItemTab1AnimationScaleX.setDuration(200);
															mwItemTab1AnimationScaleX.start();
															mwItemTab1AnimationScaleY.setTarget(mwItemTab1);
															mwItemTab1AnimationScaleY.setPropertyName("scaleY");
															mwItemTab1AnimationScaleY.setFloatValues((float)(0.9d));
															mwItemTab1AnimationScaleY.setDuration(200);
															mwItemTab1AnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwItemTab1AnimationScaleX.setTarget(mwItemTab1);
																				mwItemTab1AnimationScaleX.setPropertyName("scaleX");
																				mwItemTab1AnimationScaleX.setFloatValues((float)(1.0d));
																				mwItemTab1AnimationScaleX.setDuration(250);
																				mwItemTab1AnimationScaleX.start();
																				mwItemTab1AnimationScaleY.setTarget(mwItemTab1);
																				mwItemTab1AnimationScaleY.setPropertyName("scaleY");
																				mwItemTab1AnimationScaleY.setFloatValues((float)(1.0d));
																				mwItemTab1AnimationScaleY.setDuration(250);
																				mwItemTab1AnimationScaleY.start();
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
				});
				
		mwItemTab2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

					mwItemTab2.setBackgroundResource(R.drawable.mw_selectedbox_layout);
					mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);
					mwItemTab3.setBackgroundResource(R.drawable.mw_anybox_layout);

					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwItemTab2AnimationScaleX.setTarget(mwItemTab2);
										mwItemTab2AnimationScaleX.setPropertyName("scaleX");
										mwItemTab2AnimationScaleX.setFloatValues((float)(1.1d));
										mwItemTab2AnimationScaleX.setDuration(100);
										mwItemTab2AnimationScaleX.start();
										mwItemTab2AnimationScaleY.setTarget(mwItemTab2);
										mwItemTab2AnimationScaleY.setPropertyName("scaleY");
										mwItemTab2AnimationScaleY.setFloatValues((float)(1.1d));
										mwItemTab2AnimationScaleY.setDuration(100);
										mwItemTab2AnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwItemTab2AnimationScaleX.setTarget(mwItemTab2);
															mwItemTab2AnimationScaleX.setPropertyName("scaleX");
															mwItemTab2AnimationScaleX.setFloatValues((float)(0.9d));
															mwItemTab2AnimationScaleX.setDuration(200);
															mwItemTab2AnimationScaleX.start();
															mwItemTab2AnimationScaleY.setTarget(mwItemTab2);
															mwItemTab2AnimationScaleY.setPropertyName("scaleY");
															mwItemTab2AnimationScaleY.setFloatValues((float)(0.9d));
															mwItemTab2AnimationScaleY.setDuration(200);
															mwItemTab2AnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwItemTab2AnimationScaleX.setTarget(mwItemTab2);
																				mwItemTab2AnimationScaleX.setPropertyName("scaleX");
																				mwItemTab2AnimationScaleX.setFloatValues((float)(1.0d));
																				mwItemTab2AnimationScaleX.setDuration(250);
																				mwItemTab2AnimationScaleX.start();
																				mwItemTab2AnimationScaleY.setTarget(mwItemTab2);
																				mwItemTab2AnimationScaleY.setPropertyName("scaleY");
																				mwItemTab2AnimationScaleY.setFloatValues((float)(1.0d));
																				mwItemTab2AnimationScaleY.setDuration(250);
																				mwItemTab2AnimationScaleY.start();
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
			});
			
		mwItemTab3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

					mwItemTab3.setBackgroundResource(R.drawable.mw_selectedbox_layout);
					mwItemTab2.setBackgroundResource(R.drawable.mw_anybox_layout);
					mwItemTab1.setBackgroundResource(R.drawable.mw_anybox_layout);

					mwTimerTask = new TimerTask(){
						public void run(){
							runOnUiThread(new Runnable(){
									@Override
									public void run(){
										mwItemTab3AnimationScaleX.setTarget(mwItemTab3);
										mwItemTab3AnimationScaleX.setPropertyName("scaleX");
										mwItemTab3AnimationScaleX.setFloatValues((float)(1.1d));
										mwItemTab3AnimationScaleX.setDuration(100);
										mwItemTab3AnimationScaleX.start();
										mwItemTab3AnimationScaleY.setTarget(mwItemTab3);
										mwItemTab3AnimationScaleY.setPropertyName("scaleY");
										mwItemTab3AnimationScaleY.setFloatValues((float)(1.1d));
										mwItemTab3AnimationScaleY.setDuration(100);
										mwItemTab3AnimationScaleY.start();
										mwTimerTask = new TimerTask(){
											public void run(){
												runOnUiThread(new Runnable(){
														@Override
														public void run(){
															mwItemTab3AnimationScaleX.setTarget(mwItemTab3);
															mwItemTab3AnimationScaleX.setPropertyName("scaleX");
															mwItemTab3AnimationScaleX.setFloatValues((float)(0.9d));
															mwItemTab3AnimationScaleX.setDuration(200);
															mwItemTab3AnimationScaleX.start();
															mwItemTab3AnimationScaleY.setTarget(mwItemTab3);
															mwItemTab3AnimationScaleY.setPropertyName("scaleY");
															mwItemTab3AnimationScaleY.setFloatValues((float)(0.9d));
															mwItemTab3AnimationScaleY.setDuration(200);
															mwItemTab3AnimationScaleY.start();
															mwTimerTask = new TimerTask(){
																public void run(){
																	runOnUiThread(new Runnable(){
																			@Override
																			public void run(){
																				mwItemTab3AnimationScaleX.setTarget(mwItemTab3);
																				mwItemTab3AnimationScaleX.setPropertyName("scaleX");
																				mwItemTab3AnimationScaleX.setFloatValues((float)(1.0d));
																				mwItemTab3AnimationScaleX.setDuration(250);
																				mwItemTab3AnimationScaleX.start();
																				mwItemTab3AnimationScaleY.setTarget(mwItemTab3);
																				mwItemTab3AnimationScaleY.setPropertyName("scaleY");
																				mwItemTab3AnimationScaleY.setFloatValues((float)(1.0d));
																				mwItemTab3AnimationScaleY.setDuration(250);
																				mwItemTab3AnimationScaleY.start();
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
			});
	}
}
