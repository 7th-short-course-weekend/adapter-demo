package com.rathana.adapter_demo.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rathana.adapter_demo.R;
import com.rathana.adapter_demo.model.Song;

import java.util.List;

public class SongAdapter extends BaseAdapter {

    private List<Song> songs;
    private Context context;

    public SongAdapter(List<Song> songs, Context context) {
        this.songs = songs;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.songs.size();
    }

    @Override
    public Object getItem(int position) {
        return this.songs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        if(convertView==null){
            view= LayoutInflater.from(context)
                    .inflate(R.layout.song_item_layout,parent,false);
        }else{
            view=convertView;
        }

        ///bind data
        ImageView thumb= view.findViewById(R.id.thumb);
        TextView title=view.findViewById(R.id.tvTitle);
        TextView singer=view.findViewById(R.id.tvSinger);
        ImageView btnPlay=view.findViewById(R.id.btnPlay);

        Song song= songs.get(position);
        thumb.setImageResource(song.getThumbnail());
        title.setText(song.getTitle());
        singer.setText(song.getSinger());
        btnPlay.setOnClickListener(v->{
            Toast.makeText(context, "playing", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}
