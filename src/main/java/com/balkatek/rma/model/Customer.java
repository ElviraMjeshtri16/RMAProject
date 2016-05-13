package com.balkatek.rma.model;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Customer {
    private int idCustomer;
    private String name, lastName, address, customerUniqueId;
    private Date creationDate;

    public Customer(){}

    public Customer(int idCustomer, String name, String lastName, String address, String customerUniqueId){
        this.idCustomer= idCustomer;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.customerUniqueId = customerUniqueId;
        this.creationDate = new Date();
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerUniqueId() {
        return customerUniqueId;
    }

    public void setCustomerUniqueId(String customerUniqueId) {
        this.customerUniqueId = customerUniqueId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
