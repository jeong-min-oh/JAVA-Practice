package com.java.quiz;

import java.util.Scanner;

public class Gababo_game {
	public static void main(String[] args) {

		int user = 0;
		int com = (int) (Math.random() * 3 + 1); // 1,2,3
		char Word = ' ';

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("��ǻ�ʹ� ������ ������ �߽��ϴ�.");
			System.out.println("�̹��� ����� ����....");
			System.out.println("1.���� 2.���� 3.�� ");
			System.out.printf("�����Ͻÿ�.");
			user = sc.nextInt();

			switch (com) {
			case 1:
				switch (user) {
				case 1:
					System.out.println("��ǻ�� : ����, �����: ���� ");
					System.out.println("�����ϴ�.");
					break;
				case 2:
					System.out.println("��ǻ�� : ����, �����: ���� ");
					System.out.println("����ڰ� �̰���ϴ�.");
					break;
				case 3:
					System.out.println("��ǻ�� : ����, �����: �� ");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				default:
					System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
					continue;
				}
				break;

			case 2:
				switch (user) {
				case 1:
					System.out.println("��ǻ�� : ����, �����: ���� ");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case 2:
					System.out.println("��ǻ�� : ����, �����: ���� ");
					System.out.println("�����ϴ�.");
					break;

				case 3:
					System.out.println("��ǻ�� : ����, �����: �� ");
					System.out.println("����ڰ� �̰���ϴ�.");
					break;
				default:
					System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
					continue;

				}
				break;

			case 3:
				switch (user) {
				case 1:
					System.out.println("��ǻ�� : ��, �����: ���� ");
					System.out.println("����ڰ� �̰���ϴ�.");
					break;
				case 2:
					System.out.println("��ǻ�� : ��, �����: ���� ");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					break;
				case 3:
					System.out.println("��ǻ�� : ��, �����: �� ");
					System.out.println("�����ϴ�.");
					break;
				default:
					System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
					continue;
				}
				break;

			}

			System.out.println("������ ��� �Ͻðڽ��ϱ�? [y/n]");
			Word = sc.next().charAt(0);

			if (Word == 'y') {
				continue;
			} else if (Word == 'n') {
				System.out.println("������ �����մϴ�.");
				break;

			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�. ������ �����մϴ�.");
				break;
			}

		}
	}

}


