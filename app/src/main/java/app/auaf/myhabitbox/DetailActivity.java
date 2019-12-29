package app.auaf.myhabitbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {


    TextView tvName;
    ImageView ivPhoto;
    String url="https://babblesports.com/wp-content/uploads/2019/09/Lionel-Messi-Norway-Real-Messi-GettyImages-1166108824.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        tvName=findViewById(R.id.tvName);
        ivPhoto=findViewById(R.id.ivphoto);



        Picasso.get()
                .load(url)
                .placeholder(R.drawable.ic_logo)
                .error(R.drawable.ic_cancel)
                .into(ivPhoto);


        String nameUser=getIntent().getStringExtra("name");

        tvName.setText(nameUser);

    }
}
