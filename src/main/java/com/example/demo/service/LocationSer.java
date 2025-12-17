package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Location;

public interface LocationSer {
	Location createlocation(Location location);
	List<Location> getalllocation();
}
