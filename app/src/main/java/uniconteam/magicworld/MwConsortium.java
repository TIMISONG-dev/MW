package uniconteam.magicworld;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.itsaky.androidide.logsender.LogSender;
import java.security.spec.MGF1ParameterSpec;
import java.util.TimerTask;
import uniconteam.magicworld.MwBattleFieldActivity;
import uniconteam.magicworld.MwConsortium;
import uniconteam.magicworld.MwPlayHomeActivity;
import uniconteam.magicworld.MwPlayMainActivity;

// MwConsortium - engine for Magic World
// MwConsortium v0.2b

public class MwConsortium extends AppCompatActivity{
    
    public void mwClick(){
        
        if (MwPlayMainActivity.mwActivity.equals("mwMain")){
        // Thread 1
        if(MwPlayMainActivity.mwAnimRuleThr1){
       MwPlayMainActivity.mwTimerTaskThr1 = new TimerTask(){
      @Override
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          MwPlayMainActivity.mwAnimRuleThr1 = false;                  
          MwPlayMainActivity.mwAnimDataXThr1.setTarget(MwPlayMainActivity.mwAnimObjDataThr1);
          MwPlayMainActivity.mwAnimDataXThr1.setPropertyName("scaleX");
          MwPlayMainActivity.mwAnimDataXThr1.setFloatValues(MwPlayMainActivity.mwAnimFloats1Thr1);
          MwPlayMainActivity.mwAnimDataXThr1.setDuration(100);
          MwPlayMainActivity.mwAnimDataXThr1.start();
          MwPlayMainActivity.mwAnimDataYThr1.setTarget(MwPlayMainActivity.mwAnimObjDataThr1);
          MwPlayMainActivity.mwAnimDataYThr1.setPropertyName("scaleY");
          MwPlayMainActivity.mwAnimDataYThr1.setFloatValues(MwPlayMainActivity.mwAnimFloats1Thr1);
          MwPlayMainActivity.mwAnimDataYThr1.setDuration(100);
          MwPlayMainActivity.mwAnimDataYThr1.start();
          MwPlayMainActivity.mwTimerTaskThr1 = new TimerTask(){
           @Override
           public void run(){
            runOnUiThread(new Runnable(){
              @Override
              public void run(){
               MwPlayMainActivity.mwAnimDataXThr1.setTarget(MwPlayMainActivity.mwAnimObjDataThr1);
               MwPlayMainActivity.mwAnimDataXThr1.setPropertyName("scaleX");
               MwPlayMainActivity.mwAnimDataXThr1.setFloatValues(MwPlayMainActivity.mwAnimFloats2Thr1);
               MwPlayMainActivity.mwAnimDataXThr1.setDuration(200);
               MwPlayMainActivity.mwAnimDataXThr1.start();
               MwPlayMainActivity.mwAnimDataYThr1.setTarget(MwPlayMainActivity.mwAnimObjDataThr1);
               MwPlayMainActivity.mwAnimDataYThr1.setPropertyName("scaleY");
               MwPlayMainActivity.mwAnimDataYThr1.setFloatValues(MwPlayMainActivity.mwAnimFloats2Thr1);
               MwPlayMainActivity.mwAnimDataYThr1.setDuration(200);
               MwPlayMainActivity.mwAnimDataYThr1.start();
               MwPlayMainActivity.mwTimerTaskThr1 = new TimerTask(){
                @Override
                public void run(){
                 runOnUiThread(new Runnable(){
                   @Override
                   public void run(){
                    MwPlayMainActivity.mwAnimDataXThr1.setTarget(MwPlayMainActivity.mwAnimObjDataThr1);
                    MwPlayMainActivity.mwAnimDataXThr1.setPropertyName("scaleX");
                    MwPlayMainActivity.mwAnimDataXThr1.setFloatValues(MwPlayMainActivity.mwAnimFloats3Thr1);
                    MwPlayMainActivity.mwAnimDataXThr1.setDuration(250);
                    MwPlayMainActivity.mwAnimDataXThr1.start();
                    MwPlayMainActivity.mwAnimDataYThr1.setTarget(MwPlayMainActivity.mwAnimObjDataThr1);
                    MwPlayMainActivity.mwAnimDataYThr1.setPropertyName("scaleY");
                    MwPlayMainActivity.mwAnimDataYThr1.setFloatValues(MwPlayMainActivity.mwAnimFloats3Thr1);
                    MwPlayMainActivity.mwAnimDataYThr1.setDuration(250);
                    MwPlayMainActivity.mwAnimDataYThr1.start();
                    MwPlayMainActivity.mwAnimRuleThr1 = true;                                                   
                   }
                  });
                }
               };
               MwPlayMainActivity._mwTimerTaskThr1.schedule(MwPlayMainActivity.mwTimerTaskThr1, 200);
              }
             });
           }
          };
          MwPlayMainActivity._mwTimerTaskThr1.schedule(MwPlayMainActivity.mwTimerTaskThr1, 100);
         }
        });
      }
     };
     MwPlayMainActivity._mwTimerTaskThr1.schedule(MwPlayMainActivity.mwTimerTaskThr1, 0);
       } else {
            
        // Thread 2
        if(MwPlayMainActivity.mwAnimRuleThr2){
       MwPlayMainActivity.mwTimerTaskThr2 = new TimerTask(){
      @Override
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          MwPlayMainActivity.mwAnimRuleThr2 = false;                  
          MwPlayMainActivity.mwAnimDataXThr2.setTarget(MwPlayMainActivity.mwAnimObjDataThr2);
          MwPlayMainActivity.mwAnimDataXThr2.setPropertyName("scaleX");
          MwPlayMainActivity.mwAnimDataXThr2.setFloatValues(MwPlayMainActivity.mwAnimFloats1Thr2);
          MwPlayMainActivity.mwAnimDataXThr2.setDuration(100);
          MwPlayMainActivity.mwAnimDataXThr2.start();
          MwPlayMainActivity.mwAnimDataYThr2.setTarget(MwPlayMainActivity.mwAnimObjDataThr2);
          MwPlayMainActivity.mwAnimDataYThr2.setPropertyName("scaleY");
          MwPlayMainActivity.mwAnimDataYThr2.setFloatValues(MwPlayMainActivity.mwAnimFloats1Thr2);
          MwPlayMainActivity.mwAnimDataYThr2.setDuration(100);
          MwPlayMainActivity.mwAnimDataYThr2.start();
          MwPlayMainActivity.mwTimerTaskThr2 = new TimerTask(){
           @Override
           public void run(){
            runOnUiThread(new Runnable(){
              @Override
              public void run(){
               MwPlayMainActivity.mwAnimDataXThr2.setTarget(MwPlayMainActivity.mwAnimObjDataThr2);
               MwPlayMainActivity.mwAnimDataXThr2.setPropertyName("scaleX");
               MwPlayMainActivity.mwAnimDataXThr2.setFloatValues(MwPlayMainActivity.mwAnimFloats2Thr2);
               MwPlayMainActivity.mwAnimDataXThr2.setDuration(200);
               MwPlayMainActivity.mwAnimDataXThr2.start();
               MwPlayMainActivity.mwAnimDataYThr2.setTarget(MwPlayMainActivity.mwAnimObjDataThr2);
               MwPlayMainActivity.mwAnimDataYThr2.setPropertyName("scaleY");
               MwPlayMainActivity.mwAnimDataYThr2.setFloatValues(MwPlayMainActivity.mwAnimFloats2Thr2);
               MwPlayMainActivity.mwAnimDataYThr2.setDuration(200);
               MwPlayMainActivity.mwAnimDataYThr2.start();
               MwPlayMainActivity.mwTimerTaskThr2 = new TimerTask(){
                @Override
                public void run(){
                 runOnUiThread(new Runnable(){
                   @Override
                   public void run(){
                    MwPlayMainActivity.mwAnimDataXThr2.setTarget(MwPlayMainActivity.mwAnimObjDataThr2);
                    MwPlayMainActivity.mwAnimDataXThr2.setPropertyName("scaleX");
                    MwPlayMainActivity.mwAnimDataXThr2.setFloatValues(MwPlayMainActivity.mwAnimFloats3Thr2);
                    MwPlayMainActivity.mwAnimDataXThr2.setDuration(250);
                    MwPlayMainActivity.mwAnimDataXThr2.start();
                    MwPlayMainActivity.mwAnimDataYThr2.setTarget(MwPlayMainActivity.mwAnimObjDataThr2);
                    MwPlayMainActivity.mwAnimDataYThr2.setPropertyName("scaleY");
                    MwPlayMainActivity.mwAnimDataYThr2.setFloatValues(MwPlayMainActivity.mwAnimFloats3Thr2);
                    MwPlayMainActivity.mwAnimDataYThr2.setDuration(250);
                    MwPlayMainActivity.mwAnimDataYThr2.start();
                    MwPlayMainActivity.mwAnimRuleThr2 = true;                                                   
                   }
                  });
                }
               };
               MwPlayMainActivity._mwTimerTaskThr2.schedule(MwPlayMainActivity.mwTimerTaskThr2, 200);
              }
             });
           }
          };
          MwPlayMainActivity._mwTimerTaskThr2.schedule(MwPlayMainActivity.mwTimerTaskThr2, 100);
         }
        });
      }
     };
     MwPlayMainActivity._mwTimerTaskThr2.schedule(MwPlayMainActivity.mwTimerTaskThr2, 0);
       } else {
                    
        // Thread 3            
           if(MwPlayMainActivity.mwAnimRuleThr3){
       MwPlayMainActivity.mwTimerTaskThr3 = new TimerTask(){
      @Override
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          MwPlayMainActivity.mwAnimRuleThr3 = false;                  
          MwPlayMainActivity.mwAnimDataXThr3.setTarget(MwPlayMainActivity.mwAnimObjDataThr3);
          MwPlayMainActivity.mwAnimDataXThr3.setPropertyName("scaleX");
          MwPlayMainActivity.mwAnimDataXThr3.setFloatValues(MwPlayMainActivity.mwAnimFloats1Thr3);
          MwPlayMainActivity.mwAnimDataXThr3.setDuration(100);
          MwPlayMainActivity.mwAnimDataXThr3.start();
          MwPlayMainActivity.mwAnimDataYThr3.setTarget(MwPlayMainActivity.mwAnimObjDataThr3);
          MwPlayMainActivity.mwAnimDataYThr3.setPropertyName("scaleY");
          MwPlayMainActivity.mwAnimDataYThr3.setFloatValues(MwPlayMainActivity.mwAnimFloats1Thr3);
          MwPlayMainActivity.mwAnimDataYThr3.setDuration(100);
          MwPlayMainActivity.mwAnimDataYThr3.start();
          MwPlayMainActivity.mwTimerTaskThr3 = new TimerTask(){
           @Override
           public void run(){
            runOnUiThread(new Runnable(){
              @Override
              public void run(){
               MwPlayMainActivity.mwAnimDataXThr3.setTarget(MwPlayMainActivity.mwAnimObjDataThr3);
               MwPlayMainActivity.mwAnimDataXThr3.setPropertyName("scaleX");
               MwPlayMainActivity.mwAnimDataXThr3.setFloatValues(MwPlayMainActivity.mwAnimFloats2Thr3);
               MwPlayMainActivity.mwAnimDataXThr3.setDuration(200);
               MwPlayMainActivity.mwAnimDataXThr3.start();
               MwPlayMainActivity.mwAnimDataYThr3.setTarget(MwPlayMainActivity.mwAnimObjDataThr3);
               MwPlayMainActivity.mwAnimDataYThr3.setPropertyName("scaleY");
               MwPlayMainActivity.mwAnimDataYThr3.setFloatValues(MwPlayMainActivity.mwAnimFloats2Thr3);
               MwPlayMainActivity.mwAnimDataXThr3.setDuration(200);
               MwPlayMainActivity.mwAnimDataYThr3.start();
               MwPlayMainActivity.mwTimerTaskThr3 = new TimerTask(){
                @Override
                public void run(){
                 runOnUiThread(new Runnable(){
                   @Override
                   public void run(){
                    MwPlayMainActivity.mwAnimDataXThr3.setTarget(MwPlayMainActivity.mwAnimObjDataThr3);
                    MwPlayMainActivity.mwAnimDataXThr3.setPropertyName("scaleX");
                    MwPlayMainActivity.mwAnimDataXThr3.setFloatValues(MwPlayMainActivity.mwAnimFloats3Thr3);
                    MwPlayMainActivity.mwAnimDataXThr3.setDuration(250);
                    MwPlayMainActivity.mwAnimDataXThr3.start();
                    MwPlayMainActivity.mwAnimDataYThr3.setTarget(MwPlayMainActivity.mwAnimObjDataThr3);
                    MwPlayMainActivity.mwAnimDataYThr3.setPropertyName("scaleY");
                    MwPlayMainActivity.mwAnimDataYThr3.setFloatValues(MwPlayMainActivity.mwAnimFloats3Thr3);
                    MwPlayMainActivity.mwAnimDataYThr3.setDuration(250);
                    MwPlayMainActivity.mwAnimDataYThr3.start();
                    MwPlayMainActivity.mwAnimRuleThr3 = true;                                                   
                   }
                  });
                }
               };
               MwPlayMainActivity._mwTimerTaskThr3.schedule(MwPlayMainActivity.mwTimerTaskThr3, 200);
              }
             });
           }
          };
          MwPlayMainActivity._mwTimerTaskThr3.schedule(MwPlayMainActivity.mwTimerTaskThr3, 100);
         }
        });
      }
     };
       MwPlayMainActivity._mwTimerTaskThr3.schedule(MwPlayMainActivity.mwTimerTaskThr3, 0);          
             }
           }
          }
        }
        
        
        if (MwPlayMainActivity.mwActivity.equals("mwHome")){
           // Thread 1
        if(MwPlayHomeActivity.mwAnimRuleThr1){
       MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
      @Override
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          MwPlayHomeActivity.mwAnimRuleThr1 = false;                  
          MwPlayHomeActivity.mwAnimDataXThr1.setTarget(MwPlayHomeActivity.mwAnimObjDataThr1);
          MwPlayHomeActivity.mwAnimDataXThr1.setPropertyName("scaleX");
          MwPlayHomeActivity.mwAnimDataXThr1.setFloatValues(MwPlayHomeActivity.mwAnimFloats1Thr1);
          MwPlayHomeActivity.mwAnimDataXThr1.setDuration(100);
          MwPlayHomeActivity.mwAnimDataXThr1.start();
          MwPlayHomeActivity.mwAnimDataYThr1.setTarget(MwPlayHomeActivity.mwAnimObjDataThr1);
          MwPlayHomeActivity.mwAnimDataYThr1.setPropertyName("scaleY");
          MwPlayHomeActivity.mwAnimDataYThr1.setFloatValues(MwPlayHomeActivity.mwAnimFloats1Thr1);
          MwPlayHomeActivity.mwAnimDataYThr1.setDuration(100);
          MwPlayHomeActivity.mwAnimDataYThr1.start();
          MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
           @Override
           public void run(){
            runOnUiThread(new Runnable(){
              @Override
              public void run(){
               MwPlayHomeActivity.mwAnimDataXThr1.setTarget(MwPlayHomeActivity.mwAnimObjDataThr1);
               MwPlayHomeActivity.mwAnimDataXThr1.setPropertyName("scaleX");
               MwPlayHomeActivity.mwAnimDataXThr1.setFloatValues(MwPlayHomeActivity.mwAnimFloats2Thr1);
               MwPlayHomeActivity.mwAnimDataXThr1.setDuration(200);
               MwPlayHomeActivity.mwAnimDataXThr1.start();
               MwPlayHomeActivity.mwAnimDataYThr1.setTarget(MwPlayHomeActivity.mwAnimObjDataThr1);
               MwPlayHomeActivity.mwAnimDataYThr1.setPropertyName("scaleY");
               MwPlayHomeActivity.mwAnimDataYThr1.setFloatValues(MwPlayHomeActivity.mwAnimFloats2Thr1);
               MwPlayHomeActivity.mwAnimDataYThr1.setDuration(200);
               MwPlayHomeActivity.mwAnimDataYThr1.start();
               MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
                @Override
                public void run(){
                 runOnUiThread(new Runnable(){
                   @Override
                   public void run(){
                    MwPlayHomeActivity.mwAnimDataXThr1.setTarget(MwPlayHomeActivity.mwAnimObjDataThr1);
                    MwPlayHomeActivity.mwAnimDataXThr1.setPropertyName("scaleX");
                    MwPlayHomeActivity.mwAnimDataXThr1.setFloatValues(MwPlayHomeActivity.mwAnimFloats3Thr1);
                    MwPlayHomeActivity.mwAnimDataXThr1.setDuration(250);
                    MwPlayHomeActivity.mwAnimDataXThr1.start();
                    MwPlayHomeActivity.mwAnimDataYThr1.setTarget(MwPlayHomeActivity.mwAnimObjDataThr1);
                    MwPlayHomeActivity.mwAnimDataYThr1.setPropertyName("scaleY");
                    MwPlayHomeActivity.mwAnimDataYThr1.setFloatValues(MwPlayHomeActivity.mwAnimFloats3Thr1);
                    MwPlayHomeActivity.mwAnimDataYThr1.setDuration(250);
                    MwPlayHomeActivity.mwAnimDataYThr1.start();
                    MwPlayHomeActivity.mwAnimRuleThr1 = true;                                                   
                   }
                  });
                }
               };
               MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 200);
              }
             });
           }
          };
          MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 100);
         }
        });
      }
     };
     MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 0);
       } else {
            
        // Thread 2
        if(MwPlayHomeActivity.mwAnimRuleThr2){
       MwPlayHomeActivity.mwTimerTaskThr2 = new TimerTask(){
      @Override
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          MwPlayHomeActivity.mwAnimRuleThr2 = false;                  
          MwPlayHomeActivity.mwAnimDataXThr2.setTarget(MwPlayHomeActivity.mwAnimObjDataThr2);
          MwPlayMainActivity.mwAnimDataXThr2.setPropertyName("scaleX");
          MwPlayHomeActivity.mwAnimDataXThr2.setFloatValues(MwPlayHomeActivity.mwAnimFloats1Thr2);
          MwPlayHomeActivity.mwAnimDataXThr2.setDuration(100);
          MwPlayHomeActivity.mwAnimDataXThr2.start();
          MwPlayHomeActivity.mwAnimDataYThr2.setTarget(MwPlayHomeActivity.mwAnimObjDataThr2);
          MwPlayHomeActivity.mwAnimDataYThr2.setPropertyName("scaleY");
          MwPlayHomeActivity.mwAnimDataYThr2.setFloatValues(MwPlayHomeActivity.mwAnimFloats1Thr2);
          MwPlayHomeActivity.mwAnimDataYThr2.setDuration(100);
          MwPlayHomeActivity.mwAnimDataYThr2.start();
          MwPlayHomeActivity.mwTimerTaskThr2 = new TimerTask(){
           @Override
           public void run(){
            runOnUiThread(new Runnable(){
              @Override
              public void run(){
               MwPlayHomeActivity.mwAnimDataXThr2.setTarget(MwPlayHomeActivity.mwAnimObjDataThr2);
               MwPlayHomeActivity.mwAnimDataXThr2.setPropertyName("scaleX");
               MwPlayHomeActivity.mwAnimDataXThr2.setFloatValues(MwPlayHomeActivity.mwAnimFloats2Thr2);
               MwPlayHomeActivity.mwAnimDataXThr2.setDuration(200);
               MwPlayHomeActivity.mwAnimDataXThr2.start();
               MwPlayHomeActivity.mwAnimDataYThr2.setTarget(MwPlayHomeActivity.mwAnimObjDataThr2);
               MwPlayHomeActivity.mwAnimDataYThr2.setPropertyName("scaleY");
               MwPlayHomeActivity.mwAnimDataYThr2.setFloatValues(MwPlayHomeActivity.mwAnimFloats2Thr2);
               MwPlayHomeActivity.mwAnimDataYThr2.setDuration(200);
               MwPlayHomeActivity.mwAnimDataYThr2.start();
               MwPlayHomeActivity.mwTimerTaskThr2 = new TimerTask(){
                @Override
                public void run(){
                 runOnUiThread(new Runnable(){
                   @Override
                   public void run(){
                    MwPlayHomeActivity.mwAnimDataXThr2.setTarget(MwPlayHomeActivity.mwAnimObjDataThr2);
                    MwPlayHomeActivity.mwAnimDataXThr2.setPropertyName("scaleX");
                    MwPlayHomeActivity.mwAnimDataXThr2.setFloatValues(MwPlayHomeActivity.mwAnimFloats3Thr2);
                    MwPlayHomeActivity.mwAnimDataXThr2.setDuration(250);
                    MwPlayHomeActivity.mwAnimDataXThr2.start();
                    MwPlayHomeActivity.mwAnimDataYThr2.setTarget(MwPlayHomeActivity.mwAnimObjDataThr2);
                    MwPlayHomeActivity.mwAnimDataYThr2.setPropertyName("scaleY");
                    MwPlayHomeActivity.mwAnimDataYThr2.setFloatValues(MwPlayHomeActivity.mwAnimFloats3Thr2);
                    MwPlayHomeActivity.mwAnimDataYThr2.setDuration(250);
                    MwPlayHomeActivity.mwAnimDataYThr2.start();
                    MwPlayHomeActivity.mwAnimRuleThr2 = true;                                                   
                   }
                  });
                }
               };
               MwPlayHomeActivity._mwTimerTaskThr2.schedule(MwPlayHomeActivity.mwTimerTaskThr2, 200);
              }
             });
           }
          };
          MwPlayHomeActivity._mwTimerTaskThr2.schedule(MwPlayHomeActivity.mwTimerTaskThr2, 100);
         }
        });
      }
     };
     MwPlayHomeActivity._mwTimerTaskThr2.schedule(MwPlayHomeActivity.mwTimerTaskThr2, 0);
       } else {
                    
          // Thread 3          
           if(MwPlayHomeActivity.mwAnimRuleThr3){
       MwPlayHomeActivity.mwTimerTaskThr3 = new TimerTask(){
      @Override
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          MwPlayHomeActivity.mwAnimRuleThr3 = false;                  
          MwPlayHomeActivity.mwAnimDataXThr3.setTarget(MwPlayHomeActivity.mwAnimObjDataThr3);
          MwPlayHomeActivity.mwAnimDataXThr3.setPropertyName("scaleX");
          MwPlayHomeActivity.mwAnimDataXThr3.setFloatValues(MwPlayHomeActivity.mwAnimFloats1Thr3);
          MwPlayHomeActivity.mwAnimDataXThr3.setDuration(100);
          MwPlayHomeActivity.mwAnimDataXThr3.start();
          MwPlayHomeActivity.mwAnimDataYThr3.setTarget(MwPlayHomeActivity.mwAnimObjDataThr3);
          MwPlayHomeActivity.mwAnimDataYThr3.setPropertyName("scaleY");
          MwPlayHomeActivity.mwAnimDataYThr3.setFloatValues(MwPlayHomeActivity.mwAnimFloats1Thr3);
          MwPlayHomeActivity.mwAnimDataYThr3.setDuration(100);
          MwPlayHomeActivity.mwAnimDataYThr3.start();
          MwPlayHomeActivity.mwTimerTaskThr3 = new TimerTask(){
           @Override
           public void run(){
            runOnUiThread(new Runnable(){
              @Override
              public void run(){
               MwPlayHomeActivity.mwAnimDataXThr3.setTarget(MwPlayHomeActivity.mwAnimObjDataThr3);
               MwPlayHomeActivity.mwAnimDataXThr3.setPropertyName("scaleX");
               MwPlayHomeActivity.mwAnimDataXThr3.setFloatValues(MwPlayHomeActivity.mwAnimFloats2Thr3);
               MwPlayHomeActivity.mwAnimDataXThr3.setDuration(200);
               MwPlayHomeActivity.mwAnimDataXThr3.start();
               MwPlayHomeActivity.mwAnimDataYThr3.setTarget(MwPlayHomeActivity.mwAnimObjDataThr3);
               MwPlayHomeActivity.mwAnimDataYThr3.setPropertyName("scaleY");
               MwPlayHomeActivity.mwAnimDataYThr3.setFloatValues(MwPlayHomeActivity.mwAnimFloats2Thr3);
               MwPlayHomeActivity.mwAnimDataXThr3.setDuration(200);
               MwPlayHomeActivity.mwAnimDataYThr3.start();
               MwPlayHomeActivity.mwTimerTaskThr3 = new TimerTask(){
                @Override
                public void run(){
                 runOnUiThread(new Runnable(){
                   @Override
                   public void run(){
                    MwPlayHomeActivity.mwAnimDataXThr3.setTarget(MwPlayHomeActivity.mwAnimObjDataThr3);
                    MwPlayHomeActivity.mwAnimDataXThr3.setPropertyName("scaleX");
                    MwPlayHomeActivity.mwAnimDataXThr3.setFloatValues(MwPlayHomeActivity.mwAnimFloats3Thr3);
                    MwPlayHomeActivity.mwAnimDataXThr3.setDuration(250);
                    MwPlayHomeActivity.mwAnimDataXThr3.start();
                    MwPlayHomeActivity.mwAnimDataYThr3.setTarget(MwPlayHomeActivity.mwAnimObjDataThr3);
                    MwPlayHomeActivity.mwAnimDataYThr3.setPropertyName("scaleY");
                    MwPlayHomeActivity.mwAnimDataYThr3.setFloatValues(MwPlayHomeActivity.mwAnimFloats3Thr3);
                    MwPlayHomeActivity.mwAnimDataYThr3.setDuration(250);
                    MwPlayHomeActivity.mwAnimDataYThr3.start();
                    MwPlayHomeActivity.mwAnimRuleThr3 = true;                                                   
                   }
                  });
                }
               };
               MwPlayHomeActivity._mwTimerTaskThr3.schedule(MwPlayHomeActivity.mwTimerTaskThr3, 200);
              }
             });
           }
          };
          MwPlayHomeActivity._mwTimerTaskThr3.schedule(MwPlayHomeActivity.mwTimerTaskThr3, 100);
         }
        });
      }
     };
       MwPlayHomeActivity._mwTimerTaskThr3.schedule(MwPlayHomeActivity.mwTimerTaskThr3, 0);          
               }
             }
           }
        }
     }
    
    // Useless now
    // Animation cirles
    public void MwClickCircles(){
      // Animations img
        if(MwPlayHomeActivity.mwAnimRuleThr1){
      MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
      public void run(){
       runOnUiThread(new Runnable(){
         @Override
         public void run(){
          MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_1));
          MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
           public void run(){
            runOnUiThread(new Runnable(){
              public void run(){
               MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_2));
               MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
                public void run(){
                 runOnUiThread(new Runnable(){
                   public void run(){
                    MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_3));
                    MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
                     public void run(){
                      runOnUiThread(new Runnable(){
                        public void run(){
                         MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_4));
                         MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
                          public void run(){
                           runOnUiThread(new Runnable(){
                             public void run(){
                              MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_5));
                              MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
                               public void run(){
                                runOnUiThread(new Runnable(){
                                  public void run(){
                                   MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_4));
                                   MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
                                    public void run(){
                                     runOnUiThread(new Runnable(){
                                       public void run(){
                                        MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_3));
                                        MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
                                         public void run(){
                                          runOnUiThread(new Runnable(){
                                            public void run(){
                                             MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_2));
                                             MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
                                              public void run(){
                                               runOnUiThread(new Runnable(){
                                                 public void run(){
                                                  MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_animation_click_1));
                                                  MwPlayHomeActivity.mwTimerTaskThr1 = new TimerTask(){
                                                   public void run(){
                                                    runOnUiThread(new Runnable(){
                                                      public void run(){
                                                       MwPlayHomeActivity.mwAnimImageDataThr1.setImageDrawable(getDrawable(R.drawable.magicworld_block_grass));
                                                      }
                                                     });
                                                   }
                                                  };
                                                  MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
                                                 }
                                                });
                                              }
                                             };
                                             MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
                                            }
                                           });
                                         }
                                        };
                                        MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
                                       }
                                      });
                                    }
                                   };
                                   MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
                                  }
                                 });
                               }
                              };
                              MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
                             }
                            });
                          }
                         };
                         MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
                        }
                       });
                     }
                    };
                    MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
                   }
                  });
                }
               };
               MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
              }
             });
           }
          };
          MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
         }
        });
      }
     };
     MwPlayHomeActivity._mwTimerTaskThr1.schedule(MwPlayHomeActivity.mwTimerTaskThr1, 30);
    }
   }
}