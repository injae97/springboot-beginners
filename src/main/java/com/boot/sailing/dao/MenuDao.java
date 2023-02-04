package com.boot.sailing.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MenuDao {

	List<Map<String, Object>> doList();
	
	/* [INSERT] - 메뉴 등록 */
	int doInsert(@Param("strCoffee") String coffee, @Param("strKind")  String kind, @Param("strPrice")  String price);

	/* [DELETE] - 메뉴 삭제 */
	int doDelete(String strNo);
}