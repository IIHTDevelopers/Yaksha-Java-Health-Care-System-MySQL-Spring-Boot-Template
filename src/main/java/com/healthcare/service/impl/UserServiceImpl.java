package com.healthcare.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.healthcare.dto.UserDTO;
import com.healthcare.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public UserDTO registerUser(UserDTO userDTO) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO updateUserProfile(Long userId, UserDTO userDTO) {
		// write your logic here
		return null;
	}

	@Override
	public UserDTO getUserDetails(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean deleteUser(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		// write your logic here
		return null;
	}

	@Override
	public List<UserDTO> searchUsers(String query) {
		// write your logic here
		return null;
	}
}
