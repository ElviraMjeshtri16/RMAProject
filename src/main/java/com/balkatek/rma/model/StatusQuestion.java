package com.balkatek.rma.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusQuestion {
     private int idStatusQuestion, idStatus, idQuestion;

    public StatusQuestion(){}

    public StatusQuestion(int idStatusQuestion, int idStatus, int idQuestion){
        this.idStatusQuestion = idStatusQuestion;
        this.idStatus = idStatus;
        this.idQuestion = idQuestion;

    }

    public int getIdStatusQuestion() {
        return idStatusQuestion;
    }

    public void setIdStatusQuestion(int idStatusQuestion) {
        this.idStatusQuestion = idStatusQuestion;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }
}
