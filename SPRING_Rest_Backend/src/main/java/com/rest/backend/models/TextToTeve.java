package com.rest.backend.models;

public class TextToTeve {

    private String text;
    private String lang;

    public TextToTeve() {
    }

    public TextToTeve(String text, String lang) {
        this.text = text;
        this.lang = lang;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
