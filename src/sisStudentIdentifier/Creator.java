/**
 * 
 */
package sisStudentIdentifier;

/**
 * @author alexander.hess
 *
 */
public class Creator
	{

		/**
		 * @param args
		 */
		
				String firstName;
				String lastName;
				String period1;
				String period2;
				String period3;
				int grade1;
				int grade2;
				int grade3;
				
				 public Creator (String f, String l, String p1, String p2, String p3, int g1, int g2, int g3)
				        {
				        firstName = f;
				        lastName = l;
				        period1 = p1;
				        period2 = p2;
				        period3 = p3;
				        grade1 = g1;
				        grade2 = g2;
				        grade3 = g3;
				       
				        }

				public String getFirstName()
					{
						return firstName;
					}

				public void setFirstName(String firstName)
					{
						this.firstName = firstName;
					}

				public String getLastName()
					{
						return lastName;
					}

				public void setLastName(String lastName)
					{
						this.lastName = lastName;
					}

				public String getPeriod1()
					{
						return period1;
					}

				public void setPeriod1(String period1)
					{
						this.period1 = period1;
					}

				public String getPeriod2()
					{
						return period2;
					}

				public void setPeriod2(String period2)
					{
						this.period2 = period2;
					}

				public String getPeriod3()
					{
						return period3;
					}

				public void setPeriod3(String period3)
					{
						this.period3 = period3;
					}

				public int getGrade1()
					{
						return grade1;
					}

				public void setGrade1(int grade1)
					{
						this.grade1 = grade1;
					}

				public int getGrade2()
					{
						return grade2;
					}

				public void setGrade2(int grade2)
					{
						this.grade2 = grade2;
					}

				public int getGrade3()
					{
						return grade3;
					}

				public void setGrade3(int grade3)
					{
						this.grade3 = grade3;
					}

			

	}
