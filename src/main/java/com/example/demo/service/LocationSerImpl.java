package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.repository.LocationR;

@Service   // ⭐ VERY IMPORTANT
public class LocationSerImpl implements LocationSer {

    @Autowired
    private LocationR locationR;

    @Override
    public Location createlocation(Location le) {
        return locationR.save(le);
    }

    @Override
    public List<Location> getalllocation() {
        return locationR.findAll();
    }
}
