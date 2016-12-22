class Lab19
{
	public static void main(String[] args)
	{
		boolean b1 = 0;
		boolean b2 = 1;
		System.out.println(b1);
		System.out.println(b2);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab19.java
Lab19.java:5: error: incompatible types: int cannot be converted to boolean
                boolean b1 = 0;
                             ^
Lab19.java:6: error: incompatible types: int cannot be converted to boolean
                boolean b2 = 1;
                             ^
2 errors
*/