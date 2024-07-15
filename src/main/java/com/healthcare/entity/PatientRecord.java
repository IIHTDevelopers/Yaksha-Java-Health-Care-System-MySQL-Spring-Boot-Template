package com.healthcare.entity;

import java.time.LocalDate;

public class PatientRecord {

	private Long id;

	private User user;

	private Doctor doctor;

	private LocalDate date;

	private String diagnosis;

	private String treatment;

	private boolean flaggedForReview;

	public PatientRecord() {
		super();
	}

	public PatientRecord(Long id, User user, Doctor doctor, LocalDate date, String diagnosis, String treatment,
			boolean flaggedForReview) {
		super();
		this.id = id;
		this.user = user;
		this.doctor = doctor;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
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
