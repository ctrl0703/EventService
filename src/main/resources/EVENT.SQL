create table event
(
eventId varchar(4000),
eventNm varchar(4000),
startDate Date,
endDate Date,
imageUrl varchar(4000),
insertDate Date
);



insert into event values
('evt00001', '이벤트1', to_date('20200401', 'YYYYMMDD') ,  to_date('20200430', 'YYYYMMDD'), '', now());

insert into event values
('evt00002', '이벤트2', to_date('20200401', 'YYYYMMDD') ,  to_date('20200430', 'YYYYMMDD'), '', now());

insert into event values
('evt00003', '이벤트3', to_date('20200401', 'YYYYMMDD') ,  to_date('20200430', 'YYYYMMDD'), '', now());

insert into event values
('evt00004', '이벤트4', to_date('20200501', 'YYYYMMDD') ,  to_date('20200531', 'YYYYMMDD'), '', now());

insert into event values
('evt00005', '이벤트5', to_date('20200501', 'YYYYMMDD') ,  to_date('20200531', 'YYYYMMDD'), '', now());
