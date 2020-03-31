package com.ibm.kr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.kr.model.Event;
import com.ibm.kr.model.EventCustomer;
import com.ibm.kr.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	// 이벤트 목록
	@GetMapping("/event")
	public List<Event> getEventList() {
		return eventService.getEventList();
	}
	
	// 이벤트 상세정보
	@GetMapping("/event/{eventId}")
	public Event getEvent(@PathVariable String eventId) {
		return null;
	}
	
	// 이벤트 참여 요청
	@PostMapping("/event/{eventId}")
	public ResponseEntity applyEvent(@PathVariable String eventId, @RequestBody EventCustomer eventCustomer) {
		ResponseEntity responseEntity = eventService.applyEvent(eventCustomer);
		return null;
	}
	
}