package timisongdev.magicworld.repositories;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;

public class SettingsRepository {
    String PREFS_NAME = "settings";
    String PREF_ISMUTE = "isMute";

    SharedPreferences prefs;

    SettingsRepository(Context context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
    }

    public void setMute(boolean isMute) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(PREF_ISMUTE, isMute);
        editor.apply();
    }

    public boolean getMute() {
        return prefs.getBoolean(PREF_ISMUTE, false);
    }
}