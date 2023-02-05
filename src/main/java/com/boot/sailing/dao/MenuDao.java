package com.boot.sailing.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MenuDao {

	/* [SELECT] - 메뉴 전체 조회  */
	List<Map<String, Object>> doList();
	
	/* [INSERT] - 메뉴 등록 */
	int doInsert(@Param("strCoffee") String coffee, @Param("strKind")  String kind, @Param("strPrice")  String price);

	/* [DELETE] - 메뉴 삭제 */
	int doDelete(String strNo);

	/* [SELECT] - 수정 클릭 시 해당 데이터 값 호출(doListOne), UPDATE를 위한 용도 */
	Map<String, Object> doListOne(String strNo);

	/* [UPDATE] - 메뉴 수정 */
	int doUpdate(@Param("strNo") String no, @Param("strCoffee") String coffee, @Param("strKind") String kind, @Param("strPrice") String price);

	/* [SELECT] - 검색 기능(Search) */
	List<Map<String, Object>> doSearch(@Param("strStartDate") String start_date, @Param("strEndDate") String end_date, @Param("strCoffee") String coffee, @Param("strKind") String kind);

	/* [UPDATE] - 다중 가격 데이터 수정 */
	int doUpdatePrice(@Param("strNo") String no, @Param("strPrice") String price);
	
	/* [INSERT] - 수정한 가격 데이터 등록 */
	int doInsertLog(@Param("strNo") String no, @Param("strPrice") String price);
}