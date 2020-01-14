package app.auaf.myhabitbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FootballPlayersActivity extends AppCompatActivity {


    RecyclerView rvPlayers;

    LinearLayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football_players);
        rvPlayers=findViewById(R.id.rvPlayers);

 manager=new LinearLayoutManager(FootballPlayersActivity.this,LinearLayoutManager.VERTICAL,false);

 rvPlayers.setLayoutManager(manager);

    }
}
