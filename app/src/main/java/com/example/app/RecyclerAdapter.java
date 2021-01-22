package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    private List<User> users;
    private Context context;

    public RecyclerAdapter(Context context, List<User> users) {

        this.users = users;
        this.context = context;
    }


    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new ViewHolder(view);
    }

    @Override

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        User sampleuser = users.get(position);
        holder.name.setText(sampleuser.username);
        holder.desc.setText(sampleuser.userdesc);
       // holder.image.setImageResource(sampleuser.userimage);

        Glide.with(context).load(sampleuser.userimage).into(holder.image);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(context,"item" + position + "clicked",Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override

    public int getItemCount() {
        return users.size();
    }
}
