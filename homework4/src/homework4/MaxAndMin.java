package homework4;

public class MaxAndMin {
	void A02() {
		int max = 0;
		int min = 0;
		int i = 1;
		while (true) {
			System.out.println("0~100������ ���ڸ� �Է�(Q:����) >> ");
			String input = new ExamForWhile().input();
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			int inputNum = Integer.parseInt(input);
			if (inputNum < 0 || inputNum > 100) {
				System.out.println("���ڸ� �߸��Է��߽��ϴ�.");
				continue;
			}

			if (i == 1) {
				max = inputNum;
				min = inputNum;
				i++;
			}

			if (inputNum > max)
				max = inputNum;
			if (inputNum < min)
				min = inputNum;
		}
		System.out.println("���� ū ���� " + max + "�̰�, ���� ����" + min + "�Դϴ�.\n");
		return;
	}
}
