package com.ozads.fut.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozads.fut.Entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>{

}
