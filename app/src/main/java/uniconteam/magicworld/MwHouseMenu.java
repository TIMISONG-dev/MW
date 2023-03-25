package uniconteam.magicworld;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import uniconteam.magicworld.MwHouseMenu;

public class MwHouseMenu {
    
    private LinearLayout mwHouseTab1;
        

    public void showDialog(Activity activity, String msg){
        
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.mwhousemenu);

        TextView text = (TextView) dialog.findViewById(R.id.mwHouseId);
        text.setText(msg);

        dialog.show();
        
        mwHouseTab1 = dialog.findViewById(R.id.mwHouseTab1);
        
        if(Build.VERSION.SDK_INT >= 21) { mwHouseTab1.setElevation(10f); }

    }
}