package com.hw.web.move;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.springframework.stereotype.Repository;


import com.hw.web.util.Manage;
@Repository
public class MoveDaoImpl implements MoveDao {

	@Override
	public void insert(Move move) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(Manage.ADMIN_PATH.toString()+Manage.LIST+"adminList"+Manage.CSV),true));
		writer.write(move.toString());
		writer.newLine();
		writer.flush();
		}catch(Exception e) {
			System.out.println(Manage.FILE_INSERT_ERROR);
		}
		
	}

	@Override
	public List<Move> selectAll() {
		Move move =null;
		try {
			
		}catch(Exception e) {
			
		}
		return null;
	}
	

	@Override
	public Move selectOne(String userid) {
		Move move =null;
		try {
			
		}catch(Exception e) {
			
		}
		return null;
	}

	@Override
	public void update(Move move) {
	try {
			
		}catch(Exception e) {
			
		}
		
	}

	@Override
	public void delete(Move move) {
	try {
			
		}catch(Exception e) {
			
		}
		
	}

}
