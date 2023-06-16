package com.simplilearn.capstone2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.capstone2.entity.Role;
import com.simplilearn.capstone2.service.RoleService;

@RestController
public class RoleController {
	@Autowired
	private RoleService roleservice;

	@PostMapping({"/createNewRole"})
	public Role createNewRole(@RequestBody Role role) {
		return roleservice.createNewRole(role);
		
	}
}
