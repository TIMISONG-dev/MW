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

public class UpgradeMenu {
    public void showUpgradeMenu(Activity activity){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.upgrademenu);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.show();
        
        LinearLayout upgTab1;
        ImageView closeIcon;
        
        upgTab1 = dialog.findViewById(R.id.mwUpgTab1);
        closeIcon = dialog.findViewById(R.id.mwCloseIcon);

        upgTab1.setElevation(8f);

        closeIcon.setOnClickListener(view -> dialog.dismiss());
    }
}