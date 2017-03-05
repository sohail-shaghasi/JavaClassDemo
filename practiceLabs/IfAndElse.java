package practiceLabs;

public class IfAndElse {

	public static void main(String[] args) 
	{
		int firstInteger = 12;
		int secondInteger = 11;
		
		//Check the condition 
		if (firstInteger > secondInteger)
		{
			System.out.println("firstInteger is greater than secondInteger");
		}
		//execute else whenever the condition at "if" statement is false.
		else 
		{
			System.out.println("firstInteger is less than secondInteger");
		}
	}
}
