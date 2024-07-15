package com.healthcare.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.healthcare.dto.PatientRecordDTO;
import com.healthcare.service.PatientRecordService;

@Service
public class PatientRecordServiceImpl implements PatientRecordService {

	@Override
	public PatientRecordDTO createPatientRecord(PatientRecordDTO patientRecordDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<PatientRecordDTO> getPatientRecordsByUser(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public PatientRecordDTO updatePatientRecord(Long recordId, PatientRecordDTO patientRecordDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean deletePatientRecord(Long recordId) {
		// write your logic here
		return null;
	}

	@Override
	public PatientRecordDTO getPatientRecordDetails(Long recordId) {
		// write your logic here
		return null;
	}

	@Override
	public List<PatientRecordDTO> getAllPatientRecords() {
		// write your logic here
		return null;
	}

	@Override
	public List<PatientRecordDTO> searchPatientRecords(String query) {
		// write your logic here
		return null;
	}

	@Override
	public List<PatientRecordDTO> getPatientRecordsByDoctor(Long doctorId) {
		// write your logic here
		return null;
	}

	@Override
	public PatientRecordDTO flagPatientRecordForReview(Long recordId) {
		// write your logic here
		return null;
	}
}
