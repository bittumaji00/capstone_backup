package com.wipro.GreatLearning.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="admin_table")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String email;
	private String password;

}
