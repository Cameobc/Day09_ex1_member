package com.sesung.main;

import com.sesung.member.Member;
import com.sesung.member.MemberController;
import com.sesung.member.MemberInput;
import com.sesung.view.MemberView;

public class MemberMain {
	public static void main(String[] args) {

		//		String d1 = "test";
		//		String d2 = "test";
		//		System.out.println(d1.equalsIgnoreCase(d2));
		
		MemberController mc = new MemberController();
		mc.start();

		//프로그램을 시작 or 테스트하는 목적
//		MemberInput mi = new MemberInput();
//		MemberView mv = new MemberView();
//		MemberController mc = new MemberController();
//		//		Member m =mi.memberJoin();
//
//		Member [] members = new Member[100];
//		for(int i=0;i<members.length;i++) {
//			Member member = new Member();
//			member.setId("id"+i);
//			member.setPw("pw"+i);
//			members[i]=member;
//		}
//		Member m=mi.memberLogin(members);
//		System.out.println(m);
		

	}

}
