package com.ozads.fut.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ozads.fut.Entity.Court;

@Repository
public interface CourtRepository extends JpaRepository<Court,Long> {

}
