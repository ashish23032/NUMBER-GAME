import java.util.Scanner;
public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the no. of SUBJECT! : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;) {
			System.out.println("Enter the ontained mark of subject "+i+" (out of 100)");
			int g=sc.nextInt();
			if(g<100) {
				sum+=g;
			}else {
				System.out.println("Invalid MARK!");
				continue;
			}	
			i++;
		}
		System.out.println("Total MARKS of obtained in all subjects = "+sum);
		double a=sum/n;
		System.out.println("Average Percentage = "+a+"%");
		if(a>=90) {
			System.out.println("Grade A+");
		}else if(a>=80) {
			System.out.println("Grade A");
		}else if(a>=70) {
			System.out.println("Grade B+");
		}else if(a>=60) {
			System.out.println("Grade B");
		}else if(a>=50) {
			System.out.println("Grade c+");
		}else if(a>=40) {
			System.out.println("Grade C");
		}else if(a>=33) {
			System.out.println("Grade D");
		}else{
			System.out.println("Grade F Fail");
		}
		sc.close();
	}

}
