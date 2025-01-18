package com.mrhelp4u.dao;

import com.mrhelp4u.entity.CustomerRegistrationEntity;
import com.mrhelp4u.entity.MerchantRegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class RegistrationDaoImpl implements RegistrationDao {

    @Autowired
    CustomerRegistrationRepository registrationRepository;

    @Autowired
    MerchantRegistrationRepository merchantRegistrationRepository;

    @Override
    public BigInteger custSave(CustomerRegistrationEntity entity) {
        CustomerRegistrationEntity save = registrationRepository.save(entity);
        return save.getCustId();
    }

    @Override
    public BigInteger merchantSave(MerchantRegistrationEntity entity) {
//        MerchantRegistrationEntity merchantSave = merchantRegistrationRepository.save(entity);
        return null;
    }
}
