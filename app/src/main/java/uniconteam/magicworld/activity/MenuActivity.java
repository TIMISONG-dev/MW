package uniconteam.magicworld.activity;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.text.SimpleDateFormat;
import java.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.graphics.Typeface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import uniconteam.magicworld.R;
import uniconteam.magicworld.attack.BackElement;
import uniconteam.magicworld.attack.MagicHero;
import uniconteam.magicworld.engine.MwConsortium;

public class MenuActivity extends AppCompatActivity {
    // All objects
    public ImageView logoImg; // Image logo magic world
    public Button playButton; // Play button
    public Button magicAttackButton; // Battlefield button
    public static ObjectAnimator logoObjX = new ObjectAnimator(); // Logo animation ScaleX, ScaleY
    public static ObjectAnimator logoObjY = new ObjectAnimator();
    public static ObjectAnimator playButtonObjX = new ObjectAnimator(); // Play button animation ScaleX, ScaleY
    public static ObjectAnimator playButtonObjY = new ObjectAnimator();
    public static ObjectAnimator magicAttackButtonObjX = new ObjectAnimator(); // Battlefield button animation ScaleX, ScaleY
    public static ObjectAnimator magicAttackButtonObjY = new ObjectAnimator();
    private Intent intent = new Intent(); // Intent for launching new activity
    public static TimerTask timerTask;
    public static Timer _timerTask = new Timer();

    public static String mwActivity;

    public LinearLayout versionTab;
    public LinearLayout compTab;
    
    MwConsortium mwc = new MwConsortium();
    
    String fistOpen;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        initialize(savedInstanceState);
        initializeLogic();

        SharedPreferences playData = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        /*
        // All data from SharedPreferences
        String logFileName = "mwLogSh-" + date + ".log";
        File logFile = new File(getExternalFilesDir(null), logFileName);

        try {
            logFile.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(logFile);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);

            Map<String, ?> allEntries = playData.getAll();

            for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                String logMessage = key + ": " + value.toString();
                printWriter.println(logMessage);
                printWriter.println(BackElement.biomeSizeX);
            }

            printWriter.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    @Override
    protected void onResume() {
        super.onResume();
        mwActivity = "mwMain";
        
        // Default settings
        SharedPreferences playData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor editData = playData.edit();
        fistOpen = playData.getString("firstOpen_1.0t4", "");
        if(fistOpen == ""){
            editData.putString("firstOpen_1.0t4", "false");
            editData.putString("itemSelected", "1");
            editData.putInt("tutorialLevel", 1);
            editData.putString("itemTab1d", "CoinHouse");
            editData.putString("itemTab2d", "");
            editData.putString("itemTab3d", "");
            editData.putInt("magicCoin", 100);
            editData.putInt("magicLevel", 0);
            editData.putInt("magicGem", 0);
            editData.putInt("coinHouseLevel", 1);
            editData.putInt("gardenHouseLevel", 1);
            editData.putInt("workshopLevel", 1);
            fistOpen = playData.getString("firstOpen_1.0t4", "");
            for (int i = 1; i <= 20; i++){
                String blockTabN = "blockTab" + i + "d";
                editData.putString(blockTabN, "");
            }
            for (int i = 2; i <= 20; i++){
                String blockTabLckN = "blockTabLck" + i;
                editData.putString(blockTabLckN, "Lock");
            }
        }
        editData.apply();
    } 
    
    @Override
    protected void onStop(){
        super.onStop();
        SharedPreferences playData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor editData = playData.edit();
        editData.putString("firstOpen_1.0t4", fistOpen);
    }

    private void initialize(Bundle savedInstanceState) {
        // Design, detect objects id, set Logo image ScaleX, ScaleY
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, 
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        logoImg = findViewById(R.id.mwLogoImg);
        playButton = findViewById(R.id.mwPlayButton);
        magicAttackButton = findViewById(R.id.mwBattleFieldButton);
        logoImg.setScaleX((float) (5.0d));
        logoImg.setScaleY((float) (5.0d));
        versionTab = findViewById(R.id.mwVersionTab);
        compTab = findViewById(R.id.mwCompTab);
        playButton.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        magicAttackButton.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/magicworld_google_sans_regular.ttf"), Typeface.NORMAL);
        
        
        if (Build.VERSION.SDK_INT >= 21) {
            versionTab.setElevation(8f);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            compTab.setElevation(8f);
        }
    }

    private void initializeLogic() {

        // Onclick functions
        timerTask =
                new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(() -> {
                                    mwc.mwClick(logoImg, logoObjX, logoObjY, 0.9f, 1.1f, 1.0f, _timerTask, timerTask);
                                });
                    }
                };
        _timerTask.schedule(timerTask, 500);
        

        playButton.setOnClickListener(
                view -> {
                    mwc.mwClick(playButton, playButtonObjX, playButtonObjY, 1.1f, 0.9f, 1.0f, _timerTask, timerTask);

                    timerTask =
                                new TimerTask() {
                                    @Override
                                    public void run() {
                                        runOnUiThread(() -> {
                                                    intent.setClass(
                                                            getApplicationContext(),HomeActivity.class);
                                                    startActivity(intent);
                                                });
                                    }
                                };
                        _timerTask.schedule(timerTask, 250);
                });
        magicAttackButton.setOnClickListener(
                view -> {
                    mwc.mwClick(magicAttackButton, magicAttackButtonObjX, magicAttackButtonObjY, 1.1f, 0.9f, 1.0f, _timerTask, timerTask);

                    MagicHero.heroX = 500;
                    MagicHero.heroY = 1000;

                    timerTask =
                                new TimerTask() {
                                    @Override
                                    public void run() {
                                        runOnUiThread(() -> {
                                                    intent.setClass(
                                                            getApplicationContext(),
                                                            MagicAttackActivity.class);
                                                    startActivity(intent);
                                                });
                                    }
                                };
                        _timerTask.schedule(timerTask, 250);
                });
    } 
} 
