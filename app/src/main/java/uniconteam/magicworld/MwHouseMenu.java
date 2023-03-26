package uniconteam.magicworld;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import uniconteam.magicworld.MwHouseMenu;

public class MwHouseMenu {
    
    private LinearLayout mwHouseTab1;
    private LinearLayout mwHouseTab2;
    private ImageView mwCloseIcon;
        

    public void showDialog(Activity activity, String msg){
        
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.mwhousemenu);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        TextView text = (TextView) dialog.findViewById(R.id.mwHouseId);
        text.setText(msg);

        dialog.show();
        
        mwHouseTab1 = dialog.findViewById(R.id.mwHouseTab1);
        mwHouseTab2 = dialog.findViewById(R.id.mwHouseTab2);
        mwCloseIcon = dialog.findViewById(R.id.mwCloseIcon);
        
        if(Build.VERSION.SDK_INT >= 21) { mwHouseTab1.setElevation(8f); }
        if(Build.VERSION.SDK_INT >= 21) { mwHouseTab2.setElevation(8f); }
        
        mwCloseIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dialog.dismiss();
            }
        });

    }
}