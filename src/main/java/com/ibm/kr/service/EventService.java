package com.ibm.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ibm.kr.mapper.EventDAO;
import com.ibm.kr.model.Event;
import com.ibm.kr.model.EventCustomer;

@Service
@ComponentScan("com.ibm.kr.mapper")
public class EventService {
	
	@Autowired
	private EventDAO eventDao;

	public List<Event> getEventList() {
		return eventDao.selectEventList();
	}
	
	public Event getEvent(String eventId) {
		return eventDao.selectEvent(eventId);
	}

	public ResponseEntity<EventCustomer> applyEvent(EventCustomer customer) {
		
		ResponseEntity<EventCustomer> responseEntity = null;
		
		if(isDuplicate(customer)) {
			responseEntity = new ResponseEntity<>(customer, HttpStatus.CONFLICT);
		} else {
			responseEntity = new ResponseEntity<>(customer, HttpStatus.OK);
			eventDao.applyEvent(customer);
		}
		
		return responseEntity;
	}

	private boolean isDuplicate(EventCustomer customer) {
		
		boolean isCheck;
		int duplicateCnt;
		
		duplicateCnt = eventDao.selectEventCustomer(customer);
		
		if(duplicateCnt == 0) {  
			isCheck = false;
		}else {
			isCheck = true; // 중복 
		}

		return isCheck;
	}
}
