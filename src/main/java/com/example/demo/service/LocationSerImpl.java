package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationR;

public class LocationSerImpl implements LocationSer {

  @Autowired
  private LocationR L;

  @Override
  public Location createlocation(Location le) {
    return L.save(le);
  }

  
  public List<Location> getalllocation() {
    return L.findAll();
  }

}
