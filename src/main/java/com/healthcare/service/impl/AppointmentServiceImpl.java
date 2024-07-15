package com.healthcare.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.healthcare.dto.AppointmentDTO;
import com.healthcare.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Override
	public AppointmentDTO createAppointment(AppointmentDTO appointmentDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<AppointmentDTO> getUserAppointments(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public AppointmentDTO updateAppointment(Long appointmentId, AppointmentDTO appointmentDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean cancelAppointment(Long appointmentId) {
		// write your logic here
		return null;
	}

	@Override
	public AppointmentDTO getAppointmentDetails(Long appointmentId) {
		// write your logic here
		return null;
	}

	@Override
	public AppointmentDTO rescheduleAppointment(Long appointmentId, AppointmentDTO appointmentDTO) {
		// write your logic here
		return null;
	}

	@Override
	public String checkAppointmentStatus(Long appointmentId) {
		// write your logic here
		return null;
	}

	@Override
	public List<AppointmentDTO> getAppointmentsByDate(LocalDate date) {
		// write your logic here
		return null;
	}

	@Override
	public List<AppointmentDTO> getAppointmentsByDoctor(Long doctorId) {
		// write your logic here
		return null;
	}

	@Override
	public AppointmentDTO markAppointmentAsCompleted(Long appointmentId) {
		// write your logic here
		return null;
	}

	@Override
	public List<AppointmentDTO> getAppointmentHistoryForUser(Long userId) {
		// write your logic here
		return null;
	}
}
