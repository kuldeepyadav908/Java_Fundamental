class Lab161
{
	public static void main(String[] args)
	{
		final boolean b1 = true;
		for(;b1;)
			System.out.println("JLC");
		System.out.println("AFTER");
	}
}

/*
Output
======

E:\>cd jlc fundamental lab

E:\JLC Fundamental Lab>javac Lab161.java
Lab161.java:8: error: unreachable statement
                System.out.println("AFTER");
                ^
1 error
*/