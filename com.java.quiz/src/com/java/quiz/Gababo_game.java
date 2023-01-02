package com.java.quiz;

import java.util.Scanner;

public class Gababo_game {
	public static void main(String[] args) {

		int user = 0;
		int com = (int) (Math.random() * 3 + 1); // 1,2,3
		char Word = ' ';

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("컴퓨터는 마음의 결정을 했습니다.");
			System.out.println("이번엔 당신의 차례....");
			System.out.println("1.가위 2.바위 3.보 ");
			System.out.printf("선택하시오.");
			user = sc.nextInt();

			switch (com) {
			case 1:
				switch (user) {
				case 1:
					System.out.println("컴퓨터 : 가위, 사용자: 가위 ");
					System.out.println("비겼습니다.");
					break;
				case 2:
					System.out.println("컴퓨터 : 가위, 사용자: 바위 ");
					System.out.println("사용자가 이겼습니다.");
					break;
				case 3:
					System.out.println("컴퓨터 : 가위, 사용자: 보 ");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				default:
					System.out.println("잘못된 숫자를 입력하였습니다.");
					continue;
				}
				break;

			case 2:
				switch (user) {
				case 1:
					System.out.println("컴퓨터 : 바위, 사용자: 가위 ");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 2:
					System.out.println("컴퓨터 : 바위, 사용자: 바위 ");
					System.out.println("비겼습니다.");
					break;

				case 3:
					System.out.println("컴퓨터 : 바위, 사용자: 보 ");
					System.out.println("사용자가 이겼습니다.");
					break;
				default:
					System.out.println("잘못된 숫자를 입력하였습니다.");
					continue;

				}
				break;

			case 3:
				switch (user) {
				case 1:
					System.out.println("컴퓨터 : 보, 사용자: 가위 ");
					System.out.println("사용자가 이겼습니다.");
					break;
				case 2:
					System.out.println("컴퓨터 : 보, 사용자: 바위 ");
					System.out.println("컴퓨터가 이겼습니다.");
					break;
				case 3:
					System.out.println("컴퓨터 : 보, 사용자: 보 ");
					System.out.println("비겼습니다.");
					break;
				default:
					System.out.println("잘못된 숫자를 입력하였습니다.");
					continue;
				}
				break;

			}

			System.out.println("게임을 계속 하시겠습니까? [y/n]");
			Word = sc.next().charAt(0);

			if (Word == 'y') {
				continue;
			} else if (Word == 'n') {
				System.out.println("게임을 종료합니다.");
				break;

			} else {
				System.out.println("잘못입력하셨습니다. 게임을 종료합니다.");
				break;
			}

		}
	}

}


