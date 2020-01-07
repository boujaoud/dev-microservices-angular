package org.jb.customerservice.repository;

import org.jb.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT cust FROM Customer cust  WHERE cust.name=(:name) AND cust.email= (:email)")
    List<Customer> findByNameAndEmail(@Param("name") String name, @Param("email") String email);

}
