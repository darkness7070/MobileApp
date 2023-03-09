package com.example.mobileapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ApplicationsAdapter extends RecyclerView.Adapter<ItemViewHolder>{
    private List<Application> _list;
    public ApplicationsAdapter(List<Application> _list) {
        this._list = _list;
    }
        @NonNull
        @Override
        public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_application,parent,false);
            return new ItemViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
            Application item = _list.get(position);
            holder.date.setText(item.getDateTo());
            holder.subdivision.setText(item.getSubdivision());
            holder.type.setText(item.getType());
        }

        @Override
        public int getItemCount() {
            return _list.size();
        }
    }
    class ItemViewHolder extends RecyclerView.ViewHolder {
        public TextView date;
        public TextView subdivision;
        public TextView type;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        date = itemView.findViewById(R.id.date);
        subdivision = itemView.findViewById(R.id.subdivision);
        type = itemView.findViewById(R.id.type);
    }
}
