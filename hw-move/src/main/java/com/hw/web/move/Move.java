package com.hw.web.move;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class Move{
	private String userid,passwd,name,ssn, addr,age;
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s", userid,passwd,name,ssn, addr);
	}
	}