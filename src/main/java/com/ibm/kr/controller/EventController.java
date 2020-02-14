package com.ibm.kr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.kr.model.Event;
import com.ibm.kr.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/event")
	List<Event> getEventList() {
		return eventService.getEventList();
	}

}