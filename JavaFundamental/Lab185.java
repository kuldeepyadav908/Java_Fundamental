class Lab185
{
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			continue;
			System.out.println("**After**");
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab185.java
Lab185.java:9: error: unreachable statement
                        System.out.println("**After**");
                        ^
1 error
*/