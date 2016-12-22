class Lab140
{
	public static void main(String[] args)
	{
		int a = 1;
		if(++a == 1)
			System.out.println("One");
		else if(++a == 2)
			System.out.println("Two");
		else
			System.out.println("Not Matching");
		System.out.println(a);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab140.java

E:\JLC Fundamental Lab>java Lab140
Not Matching
3
*/