package com.r2s.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name ="taikhoan")
@Data
public class taikhoan {
	
	@Id
	String tendn;
	String matkhau;
	String hoten;
	String email;
	@ManyToOne
	@JoinColumn( name =" vaitro_id")
	vaitro vaitro;

}
