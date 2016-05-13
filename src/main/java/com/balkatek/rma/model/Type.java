package com.balkatek.rma.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Type {
    private int idType;
    private String typeDescription;

    public Type(){}

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public Type(int idType, String typeDescription){
        this.idType = idType;
        this.typeDescription = typeDescription;


    }
}
