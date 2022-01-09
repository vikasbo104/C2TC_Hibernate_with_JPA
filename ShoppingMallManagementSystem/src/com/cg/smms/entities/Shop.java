package com.cg.smms.entities;

import java.rmi.dgc.Lease;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shop")

public class Shop 
{
@Id
private long shopId;

public long getShopId() {
	return shopId;
}

public void setShopId(long shopId) {
	this.shopId = shopId;
}

}
