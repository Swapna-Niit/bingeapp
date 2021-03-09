package com.binge.CMS.model;

import java.util.Date;
import java.util.Objects;

public class Customer {

    /*CUS_ID int AUTO_INCREMENT primary key ,
    CUS_NAME varchar(30),
    CUS_PHONE bigint,
    CUS_DOB date,
    CUS_ADDR varchar(100),
    CUS_EMAIL varchar(50),
    CURR_PASS varchar(50),
    CUS_WALLET float */

    private int cusId;
    private String cusName;
    private long cusPhno;
    private Date cusDob;
    private String cusAddr;
    private String cusEmail;
    private String cusPassword;
    private float cusWalletBalance;


    public Customer() {
    }

    public Customer(int cusId, String cusName, long cusPhno, Date cusDob, String cusAddr, String cusEmail, String cusPassword, float cusWalletBalance) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusPhno = cusPhno;
        this.cusDob = cusDob;
        this.cusAddr = cusAddr;
        this.cusEmail = cusEmail;
        this.cusPassword = cusPassword;
        this.cusWalletBalance = cusWalletBalance;
    }

    public Customer(int int1) {
	}

	public int getCusId() {
        return this.cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return this.cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public long getCusPhno() {
        return this.cusPhno;
    }

    public void setCusPhno(long cusPhno) {
        this.cusPhno = cusPhno;
    }

    public Date getCusDob() {
        return this.cusDob;
    }

    public void setCusDob(Date cusDob) {
        this.cusDob = cusDob;
    }

    public String getCusAddr() {
        return this.cusAddr;
    }

    public void setCusAddr(String cusAddr) {
        this.cusAddr = cusAddr;
    }

    public String getCusEmail() {
        return this.cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusPassword() {
        return this.cusPassword;
    }

    public void setCusPassword(String cusPassword) {
        this.cusPassword = cusPassword;
    }

    public float getCusWalletBalance() {
        return this.cusWalletBalance;
    }

    public void setCusWalletBalance(float cusWalletBalance) {
        this.cusWalletBalance = cusWalletBalance;
    }

    public Customer cusId(int cusId) {
        setCusId(cusId);
        return this;
    }

    public Customer cusName(String cusName) {
        setCusName(cusName);
        return this;
    }

    public Customer cusPhno(int cusPhno) {
        setCusPhno(cusPhno);
        return this;
    }

    public Customer cusDob(Date cusDob) {
        setCusDob(cusDob);
        return this;
    }

    public Customer cusAddr(String cusAddr) {
        setCusAddr(cusAddr);
        return this;
    }

    public Customer cusEmail(String cusEmail) {
        setCusEmail(cusEmail);
        return this;
    }

    public Customer cusPassword(String cusPassword) {
        setCusPassword(cusPassword);
        return this;
    }

    public Customer cusWalletBalance(float cusWalletBalance) {
        setCusWalletBalance(cusWalletBalance);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return cusId == customer.cusId && Objects.equals(cusName, customer.cusName) && cusPhno == customer.cusPhno && Objects.equals(cusDob, customer.cusDob) && Objects.equals(cusAddr, customer.cusAddr) && Objects.equals(cusEmail, customer.cusEmail) && Objects.equals(cusPassword, customer.cusPassword) && cusWalletBalance == customer.cusWalletBalance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cusId, cusName, cusPhno, cusDob, cusAddr, cusEmail, cusPassword, cusWalletBalance);
    }

    @Override
    public String toString() {
        return "{" +
            " cusId='" + getCusId() + "'" +
            ", cusName='" + getCusName() + "'" +
            ", cusPhno='" + getCusPhno() + "'" +
            ", cusDob='" + getCusDob() + "'" +
            ", cusAddr='" + getCusAddr() + "'" +
            ", cusEmail='" + getCusEmail() + "'" +
            ", cusPassword='" + getCusPassword() + "'" +
            ", cusWalletBalance='" + getCusWalletBalance() + "'" +
            "}";
    }
    
}
