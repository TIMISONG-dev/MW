package timisongdev.magicworld.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import timisongdev.magicworld.databinding.ShopmenuBinding;

public class ShopMenu {
    
    ShopmenuBinding binding;
    
    public void showShopMenu(Activity activity, int coin, int level){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        binding = ShopmenuBinding.inflate(dialog.getLayoutInflater());
        dialog.setContentView(binding.getRoot());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.show();

        binding.mwShopTab1.setElevation(8f);
        binding.mwShopTab2.setElevation(8f);
        binding.mwShopTab3.setElevation(8f);

        binding.mwCloseIcon.setOnClickListener(view -> dialog.dismiss());
    }
}