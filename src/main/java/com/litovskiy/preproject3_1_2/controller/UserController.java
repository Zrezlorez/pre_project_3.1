package com.litovskiy.preproject3_1_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.litovskiy.preproject3_1_2.model.User;
import com.litovskiy.preproject3_1_2.service.UserService;

@Controller
public class UserController {
	private final UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping(value = "/")
	public String printAll(ModelMap model) {
		model.addAttribute("users", userService.getAllUsers());
		return "index";
	}
	@GetMapping(value = "/edit")
	public String getEditPage(@RequestParam long id, ModelMap model) {
		model.addAttribute("currentUser", userService.getById(id));
		return "edit";
	}

	@PostMapping(value = "/delete")
	public String delete(@RequestParam long id) {
		userService.delete(id);
		return "redirect:/";
	}

	@PostMapping(value = "/edit")
	public String edit(@ModelAttribute("user") User user) {
		userService.update(user);
		return "redirect:/";
	}

	@PostMapping(value = "/add")
	public String add(@ModelAttribute("user") User user) {
		userService.add(user);
		return "redirect:/";
	}


}