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
        MwPlayHomeActivity.mwItemTab2d = mwPlayData.getString("mwItemTab2d", "");
        MwPlayHomeActivity.mwItemTab3d = mwPlayData.getString("mwItemTab3d", "");
    }
    public void mwDataInventory(){
        for(int i = 1; i < 4; i++){
            String slot = String.join("", "mwItemTab", Integer.toString(i), "d");
            String[] mwItems = new String[]{"mwCoinHouse", "mwGardenHouse", "mwWorkshop","mwEnchTable"};
            
            if(mwItems[i] == "mwEnchTable"){
                MwPlayHomeActivity.mwItemTab1.setBackgroundResource(R.drawable.magicworld_house_coinhouse);
            }
            
            MwPlayHomeActivity.test.setText(mwItems[i]);
        }
    }
}