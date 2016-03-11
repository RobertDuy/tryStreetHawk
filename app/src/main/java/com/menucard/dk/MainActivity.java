package com.menucard.dk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.streethawk.library.StreetHawk;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStreetHawk();
    }

    private void initStreetHawk() {
        try {
            StreetHawk.INSTANCE.setGcmSenderId("558988786839");
            StreetHawk.INSTANCE.init(getApplication());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
