package sisStudentIdentifier;
import java.util.Scanner;
public class main
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		public static void main(String[] args)
		{
<<<<<<< HEAD
				
			System.out.println("Select an option \n 1: Sort Students \n Find a student \n Option 3");
			System.out.println("Select another option \n 1: Sort Students \n Find a student \n Option 3");
=======
			
			System.out.println("Select an option \n 1: Sort Students \n 2: Add or Delete a Student \n 3: Change a Student's Grades or Schedules");
			int option = userIntInput.nextInt();
			
			if(option == 1) {
				sort();
			}
			if(option == 2) {
				addDelete();
			}
			if(option == 3) {
				changeSched();
			}
			}

		private static void changeSched()
			{
				System.out.println("Select an Option \n 1: Change a student's schedule \n 2: Change a student's grades");
				int option = userIntInput.nextInt();
				if(option == 1) {
					
				}
				if(option == 2) {
					
				}
				
			}

		private static void addDelete()
			{
				System.out.println("Select an Option \n 1: Add a student \n 2: Delete a student");
				int option = userIntInput.nextInt();
				if(option == 1) {
					System.out.println("Enter New Student's first name");
					String firstName = userStringInput.nextLine();
					
					System.out.println("Enter New Student's last name");
					String lastName = userStringInput.nextLine();
					
					System.out.println("Enter New Student's first period");
					String period1 = userStringInput.nextLine();
					System.out.println("Enter New Student's first period grade");
					String grade1 = userStringInput.nextLine();
					
					System.out.println("Enter New Student's second period");
					String period2 = userStringInput.nextLine();
					System.out.println("Enter New Student's second period grade");
					String grade2 = userStringInput.nextLine();
					
					System.out.println("Enter New Student's third period");
					String period3 = userStringInput.nextLine();
					System.out.println("Enter New Student's third period grade");
					String grade3 = userStringInput.nextLine();
					
					//will not work until pojo and arraylist are in working order
					student.add(new Student(firstName, lastName, period1, period2, period3, grade1, grade2, grade3));
				}
				if(option == 2) {
					System.out.println("Enter the last name of the student you would like to remove");
					String lastName = userStringInput.nextLine();
					for(int i = 0; i < student.length(); i++) {
						//once again wont work until yall pick up the slack smh my head
					}
				}
			}

		private static void sort()
			{
				System.out.println("Select an Option \n 1: Sort by last name \n 2: Sort by GPA \n 3: Sort by period");
				int option = userIntInput.nextInt();
				if(option == 1) {
					
				}
				if(option == 2) {
					
				}
				if(option == 3) {
					System.out.println("Which period would you like to sort by?");
				}
				
>>>>>>> branch 'main' of https://github.com/JacobSushinsky/SIS.git
			}

	}
