package debug;

import android.app.Application;
import android.util.Log;

/**
 * Created by:blank
 * Created on: 2019/10/10.22:55
 * Description:
 */
public class LoginApplication extends Application {
    private static final String TAG = "LoginApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "LoginApplication onCreate: ");
    }
}
