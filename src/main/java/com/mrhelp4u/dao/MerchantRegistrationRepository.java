package com.mrhelp4u.dao;

import com.mrhelp4u.entity.CustomerRegistrationEntity;
import com.mrhelp4u.entity.MerchantRegistrationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRegistrationRepository extends CrudRepository<MerchantRegistrationEntity,Integer> {
}
