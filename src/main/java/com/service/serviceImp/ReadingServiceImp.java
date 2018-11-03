package com.service.serviceImp;

import com.entity.Reading;
import com.repository.ReadingRepository;
import com.service.ReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadingServiceImp implements ReadingService {

    @Autowired
    private ReadingRepository readingRepository;

    @Override
    public Reading putReadingData(Reading readingData) {
        return readingRepository.putReadingData(readingData);
    }

    @Override
    public List<Reading> getReadings() {
        return readingRepository.getReadings();
    }
}
