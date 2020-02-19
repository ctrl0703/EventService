CREATE TABLE EVENT (
SEQ NUMBER NOT NULL
,EVT_NM VARCHAR2(20) NOT NULL
,ST_DT VARCHAR2(14) 
,ED_DT VARCHAR2(14) 
,COMMENTS VARCHAR2(100) 
,REGID VARCHAR2(20) 
,REGDATE DATE 
,MODID VARCHAR2(20) 
,MODDATE DATE  
,SAMPLE_REF_SEQ NUMBER  
);

INSERT INTO EVENT
(SEQ, EVT_NM, ST_DT, ED_DT, COMMENTS, REGID, REGDATE, MODID, MODDATE, SAMPLE_REF_SEQ)
VALUES
(1, '202002_PROBIO_SAMPLE', '20200201', '20200229', '202002_그린티 프로바이오틱스 샘플링 이벤트', 'AC921937', SYSDATE, 'AC921937',SYSDATE,1);