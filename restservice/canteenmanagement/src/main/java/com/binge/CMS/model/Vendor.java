package com.binge.CMS.model;

import java.util.Date;
import java.util.Objects;

public class Vendor {

    private int vendorId;
    private String vendorName;
    private Date vendorDob;
    private int vendorPhno;
    private String vendorEmail;
    private String vendorPwd;
    private float vendorWalBal;


    

    public Vendor() {
    }

    public Vendor(int vendorId, String vendorName, int vendorPhno, String vendorEmail, String vendorPwd, float vendorWalBal) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorPhno = vendorPhno;
        this.vendorEmail = vendorEmail;
        this.vendorPwd = vendorPwd;
        this.vendorWalBal = vendorWalBal;
    }

    public Vendor(int vendorId, String vendorName, Date vendorDob, int vendorPhno, String vendorEmail, String vendorPwd, float vendorWalBal) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
       this.vendorDob = vendorDob;
        this.vendorPhno = vendorPhno;
        this.vendorEmail = vendorEmail;
        this.vendorPwd = vendorPwd;
        this.vendorWalBal = vendorWalBal;
    }

    public Vendor(int i) {
	}

	public Vendor(int int1, String string, String string2, float float1, int int2, String string3) {
	}

	public int getVendorId() {
        return this.vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Date getVendorDob() {
        return this.vendorDob;
    }

    public void setVendorDob(Date vendorDob) {
        this.vendorDob = vendorDob;
    }

    public int getVendorPhno() {
        return this.vendorPhno;
    }

    public void setVendorPhno(int vendorPhno) {
        this.vendorPhno = vendorPhno;
    }

    public String getVendorEmail() {
        return this.vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorPwd() {
        return this.vendorPwd;
    }

    public void setVendorPwd(String vendorPwd) {
        this.vendorPwd = vendorPwd;
    }

    public float getVendorWalBal() {
        return this.vendorWalBal;
    }

    public void setVendorWalBal(float vendorWalBal) {
        this.vendorWalBal = vendorWalBal;
    }

    public Vendor vendorId(int vendorId) {
        setVendorId(vendorId);
        return this;
    }

    public Vendor vendorName(String vendorName) {
        setVendorName(vendorName);
        return this;
    }

    public Vendor vendorDob(Date vendorDob) {
        setVendorDob(vendorDob);
        return this;
    }

    public Vendor vendorPhno(int vendorPhno) {
        setVendorPhno(vendorPhno);
        return this;
    }

    public Vendor vendorEmail(String vendorEmail) {
        setVendorEmail(vendorEmail);
        return this;
    }

    public Vendor vendorPwd(String vendorPwd) {
        setVendorPwd(vendorPwd);
        return this;
    }

    public Vendor vendorWalBal(float vendorWalBal) {
        setVendorWalBal(vendorWalBal);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Vendor)) {
            return false;
        }
        Vendor vendor = (Vendor) o;
        return vendorId == vendor.vendorId && Objects.equals(vendorName, vendor.vendorName) && Objects.equals(vendorDob, vendor.vendorDob) && vendorPhno == vendor.vendorPhno && Objects.equals(vendorEmail, vendor.vendorEmail) && Objects.equals(vendorPwd, vendor.vendorPwd) && vendorWalBal == vendor.vendorWalBal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, vendorName, vendorDob, vendorPhno, vendorEmail, vendorPwd, vendorWalBal);
    }

    @Override
    public String toString() {
        return "{" +
            " vendorId='" + getVendorId() + "'" +
            ", vendorName='" + getVendorName() + "'" +
            ", vendorDob='" + getVendorDob() + "'" +
            ", vendorPhno='" + getVendorPhno() + "'" +
            ", vendorEmail='" + getVendorEmail() + "'" +
            ", vendorPwd='" + getVendorPwd() + "'" +
            ", vendorWalBal='" + getVendorWalBal() + "'" +
            "}";
    }

    
    
}
