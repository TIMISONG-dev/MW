package uniconteam.magicworld;

import android.app.Application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Locale;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(this::logException);
    }

    void logException(Thread thread, Throwable throwable) {
        Calendar calendar = Calendar.getInstance();
        java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMdd-HHmmss", Locale.getDefault());
        String date = dateFormat.format(calendar.getTime());

        String logFileName = "mwLogs-" + date + ".log";
        File logFile = new File(getExternalFilesDir(null), logFileName);

        try {
            FileWriter fileWriter = new FileWriter(logFile, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("MagicWorld exception:");
            throwable.printStackTrace(printWriter);

            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(1);
    }
}
