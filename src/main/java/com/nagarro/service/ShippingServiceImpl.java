package com.nagarro.service;

import java.util.List;

import com.nagarro.Exception.ResourceNotFoundException;
import com.nagarro.dao.ShippingRepo;
import com.nagarro.entity.Shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingServiceImpl implements ShippingService {
	
	@Autowired
	private ShippingRepo repo;

	@Override
	public Shipping getShipDetails(int pincode) {
		Shipping details = repo.findById(pincode).
				orElseThrow(()->new ResourceNotFoundException("Delivery not possible with this pincode :"+pincode));
		return details;
	}

}
