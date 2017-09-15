
public class HelloWorld {

	static int addFinal;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld obj = new HelloWorld();
		obj.testMethod();
		addFinal = obj.calMethod(5, 3);
		System.out.println(addFinal);
		System.out.println("Hello, World");

	}
	
	public void testMethod()
	{
		System.out.println("In Method 1");
		
		int num[] = {10, 20, 30, 40, 50};
		for(int x : num)
		{
			System.out.println("Value of x = " + x);
		}
		
		String str[] = {"Messi", "Ronaldo", "Iniesta", "Reus", "Ibrahimovic", "Greezman"};
		for(String name : str)
		{
			System.out.print(name + ",");
		}
	}
	
	public int calMethod(int a, int b)
	{
		Integer x = 5, y=10, z=5;
		Short c = 5;

		System.out.println(x.equals(y));  
		System.out.println(x.equals(z)); 
		System.out.println(x.equals(c));
		
		return (a + b);
	}

}
