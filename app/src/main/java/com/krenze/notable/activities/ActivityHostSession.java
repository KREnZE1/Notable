package com.krenze.notable.activities;

import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.krenze.notable.R;
import com.krenze.notable.adapter.AdapterPlayerNames;
import com.krenze.notable.adapter.AdapterTeamCards;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActivityHostSession extends ActivityParent {

    ArrayList<String> players = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_session);
        RecyclerView recycler = findViewById(R.id.container_recycler);
        recycler.setLayoutManager(new GridLayoutManager(this, 2));
        recycler.setAdapter(new AdapterTeamCards());
        players.addAll(List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"));
        findViewById(R.id.button_add_team).setOnClickListener(v -> ((AdapterTeamCards) recycler.getAdapter()).addTeamName());
        findViewById(R.id.button_temp_add_player).setOnClickListener(v -> ((AdapterPlayerNames) ((RecyclerView) findViewById(R.id.container_recycler)).getAdapter()).addPlayerName(players.remove(0)));
    }
}
