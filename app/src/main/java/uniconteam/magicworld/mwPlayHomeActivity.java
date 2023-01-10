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
	private LinearLayout mwWinBoxLinear;
	private LinearLayout mwItemBoxLinear;
	private LinearLayout mwItemTab1;
	private LinearLayout mwItemTab2;
	private LinearLayout mwItemTab3;
    private ImageView mwBlockTab1;
    private ImageView mwBlockTab2;
    private ImageView mwBlockTab3;
    private ImageView mwBlockTab4;
    private ImageView mwBlockTab5;
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
		mwDataBoxCoinCount.setTypeface(Typeface.createFromAsset(getAssets(),"mwFonts/magicworld_google_sans_regular.tmp"), 0);
        
		
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
