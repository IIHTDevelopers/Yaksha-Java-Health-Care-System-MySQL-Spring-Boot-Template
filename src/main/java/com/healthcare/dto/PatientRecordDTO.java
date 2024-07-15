package com.healthcare.dto;

import java.time.LocalDate;

public class PatientRecordDTO {

	private Long id;

	private Long userId;

	private Long doctorId;

	private LocalDate date;

	private String diagnosis;

	private String treatment;

	private boolean flaggedForReview;

	public PatientRecordDTO() {
		super();
	}

	public PatientRecordDTO(Long id, Long userId, Long doctorId, LocalDate date, String diagnosis, String treatment,
			boolean flaggedForReview) {
		super();
		this.id = id;
		this.userId = userId;
		this.doctorId = doctorId;
		this.date = date;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.flaggedForReview = flaggedForReview;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public boolean isFlaggedForReview() {
		return flaggedForReview;
	}

	public void setFlaggedForReview(boolean flaggedForReview) {
		this.flaggedForReview = flaggedForReview;
	}
}
