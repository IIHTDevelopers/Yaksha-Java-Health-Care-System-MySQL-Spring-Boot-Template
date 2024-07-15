package com.healthcare.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.entity.PatientRecord;

@Repository
public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {

	// write logic for finding all patient records by flagged records by user

	// write logic for finding all patient records by diagnosis
}
