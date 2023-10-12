package com.glo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.glo.model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
