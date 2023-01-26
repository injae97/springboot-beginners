package com.delivery.dao;

import com.delivery.dto.Join;

public interface UserDAO {
	void join(Join join);
	int overlapCheck(String value, String valueType);
}