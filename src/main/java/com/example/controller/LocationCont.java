package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationSer;

@RestController
@RequestMapping("/location")   // good practice
public class LocationCont {

    @Autowired
    private LocationSer locationSer;

    @PostMapping("/add")
    public Location add(@RequestBody Location le) {
        return locationSer.createlocation(le);
    }

    @GetMapping("/all")
    public List<Location> show() {
        return locationSer.getalllocation();
    }
}
