package com.fitness.erp.domain;

import lombok.Data;
/**
 * ========================================
 * 	Member 클래스 (도메인 객체 / VO / 모델)
 * ========================================
 *
 * ✔ 이 클래스는 '회원 한 명의 정보'를 담는 데이터 구조입니다.
 *   즉, DB의 member 테이블과 1:1로 매핑되는 자바 객체입니다.
 *
 * ✔ 왜 필요한가?
 *   - MyBatis가 DB에서 SELECT한 값을 이 객체에 담아오기 위해 필요
 *   - Controller → JSON 응답 시 자동 변환됨
 *   - Service 계층에서 회원 정보를 전달할 때 사용
 *
 * ✔ 어디서 사용되나?
 *   - MemberMapper.xml 에서 SELECT/INSERT/UPDATE 할 때
 *   - MemberService에서 로직 처리할 때
 *   - MemberController에서 반환값 또는 요청값으로 사용
 *
 * ✔ Lombok @Data
 *   - getter, setter, toString, equals 등 자동 생성
 *   - 반복코드 없이 깔끔하게 유지 가능
 *
 * ========================================
 */

@Data
public class Member {
    // 회원 고유 번호 (PK)
	private Long 	memberId;
	//	회원 이름
	private String 	name;
	//	성별(M/F)
	private String	gender;
	//	생년원일(yyyy-mm-dd)
	private String	birthDate;
	//	연락처
	private String	phone;
	//	상태(ACTIVE, INACTIVE)
	private String	status;
	//	생성일자
	private String	createdAt;
	//	수정일자
	private String 	updatedAt;
}
