package timisongdev.magicworld.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import timisongdev.magicworld.R;
import timisongdev.magicworld.databinding.UpgrademenuBinding;

public class UpgradeMenu {
    
    UpgrademenuBinding binding;
    
    public void showUpgradeMenu(Activity activity){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.upgrademenu);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.show();

        binding.mwUpgTab1.setElevation(8f);
        binding.mwCloseIcon.setOnClickListener(view -> dialog.dismiss());
    }
}