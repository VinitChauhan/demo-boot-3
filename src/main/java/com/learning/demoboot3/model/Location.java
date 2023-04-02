package com.learning.demoboot3.model;

import lombok.Data;

@Data
public class Location {
    private Integer id;
    private String street;
    private String city;
    private String state;
    private String pin;
}
