package app.auaf.myhabitbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

public class ShowMoreDataWithRecyclerView extends AppCompatActivity {

    RecyclerView rvItems;


    String names[]={"Habil", "Sahar","Husna","Atika","Razia","Said Rasool","Sayed Isaahq","SafiUllah","Ziaqat","Rohullah","Refa","Faisal"};

    String jobs[]={ "Student at AUAF","Student at AUAF","Student at AUAF","Student at AUAF","Student at AUAF","Student at AUAF","Student at AUAF","Student at AUAF","Student at AUAF","Student at AUAF","Student at AUAF","Student at AUAF"};

    String descriptionPost[]={"Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries","Android Development and its features,term of use in afghanistan and other developing countries"};


    int photos[]={R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile,R.drawable.profile};

    int photoDesc[]={R.drawable.desc1,R.drawable.desc2,R.drawable.desc2,R.drawable.desc1,R.drawable.desc2,R.drawable.desc1,R.drawable.desc2,R.drawable.desc1,R.drawable.desc1,R.drawable.desc2,R.drawable.desc1,R.drawable.desc2};


    StudentsAdapter studentsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_more_data_with_recycler_view);

        Log.d("size",names.length+"");
        rvItems=findViewById(R.id.rvItems);

        studentsAdapter= new StudentsAdapter(names,jobs,descriptionPost,photos,photoDesc);


        LinearLayoutManager manager=new LinearLayoutManager(ShowMoreDataWithRecyclerView.this,LinearLayoutManager.VERTICAL,false);
        rvItems.setLayoutManager(manager);
        rvItems.setAdapter(studentsAdapter);





    }
}
