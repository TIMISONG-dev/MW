package uniconteam.magicworld;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class HouseMain extends AppCompatActivity {
    
    public String blockTab1 = "";
    public String blockTab2 = "";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(savedInstanceState);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences playData = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        blockTab1 = playData.getString("blockTab1", "");
        blockTab2 = playData.getString("blockTab2", "");
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences playData = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor editData = playData.edit();
        editData.putString("blockTab1", blockTab1.toString());
        editData.apply();
    }
    
    private void initialize(Bundle savedInstanceState) {
        
        
        
    }
    
}