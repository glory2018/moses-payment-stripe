package com.moses.repository;

import com.moses.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moses
 * @date 2020/4/27
 */
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
    //    @Query("from CustomerEntity where userId = ?1")
    CustomerEntity findByUserId(String userId);
}
