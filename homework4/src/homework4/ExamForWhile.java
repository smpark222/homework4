package homework4;

import java.util.*;

public class ExamForWhile {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. 1부터 입력한 수까지 더하기");
			System.out.println("2. 최대값/최소값 구하기");
			System.out.println("3. 입력받은 숫자의 합계와 평균 구하기");
			System.out.println("4. 원하는 구구단 출력하기");
			System.out.println("5. 짝수단/홀수단 출력하기");
			System.out.println("6. 프로그램 종료");
			System.out.println("원하는 메뉴는>> ");
			String input = input();
			int inputNum = Integer.parseInt(input);

			switch (inputNum) {
			case 1:
				new SumOfNumbers().A01();
				break;
			case 2:
				new MaxAndMin().A02();
				break;
			case 3:
				new SumAndAvg().A03();
				break;
			case 4:
				new GuGuDan().A04();
				break;
			case 5:
				new GuGuDan2().A05();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("숫자를 다시  입력해주세요");
				break;
			}
		}
	}

	public static String input() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
