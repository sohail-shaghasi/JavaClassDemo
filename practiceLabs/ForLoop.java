package practiceLabs;

public class ForLoop {

	public static void main(String[] args) 
	{
		int count = 1;
		
	    /* The loop goes until count < 10, and initialValue increases by one every loop*/ 
		for ( count = 0; count < 10; count++ ) 
	    {
	        /* Keep in mind that the loop condition checks 
	           the conditional statement before it loops again.
	           consequently, when count equals 10 the loop breaks.
	           count is updated before the condition is checked. */   
	        System.out.println("value of initialValue variable is : " + count);

	    }
	}

}
