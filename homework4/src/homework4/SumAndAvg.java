package homework4;

public class SumAndAvg {
	void A03(){
		int sum = 0;
		double avg = 0;
		int count = 0;
		while(true){
			System.out.println("숫자를 입력(Q:종료) >> ");
			String input = new ExamForWhile().input();
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			int inputNum = Integer.parseInt(input);
			sum += inputNum;
			count++;
		}
		avg = (double)sum / count;
		System.out.printf("합계는 %d이고, 평균은 %.2f입니다.\n\n", sum, avg);
	}
}
