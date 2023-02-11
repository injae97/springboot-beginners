package com.boot.sailing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.sailing.service.OrderSvc;
import com.boot.sailing.vo.Order_details;

@Controller
public class OrderCon {
	
	@Autowired
	OrderSvc orderSvc;
	
	/*
	 * [SELECT] - 메뉴 전체 조회 	
	 * 해당 검색 결과만 받기 위하여 List<Order_details> - Vo 사용
	 */
    @GetMapping("/order")
    public String doOrder(Model model) {

        List<Order_details> list = orderSvc.doList();
        model.addAttribute("list", list);
		model.addAttribute("hello", "========== OrderCon - VO 사용 ==========");
        return "/order/order"; 
    }  
}