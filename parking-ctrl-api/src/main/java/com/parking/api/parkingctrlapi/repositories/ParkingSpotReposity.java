package com.parking.api.parkingctrlapi.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.parking.api.parkingctrlapi.models.ParkingSpotModel;

public interface ParkingSpotReposity extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
