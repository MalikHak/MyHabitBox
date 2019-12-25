package app.auaf.myhabitbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent intent=new Intent(SplashScreenActivity.this, Login_activity.class);
                startActivity(intent);
                finish();

            }
        },4000);

    }
}
