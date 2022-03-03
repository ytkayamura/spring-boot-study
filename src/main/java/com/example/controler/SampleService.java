package com.example.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  // データの一覧を返す
  public List<Person> findAll() {
    // 実行する SQL を組み立てて実行
    String query = "SELECT * from person";
    List<Person> persons = jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Person.class));
    return persons;
  }

}
