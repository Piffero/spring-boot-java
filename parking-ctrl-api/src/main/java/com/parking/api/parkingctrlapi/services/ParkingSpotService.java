package com.parking.api.parkingctrlapi.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import com.parking.api.parkingctrlapi.models.ParkingSpotModel;
import com.parking.api.parkingctrlapi.repositories.ParkingSpotReposity;

import jakarta.transaction.Transactional;

@Service
public class ParkingSpotService {
    
    final ParkingSpotReposity parkingSpotReposity;

    public ParkingSpotService(ParkingSpotReposity parkingSpotReposity) {
        this.parkingSpotReposity = parkingSpotReposity;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotReposity.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotReposity.existsByLicensePlateCar(licensePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotReposity.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotReposity.existsByApartmentAndBlock(apartment, block);
    }
    
    public Page<ParkingSpotModel> findAll(Pageable pageable) {
        return parkingSpotReposity.findAll(pageable);
    }

    public Optional<ParkingSpotModel> findById(UUID id) {
        return parkingSpotReposity.findById(id);
    }

    @Transactional
    public void delete(ParkingSpotModel parkingSpotModel) {
        parkingSpotReposity.delete(parkingSpotModel);
    }
    
}
