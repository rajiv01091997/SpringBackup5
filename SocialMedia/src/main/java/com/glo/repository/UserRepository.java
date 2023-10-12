package com.glo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glo.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
