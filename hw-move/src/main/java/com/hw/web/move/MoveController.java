package com.hw.web.move;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hw.web.util.Manage;

@RestController
@RequestMapping("/moves")

public class MoveController {

	@Autowired MoveService moveService;
	
	@PostMapping("")
	public Manage post(@RequestBody Move move) {
		moveService.register(move);
		return Manage.SUCCESS;
	}
	@GetMapping("")
	public List<Move> list(){
		return moveService.list();
	}
	@GetMapping("/{userid}")
	public Move detail(@PathVariable String userid) {
		return moveService.findOne(userid);
	}
	@PutMapping("/{userid}")
	public Manage put (@RequestBody Move move) {
		moveService.modify(move);
		return Manage.SUCCESS;
	}
	@DeleteMapping("/{userid}")
	public Manage delete(@RequestBody Move move) {
		moveService.delete(move);
		return Manage.SUCCESS;
	}
	}

