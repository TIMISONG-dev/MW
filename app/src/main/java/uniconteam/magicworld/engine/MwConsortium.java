package uniconteam.magicworld;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import java.util.TimerTask;

// MwConsortium - engine for Magic World
// MwConsortium v0.5b

public class MwConsortium extends AppCompatActivity{

    void mwThreads(View view, ObjectAnimator objX, ObjectAnimator objY, float f1, float f2, float f3) {

        if (MenuActivity.mwActivity.equals("mwMain")) {
            if (MenuActivity.animRuleThr1) {
                MenuActivity.animObjDataThr1 = view;
                MenuActivity.animDataXThr1 = objX;
                MenuActivity.animDataYThr1 = objY;
                MenuActivity.animFloats1Thr1 = f1;
                MenuActivity.animFloats2Thr1 = f2;
                MenuActivity.animFloats3Thr1 = f3;
            } else {
                if (MenuActivity.animRuleThr2) {
                    MenuActivity.animObjDataThr2 = view;
                    MenuActivity.animDataXThr2 = objX;
                    MenuActivity.animDataYThr2 = objY;
                    MenuActivity.animFloats1Thr2 = f1;
                    MenuActivity.animFloats2Thr2 = f2;
                    MenuActivity.animFloats3Thr2 = f3;
                } else {
                    if (MenuActivity.animRuleThr3) {
                        MenuActivity.animObjDataThr3 = view;
                        MenuActivity.animDataXThr3 = objX;
                        MenuActivity.animDataYThr3 = objY;
                        MenuActivity.animFloats1Thr3 = f1;
                        MenuActivity.animFloats2Thr3 = f2;
                        MenuActivity.animFloats3Thr3 = f3;
                    }
                }
            }
        }
        if (MenuActivity.mwActivity.equals("mwHome")) {
            if (HomeActivity.animRuleThr1) {
                HomeActivity.animObjDataThr1 = view;
                HomeActivity.animDataXThr1 = objX;
                HomeActivity.animDataYThr1 = objY;
                HomeActivity.animFloats1Thr1 = f1;
                HomeActivity.animFloats2Thr1 = f2;
                HomeActivity.animFloats3Thr1 = f3;
            } else {
                if (HomeActivity.animRuleThr2) {
                    HomeActivity.animObjDataThr2 = view;
                    HomeActivity.animDataXThr2 = objX;
                    HomeActivity.animDataYThr2 = objY;
                    HomeActivity.animFloats1Thr2 = f1;
                    HomeActivity.animFloats2Thr2 = f2;
                    HomeActivity.animFloats3Thr2 = f3;
                } else {
                    if (HomeActivity.animRuleThr3) {
                        HomeActivity.animObjDataThr3 = view;
                        HomeActivity.animDataXThr3 = objX;
                        HomeActivity.animDataYThr3 = objY;
                        HomeActivity.animFloats1Thr3 = f1;
                        HomeActivity.animFloats2Thr3 = f2;
                        HomeActivity.animFloats3Thr3 = f3;
                    }
                }
            }
        }
    }

    public void mwClick(){
        
        if (MenuActivity.mwActivity.equals("mwMain")){
            System.out.println("menu/thr1");
            // Thread 1
            if (MenuActivity.animRuleThr1) {
                MenuActivity.timerTaskThr1 =
                        new TimerTask() {
                            @Override
                            public void run() {
                                runOnUiThread(
                                        new Runnable() {
                                            @Override
                                            public void run() {
                                                MenuActivity.animRuleThr1 = false;
                                                MenuActivity.animDataXThr1.setTarget(
                                                        MenuActivity.animObjDataThr1);
                                                MenuActivity.animDataXThr1.setPropertyName(
                                                        "scaleX");
                                                MenuActivity.animDataXThr1.setFloatValues(
                                                        MenuActivity.animFloats1Thr1);
                                                MenuActivity.animDataXThr1.setDuration(100);
                                                MenuActivity.animDataXThr1.start();
                                                MenuActivity.animDataYThr1.setTarget(
                                                        MenuActivity.animObjDataThr1);
                                                MenuActivity.animDataYThr1.setPropertyName(
                                                        "scaleY");
                                                MenuActivity.animDataYThr1.setFloatValues(
                                                        MenuActivity.animFloats1Thr1);
                                                MenuActivity.animDataYThr1.setDuration(100);
                                                MenuActivity.animDataYThr1.start();
                                                MenuActivity.timerTaskThr1 =
                                                        new TimerTask() {
                                                            @Override
                                                            public void run() {
                                                                runOnUiThread(
                                                                        new Runnable() {
                                                                            @Override
                                                                            public void run() {
                                                                                MenuActivity
                                                                                        .animDataXThr1
                                                                                        .setTarget(
                                                                                                MenuActivity
                                                                                                        .animObjDataThr1);
                                                                                MenuActivity
                                                                                        .animDataXThr1
                                                                                        .setPropertyName(
                                                                                                "scaleX");
                                                                                MenuActivity
                                                                                        .animDataXThr1
                                                                                        .setFloatValues(
                                                                                                MenuActivity
                                                                                                        .animFloats2Thr1);
                                                                                MenuActivity
                                                                                        .animDataXThr1
                                                                                        .setDuration(
                                                                                                200);
                                                                                MenuActivity
                                                                                        .animDataXThr1
                                                                                        .start();
                                                                                MenuActivity
                                                                                        .animDataYThr1
                                                                                        .setTarget(
                                                                                                MenuActivity
                                                                                                        .animObjDataThr1);
                                                                                MenuActivity
                                                                                        .animDataYThr1
                                                                                        .setPropertyName(
                                                                                                "scaleY");
                                                                                MenuActivity
                                                                                        .animDataYThr1
                                                                                        .setFloatValues(
                                                                                                MenuActivity
                                                                                                        .animFloats2Thr1);
                                                                                MenuActivity
                                                                                        .animDataYThr1
                                                                                        .setDuration(
                                                                                                200);
                                                                                MenuActivity
                                                                                        .animDataYThr1
                                                                                        .start();
                                                                                MenuActivity
                                                                                                .timerTaskThr1 =
                                                                                        new TimerTask() {
                                                                                            @Override
                                                                                            public
                                                                                            void
                                                                                                    run() {
                                                                                                runOnUiThread(
                                                                                                        new Runnable() {
                                                                                                            @Override
                                                                                                            public
                                                                                                            void
                                                                                                                    run() {
                                                                                                                MenuActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .setTarget(
                                                                                                                                MenuActivity
                                                                                                                                        .animObjDataThr1);
                                                                                                                MenuActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .setPropertyName(
                                                                                                                                "scaleX");
                                                                                                                MenuActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .setFloatValues(
                                                                                                                                MenuActivity
                                                                                                                                        .animFloats3Thr1);
                                                                                                                MenuActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .setDuration(
                                                                                                                                250);
                                                                                                                MenuActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .start();
                                                                                                                MenuActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .setTarget(
                                                                                                                                MenuActivity
                                                                                                                                        .animObjDataThr1);
                                                                                                                MenuActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .setPropertyName(
                                                                                                                                "scaleY");
                                                                                                                MenuActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .setFloatValues(
                                                                                                                                MenuActivity
                                                                                                                                        .animFloats3Thr1);
                                                                                                                MenuActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .setDuration(
                                                                                                                                250);
                                                                                                                MenuActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .start();
                                                                                                                MenuActivity
                                                                                                                                .animRuleThr1 =
                                                                                                                        true;
                                                                                                            }
                                                                                                        });
                                                                                            }
                                                                                        };
                                                                                MenuActivity
                                                                                        ._timerTaskThr1
                                                                                        .schedule(
                                                                                                MenuActivity
                                                                                                        .timerTaskThr1,
                                                                                                200);
                                                                            }
                                                                        });
                                                            }
                                                        };
                                                MenuActivity._timerTaskThr1.schedule(
                                                        MenuActivity.timerTaskThr1, 100);
                                            }
                                        });
                            }
                        };
                MenuActivity._timerTaskThr1.schedule(MenuActivity.timerTaskThr1, 0);
            } else {

                // Thread 2
                if (MenuActivity.animRuleThr2) {
                    System.out.println("menu/thr2");
                    MenuActivity.timerTaskThr2 =
                            new TimerTask() {
                                @Override
                                public void run() {
                                    runOnUiThread(
                                            new Runnable() {
                                                @Override
                                                public void run() {
                                                    MenuActivity.animRuleThr2 = false;
                                                    MenuActivity.animDataXThr2.setTarget(
                                                            MenuActivity.animObjDataThr2);
                                                    MenuActivity.animDataXThr2
                                                            .setPropertyName("scaleX");
                                                    MenuActivity.animDataXThr2
                                                            .setFloatValues(
                                                                    MenuActivity
                                                                            .animFloats1Thr2);
                                                    MenuActivity.animDataXThr2.setDuration(
                                                            100);
                                                    MenuActivity.animDataXThr2.start();
                                                    MenuActivity.animDataYThr2.setTarget(
                                                            MenuActivity.animObjDataThr2);
                                                    MenuActivity.animDataYThr2
                                                            .setPropertyName("scaleY");
                                                    MenuActivity.animDataYThr2
                                                            .setFloatValues(
                                                                    MenuActivity
                                                                            .animFloats1Thr2);
                                                    MenuActivity.animDataYThr2.setDuration(
                                                            100);
                                                    MenuActivity.animDataYThr2.start();
                                                    MenuActivity.timerTaskThr2 =
                                                            new TimerTask() {
                                                                @Override
                                                                public void run() {
                                                                    runOnUiThread(
                                                                            new Runnable() {
                                                                                @Override
                                                                                public void run() {
                                                                                    MenuActivity
                                                                                            .animDataXThr2
                                                                                            .setTarget(
                                                                                                    MenuActivity
                                                                                                            .animObjDataThr2);
                                                                                    MenuActivity
                                                                                            .animDataXThr2
                                                                                            .setPropertyName(
                                                                                                    "scaleX");
                                                                                    MenuActivity
                                                                                            .animDataXThr2
                                                                                            .setFloatValues(
                                                                                                    MenuActivity
                                                                                                            .animFloats2Thr2);
                                                                                    MenuActivity
                                                                                            .animDataXThr2
                                                                                            .setDuration(
                                                                                                    200);
                                                                                    MenuActivity
                                                                                            .animDataXThr2
                                                                                            .start();
                                                                                    MenuActivity
                                                                                            .animDataYThr2
                                                                                            .setTarget(
                                                                                                    MenuActivity
                                                                                                            .animObjDataThr2);
                                                                                    MenuActivity
                                                                                            .animDataYThr2
                                                                                            .setPropertyName(
                                                                                                    "scaleY");
                                                                                    MenuActivity
                                                                                            .animDataYThr2
                                                                                            .setFloatValues(
                                                                                                    MenuActivity
                                                                                                            .animFloats2Thr2);
                                                                                    MenuActivity
                                                                                            .animDataYThr2
                                                                                            .setDuration(
                                                                                                    200);
                                                                                    MenuActivity
                                                                                            .animDataYThr2
                                                                                            .start();
                                                                                    MenuActivity
                                                                                                    .timerTaskThr2 =
                                                                                            new TimerTask() {
                                                                                                @Override
                                                                                                public
                                                                                                void
                                                                                                        run() {
                                                                                                    runOnUiThread(
                                                                                                            new Runnable() {
                                                                                                                @Override
                                                                                                                public
                                                                                                                void
                                                                                                                        run() {
                                                                                                                    MenuActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .setTarget(
                                                                                                                                    MenuActivity
                                                                                                                                            .animObjDataThr2);
                                                                                                                    MenuActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .setPropertyName(
                                                                                                                                    "scaleX");
                                                                                                                    MenuActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .setFloatValues(
                                                                                                                                    MenuActivity
                                                                                                                                            .animFloats3Thr2);
                                                                                                                    MenuActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .setDuration(
                                                                                                                                    250);
                                                                                                                    MenuActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .start();
                                                                                                                    MenuActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .setTarget(
                                                                                                                                    MenuActivity
                                                                                                                                            .animObjDataThr2);
                                                                                                                    MenuActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .setPropertyName(
                                                                                                                                    "scaleY");
                                                                                                                    MenuActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .setFloatValues(
                                                                                                                                    MenuActivity
                                                                                                                                            .animFloats3Thr2);
                                                                                                                    MenuActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .setDuration(
                                                                                                                                    250);
                                                                                                                    MenuActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .start();
                                                                                                                    MenuActivity
                                                                                                                                    .animRuleThr2 =
                                                                                                                            true;
                                                                                                                }
                                                                                                            });
                                                                                                }
                                                                                            };
                                                                                    MenuActivity
                                                                                            ._timerTaskThr2
                                                                                            .schedule(
                                                                                                    MenuActivity
                                                                                                            .timerTaskThr2,
                                                                                                    200);
                                                                                }
                                                                            });
                                                                }
                                                            };
                                                    MenuActivity._timerTaskThr2.schedule(
                                                            MenuActivity.timerTaskThr2,
                                                            100);
                                                }
                                            });
                                }
                            };
                    MenuActivity._timerTaskThr2.schedule(
                            MenuActivity.timerTaskThr2, 0);
                } else {

                    // Thread 3
                    if (MenuActivity.animRuleThr3) {
                        System.out.println("menu/thr3");
                        MenuActivity.timerTaskThr3 =
                                new TimerTask() {
                                    @Override
                                    public void run() {
                                        runOnUiThread(
                                                new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        MenuActivity.animRuleThr3 = false;
                                                        MenuActivity.animDataXThr3
                                                                .setTarget(
                                                                        MenuActivity
                                                                                .animObjDataThr3);
                                                        MenuActivity.animDataXThr3
                                                                .setPropertyName("scaleX");
                                                        MenuActivity.animDataXThr3
                                                                .setFloatValues(
                                                                        MenuActivity
                                                                                .animFloats1Thr3);
                                                        MenuActivity.animDataXThr3
                                                                .setDuration(100);
                                                        MenuActivity.animDataXThr3.start();
                                                        MenuActivity.animDataYThr3
                                                                .setTarget(
                                                                        MenuActivity
                                                                                .animObjDataThr3);
                                                        MenuActivity.animDataYThr3
                                                                .setPropertyName("scaleY");
                                                        MenuActivity.animDataYThr3
                                                                .setFloatValues(
                                                                        MenuActivity
                                                                                .animFloats1Thr3);
                                                        MenuActivity.animDataYThr3
                                                                .setDuration(100);
                                                        MenuActivity.animDataYThr3.start();
                                                        MenuActivity.timerTaskThr3 =
                                                                new TimerTask() {
                                                                    @Override
                                                                    public void run() {
                                                                        runOnUiThread(
                                                                                new Runnable() {
                                                                                    @Override
                                                                                    public void
                                                                                            run() {
                                                                                        MenuActivity
                                                                                                .animDataXThr3
                                                                                                .setTarget(
                                                                                                        MenuActivity
                                                                                                                .animObjDataThr3);
                                                                                        MenuActivity
                                                                                                .animDataXThr3
                                                                                                .setPropertyName(
                                                                                                        "scaleX");
                                                                                        MenuActivity
                                                                                                .animDataXThr3
                                                                                                .setFloatValues(
                                                                                                        MenuActivity
                                                                                                                .animFloats2Thr3);
                                                                                        MenuActivity
                                                                                                .animDataXThr3
                                                                                                .setDuration(
                                                                                                        200);
                                                                                        MenuActivity
                                                                                                .animDataXThr3
                                                                                                .start();
                                                                                        MenuActivity
                                                                                                .animDataYThr3
                                                                                                .setTarget(
                                                                                                        MenuActivity
                                                                                                                .animObjDataThr3);
                                                                                        MenuActivity
                                                                                                .animDataYThr3
                                                                                                .setPropertyName(
                                                                                                        "scaleY");
                                                                                        MenuActivity
                                                                                                .animDataYThr3
                                                                                                .setFloatValues(
                                                                                                        MenuActivity
                                                                                                                .animFloats2Thr3);
                                                                                        MenuActivity
                                                                                                .animDataXThr3
                                                                                                .setDuration(
                                                                                                        200);
                                                                                        MenuActivity
                                                                                                .animDataYThr3
                                                                                                .start();
                                                                                        MenuActivity
                                                                                                        .timerTaskThr3 =
                                                                                                new TimerTask() {
                                                                                                    @Override
                                                                                                    public
                                                                                                    void
                                                                                                            run() {
                                                                                                        runOnUiThread(
                                                                                                                new Runnable() {
                                                                                                                    @Override
                                                                                                                    public
                                                                                                                    void
                                                                                                                            run() {
                                                                                                                        MenuActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .setTarget(
                                                                                                                                        MenuActivity
                                                                                                                                                .animObjDataThr3);
                                                                                                                        MenuActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .setPropertyName(
                                                                                                                                        "scaleX");
                                                                                                                        MenuActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .setFloatValues(
                                                                                                                                        MenuActivity
                                                                                                                                                .animFloats3Thr3);
                                                                                                                        MenuActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .setDuration(
                                                                                                                                        250);
                                                                                                                        MenuActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .start();
                                                                                                                        MenuActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .setTarget(
                                                                                                                                        MenuActivity
                                                                                                                                                .animObjDataThr3);
                                                                                                                        MenuActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .setPropertyName(
                                                                                                                                        "scaleY");
                                                                                                                        MenuActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .setFloatValues(
                                                                                                                                        MenuActivity
                                                                                                                                                .animFloats3Thr3);
                                                                                                                        MenuActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .setDuration(
                                                                                                                                        250);
                                                                                                                        MenuActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .start();
                                                                                                                        MenuActivity
                                                                                                                                        .animRuleThr3 =
                                                                                                                                true;
                                                                                                                    }
                                                                                                                });
                                                                                                    }
                                                                                                };
                                                                                        MenuActivity
                                                                                                ._timerTaskThr3
                                                                                                .schedule(
                                                                                                        MenuActivity
                                                                                                                .timerTaskThr3,
                                                                                                        200);
                                                                                    }
                                                                                });
                                                                    }
                                                                };
                                                        MenuActivity._timerTaskThr3
                                                                .schedule(
                                                                        MenuActivity
                                                                                .timerTaskThr3,
                                                                        100);
                                                    }
                                                });
                                    }
                                };
                        MenuActivity._timerTaskThr3.schedule(
                                MenuActivity.timerTaskThr3, 0);
                    }
                }
            }
        }

        if (MenuActivity.mwActivity.equals("mwHome")) {

            // Thread 1
            if (HomeActivity.animRuleThr1) {
                System.out.println("home/thr1");
                HomeActivity.timerTaskThr1 =
                        new TimerTask() {
                            @Override
                            public void run() {
                                runOnUiThread(
                                        new Runnable() {
                                            @Override
                                            public void run() {
                                                HomeActivity.animRuleThr1 = false;
                                                HomeActivity.animDataXThr1.setTarget(
                                                        HomeActivity.animObjDataThr1);
                                                HomeActivity.animDataXThr1.setPropertyName(
                                                        "scaleX");
                                                HomeActivity.animDataXThr1.setFloatValues(
                                                        HomeActivity.animFloats1Thr1);
                                                HomeActivity.animDataXThr1.setDuration(100);
                                                HomeActivity.animDataXThr1.start();
                                                HomeActivity.animDataYThr1.setTarget(
                                                        HomeActivity.animObjDataThr1);
                                                HomeActivity.animDataYThr1.setPropertyName(
                                                        "scaleY");
                                                HomeActivity.animDataYThr1.setFloatValues(
                                                        HomeActivity.animFloats1Thr1);
                                                HomeActivity.animDataYThr1.setDuration(100);
                                                HomeActivity.animDataYThr1.start();
                                                HomeActivity.timerTaskThr1 =
                                                        new TimerTask() {
                                                            @Override
                                                            public void run() {
                                                                runOnUiThread(
                                                                        new Runnable() {
                                                                            @Override
                                                                            public void run() {
                                                                                HomeActivity
                                                                                        .animDataXThr1
                                                                                        .setTarget(
                                                                                                HomeActivity
                                                                                                        .animObjDataThr1);
                                                                                HomeActivity
                                                                                        .animDataXThr1
                                                                                        .setPropertyName(
                                                                                                "scaleX");
                                                                                HomeActivity
                                                                                        .animDataXThr1
                                                                                        .setFloatValues(
                                                                                                HomeActivity
                                                                                                        .animFloats2Thr1);
                                                                                HomeActivity
                                                                                        .animDataXThr1
                                                                                        .setDuration(
                                                                                                200);
                                                                                HomeActivity
                                                                                        .animDataXThr1
                                                                                        .start();
                                                                                HomeActivity
                                                                                        .animDataYThr1
                                                                                        .setTarget(
                                                                                                HomeActivity
                                                                                                        .animObjDataThr1);
                                                                                HomeActivity
                                                                                        .animDataYThr1
                                                                                        .setPropertyName(
                                                                                                "scaleY");
                                                                                HomeActivity
                                                                                        .animDataYThr1
                                                                                        .setFloatValues(
                                                                                                HomeActivity
                                                                                                        .animFloats2Thr1);
                                                                                HomeActivity
                                                                                        .animDataYThr1
                                                                                        .setDuration(
                                                                                                200);
                                                                                HomeActivity
                                                                                        .animDataYThr1
                                                                                        .start();
                                                                                HomeActivity
                                                                                                .timerTaskThr1 =
                                                                                        new TimerTask() {
                                                                                            @Override
                                                                                            public
                                                                                            void
                                                                                                    run() {
                                                                                                runOnUiThread(
                                                                                                        new Runnable() {
                                                                                                            @Override
                                                                                                            public
                                                                                                            void
                                                                                                                    run() {
                                                                                                                HomeActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .setTarget(
                                                                                                                                HomeActivity
                                                                                                                                        .animObjDataThr1);
                                                                                                                HomeActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .setPropertyName(
                                                                                                                                "scaleX");
                                                                                                                HomeActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .setFloatValues(
                                                                                                                                HomeActivity
                                                                                                                                        .animFloats3Thr1);
                                                                                                                HomeActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .setDuration(
                                                                                                                                250);
                                                                                                                HomeActivity
                                                                                                                        .animDataXThr1
                                                                                                                        .start();
                                                                                                                HomeActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .setTarget(
                                                                                                                                HomeActivity
                                                                                                                                        .animObjDataThr1);
                                                                                                                HomeActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .setPropertyName(
                                                                                                                                "scaleY");
                                                                                                                HomeActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .setFloatValues(
                                                                                                                                HomeActivity
                                                                                                                                        .animFloats3Thr1);
                                                                                                                HomeActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .setDuration(
                                                                                                                                250);
                                                                                                                HomeActivity
                                                                                                                        .animDataYThr1
                                                                                                                        .start();
                                                                                                                HomeActivity
                                                                                                                                .animRuleThr1 =
                                                                                                                        true;
                                                                                                            }
                                                                                                        });
                                                                                            }
                                                                                        };
                                                                                HomeActivity
                                                                                        ._timerTaskThr1
                                                                                        .schedule(
                                                                                                HomeActivity
                                                                                                        .timerTaskThr1,
                                                                                                200);
                                                                            }
                                                                        });
                                                            }
                                                        };
                                                HomeActivity._timerTaskThr1.schedule(
                                                        HomeActivity.timerTaskThr1, 100);
                                            }
                                        });
                            }
                        };
                HomeActivity._timerTaskThr1.schedule(HomeActivity.timerTaskThr1, 0);
            } else {

                // Thread 2
                if (HomeActivity.animRuleThr2) {
                    System.out.println("home/thr2");
                    HomeActivity.timerTaskThr2 =
                            new TimerTask() {
                                @Override
                                public void run() {
                                    runOnUiThread(
                                            new Runnable() {
                                                @Override
                                                public void run() {
                                                    HomeActivity.animRuleThr2 = false;
                                                    HomeActivity.animDataXThr2.setTarget(
                                                            HomeActivity.animObjDataThr2);
                                                    HomeActivity.animDataXThr2
                                                            .setPropertyName("scaleX");
                                                    HomeActivity.animDataXThr2
                                                            .setFloatValues(
                                                                    HomeActivity
                                                                            .animFloats1Thr2);
                                                    HomeActivity.animDataXThr2.setDuration(
                                                            100);
                                                    HomeActivity.animDataXThr2.start();
                                                    HomeActivity.animDataYThr2.setTarget(
                                                            HomeActivity.animObjDataThr2);
                                                    HomeActivity.animDataYThr2
                                                            .setPropertyName("scaleY");
                                                    HomeActivity.animDataYThr2
                                                            .setFloatValues(
                                                                    HomeActivity
                                                                            .animFloats1Thr2);
                                                    HomeActivity.animDataYThr2.setDuration(
                                                            100);
                                                    HomeActivity.animDataYThr2.start();
                                                    HomeActivity.timerTaskThr2 =
                                                            new TimerTask() {
                                                                @Override
                                                                public void run() {
                                                                    runOnUiThread(
                                                                            new Runnable() {
                                                                                @Override
                                                                                public void run() {
                                                                                    HomeActivity
                                                                                            .animDataXThr2
                                                                                            .setTarget(
                                                                                                    HomeActivity
                                                                                                            .animObjDataThr2);
                                                                                    HomeActivity
                                                                                            .animDataXThr2
                                                                                            .setPropertyName(
                                                                                                    "scaleX");
                                                                                    HomeActivity
                                                                                            .animDataXThr2
                                                                                            .setFloatValues(
                                                                                                    HomeActivity
                                                                                                            .animFloats2Thr2);
                                                                                    HomeActivity
                                                                                            .animDataXThr2
                                                                                            .setDuration(
                                                                                                    200);
                                                                                    HomeActivity
                                                                                            .animDataXThr2
                                                                                            .start();
                                                                                    HomeActivity
                                                                                            .animDataYThr2
                                                                                            .setTarget(
                                                                                                    HomeActivity
                                                                                                            .animObjDataThr2);
                                                                                    HomeActivity
                                                                                            .animDataYThr2
                                                                                            .setPropertyName(
                                                                                                    "scaleY");
                                                                                    HomeActivity
                                                                                            .animDataYThr2
                                                                                            .setFloatValues(
                                                                                                    HomeActivity.animFloats2Thr2);
                                                                                    HomeActivity
                                                                                            .animDataYThr2
                                                                                            .setDuration(
                                                                                                    200);
                                                                                    HomeActivity
                                                                                            .animDataYThr2
                                                                                            .start();
                                                                                    HomeActivity
                                                                                                    .timerTaskThr2 =
                                                                                            new TimerTask() {
                                                                                                @Override
                                                                                                public
                                                                                                void
                                                                                                        run() {
                                                                                                    runOnUiThread(
                                                                                                            new Runnable() {
                                                                                                                @Override
                                                                                                                public
                                                                                                                void
                                                                                                                        run() {
                                                                                                                    HomeActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .setTarget(
                                                                                                                                    HomeActivity
                                                                                                                                            .animObjDataThr2);
                                                                                                                    HomeActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .setPropertyName(
                                                                                                                                    "scaleX");
                                                                                                                    HomeActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .setFloatValues(
                                                                                                                                    HomeActivity
                                                                                                                                            .animFloats3Thr2);
                                                                                                                    HomeActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .setDuration(
                                                                                                                                    250);
                                                                                                                    HomeActivity
                                                                                                                            .animDataXThr2
                                                                                                                            .start();
                                                                                                                    HomeActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .setTarget(
                                                                                                                                    HomeActivity
                                                                                                                                            .animObjDataThr2);
                                                                                                                    HomeActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .setPropertyName(
                                                                                                                                    "scaleY");
                                                                                                                    HomeActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .setFloatValues(
                                                                                                                                    HomeActivity
                                                                                                                                            .animFloats3Thr2);
                                                                                                                    HomeActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .setDuration(
                                                                                                                                    250);
                                                                                                                    HomeActivity
                                                                                                                            .animDataYThr2
                                                                                                                            .start();
                                                                                                                    HomeActivity
                                                                                                                                    .animRuleThr2 =
                                                                                                                            true;
                                                                                                                }
                                                                                                            });
                                                                                                }
                                                                                            };
                                                                                    HomeActivity
                                                                                            ._timerTaskThr2
                                                                                            .schedule(
                                                                                                    HomeActivity
                                                                                                            .timerTaskThr2,
                                                                                                    200);
                                                                                }
                                                                            });
                                                                }
                                                            };
                                                    HomeActivity._timerTaskThr2.schedule(
                                                            HomeActivity.timerTaskThr2,
                                                            100);
                                                }
                                            });
                                }
                            };
                    HomeActivity._timerTaskThr2.schedule(
                            HomeActivity.timerTaskThr2, 0);
                } else {

                    // Thread 3
                    if (HomeActivity.animRuleThr3) {
                        System.out.println("home/thr3");
                        HomeActivity.timerTaskThr3 =
                                new TimerTask() {
                                    @Override
                                    public void run() {
                                        runOnUiThread(
                                                new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        HomeActivity.animRuleThr3 = false;
                                                        HomeActivity.animDataXThr3
                                                                .setTarget(
                                                                        HomeActivity
                                                                                .animObjDataThr3);
                                                        HomeActivity.animDataXThr3
                                                                .setPropertyName("scaleX");
                                                        HomeActivity.animDataXThr3
                                                                .setFloatValues(
                                                                        HomeActivity
                                                                                .animFloats1Thr3);
                                                        HomeActivity.animDataXThr3
                                                                .setDuration(100);
                                                        HomeActivity.animDataXThr3.start();
                                                        HomeActivity.animDataYThr3
                                                                .setTarget(
                                                                        HomeActivity
                                                                                .animObjDataThr3);
                                                        HomeActivity.animDataYThr3
                                                                .setPropertyName("scaleY");
                                                        HomeActivity.animDataYThr3
                                                                .setFloatValues(
                                                                        HomeActivity
                                                                                .animFloats1Thr3);
                                                        HomeActivity.animDataYThr3
                                                                .setDuration(100);
                                                        HomeActivity.animDataYThr3.start();
                                                        HomeActivity.timerTaskThr3 =
                                                                new TimerTask() {
                                                                    @Override
                                                                    public void run() {
                                                                        runOnUiThread(
                                                                                new Runnable() {
                                                                                    @Override
                                                                                    public void
                                                                                            run() {
                                                                                        HomeActivity
                                                                                                .animDataXThr3
                                                                                                .setTarget(
                                                                                                        HomeActivity
                                                                                                                .animObjDataThr3);
                                                                                        HomeActivity
                                                                                                .animDataXThr3
                                                                                                .setPropertyName(
                                                                                                        "scaleX");
                                                                                        HomeActivity
                                                                                                .animDataXThr3
                                                                                                .setFloatValues(
                                                                                                        HomeActivity
                                                                                                                .animFloats2Thr3);
                                                                                        HomeActivity
                                                                                                .animDataXThr3
                                                                                                .setDuration(
                                                                                                        200);
                                                                                        HomeActivity
                                                                                                .animDataXThr3
                                                                                                .start();
                                                                                        HomeActivity
                                                                                                .animDataYThr3
                                                                                                .setTarget(
                                                                                                        HomeActivity
                                                                                                                .animObjDataThr3);
                                                                                        HomeActivity
                                                                                                .animDataYThr3
                                                                                                .setPropertyName(
                                                                                                        "scaleY");
                                                                                        HomeActivity
                                                                                                .animDataYThr3
                                                                                                .setFloatValues(
                                                                                                        HomeActivity
                                                                                                                .animFloats2Thr3);
                                                                                        HomeActivity
                                                                                                .animDataXThr3
                                                                                                .setDuration(
                                                                                                        200);
                                                                                        HomeActivity
                                                                                                .animDataYThr3
                                                                                                .start();
                                                                                        HomeActivity
                                                                                                        .timerTaskThr3 =
                                                                                                new TimerTask() {
                                                                                                    @Override
                                                                                                    public
                                                                                                    void
                                                                                                            run() {
                                                                                                        runOnUiThread(
                                                                                                                new Runnable() {
                                                                                                                    @Override
                                                                                                                    public
                                                                                                                    void
                                                                                                                            run() {
                                                                                                                        HomeActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .setTarget(
                                                                                                                                        HomeActivity
                                                                                                                                                .animObjDataThr3);
                                                                                                                        HomeActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .setPropertyName(
                                                                                                                                        "scaleX");
                                                                                                                        HomeActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .setFloatValues(
                                                                                                                                        HomeActivity
                                                                                                                                                .animFloats3Thr3);
                                                                                                                        HomeActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .setDuration(
                                                                                                                                        250);
                                                                                                                        HomeActivity
                                                                                                                                .animDataXThr3
                                                                                                                                .start();
                                                                                                                        HomeActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .setTarget(
                                                                                                                                        HomeActivity
                                                                                                                                                .animObjDataThr3);
                                                                                                                        HomeActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .setPropertyName(
                                                                                                                                        "scaleY");
                                                                                                                        HomeActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .setFloatValues(
                                                                                                                                        HomeActivity
                                                                                                                                                .animFloats3Thr3);
                                                                                                                        HomeActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .setDuration(
                                                                                                                                        250);
                                                                                                                        HomeActivity
                                                                                                                                .animDataYThr3
                                                                                                                                .start();
                                                                                                                        HomeActivity
                                                                                                                                        .animRuleThr3 =
                                                                                                                                true;
                                                                                                                    }
                                                                                                                });
                                                                                                    }
                                                                                                };
                                                                                        HomeActivity
                                                                                                ._timerTaskThr3
                                                                                                .schedule(
                                                                                                        HomeActivity
                                                                                                                .timerTaskThr3,
                                                                                                        200);
                                                                                    }
                                                                                });
                                                                    }
                                                                };
                                                        HomeActivity._timerTaskThr3
                                                                .schedule(
                                                                        HomeActivity
                                                                                .timerTaskThr3,
                                                                        100);
                                                    }
                                                });
                                    }
                                };
                        HomeActivity._timerTaskThr3.schedule(
                                HomeActivity.timerTaskThr3, 0);
                    }
                }
            }
        }
    }
}