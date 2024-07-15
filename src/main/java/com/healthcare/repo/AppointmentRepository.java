package com.healthcare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	// write logic for finding all appointments by doctor and date in range

	// write logic for finding all appointments by date range

	// write logic for finding all appointments by user id
}
