class Lab175
{
	public static void main(String[] args)
	{
		int i = 0;
		do
		{
			System.out.println(i++);
		}
		while(true);
		System.out.println("After");
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab175.java
Lab175.java:11: error: unreachable statement
                System.out.println("After");
                ^
1 error
*/