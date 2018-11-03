package com.controller;

import com.entity.Reading;
import com.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("readings")
@CrossOrigin(maxAge = 3600)
public class ReadingController {

    @Autowired
    private ReadingService readingService;

    @RequestMapping(method = RequestMethod.POST)
    public Reading putReadingData(@RequestBody Reading readingData){
        return readingService.putReadingData(readingData);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Reading> getReadings(){
        return readingService.getReadings();
    }

}
