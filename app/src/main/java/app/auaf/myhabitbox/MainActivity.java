package app.auaf.myhabitbox;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.nio.file.DirectoryStream;

public class MainActivity extends AppCompatActivity {


    String[] names = {"Rouhulla","Razia","Atika","Habil","Ziaqat","Said Rasool","Safiulla","Husna","Sahar","Faisal","Rouhulla","Razia","Atika","Habil","Ziaqat","Said Rasool","Safiulla","Rouhulla","Razia","Atika","Habil","Ziaqat","Said Rasool","Safiulla"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lvNames);
        //adapterts
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, names);

        listView.setAdapter(adapter);



        ///click
    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent=new Intent(MainActivity.this,DetailActivity.class);
            intent.putExtra("name",names[position]);
            startActivity(intent);
        }
    });

    }

}
