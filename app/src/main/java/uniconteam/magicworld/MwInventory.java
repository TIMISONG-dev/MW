package uniconteam.magicworld;

import android.content.SharedPreferences;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import uniconteam.magicworld.MwPlayHomeActivity;

public class MwInventory extends AppCompatActivity {
    
    public void mwDataInventory(){
        
        // List of items
        Map<String, Integer> itemIconMap = new HashMap<>();
        itemIconMap.put("CoinHouse", R.drawable.magicworld_house_coinhouse);
        itemIconMap.put("GardenHouse", R.drawable.magicworld_house_garden);
        itemIconMap.put("Workshop", R.drawable.magicworld_house_workshop);
        List<String> itemList = Arrays.asList("CoinHouse", "GardenHouse", "Workshop");

        // ItemTab1    
        if (itemList.contains(MwPlayHomeActivity.mwItemTab1d)) {
                int iconResourceId = itemIconMap.get(MwPlayHomeActivity.mwItemTab1d);
                MwPlayHomeActivity.mwItemId1.setImageResource(iconResourceId);
        }
        // ItemTab2
        if (itemList.contains(MwPlayHomeActivity.mwItemTab2d)) {
                int iconResourceId = itemIconMap.get(MwPlayHomeActivity.mwItemTab2d);
                MwPlayHomeActivity.mwItemId2.setImageResource(iconResourceId);
        }
        // ItemTab3
        if (itemList.contains(MwPlayHomeActivity.mwItemTab3d)) {
                int iconResourceId = itemIconMap.get(MwPlayHomeActivity.mwItemTab3d);
                MwPlayHomeActivity.mwItemId3.setImageResource(iconResourceId);
        } 
    }
}