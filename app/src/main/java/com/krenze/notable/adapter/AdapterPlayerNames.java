package com.krenze.notable.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.krenze.notable.R;

import java.util.ArrayList;

public class AdapterPlayerNames extends RecyclerView.Adapter<AdapterPlayerNames.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView player_name;
        public ViewHolder(@NonNull View view) {
            super(view);
            player_name = view.findViewById(R.id.label_player_name);
        }

        public void setName(String name) {
            player_name.setText(name);
        }
    }

    ArrayList<String> player_names;
    public AdapterPlayerNames() {
        player_names = new ArrayList<>();
    }

    public void addPlayerName(String name) {
        player_names.add(name);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setName(player_names.get(position));
    }

    @Override
    public int getItemCount() {
        return player_names.size();
    }
}
