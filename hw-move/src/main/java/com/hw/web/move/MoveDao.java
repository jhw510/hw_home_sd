package com.hw.web.move;

import java.util.List;

public interface MoveDao {

	public void insert(Move move);

	public List<Move> selectAll();

	public Move selectOne(String userid);

	public void update(Move move);

	public void delete(Move move);

}
