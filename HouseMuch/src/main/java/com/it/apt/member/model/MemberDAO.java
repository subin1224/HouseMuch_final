package com.it.apt.member.model;

public interface MemberDAO {
	String selectPwd(String id);
	MemberVO selectMember(String id);
	int selectAptNo(String id);
}
