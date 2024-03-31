package com.example.saurav_shrestha_project2;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerView_Adapter extends RecyclerView.Adapter<RecyclerView_Adapter.ViewHolder> {
    private ArrayList<Category_RecyclerView_List> categoryList;
    private Context context;

    public RecyclerView_Adapter(ArrayList<Category_RecyclerView_List> categoryList, Context context) {
        this.categoryList = categoryList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_category_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_Adapter.ViewHolder holder, int position) {
        holder.imageView_Category.setImageResource(categoryList.get(position).getCategory_image());
        holder.textView_Category.setText(categoryList.get(position).getCategory_name());

        holder.cardView_Category.setOnClickListener(e -> {
            Intent intent = new Intent(context, MainActivity.class);
            intent.putExtra("id", position);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CardView cardView_Category;
        ImageView imageView_Category;
        TextView textView_Category;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView_Category = itemView.findViewById(R.id.cardView_Category);
            imageView_Category = itemView.findViewById(R.id.imageView_Category);
            textView_Category = itemView.findViewById(R.id.textView_Category);
        }
    }
}
