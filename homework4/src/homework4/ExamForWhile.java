package homework4;

import java.util.*;

public class ExamForWhile {
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. 1���� �Է��� ������ ���ϱ�");
			System.out.println("2. �ִ밪/�ּҰ� ���ϱ�");
			System.out.println("3. �Է¹��� ������ �հ�� ��� ���ϱ�");
			System.out.println("4. ���ϴ� ������ ����ϱ�");
			System.out.println("5. ¦����/Ȧ���� ����ϱ�");
			System.out.println("6. ���α׷� ����");
			System.out.println("���ϴ� �޴���>> ");
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
				System.out.println("���ڸ� �ٽ�  �Է����ּ���");
				break;
			}
		}
	}

	public static String input() {
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
}
