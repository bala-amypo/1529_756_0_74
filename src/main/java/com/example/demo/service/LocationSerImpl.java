package com.example.demo.service;

import java.lang.reflect.AccessFlag.Location;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.LocationR;

public class LocationSerImpl implements LocationSer {
@Autowired
LocationR L;
@Override
public Location createlocation(Location le){
return L.save(le);    
  }

}
