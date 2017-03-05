package practiceLabs;

public class JavaArrays {

	public static void main(String[] args) 
	{
		// First way of Array declaration
		String[] uiaStudents = new String[5];
		uiaStudents[0] = "Index0Value";
		uiaStudents[1] = "Index1Value";
		uiaStudents[2] = "Index2Value";
		uiaStudents[3] = "Index3Value";
		//uiaStudents[4] = "Index4Value"; //This index is commented to see memory allocation (null)
		
		
		//Second way of Array declaration and initialization 
		String[] umStudents = {"Student1", "Student2", "Student3"};
		
		//loop through uiaStudents array
		for(int index = 0; index < uiaStudents.length; index++ )
		{
			System.out.println(uiaStudents[index]);
		}
		
		//loop through umStudents array
		for(int index = 0; index < umStudents.length; index++ )
		{
			System.out.println(umStudents[index]);
		}
	}
}
