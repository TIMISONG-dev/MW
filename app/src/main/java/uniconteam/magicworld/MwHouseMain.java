package uniconteam.magicworld;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MwHouseMain extends AppCompatActivity {
    
    public String mwBlockTab1 = "";
    public String mwBlockTab2 = "";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(savedInstanceState);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences mwPlayData = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        mwBlockTab1 = mwPlayData.getString("mwBlockTab1", "");
        mwBlockTab2 = mwPlayData.getString("mwBlockTab2", "");
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences mwPlayData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor mwEditData = mwPlayData.edit();
        mwEditData.putString("mwBlockTab1", mwBlockTab1.toString());
        mwEditData.apply();
    }
    
    private void initialize(Bundle savedInstanceState) {
        
        
        
    }
    
}