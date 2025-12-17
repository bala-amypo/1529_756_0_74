package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationSer;

@RestController
public class LocationCont {
    @Autowired
    LocationSer locationSer;

    @PostMapping("/a")
    public Location add(@RequestBody Location le) {
        return locationSer.createlocation(le);

    }

    @GetMapping("/showlocation")
    public List<Location> show() {
        return locationSer.getalllocation();
    }
}
