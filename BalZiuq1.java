

public class LabQuiz1
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an Grade: ");
		int GRD = sc.nextInt();
				
		if (GRD >= 65 && GRD <= 74)
		{
			System.out.println("Grade Equivalent is: 5.00");
			System.out.println("Remarks: FAILED!");
		}
		else if (GRD >= 75 && GRD <= 99)
		{
			if (GRD >= 75 && GRD <= 76)
			{
				System.out.println("Grade Equivalent is: 3.00");
			}
			else if (GRD >= 77 && GRD <= 79)
			{
				System.out.println("Grade Equivalent is: 2.75");
			}
			else if (GRD >= 80 && GRD <= 82)
			{
				System.out.println("Grade Equivalent is: 2.50");
			}
			else if (GRD >= 83 && GRD <= 85)
			{
				System.out.println("Grade Equivalent is: 2.25");
			}
			else if (GRD >= 86 && GRD <= 88)
			{
				System.out.println("Grade Equivalent is: 2.00");
			}
			else if (GRD >= 89 && GRD <= 91)
			{
				System.out.println("Grade Equivalent is: 1.75");
			}
			else if (GRD >= 92 && GRD <= 94)
			{
				System.out.println("Grade Equivalent is: 1.50");
			}
			else if (GRD >= 95 && GRD <= 97)
			{
				System.out.println("Grade Equivalent is: 1.25");
			}
			else if (GRD >= 98 && GRD <= 99)
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