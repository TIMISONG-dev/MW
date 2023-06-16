package uniconteam.magicworld;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;


public class MwBattleFieldActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MwBattleFieldMap(this));
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, 
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }
    @Override
    protected void onPause(){
        super.onPause();
        MwBattleFieldMap.mwGameStoped = true;
    }
    @Override
    protected void onResume(){
        super.onResume();
        MwBattleFieldMap.mwGameStoped = false;
    }
}