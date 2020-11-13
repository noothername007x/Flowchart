
import java.util.*;

public class LabQuiz3 
{
	public static void main (String[] args) 
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
		
		double Average = GRADE/Subjects;
		System.out.println("The Average Grade is: " + String.format("%7.2f", Average));		
		Average = Math.round(Average);
		
		if (Average >= 65 && Average <= 74)
		{
			System.out.println("Grade Equivalent is: 5.00");
			System.out.println("Remarks: FAILED!");
		}
		else if (Average >= 75 && Average <= 99)
		{
			if (Average >= 75 && Average <= 76)
			{
				System.out.println("Grade Equivalent is: 3.00");
			}
			else if (Average >= 77 && Average <= 79)
			{
				System.out.println("Grade Equivalent is: 2.75");
			}
			else if (Average >= 80 && Average <= 82)
			{
				System.out.println("Grade Equivalent is: 2.50");
			}
			else if (Average >= 83 && Average <= 85)
			{
				System.out.println("Grade Equivalent is: 2.25");
			}
			else if (Average >= 86 && Average <= 88)
			{
				System.out.println("Grade Equivalent is: 2.00");
			}
			else if (Average >= 89 && Average <= 91)
			{
				System.out.println("Grade Equivalent is: 1.75");
			}
			else if (Average >= 92 && Average <= 94)
			{
				System.out.println("Grade Equivalent is: 1.50");
			}
			else if (Average >= 95 && Average <= 97)
			{
				System.out.println("Grade Equivalent is: 1.25");
			}
			else if (Average >= 98 && Average <= 99)
			{
				System.out.println("Grade Equivalent is: 1.00");
			}
			System.out.println("Remarks: PASSED!");		
		}
		else
		{
			System.out.println("Invalid Grade!");
			System.out.println("Remarks: UNDEFINED!");
		}		
		
	}
}