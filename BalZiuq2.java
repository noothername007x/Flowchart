import java.util.*;

public class LabQuiz2 
{
	public static Double Average;
	
	public static void main(String[] args)
	{
		double GRD=0, GRADE=0;
		int Subjects=0, CTR=1;
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter number of Subjects: ");
		Subjects = Input.nextInt();
		
		while (CTR <= Subjects)
		{
			System.out.print("Enter Subject " + CTR + ":");
			GRD = Input.nextInt();			
			GRADE += GRD;
			CTR +=1;
		}
		Average = GRADE/Subjects;
		System.out.println("The Average Grade is: " + String.format("%7.2f", Average));				
	}
}