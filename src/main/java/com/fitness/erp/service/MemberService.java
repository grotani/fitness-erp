package com.fitness.erp.service;

import com.fitness.erp.domain.Member;
import com.fitness.erp.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //final 필드를 자동으로 생성자 주입
public class MemberService {
	
	// DB 접근 담당 Mapper 주입
	private final MemberMapper memberMapper;
	
	public List<Member> getMembers() {
		return memberMapper.selectMembers();
	}

}
