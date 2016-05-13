package com.balkatek.rma.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transition {
    private int idTransition, idStatus;

    public Transition(){}

    public Transition(int idStatus, int idTransition){
        this.idStatus = idStatus;
        this.idTransition = idTransition;
    }

    public int getIdTransition() {
        return idTransition;
    }

    public void setIdTransition(int idTransition) {
        this.idTransition = idTransition;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }
}
