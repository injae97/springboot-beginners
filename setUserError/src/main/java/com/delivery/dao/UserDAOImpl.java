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
		/* UserMapper.xml에 있는 namespace="user" + id 값(join)으로 호출 즉, user.join */
		sql.insert("user.join" , join);	
	}
	
	@Override
	public int overlapCheck(String value, String valueType) {
		Map<String, String> map = new HashMap<>();
		map.put("value", value);
		map.put("valueType", valueType);
		
		/* UserMapper.xml에 있는 namespace="user" + id 값("overlapCheck")으로 호출 즉, user.overlapCheck */
		return sql.selectOne("user.overlapCheck" ,map); // user.overlapCheck에 대한 select문을 실행하면서 map(쿼리문에서 사용할 인자)를 전달
	}
}