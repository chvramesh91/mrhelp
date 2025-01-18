package com.mrhelp4u.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
public class CustomerRegistrationEntity {

    public BigInteger getCustId() {
        return custId;
    }

    public void setCustId(BigInteger custId) {
        this.custId = custId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getlLandmark() {
        return lLandmark;
    }

    public void setlLandmark(String lLandmark) {
        this.lLandmark = lLandmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    @Id
    @Column
    public BigInteger custId;
    @Column
    public LocalDateTime dateTime;
    @Column
    public String fName;
    @Column
    public String mName;
    @Column
    public String lName;
    @Column
    public String emailAddress;
    @Column
    public String password;
    @Column
    public String address1;
    @Column
    public String address2;
    @Column
    public String address3;
    @Column
    public String lLandmark;
    @Column
    public String city;
    @Column
    public String district;
    @Column
    public String state;
    @Column
    public String country;
    @Column
    public String phoneNumber1;
    @Column
    public String phoneNumber2;

}
