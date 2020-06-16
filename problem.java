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
		System.out.print("태어난 년도: ");
		year = scan.nextLine();
		int Year = Integer.parseInt(year);
		switch (Year % 12) {
		case 0:
			System.out.println("신,원숭이 띠입니다.");
			break;
		case 1:
			System.out.println("유,닭 띠입니다.");
			break;
		case 2:
			System.out.println("술,개 띠입니다.");
			break;
		case 3:
			System.out.println("해,돼지 띠입니다.");
			break;
		case 4:
			System.out.println("자,쥐 띠입니다.");
			break;
		case 5:
			System.out.println("축,소 띠입니다.");
			break;
		case 6:
			System.out.println("인,호랑이 띠입니다.");
			break;
		case 7:
			System.out.println("묘,토끼 띠입니다.");
			break;
		case 8:
			System.out.println("진,용 띠입니다.");
			break;
		case 9:
			System.out.println("사,뱀 띠입니다.");
			break;
		case 10:
			System.out.println("오,말 띠입니다.");
			break;
		case 11:
			System.out.println("미,양 띠입니다.");
			break;

		}
		String month;
		System.out.print("태어난 월: ");
		month = scan.nextLine();
		int Month = Integer.parseInt(month);
		switch (Month) {
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		case 12:
			System.out.println("겨울입니다.");
			break;

		}
		System.out.println("종료합니다.");
	}

}
