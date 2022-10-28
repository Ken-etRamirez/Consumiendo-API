package org.example;

public class Noticia {
    private String title;
    private String byline;
    private String abs;
    private String urlFoto;

    public Noticia(String title, String byline, String abs, String urlFoto) {
        this.title = title;
        this.byline = byline;
        this.abs = abs;
        this.urlFoto = urlFoto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "title='" + title + '\'' +
                ", byline='" + byline + '\'' +
                ", abs='" + abs + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }
}
