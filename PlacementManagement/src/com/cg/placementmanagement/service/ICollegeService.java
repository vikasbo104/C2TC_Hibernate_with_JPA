package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entities.College;
import com.cg.placementmanagement.entities.Placement;

public interface ICollegeService 
{
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(College college);
	public boolean deleteCollege(long id);
	public boolean schedulePlacement(Placement placement);
}
