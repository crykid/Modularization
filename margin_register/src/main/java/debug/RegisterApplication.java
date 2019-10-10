package debug;

import android.app.Application;
import android.util.Log;

/**
 * Created by:blank
 * Created on: 2019/10/10.23:13
 * Description:
 */
public class RegisterApplication extends Application {
    private static final String TAG = "RegisterApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "RegisterApplication onCreate: ");
    }
}
