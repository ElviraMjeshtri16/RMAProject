package com.balkatek.rma.model;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Agents {
    private int idAgent, idCustomer;
    private String firstName, lastName;
    private Date createdDate;

    public  Agents(){}

    public Agents(int idAgent, int idCustomer, String firstName, String lastName) {
        this.idAgent = idAgent;
        this.idCustomer = idCustomer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdDate = new Date();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
