package com.cypcode.cacheable_microservice.controller;

import com.cypcode.cacheable_microservice.dto.FruitDto;
import com.cypcode.cacheable_microservice.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class DataController {

    @Autowired
    private DataService dataService;

    @CachePut("fruits")
    @GetMapping("fruit-list")
    public List<FruitDto> getFruitList() {
        return dataService.getFruitList();
    }

    @GetMapping("car-list")
    public List<String> getCar() {
        return dataService.getCarList();
    }
}
