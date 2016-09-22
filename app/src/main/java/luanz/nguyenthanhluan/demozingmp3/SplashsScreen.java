package luanz.nguyenthanhluan.demozingmp3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Admin on 9/21/2016.
 */
public class SplashsScreen extends Activity {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);

            int secondsDelayed = 1;
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    startActivity(new Intent(SplashsScreen.this, MainActivity.class));
                    finish();
                }
            }, secondsDelayed * 3000);
        }


}
