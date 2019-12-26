package app.auaf.myhabitbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {


    TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        tvName=findViewById(R.id.tvName);


        String nameUser=getIntent().getStringExtra("name");

        tvName.setText(nameUser);

    }
}
