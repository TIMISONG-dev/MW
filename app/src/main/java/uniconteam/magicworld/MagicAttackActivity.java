package uniconteam.magicworld;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;


public class MagicAttackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MagicAttackMap(this));
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, 
        WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }
    @Override
    protected void onPause(){
        super.onPause();
        MagicAttackMap.gameStoped = true;
    }
    @Override
    protected void onResume(){
        super.onResume();
        MagicAttackMap.gameStoped = false;
    }
}