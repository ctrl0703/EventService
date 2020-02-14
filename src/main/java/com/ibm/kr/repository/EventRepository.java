package com.ibm.kr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.kr.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {
	public List<Event> findAll();
}
