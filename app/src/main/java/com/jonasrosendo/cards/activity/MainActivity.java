package com.jonasrosendo.cards.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jonasrosendo.cards.R;
import com.jonasrosendo.cards.adapter.AdapterPost;
import com.jonasrosendo.cards.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private AdapterPost adapterPost;
    private List<Post> postList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);

        this.setPostList();
        adapterPost = new AdapterPost(postList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(layoutManager);

        recycler.setAdapter(adapterPost);
    }

    public void setPostList(){
        Post post = new Post("Jonas Rosendo", "#TBT viagem muito louca!", R.drawable.imagem1);
        postList.add(post);

        post = new Post("Maria Silva", "Academia logo ced", R.drawable.imagem2);
        postList.add(post);

        post = new Post("João Pedro", "Café da manhã especial", R.drawable.imagem3);
        postList.add(post);

        post = new Post("Pizzaria Los Santos", "Que tal uma pizza hoje à noite ?", R.drawable.imagem4);
        postList.add(post);
    }
}
