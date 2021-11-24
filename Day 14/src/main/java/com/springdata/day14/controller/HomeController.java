package com.springdata.day14.controller;

import com.springdata.day14.model.*;
import com.springdata.day14.service.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@Autowired
	private TalkService talkService;

	@GetMapping("/talks")
	public List<Talk> getTalkList() {
		return talkService.getTalks();
	}

	@GetMapping("/talks/{id}")
	public ResponseEntity<Talk> getTalk(@PathVariable int id) {
		try {
			Talk talk = talkService.getTalk(id);
			return new ResponseEntity<Talk>(talk, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Talk>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/talks")
	public void addTalk(@RequestBody Talk talk) {
		talkService.insertTalk(talk);
	}

	@PutMapping("/talks/{id}")
	public ResponseEntity<?> update(@RequestBody Talk talk, @PathVariable Integer id) {
		try {
			talkService.updateTalk(talk, id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/talks/{id}")
	public void delete(@PathVariable Integer id) {
		talkService.deleteTalk(id);
	}
}