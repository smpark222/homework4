package homework4;

public class MaxAndMin {
	void A02() {
		int max = 0;
		int min = 0;
		int i = 1;
		while (true) {
			System.out.println("0~100사이의 숫자를 입력(Q:종료) >> ");
			String input = new ExamForWhile().input();
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			int inputNum = Integer.parseInt(input);
			if (inputNum < 0 || inputNum > 100) {
				System.out.println("숫자를 잘못입력했습니다.");
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
		System.out.println("가장 큰 수는 " + max + "이고, 작은 수는" + min + "입니다.\n");
		return;
	}
}
