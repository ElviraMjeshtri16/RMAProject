package com.balkatek.rma.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Device {
    private int idDevice, idCustomer, idType;
    private String serialNumber;

    public Device(){}

    public Device(int idDevice, int idCustomer, int idType, String serialNumber) {
        this.idDevice = idDevice;
        this.idCustomer = idCustomer;
        this.idType = idType;
        this.serialNumber = serialNumber;
    }

    public int getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(int idDevice) {
        this.idDevice = idDevice;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
