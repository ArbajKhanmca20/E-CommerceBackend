package com.nagarro.dao;

import com.nagarro.entity.Shipping;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepo extends JpaRepository<Shipping, Integer> {

}
