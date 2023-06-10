package uniconteam.magicworld;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class MwBattleFieldActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MwBattleFieldMap(this));
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(Color.parseColor("#2C6E3C"));
        }
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