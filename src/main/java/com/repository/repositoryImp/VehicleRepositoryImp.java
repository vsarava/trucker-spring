package com.repository.repositoryImp;

import com.entity.Vehicle;
import com.repository.VehicleRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class VehicleRepositoryImp implements VehicleRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public List<Vehicle> putVehicleData(List<Vehicle> vehicleData) {
        for (Vehicle vData:vehicleData) {
            em.merge(vData);
        }
        return vehicleData;
    }

    @Override
    public List<Vehicle> getVehicles() {
        TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.getVehicles", Vehicle.class);
        return query.getResultList();
    }

    @Override
    public Vehicle getVehicleByVin(String vin) {
        TypedQuery<Vehicle> query = em.createNamedQuery("Vehicle.getVehicleByVin", Vehicle.class);
        query.setParameter("paramVin",vin);
        return query.getResultList().get(0);
    }
}
