package com.r2s.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name ="cty")
@Data
public class cty {

	@Id
	String id;
	String tencty;
}
