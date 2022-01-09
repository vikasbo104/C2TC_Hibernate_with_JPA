package com.cg.smms.entities;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDetails
{
private long id;
private LocalDateTime dateOfPurchase;
private float total;
private List<Customer>customers;

private String paymentMode; 


private Customer customer;
private Shop shop;
}
