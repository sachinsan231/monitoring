package com.example.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.monitoring.service.ItemService;

import io.micrometer.core.annotation.Timed;

@RestController
@Timed
public class ItemController {

	ItemService itemService;

	public ItemController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}
	
	@GetMapping("/")
	@Timed("api")
	public String index() {
		return "greeting";
	}
	
	@PostMapping("/books")
	@Timed("books-api")
	public String orderBook() {
		return itemService.orderBook();
	}
	
	@PostMapping("/movies")
	@Timed("movies.api")
	public String orderMovie() {
		return itemService.orderMovie();
	}
	
}
