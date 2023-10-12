package com.glo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glo.model.Profile;
@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
