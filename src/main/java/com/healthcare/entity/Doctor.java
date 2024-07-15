package com.healthcare.entity;

import java.util.Set;

public class Doctor {

	private Long id;

	private String name;

	private String specialty;

	private Set<Appointment> appointments;

	public Doctor() {
		super();
	}

	public Doctor(Long id, String name, String specialty, Set<Appointment> appointments) {
		super();
		this.id = id;
		this.name = name;
		this.specialty = specialty;
		this.appointments = appointments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Set<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
}
