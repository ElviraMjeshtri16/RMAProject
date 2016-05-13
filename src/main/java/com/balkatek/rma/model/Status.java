package com.balkatek.rma.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Status {

    private int idStatus;
    private String descripton;

    public Status(){}

    public  Status(int idStatus, String descripton){
        this.idStatus = idStatus;
        this.descripton = descripton;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;

    }
}
