package homework4;

public class SumAndAvg {
	void A03(){
		int sum = 0;
		double avg = 0;
		int count = 0;
		while(true){
			System.out.println("���ڸ� �Է�(Q:����) >> ");
			String input = new ExamForWhile().input();
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			int inputNum = Integer.parseInt(input);
			sum += inputNum;
			count++;
		}
		avg = (double)sum / count;
		System.out.printf("�հ�� %d�̰�, ����� %.2f�Դϴ�.\n\n", sum, avg);
	}
}
