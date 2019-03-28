package com.sesung.member;

import java.util.Scanner;

public class MemberInput {
	private Scanner sc;

	public MemberInput() {
		sc = new Scanner(System.in);
	}
	//memberLogin
	//매개변수로 Member [] 을 받아서 로그인 성공시 member 리턴 , 실패시 null 리턴
	public Member memberLogin(Member [] members) {
		Member member = null;
		
		System.out.println("아이디 입력");
		String id = sc.next();
		System.out.println("비밀번호 입력");
		String pw = sc.next();
		for(int i =0; i<members.length; i++) {
			if(id.equals(members[i].getId())&& pw.equals(members[i].getPw())) {
				member = members[i];
				break;
			}
		}
		return member;
//		boolean check = true;
//		for(int i =0; i<members.length; i++) {
//			Member member = members[i];
//			System.out.println("아이디 입력");
//			String id = sc.next();
//			System.out.println("비밀번호 입력");
//			String pw = sc.next();
//			if(id.equals(member.getId()) && pw.equals(member.getPw())) {
//				return member;
//			}
//		}
//		return null;
	}

		//메서드명 memberJoin id pw age email phone 입력받아 member를 리턴
		public Member memberJoin() {
			Member member = new Member();

			System.out.println("아이디 입력");
			member.setId(sc.next());
			System.out.println("비밀번호 입력");
			member.setPw(sc.next());
			System.out.println("나이 입력");
			member.setAge(sc.nextInt());
			System.out.println("이메일 입력");
			member.setEmail(sc.next());
			System.out.println("전화번호 입력");
			member.setPhone(sc.next());

			return member;
		}
	}
