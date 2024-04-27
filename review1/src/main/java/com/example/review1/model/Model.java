package com.example.review1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Model {
     @Id
     private int eid;
     public int getEid() {
      return eid;
    }
    public void setEid(int eid) {
      this.eid = eid;
    }
    private String fname;
     private String lname;
     private String email;
     private String organisation;
     private int phno;
     private String address;
     private String state;
     private String country;
     private int pincode;
     private int addtocart;
     private int numofproductavail;
    public Model() {
    }
    
    public Model(int eid, String fname, String lname, String email, String organisation, int phno, String address,
        String state, String country, int pincode, int addtocart, int numofproductavail) {
      this.eid = eid;
      this.fname = fname;
      this.lname = lname;
      this.email = email;
      this.organisation = organisation;
      this.phno = phno;
      this.address = address;
      this.state = state;
      this.country = country;
      this.pincode = pincode;
      this.addtocart = addtocart;
      this.numofproductavail = numofproductavail;
    }
    public String getFname() {
      return fname;
    }
    public void setFname(String fname) {
      this.fname = fname;
    }
    public String getLname() {
      return lname;
    }
    public void setLname(String lname) {
      this.lname = lname;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public String getOrganisation() {
      return organisation;
    }
    public void setOrganisation(String organisation) {
      this.organisation = organisation;
    }
    public int getPhno() {
      return phno;
    }
    public void setPhno(int phno) {
      this.phno = phno;
    }
    public String getAddress() {
      return address;
    }
    public void setAddress(String address) {
      this.address = address;
    }
    public String getState() {
      return state;
    }
    public void setState(String state) {
      this.state = state;
    }
    public String getCountry() {
      return country;
    }
    public void setCountry(String country) {
      this.country = country;
    }
    public int getPincode() {
      return pincode;
    }
    public void setPincode(int pincode) {
      this.pincode = pincode;
    }
    public int getAddtocart() {
      return addtocart;
    }
    public void setAddtocart(int addtocart) {
      this.addtocart = addtocart;
    }
    public int getNumofproductavail() {
      return numofproductavail;
    }
    public void setNumofproductavail(int numofproductavail) {
      this.numofproductavail = numofproductavail;
    }



}