package uniconteam.magicworld;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    
    public void dataInventory(){
        
        // List of items
        Map<String, Integer> itemIconMap = new HashMap<>();
        itemIconMap.put("CoinHouse", R.drawable.magicworld_house_coinhouse);
        itemIconMap.put("GardenHouse", R.drawable.magicworld_house_garden);
        itemIconMap.put("Workshop", R.drawable.magicworld_house_workshop);
        itemIconMap.put("", R.drawable.magicworld_item_0);
        List<String> itemList = Arrays.asList("CoinHouse", "GardenHouse", "Workshop");

        // ItemTab1    
        if (itemList.contains(HomeActivity.itemTab1d)) {
                int iconResourceId = itemIconMap.get(HomeActivity.itemTab1d);
                HomeActivity.itemId1.setImageResource(iconResourceId);
        }
        // ItemTab2
        if (itemList.contains(HomeActivity.itemTab2d)) {
                int iconResourceId = itemIconMap.get(HomeActivity.itemTab2d);
                HomeActivity.itemId2.setImageResource(iconResourceId);
        }
        // ItemTab3
        if (itemList.contains(HomeActivity.itemTab3d)) {
                int iconResourceId = itemIconMap.get(HomeActivity.itemTab3d);
                HomeActivity.itemId3.setImageResource(iconResourceId);
        } 
    }
}