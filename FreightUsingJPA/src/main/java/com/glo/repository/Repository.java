package com.glo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glo.model.Freight;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Freight, Integer> {

}
