package com.example.MysqlDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MysqlDemo.Entity.SqlUser;

public interface MysqlRepo extends JpaRepository<SqlUser, Integer> {

}
