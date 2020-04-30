package com.hw.web.move;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoveServiceImpl implements MoveService {
@Autowired MoveDao moveDao;

	
	@Override
	public void register(Move move) {
	move.setSsn("90000-1");
	move.setAddr("옥련동");
	moveDao.insert(move);
	}


	@Override
	public List<Move> list() {
	
		return moveDao.selectAll();
	}

	@Override
	public Move findOne(String userid) {
		
		return moveDao.selectOne(userid);
	}

	@Override
	public void modify(Move move) {
		moveDao.update(move);
	}

	@Override
	public void delete(Move move) {
		moveDao.delete(move);
	}

}
