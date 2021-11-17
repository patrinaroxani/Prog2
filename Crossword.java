package mysterylab;
import java.util.Scanner;

public class Crossword {
   
	private Scanner input = new Scanner(System.in);
	private int success;
	private String roomName;
	
	public Crossword(String name) {
		success=0;
		roomName=name;
	}
	
	public boolean playGame() {
		
		int qnumber;
		
		do {
			for(int i=0;i<4;i++) {
				System.out.println(questions[i]);
			}
			System.out.println("�������� ��� ������� ��� ������ �� ����������!");
			
			do {
			qnumber=input.nextInt();
			if (qnumber!=1 || qnumber!=2 || qnumber!=3 || qnumber!=4) {
				System.out.println("� ������� ��� ��������� ��� ����������� �� ������ �������! �������� ������������ ����!");
			}	
			}while(qnumber!=1 || qnumber!=2 || qnumber!=3 || qnumber!=4);
			
			
			if(checkAnswers(qnumber);) {
				success++;
				System.out.println("������������! ������� ��� ����!");
			}else {
				System.out.println("�����! ������������ ����!");
			}
			}while(success!=4);
		
	System.out.println("������! ���������� ��� �� ����� ������ ��� ��������! ����� ������ �� �����������!");
	}
	
	
	
	
	public boolean checkAnswers(int num) {
		String answer;
		answer=input.nextLine();
		String change = answer.toUpperCase();
		if(answers[num-1]==change){
			return true;
		}else {
			return false;
		}
	}
	

	
	
	
	
	
	public void printInstructions() {
		System.out.println("����� ������ ��� Escape room: Greek mythology Edition ");
		System.out.println("��������� �� ���������� ��� �� ������� ���/���" + roomName);
		System.out.println("� ������ ��� �������� ��� ����!");
	    System.out.println("� ����� ��������� ������� �� ������������ �� �������� ��� �������� ��� �� ������ �� �������� ����������");
	    System.out.println("�� ������� ��� ���������� ����� � ����:");
	    System.out.println("������ �� ����������� ��� ��� 4 ��������� ������ ����������� �� ����������� ��� ������� ������.");
	    System.out.println("�������� �� ��������� ���� ���� ��� ������� ���� ����� ������ �� ���������� ����� �� ������� ����������� �����������");
	    System.out.println("���� ��������!");
	
	}
	
	
	
		
}
