package com.example.MysqlDemo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SqlUser {

	@Id
	private Integer id;
	private String name;
	private String city;
}
