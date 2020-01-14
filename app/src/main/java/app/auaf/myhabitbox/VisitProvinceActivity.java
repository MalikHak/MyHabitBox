package app.auaf.myhabitbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class VisitProvinceActivity extends AppCompatActivity {



    // My Data

    String names[]={"Bamyan","Herat","Nooristan","Panjshir","Jalalabad"};

    String description[]={"National Park of Afghanistan","The historical place of Afghanistan","Green and beautiful humans","The beautiful river of Afghanistan","Always green view of Afghanistan"};

    int photos[]={R.drawable.bamyan,R.drawable.bamyan,R.drawable.bamyan,R.drawable.bamyan,R.drawable.bamyan};



    RecyclerView rvProvince;

    ProvinceAdapter provinceAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_province);

        rvProvince=findViewById(R.id.rvprovinces);

        LinearLayoutManager manager=new LinearLayoutManager(VisitProvinceActivity.this,LinearLayoutManager.VERTICAL,false);


        rvProvince.setLayoutManager(manager);

        provinceAdapter=new ProvinceAdapter(names,description,photos);



        rvProvince.setAdapter(provinceAdapter);





    }
}
