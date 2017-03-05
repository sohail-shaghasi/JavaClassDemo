package practiceLabs;

public class BreakStatement {

	public static void main(String[] args) {
		
		//loop 50 times 
		for(int i = 1; i < 50; i ++)
		{
				if(i%11==0 )//break the loop if the remainder is zero
				{
					System.out.println("Before breaking the loop");
					break;//terminate loop if i%11==0
				}
				System.out.println("Value of i: " + i);
		}
	}
}
