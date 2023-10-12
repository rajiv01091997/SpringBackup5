package com.glo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glo.model.Profile;
import com.glo.repository.ProfileRepository;

@Service
public class ProfileService {
	
	@Autowired
	private ProfileRepository profileRepository;
	
	public Profile save(Profile profile)
	{
		return profileRepository.save(profile);
	}
     
	public List<Profile> getAll()
	{
		return profileRepository.findAll();
	}
	
	public String deleteByProfileId(int id)
	{
     profileRepository.deleteById(id);
     return "Deleted Successfully";
	}
}
