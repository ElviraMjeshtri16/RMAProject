package com.balkatek.rma.model;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class RmaHistory {
    private int id, idRma, idStatus, idPreviousStatus,idAgent,idCustomer;
    private Date creationDate;

    public RmaHistory(){}

    public RmaHistory(int id, int idRma, int idStatus, int idPreviousStatus, int idAgent, int idCustomer){
        this.id = id;
        this.idRma = idRma;
        this.idStatus = idStatus;
        this.idPreviousStatus = idPreviousStatus;
        this.idAgent = idAgent;
        this.idCustomer = idCustomer;
        this.creationDate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRma() {
        return idRma;
    }

    public void setIdRma(int idRma) {
        this.idRma = idRma;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public int getIdPreviousStatus() {
        return idPreviousStatus;
    }

    public void setIdPreviousStatus(int idPreviousStatus) {
        this.idPreviousStatus = idPreviousStatus;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
