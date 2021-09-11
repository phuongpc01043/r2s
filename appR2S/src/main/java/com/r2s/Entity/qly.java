package com.r2s.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name ="qly")
@Data
public class qly {
	
	
	@Id
	Integer id;
	@ManyToOne
	@JoinColumn(name ="taikhoan_id")
	taikhoan taikhoan;
	@ManyToOne
	@JoinColumn(name="chucvu_id")
	chucvu chucvu;
	@ManyToOne
	@JoinColumn(name="cty_id")
	cty cty;

}
