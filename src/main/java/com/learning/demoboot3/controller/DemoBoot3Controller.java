package com.learning.demoboot3.controller;

import com.learning.demoboot3.model.Location;
import com.learning.demoboot3.service.DemoBoot3Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;

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

}
