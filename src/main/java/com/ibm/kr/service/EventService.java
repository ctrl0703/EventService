package com.ibm.kr.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ibm.kr.model.Event;
import com.ibm.kr.model.EventCustomer;
import com.ibm.kr.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;

	public List<Event> getEventList() {
		return eventRepository.findAll();
	}

	public ResponseEntity applyEvent(EventCustomer eventCustomer) {
		if(isDuplicate(eventCustomer)) {
			//중복이면 결과는 중복 메시지 반환
		} else {
			// 데이터 적재
		}
		return null;
	}

	private boolean isDuplicate(EventCustomer eventCustomer) {
		// TODO Auto-generated method stub
		return false;
	}
}
