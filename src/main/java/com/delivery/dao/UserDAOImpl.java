package com.delivery.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.delivery.dto.Join;


/* UserDAO interface에 선언 한 메소드(join, overlapCheck) implements */
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SqlSession sql;
	
	@Override
	public void join(Join join) {
		sql.insert("user.join" , join);	
	}
	
	@Override
	public int overlapCheck(String value, String valueType) {
		Map<String, String> map = new HashMap<>();
		map.put("value", value);
		map.put("valueType", valueType);
		
		return sql.selectOne("user.overlapCheck" ,map);
	}
}