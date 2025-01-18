package com.mrhelp4u.service;


import com.mrhelp4u.entity.MerchantRegistrationEntity;
import org.springframework.stereotype.Service;

@Service
public class MerchantRegistrationServiceImpl implements MerchantRegistrationService {


    @Override
    public boolean merchantValidation(MerchantRegistrationEntity entity) {
        if(entity.getbName() == null || entity.getfName() == null || entity.getlName() == null){
            throw new RuntimeException("Business, First & Second name should not be blank");
        } return true;
    }
}
