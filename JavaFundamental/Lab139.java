class Lab139
{
	public static void main(String[] args)
	{
		int a = 0;
		if(a++ == 0)
			System.out.println("Zero");
		else if(a++ == 1)
			System.out.println("One");
		else
			System.out.println("Not Matching");
		System.out.println(a);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab139.java

E:\JLC Fundamental Lab>java Lab139
Zero
1
*/