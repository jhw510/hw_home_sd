package com.hw.web.move;

import java.util.List;

public interface MoveService {

	public void register(Move move);

	public List<Move> list();

	public Move findOne(String userid);

	public void modify(Move move);

	public void delete(Move move);

}
