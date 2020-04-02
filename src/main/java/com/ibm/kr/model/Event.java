package com.ibm.kr.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Event {
	String eventId;
	String eventNm;
	Date startDate;
	Date endDate;
	String imageUrl;
	Date insertDate;
}
