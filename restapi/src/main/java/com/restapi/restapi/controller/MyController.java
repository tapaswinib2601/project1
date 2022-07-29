package com.restapi.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restapi.entities.Categories;
import com.restapi.restapi.services.CategoriesService;

@RestController
public class MyController {
	@Autowired
	private CategoriesService categoriesService;

	@GetMapping("/home")
	public String home() {

		return "this is home page";
	}

	@GetMapping("/Categories")
	public List<Categories> getCategories() {

		return this.categoriesService.getCategories();
	}

	@GetMapping("/Categories/{categoriesId}")
	public Categories getCategories(@PathVariable String categoriesId) {
		return this.categoriesService.getCategories(Long.parseLong(categoriesId));
	}

	@PostMapping(path = "/Categories", consumes = "aplication/json")
	public Categories addCategories(@RequestBody Categories categories) {
		return this.categoriesService.addCategories(categories);
	}

}
