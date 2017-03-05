package practiceLabs;

/**
 * This program will switch through "integerVaribale" 
 * @author shaghasi
 *
 */
public class SwitchStatement {

	public static void main(String[] args) {
		
		int integerVariable = 4;
		
		/* switch statement will
		 * check the integerVariable against the values at 'case' 
		*/
		switch(integerVariable)
		{
		case 4:
			System.out.println("The value of integerVariable is: 4");
		break;
		case 5:
			System.out.println("The value of integerVariable is: 5");
		break;
		
		default: 
			System.out.println("Default message when none of the conditions are true");
		}
	}
}
