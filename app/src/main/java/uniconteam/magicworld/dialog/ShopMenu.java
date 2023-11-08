package uniconteam.magicworld.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import uniconteam.magicworld.R;

public class ShopMenu {
    
    public void showShopMenu(Activity activity, int coin, int level){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.shopmenu);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.show();
        
        LinearLayout shopTab1;
        LinearLayout shopTab2;
        LinearLayout shopTab3;
        ImageView closeIcon;
        
        shopTab1 = dialog.findViewById(R.id.mwShopTab1);
        shopTab2 = dialog.findViewById(R.id.mwShopTab2);
        shopTab3 = dialog.findViewById(R.id.mwShopTab3);
        closeIcon = dialog.findViewById(R.id.mwCloseIcon);

        shopTab1.setElevation(8f);
        shopTab2.setElevation(8f);
        shopTab3.setElevation(8f);

        closeIcon.setOnClickListener(view -> dialog.dismiss());
    }
}