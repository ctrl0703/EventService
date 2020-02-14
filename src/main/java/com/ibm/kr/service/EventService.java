package com.ibm.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.kr.model.Event;
import com.ibm.kr.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;

	public List<Event> getEventList() {
		return eventRepository.findAll();
	}
}
