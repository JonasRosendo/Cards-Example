package com.jonasrosendo.cards.model;

import android.widget.ImageView;

public class Post {

    String titulo;
    String post_conteudo;
    int img_post;

    public Post() {
    }

    public Post(String titulo, String post_conteudo, int img_post) {
        this.titulo = titulo;
        this.post_conteudo = post_conteudo;
        this.img_post = img_post;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPost_conteudo() {
        return post_conteudo;
    }

    public void setPost_conteudo(String post_conteudo) {
        this.post_conteudo = post_conteudo;
    }

    public int getImg_post() {
        return img_post;
    }

    public void setImg_post(int img_post) {
        this.img_post = img_post;
    }
}
