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

        List<ImageView> blockImageViews = new ArrayList<>();

        blockImageViews.add(HomeActivity.blockTab1);
        blockImageViews.add(HomeActivity.blockTab2);
        blockImageViews.add(HomeActivity.blockTab3);
        blockImageViews.add(HomeActivity.blockTab4);
        blockImageViews.add(HomeActivity.blockTab5);
        blockImageViews.add(HomeActivity.blockTab6);
        blockImageViews.add(HomeActivity.blockTab7);
        blockImageViews.add(HomeActivity.blockTab8);
        blockImageViews.add(HomeActivity.blockTab9);
        blockImageViews.add(HomeActivity.blockTab10);
        blockImageViews.add(HomeActivity.blockTab11);
        blockImageViews.add(HomeActivity.blockTab12);
        blockImageViews.add(HomeActivity.blockTab13);
        blockImageViews.add(HomeActivity.blockTab14);
        blockImageViews.add(HomeActivity.blockTab15);
        blockImageViews.add(HomeActivity.blockTab16);
        blockImageViews.add(HomeActivity.blockTab17);
        blockImageViews.add(HomeActivity.blockTab18);
        blockImageViews.add(HomeActivity.blockTab19);
        blockImageViews.add(HomeActivity.blockTab20);

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
