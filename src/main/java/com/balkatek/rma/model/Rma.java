package com.balkatek.rma.model;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Rma {
    private int idRma, idStatus, idDevice;
    private String serialNumber;
    private Date creationDate;

    public Rma(){}

    public Rma( int idRma, int idStatus, int idDevice, String serialNumber){
        this.idRma = idRma;
        this.idDevice = idDevice;
        this.idStatus = idDevice;
        this.serialNumber = serialNumber;
        this.creationDate = new Date();
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

    public int getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(int idDevice) {
        this.idDevice = idDevice;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
