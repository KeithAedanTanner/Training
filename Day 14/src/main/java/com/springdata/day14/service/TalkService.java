package com.springdata.day14.service;

import com.springdata.day14.model.*;
import com.springdata.day14.repo.*;
import java.util.*;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TalkService {
	@Autowired
	TalkRepo talkRepo;

	public List<Talk> getTalks() {
		return talkRepo.findAll();
	}
	
	public Talk getTalk(int id) {
		return talkRepo.findById(id).get();
	}
	
	public void insertTalk(Talk talk) {
		talkRepo.save(talk);
	}
	
	public void updateTalk(Talk talk, int id) {
		talk.setId(id);
		talkRepo.save(talk);
	}

	public void deleteTalk(int id) {
		talkRepo.deleteById(id);
	}
}