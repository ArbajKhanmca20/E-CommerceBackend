package com.nagarro.service;

import com.nagarro.entity.Shipping;

public interface ShippingService {
	Shipping getShipDetails(int pincode);
}
