package uniconteam.magicworld;

import android.util.LogPrinter;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Houses {

    public void dataHouses() {
        // List of houses
        Map<String, Integer> itemIconMap = new HashMap<>();
        itemIconMap.put("CoinHouse", R.drawable.magicworld_house_coinhouse);
        itemIconMap.put("GardenHouse", R.drawable.magicworld_house_garden);
        itemIconMap.put("Workshop", R.drawable.magicworld_house_workshop);
        itemIconMap.put("", R.drawable.magicworld_block_grass);

        List<ImageView> blockImageViews = List.of(
                HomeActivity.blockTab1,
                HomeActivity.blockTab2,
                HomeActivity.blockTab3,
                HomeActivity.blockTab4,
                HomeActivity.blockTab5,
                HomeActivity.blockTab6,
                HomeActivity.blockTab7,
                HomeActivity.blockTab8,
                HomeActivity.blockTab9,
                HomeActivity.blockTab10,
                HomeActivity.blockTab11,
                HomeActivity.blockTab12,
                HomeActivity.blockTab13,
                HomeActivity.blockTab14,
                HomeActivity.blockTab15,
                HomeActivity.blockTab16,
                HomeActivity.blockTab17,
                HomeActivity.blockTab18,
                HomeActivity.blockTab19,
                HomeActivity.blockTab20
        );

        for (int i = 1; i <= 20; i++) {
            String block = HomeActivity.blocksTab[i];

            if (itemIconMap.containsKey(block)) {
                int iconResourceId = itemIconMap.get(block);
                ImageView blockImageView =
                        blockImageViews.get(i - 1);
                blockImageView.setImageResource(iconResourceId);
            }
        }
    }
}
