package com.glo.Service;
import java.util.List;

import com.glo.model.*;
public interface FleetService {
	
	public List<Fleet> getAllFleets();
	public Fleet getFleetById(long id);
	
	
}
