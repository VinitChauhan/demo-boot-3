package com.learning.demoboot3.service;

import com.learning.demoboot3.model.Location;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

@Service
public interface DemoBoot3Service {
    @GetExchange("/demo")
    List<Location> getAllLocations();

    @PostExchange("/demo/add")
    List<Location> addLocation(@RequestBody Location location);
}
