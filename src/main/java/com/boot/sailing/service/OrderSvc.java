package com.boot.sailing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.sailing.dao.OrderDao;
import com.boot.sailing.vo.Order_details;

import lombok.extern.log4j.Log4j2;

@Service 
@Log4j2
public class OrderSvc {
	
	@Autowired
	OrderDao orderDao;
	
	public OrderSvc() {
		log.info("================ OrderSvc 서비스 접근 ===================");
	}

	
	/* [SELECT] - 주문 내역 전체 조회(Vo 사용)  */
	public List<Order_details> doList() {
		List<Order_details> list = orderDao.doList();
		
		log.info(list);
		return list;
	}
}