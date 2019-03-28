package com.sesung.view;

import com.sesung.member.Member;

public class MemberView {	

	public void view(String message) {
		System.out.println(message);
	}

	//member 한 명의 정보 출력 메서드
	public void view(Member member) {
		System.out.println("Id : "+member.getId());
		System.out.println("Pw : "+member.getPw());
		System.out.println("Age : "+member.getAge());
		System.out.println("Email : "+member.getEmail());
		System.out.println("Phone : "+member.getPhone());
	}

	//member들의 정보 출력 메서드
	public void view(Member [] members) {
		for(int i=0; i<members.length; i++) {
			Member member = members[i];
			this.view(member);
			//			System.out.println("Id : "+members[i].getId());
			//			System.out.println("Pw : "+members[i].getPw());
			//			System.out.println("Age : "+members[i].getAge());
			//			System.out.println("Email : "+members[i].getEmail());
			//			System.out.println("Phone : "+members[i].getPhone());
		}
	}

}
