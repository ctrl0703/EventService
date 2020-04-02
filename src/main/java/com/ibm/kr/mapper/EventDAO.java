package com.ibm.kr.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.kr.model.Event;
import com.ibm.kr.model.EventCustomer;

@Repository
public class EventDAO  {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<Event> selectEventList() {
		return sqlSession.selectList("com.ibm.kr.event.selectEventList");
	}
	
	public Event selectEvent(String eventId) {
		return sqlSession.selectOne("com.ibm.kr.event.selectEvent", eventId);
	}
	
	public int selectEventCustomer(EventCustomer customer) {
		return sqlSession.selectOne("com.ibm.kr.event.selectEventCustomer", customer);
	}
	
	public int applyEvent(EventCustomer customer){
		return sqlSession.insert("com.ibm.kr.event.insertEventCustomer", customer);
	}
	
}
