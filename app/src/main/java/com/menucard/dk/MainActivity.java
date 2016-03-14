package com.menucard.dk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.streethawk.library.core.StreetHawk;
import com.streethawk.library.push.Push;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStreetHawk();
    }

    private void initStreetHawk() {
        try {
            Push.getInstance(this).registerForPushMessaging("558988786839");
            StreetHawk.INSTANCE.init(getApplication());

            StreetHawk.INSTANCE.setAppKey("menucard_dk");  // APP_KEY registered with StreetHawk
            StreetHawk.INSTANCE.init(getApplication());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
