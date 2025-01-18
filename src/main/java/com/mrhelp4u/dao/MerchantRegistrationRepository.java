package com.mrhelp4u.dao;

import com.mrhelp4u.entity.CustomerRegistrationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRegistrationRepository extends CrudRepository<CustomerRegistrationEntity,Integer> {
}
