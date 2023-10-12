package com.glo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.glo.model.Profile;
import com.glo.service.ProfileService;

@Component
public class ProfileController {
	
	@Autowired
 ProfileService profileService;
	
	public Profile save(Profile profile)
	{
		return profileService.save(profile);
	}
	
	public List<Profile> getAll()
	{
		return profileService.getAll();
	}
	
	public String deleteByProfileId(int id)
	{
		return profileService.deleteByProfileId(id);
	}
}
