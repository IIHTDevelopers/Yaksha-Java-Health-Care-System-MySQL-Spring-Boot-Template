package com.healthcare.entity;

import java.time.LocalDateTime;

public class Appointment {

	private Long id;

	private User user;

	private Doctor doctor;

	private LocalDateTime appointmentTime;

	private String status;

	public Appointment() {
		super();
	}

	public Appointment(Long id, User user, Doctor doctor, LocalDateTime appointmentTime, String status) {
		super();
		this.id = id;
		this.user = user;
		this.doctor = doctor;
		this.appointmentTime = appointmentTime;
		this.status = status;
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

	public LocalDateTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalDateTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
