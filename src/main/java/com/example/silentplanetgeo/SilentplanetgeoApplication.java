package com.example.silentplanetgeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SilentplanetgeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SilentplanetgeoApplication.class, args);
	}
	@GetMapping("/geojson")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("%s", name);
	}

}
