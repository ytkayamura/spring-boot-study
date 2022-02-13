package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
@RestController
public class DemoApplication {

  @Autowired
  private SampleService service;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @GetMapping("/")
  public String hello(@RequestParam(value = "name", defaultValue = "Wooooorld") String name, Model model) {
    //model.addAttribute("name", name);
    //return "greeting";
    return service.findAll().toString();
  }

}
