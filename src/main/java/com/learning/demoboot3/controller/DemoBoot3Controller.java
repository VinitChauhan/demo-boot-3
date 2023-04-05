package com.learning.demoboot3.controller;

import com.learning.demoboot3.model.Location;
import com.learning.demoboot3.service.DemoBoot3Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/demo3")
public class DemoBoot3Controller {

    private DemoBoot3Service demoBoot3Service;

    public DemoBoot3Controller(HttpServiceProxyFactory httpServiceProxyFactory) {
        demoBoot3Service = httpServiceProxyFactory.createClient(DemoBoot3Service.class);
    }
    @GetMapping
    public List<Location> getAllLocations() {
        return demoBoot3Service.getAllLocations();
    }

    @PostMapping("/add")
    public List<Location> addLocation(@RequestBody Location location) {
        return demoBoot3Service.addLocation(location);
    }
    @PutMapping("/update")
    public List<Location> updateLocation(@RequestBody Location location) {
        return demoBoot3Service.updateLocation(location);
    }
    @DeleteMapping("/delete/{id}")
    public List<Location> updateLocation(@PathVariable("id") Integer id) {
        return demoBoot3Service.deleteLocation(id);
    }

}
