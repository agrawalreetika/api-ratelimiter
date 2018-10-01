package com.service.dbservice.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="apilist")
@NoArgsConstructor
@AllArgsConstructor
public class UrlsList implements java.io.Serializable{
	
	@Id
	@Getter
	@Setter
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
    private String id;

	@Getter
	@Setter
	@Column(name = "api")
	private String api;
	
	@Getter
	@Setter
	@Column(name = "hitlimit")
	private int hitlimit;
	
	@Getter
	@Setter
	@Column(name = "hittime")
	private int hittime;
}
