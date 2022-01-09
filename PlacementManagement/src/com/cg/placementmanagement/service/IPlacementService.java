package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entities.Placement;

public interface IPlacementService {
	public Placement addPlacement(Placement placement);  // C
	public Placement updatePlacement(Placement placement); // U
	public Placement searchPlacement(long id); // R
	public boolean cancelPlacement(long id); // R
	
}
