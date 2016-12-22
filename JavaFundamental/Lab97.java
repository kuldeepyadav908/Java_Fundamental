class Lab97
{
	public static void main(String[] args)
	{
		boolean b = 1;
		String str = 99;
		int x = "JLC";
		System.out.println(b);
		System.out.println(str);
		System.out.println(x);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab97.java
Lab97.java:5: error: incompatible types: int cannot be converted to boolean
                boolean b = 1;
                            ^
Lab97.java:6: error: incompatible types: int cannot be converted to String
                String str = 99;
                             ^
Lab97.java:7: error: incompatible types: String cannot be converted to int
                int x = "JLC";
                        ^
3 errors
*/