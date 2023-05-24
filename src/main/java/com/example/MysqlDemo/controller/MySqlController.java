package com.example.MysqlDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MysqlDemo.Entity.SqlUser;
import com.example.MysqlDemo.service.MysqlService;

@RestController
@RequestMapping("/docker")
public class MySqlController {

	@Autowired
	private MysqlService mysqlService;
	@GetMapping("/get")
	public List<SqlUser> getAll(){
		return mysqlService.getAll();
	}
	@PostMapping("/add")
	public SqlUser addUser(@RequestBody SqlUser sqlUser) {
		return mysqlService.addUser(sqlUser);
	}
	
}
