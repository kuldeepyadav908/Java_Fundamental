class Lab137
{
	public static void main(String[] args)
	{
		int a = 99;
		if(a == 99)
		{
			int b = 12;
			System.out.println(b);
			System.out.println(a);
		}
		System.out.println(a);
		//System.out.println(b);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab137.java
Lab137.java:13: error: cannot find symbol
                System.out.println(b);
                                   ^
  symbol:   variable b
  location: class Lab136
1 error
*/

/*
Output
======

E:\JLC Fundamental Lab>javac Lab137.java

E:\JLC Fundamental Lab>java Lab137
12
99
99
*/