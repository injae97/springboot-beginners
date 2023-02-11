package com.boot.sailing.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.sailing.vo.Order_details;

@Mapper
public interface OrderDao {

	/* [SELECT] - 주문 내역 전체 조회(Vo 사용)  */
	 List<Order_details> doList();
}