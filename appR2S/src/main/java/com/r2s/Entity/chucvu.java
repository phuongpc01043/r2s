package com.r2s.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name ="chucvu")
@Data
public class chucvu {

	@Id
	String id;
	String tencty;
	
}
