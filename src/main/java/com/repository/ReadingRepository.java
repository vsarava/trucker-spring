package com.repository;

import com.entity.Reading;

import java.util.List;

public interface ReadingRepository {

    Reading putReadingData(Reading readingData);
    List<Reading> getReadings();
    List<Reading> getReadingsByVin(String vin);
}
