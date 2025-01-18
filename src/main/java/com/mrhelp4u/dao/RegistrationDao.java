package com.mrhelp4u.dao;

import com.mrhelp4u.entity.CustomerRegistrationEntity;
import com.mrhelp4u.entity.MerchantRegistrationEntity;

import java.math.BigInteger;

public interface RegistrationDao {

    public BigInteger custSave(CustomerRegistrationEntity entity);
    public BigInteger merchantSave(MerchantRegistrationEntity entity);


}
