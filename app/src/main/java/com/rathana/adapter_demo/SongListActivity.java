package com.rathana.adapter_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.rathana.adapter_demo.adapter.SongAdapter;
import com.rathana.adapter_demo.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongListActivity extends AppCompatActivity {

    ListView songListView;
    List<Song> songs=new ArrayList<Song>();
    SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        songListView=findViewById(R.id.listView);
        songAdapter=new SongAdapter(songs,this);
        songListView.setAdapter(songAdapter);
        getSongs();


        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SongListActivity.this,
                        ""+songs.get(position).getTitle(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getSongs(){
        for(int i=0;i<50;i++){
            this.songs.add(new Song(
                "Lady By Preab Sovath"+ i,
                    "Preab Sovath",
                    R.drawable.preap_sovath,
                    false
            ));
        }

        songAdapter.notifyDataSetChanged();
    }
}
