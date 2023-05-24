package com.example.MysqlDemo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MysqlDemo.Entity.SqlUser;
import com.example.MysqlDemo.repo.MysqlRepo;

@Service
public class MysqlService {

	Logger logger = LoggerFactory.getLogger(MysqlService.class);
	@Autowired
	private MysqlRepo mysqlRepo;
	public List<SqlUser> getAll(){
		logger.info("Inside findall");
		return mysqlRepo.findAll();
	}
	
	public SqlUser addUser(SqlUser sqlUser) {
		logger.info("Inside add");
		return mysqlRepo.save(sqlUser);
	}
}
