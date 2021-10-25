package com.example.demo.bean;

public class Website {
    String id;
    String name;
    String url;
    String alexa;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAlexa(String alexa) {
        this.alexa = alexa;
    }

    public String getAlexa() {
        return alexa;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "（" +
                "'" + id + "'" +
                "'" + name + "'" +
                "'" + url + "'" +
                "'" + alexa + "'" +
                '）';
    }
}
