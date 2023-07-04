package Pack;

public class Overload {
	void Menu(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	void Menu(char d, char e)
	{
		
		System.out.println("the caractors are:" +d +e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overload v=new Overload();
		v.Menu(2,8);
		v.Menu('c','r');
		
		

	}

}
