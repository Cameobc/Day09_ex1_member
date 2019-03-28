package com.sesung.member;

import java.util.Scanner;

import com.sesung.view.MemberView;

public class MemberController {
	private Scanner sc;
	private Member [] members;
	private MemberInput mi;
	private MemberAdd ma;
	private MemberView mv;
	
	public MemberController() {
		sc = new Scanner(System.in);
		members = new Member[0];  //객체는 있지만 0칸임
		mi = new MemberInput();
		ma = new MemberAdd();
		mv = new MemberView();
//		System.out.println(members.length);
	}
	
	//start
	//1. 회원가입
	//2. 로그인
	//3. 회원정보전체출력
	//4. 프로그램종료
	public void start() {
		boolean check = true;
		while(check) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원정보전체출력");
			System.out.println("4.프로그램종료");
			int select = sc.nextInt();  //this.sc(this 생략
			
			switch(select) {
			case 1 :	
				Member m = mi.memberJoin();
				members = ma.add(members, m);
				break;
			case 2:
				Member member = mi.memberLogin(members);
				if(member!= null) {
					System.out.println(member.getId()+"님 환영합니다.");
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				mv.view(members);
				break;
				default:		
					check=!check;
			}//switch
		}//while
	}
}
