package com.repository.repositoryImp;

import com.entity.Reading;
import com.entity.Vehicle;
import com.repository.ReadingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ReadingRepositoryImp implements ReadingRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Reading putReadingData(Reading readingData) {
        em.merge(readingData);
        return readingData;
    }

    @Override
    public List<Reading> getReadings() {
        TypedQuery<Reading> query = em.createNamedQuery("Reading.getReadings", Reading.class);
        return query.getResultList();
    }
}
