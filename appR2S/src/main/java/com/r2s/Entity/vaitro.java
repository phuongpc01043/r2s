package com.r2s.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name ="vaitro")
@Data
public class vaitro {

	@Id
	String id;
	String vaitro;
	
}
