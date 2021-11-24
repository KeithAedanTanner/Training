package com.springdata.day14.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springdata.day14.model.*;

@Repository
public interface TalkRepo extends JpaRepository<Talk, Integer> {
}