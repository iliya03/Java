package pk2;
import pk1.Student;
class Example2
{
public static void main(String []args)
{
	Student std = new Student();
	std.setRoll(105);
	std.setName("Iliya");
	System.out.println("Roll="+ std.getRoll());
	System.out.println("Name="+ std.getName());

}
}