package com.service;

import com.entity.Reading;

import java.util.List;

public interface ReadingService {

    Reading putReadingData(Reading readingData);
    List<Reading> getReadings();
    List<Reading> getReadingsByVin(String vin);

}
