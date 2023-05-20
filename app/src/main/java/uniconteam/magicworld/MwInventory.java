package uniconteam.magicworld;

import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import uniconteam.magicworld.MwPlayHomeActivity;

public class MwInventory extends AppCompatActivity {
    
    @Override
    protected void onResume(){
        super.onResume();
        SharedPreferences mwPlayData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        MwPlayHomeActivity.mwItemTab1d = mwPlayData.getString("mwItemTab1d", "");
    }
}