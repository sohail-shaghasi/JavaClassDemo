package practiceLabs;

public class ContinueStatement {

	public static void main(String[] args) {

			for(int i=1;i<50;i++)
			{
				if(i%11==0)
				{
					System.out.println("Before continue");
					continue;// skip next statement if i%11==0
				}
					System.out.println("Value of i:"+ i );
			}
	}

}
