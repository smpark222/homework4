package homework4;

public class SumOfNumbers {
	void A01() {
		int sum = 0;
		while (true) {
			System.out.println("������ ���� �Է�(Q:����) >> ");
			String input = new ExamForWhile().input();
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			int inputNum = Integer.parseInt(input);
			if (inputNum >= 1)
				sum = inputNum * (1 + inputNum) / 2;
			else
				sum = (2 - inputNum) * (1 + inputNum) / 2;
			System.out.println("��  ���� " + sum + "�Դϴ�.\n");
		}
		return;
	}
}