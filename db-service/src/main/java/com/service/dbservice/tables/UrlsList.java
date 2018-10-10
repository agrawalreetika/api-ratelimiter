package com.service.dbservice.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="apilist")
@NoArgsConstructor
@AllArgsConstructor

@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "UrlsList.findUrlRow",  
	        query = "from UrlsList e where e.api = :api"  
	        ),  
	    }

	)
public class UrlsList implements java.io.Serializable{

	@Getter
	@Setter
	@Column(name = "api")
	@Id
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
