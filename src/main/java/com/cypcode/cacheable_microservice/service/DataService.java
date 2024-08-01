package com.cypcode.cacheable_microservice.service;

import com.cypcode.cacheable_microservice.dto.FruitDto;
import com.cypcode.cacheable_microservice.dto.TasteDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class DataService {

    public List<FruitDto> getFruitList(){
      log.info("getFruitList from DataService");
        List<FruitDto> list = new ArrayList<>();
        list.add(FruitDto.builder()
                        .name("Apple")
                        .color("green")
                        .tasteDto(TasteDto.builder()
                                .type("Sweet")
                                .build())
                .build());
        list.add(FruitDto.builder()
                .name("Orange")
                .color("orange")
                .tasteDto(TasteDto.builder()
                        .type("Sour")
                        .build())
                .build());
        list.add(FruitDto.builder()
                .name("Banana")
                .color("yellow")
                .tasteDto(TasteDto.builder()
                        .type("Sweet")
                        .build())
                .build());
        list.add(FruitDto.builder()
                .name("Lemon")
                .color("green")
                .tasteDto(TasteDto.builder()
                        .type("Sour")
                        .build())
                .build());

        return list;
    }

    @Cacheable(value = "car")
    public List<String> getCarList(){
        log.info("getCar from DataService");
        List<String> list = new ArrayList<String>();
       list.add("Mercedes");
       list.add("Benz");
       list.add("Chevy");
       list.add("Lemon");
       list.add("Toyota");
        return list;
    }

}
