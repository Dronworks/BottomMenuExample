package org.dronworks.lowermenuexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TextListAdapter extends RecyclerView.Adapter<TextListAdapter.TextViewHolder> {

    private final List<String> textList;

    // Constructor to initialize the list
    public TextListAdapter(List<String> textList) {
        this.textList = textList;
    }

    @NonNull
    @Override
    public TextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.text_list_item, parent, false);
        return new TextViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TextViewHolder holder, int position) {
        // Bind the data to the TextView
        String text = textList.get(position);
        holder.textItem.setText(text);
    }

    @Override
    public int getItemCount() {
        // Return the size of the list
        return textList.size();
    }

    // ViewHolder class to hold the item view
    static class TextViewHolder extends RecyclerView.ViewHolder {
        TextView textItem;

        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            textItem = itemView.findViewById(R.id.text_item);
        }
    }
}