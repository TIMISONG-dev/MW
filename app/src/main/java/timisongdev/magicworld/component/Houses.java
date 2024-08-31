package timisongdev.magicworld.component;

import android.widget.ImageView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import timisongdev.magicworld.R;
import timisongdev.magicworld.activity.HomeActivity;
import timisongdev.magicworld.databinding.HomeBinding;

public class Houses {
    public void dataHouses() {
        // List of houses
        Map<String, Integer> itemIconMap = new HashMap<>();
        itemIconMap.put("CoinHouse", R.drawable.magicworld_house_coinhouse);
        itemIconMap.put("GardenHouse", R.drawable.magicworld_house_garden);
        itemIconMap.put("Workshop", R.drawable.magicworld_house_workshop);
        itemIconMap.put("Mine", R.drawable.magicworld_house_mine);
        itemIconMap.put("", R.drawable.magicworld_block_grass);

        List<ImageView> blockImageViews = Arrays.asList(
                HomeActivity.binding.mwBlockTab1,
                HomeActivity.binding.mwBlockTab2,
                HomeActivity.binding.mwBlockTab3,
                HomeActivity.binding.mwBlockTab4,
                HomeActivity.binding.mwBlockTab5,
                HomeActivity.binding.mwBlockTab6,
                HomeActivity.binding.mwBlockTab7,
                HomeActivity.binding.mwBlockTab8,
                HomeActivity.binding.mwBlockTab9,
                HomeActivity.binding.mwBlockTab10,
                HomeActivity.binding.mwBlockTab11,
                HomeActivity.binding.mwBlockTab12,
                HomeActivity.binding.mwBlockTab13,
                HomeActivity.binding.mwBlockTab14,
                HomeActivity.binding.mwBlockTab15,
                HomeActivity.binding.mwBlockTab16,
                HomeActivity.binding.mwBlockTab17,
                HomeActivity.binding.mwBlockTab18,
                HomeActivity.binding.mwBlockTab19,
                HomeActivity.binding.mwBlockTab20
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
