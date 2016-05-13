package com.balkatek.rma.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Question {
    private int idQuestion;
    private String description;
    private String url;

    public Question(){}

    public Question(int idQuestion, String description, String url){
        this.idQuestion = idQuestion;
        this.description = description;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
