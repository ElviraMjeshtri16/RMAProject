package com.balkatek.rma.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Answer {
    private int idAnswer, idStatusQuestion, idTransition;
    private String result;

    public Answer(){}

    public Answer(int idAnswer, int idStatusQuestion, int idTransition, String result){
        this.idAnswer = idAnswer;
        this.idStatusQuestion = idStatusQuestion;
        this.idTransition = idTransition;
        this.result = result;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public int getIdStatusQuestion() {
        return idStatusQuestion;
    }

    public void setIdStatusQuestion(int idStatusQuestion) {
        this.idStatusQuestion = idStatusQuestion;
    }

    public int getIdTransition() {
        return idTransition;
    }

    public void setIdTransition(int idTransition) {
        this.idTransition = idTransition;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
