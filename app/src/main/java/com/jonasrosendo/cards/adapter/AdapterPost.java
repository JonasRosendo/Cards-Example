package com.jonasrosendo.cards.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonasrosendo.cards.R;
import com.jonasrosendo.cards.model.Post;

import java.util.ArrayList;
import java.util.List;

public class AdapterPost extends RecyclerView.Adapter<AdapterPost.MyViewHolder> {

    private List<Post> posts = new ArrayList<>();

    public AdapterPost(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        Post post = posts.get(i);
        holder.titulo.setText(post.getTitulo());
        holder.post_conteudo.setText(post.getPost_conteudo());
        holder.img_post.setImageResource(post.getImg_post());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo, post_conteudo;
        ImageView img_post;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

           titulo   = itemView.findViewById(R.id.txv_titulo);
           post_conteudo     = itemView.findViewById(R.id.txv_post);
           img_post = itemView.findViewById(R.id.imgv_post);
        }
    }
}
