package test;

import java.util.Scanner; //input

public class problem {

	public static void main(String[] args) {
		// input
		Scanner scan = new Scanner(System.in);
		/*
		 * String message; message=scan.nextLine();
		 */
		// TODO Auto-generated method stub
		String year;
		System.out.print("�¾ �⵵: ");
		year = scan.nextLine();
		int Year = Integer.parseInt(year);
		switch (Year % 12) {
		case 0:
			System.out.println("��,������ ���Դϴ�.");
			break;
		case 1:
			System.out.println("��,�� ���Դϴ�.");
			break;
		case 2:
			System.out.println("��,�� ���Դϴ�.");
			break;
		case 3:
			System.out.println("��,���� ���Դϴ�.");
			break;
		case 4:
			System.out.println("��,�� ���Դϴ�.");
			break;
		case 5:
			System.out.println("��,�� ���Դϴ�.");
			break;
		case 6:
			System.out.println("��,ȣ���� ���Դϴ�.");
			break;
		case 7:
			System.out.println("��,�䳢 ���Դϴ�.");
			break;
		case 8:
			System.out.println("��,�� ���Դϴ�.");
			break;
		case 9:
			System.out.println("��,�� ���Դϴ�.");
			break;
		case 10:
			System.out.println("��,�� ���Դϴ�.");
			break;
		case 11:
			System.out.println("��,�� ���Դϴ�.");
			break;

		}
		String month;
		System.out.print("�¾ ��: ");
		month = scan.nextLine();
		int Month = Integer.parseInt(month);
		switch (Month) {
		case 1:
		case 2:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�.");
			break;
		case 12:
			System.out.println("�ܿ��Դϴ�.");
			break;

		}
		System.out.println("�����մϴ�.");
	}

}
