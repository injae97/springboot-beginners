package com.delivery.service;

import com.delivery.dto.Join;

/* 상속받기 위해 interface로 선언 */
public interface UserService {
	void join(Join join);
	int overlapCheck(String value, String valueType);
}