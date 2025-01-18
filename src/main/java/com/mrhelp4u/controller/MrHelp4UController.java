package com.mrhelp4u.controller;

import com.mrhelp4u.dao.RegistrationDao;
import com.mrhelp4u.dto.CustomerRegistrationResponceDto;
import com.mrhelp4u.entity.CustomerRegistrationEntity;
import com.mrhelp4u.service.CustomerRegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class MrHelp4UController {

    @Autowired
    CustomerRegistrationServiceImpl customerRegistrationServiceImpl;

    @Autowired
    RegistrationDao customerRegistrationDao;

    @PostMapping("/customerRegistration")
    public CustomerRegistrationResponceDto customerRegistration(@RequestBody CustomerRegistrationEntity entity) {
        customerRegistrationServiceImpl.custValidation(entity);
        BigInteger save = customerRegistrationDao.custSave(entity);
        return new CustomerRegistrationResponceDto(save.intValue(), " Success!!");
    }
}
