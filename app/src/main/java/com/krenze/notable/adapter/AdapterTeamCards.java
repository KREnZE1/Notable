package com.krenze.notable.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.krenze.notable.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterTeamCards extends RecyclerView.Adapter<AdapterTeamCards.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        RecyclerView recyclerView;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.label_team_name);
            recyclerView = view.findViewById(R.id.item_recyclerview);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.textView.getContext()));
            recyclerView.setAdapter(new AdapterPlayerNames());
        }

        public void setName(String name) {
            textView.setText(name);
        }

        public void addPlayerName(String name) {
            ((AdapterPlayerNames) recyclerView.getAdapter()).addPlayerName(name);
        }
    }


    ArrayList<String> teamnames = new ArrayList<>(List.of("Team 1", "Team 2"));

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team_card, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setName(teamnames.get(position));
    }

    @Override
    public int getItemCount() {
        return teamnames.size();
    }

    public void addTeamName() {
        teamnames.add("Team "+teamnames.size());
    }

}
