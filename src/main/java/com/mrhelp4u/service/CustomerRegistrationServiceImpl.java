package com.mrhelp4u.service;


import com.mrhelp4u.entity.CustomerRegistrationEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService {

    @Override
    public boolean custValidation(CustomerRegistrationEntity entity) {
        if(entity.getfName() == null || entity.getlName() == null){
            throw new RuntimeException("First & Second name should not be blank");
        } return true;
    }

}
