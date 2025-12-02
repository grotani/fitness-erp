package com.fitness.erp.mapper;

import	com.fitness.erp.domain.Member;
import	org.apache.ibatis.annotations.Mapper;
import	java.util.List;
	/**
	 * MemberMapper
	 * - member 테이블에 접근하는 Mapper(DAO) 역항 
	 * - SQL은 resources/mapper/MemberMapper.xml 에 작성됨
	 * - 인터페이스의 메서드 이름이 XML의 id와 연결됨
	 */
@Mapper
public interface MemberMapper {
	/* 전체 회원 조회 */
	List<Member> selectMembers();
	
}
