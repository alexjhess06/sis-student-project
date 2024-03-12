package sisStudentIdentifier;
import java.util.ArrayList;
public class Student
{
	private String firstName;
	private String lastName;
	private String period1;
	private String period2;
	private String period3;
	private String grade1;
	private String grade2;
	private String grade3;
	public Student(String f, String l, String p1, String p2, String p3, String g1, String g2, String g3)
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
		return firstname;
	}
	public void setFirstName(String f)
	{
		firstName = f;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setFirstName(String l)
	{
		lastName = l;
	}
	public String getPeriod1()
	{
		return period1;
	}
	public void setPeriod1(String p)
	{
		period1 = p;
	}
	public String getPeriod2()
	{
		return period2;
	}
	public void setPeriod2(String p)
	{
		period2 = p;
	}
	public String getPeriod3()
	{
		return period3;
	}
	public void setPeriod3(String p)
	{
		period3 = p;
	}
	public String getGrade1()
	{
		return grade1;
	}
	public void setGrade1(String g)
	{
		grade1 = g;
	}
	public String getGrade2()
	{
		return grade2;
	}
	public void setGrade2(String g)
	{
		grade2 = g;
	}
	public String getGrade3()
	{
		return grade3;
	}
	public void setGrade3(String g)
	{
		grade3 = g;
	}
}