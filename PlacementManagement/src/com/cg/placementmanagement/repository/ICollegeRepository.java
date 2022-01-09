package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entities.College;

public interface ICollegeRepository {
public College addCollege(College college);
public College updateCollege(College college);
public College searchCollege(College college);
public boolean deleteCollege(long id);


}
