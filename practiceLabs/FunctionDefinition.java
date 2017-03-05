package practiceLabs;

public class FunctionDefinition {

	
	public static void main(String[] args)
	{
		/**
		 * create an instance of the class.
		 * you cannot call non-static function from static function 
		 * unless you create an instance of the class.
		 * because the non static functions belongs to the instance of the class.
		 */
		FunctionDefinition obj = new FunctionDefinition();
		obj.addition(5, 5);//call to addition function
	}
	
	/**
	 * This function is performing addition
	 * @param firstParameter
	 * @param SecondParameter
	 * @return
	 */
	public int addition(int firstParameter, int SecondParameter)
	{
		int sum = firstParameter + SecondParameter;
		return sum;
	}
}
