package Day_12_Inheritance;

import java.util.Scanner;

public class Student extends Person {
	
	private int[] testScores;
	
	Student(String firstName, String lastName, int identification,int []testScores) {
		super(firstName, lastName, identification);
		this.testScores=testScores;
	}
	private String calculate() {
		int suma =0;
		int prom=0;
		String ret="";
		for(int i=0;i<testScores.length;i++)
		{
			suma+=testScores[i];
		}
		prom=suma/testScores.length;
		if (prom>=90 && prom<=100)
		{
			ret="O";
		}
		else if(prom>=80 && prom<90)
		{
			ret="E";
		}
		else if(prom>=70 && prom<80)
		{
			ret="A";
		}
		else if(prom>=55 && prom<70)
		{
			ret="P";
		}
		else if(prom>=40 && prom<50)
		{
			ret="D";
		}
		else if(prom<40)
		{
			ret="T";
		}		
		return ret;
	}	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}


	

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
}


