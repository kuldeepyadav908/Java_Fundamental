class Lab179
{
	public static void main(String[] args)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			break;
			System.out.println("Inside Loop");
		}
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab179.java
Lab179.java:9: error: unreachable statement
                        System.out.println("Inside Loop");
                        ^
1 error
*/