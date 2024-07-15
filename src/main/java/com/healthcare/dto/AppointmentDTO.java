package com.healthcare.dto;

import java.time.LocalDateTime;

public class AppointmentDTO {

	private Long id;

	private Long userId;

	private Long doctorId;

	private LocalDateTime appointmentTime;

	private String status;

	public AppointmentDTO() {
		super();
	}

	public AppointmentDTO(Long id, Long userId, Long doctorId, LocalDateTime appointmentTime, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.doctorId = doctorId;
		this.appointmentTime = appointmentTime;
		this.status = status;
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
