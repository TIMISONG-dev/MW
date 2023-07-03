package uniconteam.magicworld;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import uniconteam.magicworld.HouseMenu;

public class HouseMenu {
    
    private LinearLayout houseTab1;
    private LinearLayout houseTab2;
    private LinearLayout houseTab3;
    private HorizontalScrollView scrollTabs;
    private ImageView closeIcon;
    public TextView menuHint;
        

    public void showDialog(Activity activity, String msg){
        
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.housemenu);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        TextView text = (TextView) dialog.findViewById(R.id.mwHouseId);
        text.setText(msg);

        dialog.show();
        
        houseTab1 = dialog.findViewById(R.id.mwHouseTab1);
        houseTab2 = dialog.findViewById(R.id.mwHouseTab2);
        houseTab3 = dialog.findViewById(R.id.mwHouseTab3);
        closeIcon = dialog.findViewById(R.id.mwCloseIcon);
        scrollTabs = dialog.findViewById(R.id.mwScrollTabs);
        menuHint = dialog.findViewById(R.id.mwMenuHint);
        
        if(Build.VERSION.SDK_INT >= 21) { houseTab1.setElevation(8f); }
        if(Build.VERSION.SDK_INT >= 21) { houseTab2.setElevation(8f); }
        if(Build.VERSION.SDK_INT >= 21) { houseTab3.setElevation(8f); }
        scrollTabs.setHorizontalScrollBarEnabled(false);
        
        closeIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
            }
        });

    }
}