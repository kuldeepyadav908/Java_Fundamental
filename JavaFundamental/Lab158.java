class Lab158
{
	public static void main(String[] args)
	{
		for(int i=1; i<=10; i++)
			System.out.println(i);
		System.out.println(i);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab158.java
Lab158.java:7: error: cannot find symbol
                System.out.println(i);
                                   ^
  symbol:   variable i
  location: class Lab158
1 error
*/