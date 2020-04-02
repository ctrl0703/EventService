package com.ibm.kr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.kr.controller.EventController;
import com.ibm.kr.mapper.EventDAO;
import com.ibm.kr.model.Event;
import com.ibm.kr.model.EventCustomer;
import com.ibm.kr.service.EventService;


@SpringBootTest
class EventServiceApplicationTests {
	
	@Autowired
	EventController eventController;
	
	@Autowired
	EventService eventService;
	
	@Autowired
	EventDAO eventDao;
	
	/**
	 * 요청 : GET /v1/event/{#evtId}
	 * 응답 : Event
	 * 테스트 메소드 명 : getEvent({#evtId}), getEventList()
	 * 테스트 메소드 기능 : 이벤트 조회
	 * 테스트 시나리오 : 1. 지금 시행중인 이벤트 리스트 조회
	 * 			   2. evt00001 이벤트 정보 조회
	 */
	@Test
	void 이벤트_조회() {
		List<Event> events = eventDao.selectEventList();
		
		for(Event event : events) {
			System.out.println(event.toString());
		}
		
		assertEquals(3,  eventController.getEventList().size());
		assertEquals("이벤트1", eventController.getEvent("evt00001").getEventNm());
	}
	
	/**
	 * 요청 : eventService.isDuplicate
	 * 응답 : boolean
	 * 테스트 메소드 명 : isDuplicate()
	 * 테스트 메소드 기능 : 이벤트 등록 중복 조회
	 * 테스트 시나리오 : 1. 중복 조회 (테스트시 private 함수 > public으로 변경 필요)
	 */
	@Test
	void 이벤트_중복체크() {
		
		EventCustomer existCustomer = new EventCustomer();
		
		existCustomer.setEventId("evt00001");
		existCustomer.setName("김민경");
		existCustomer.setMobileNumber("01049958630");
		existCustomer.setApplyDate(Date.valueOf("2020-04-02"));
		
		//assertTrue(eventService.isDuplicate(existCustomer));
		
		EventCustomer nonExistCustomer = new EventCustomer();
		existCustomer.setEventId("evt00001");
		existCustomer.setName("박주영");
		existCustomer.setMobileNumber("01056761746");
		
		//assertFalse(eventService.isDuplicate(nonExistCustomer));
		
	}
}
