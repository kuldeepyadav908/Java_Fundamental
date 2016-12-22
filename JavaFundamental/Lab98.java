class Lab98
{
	public static void main(String[] args)
	{
		boolean b = (boolean)1;
		String str = (String)99;
		int x = (int)"JLC";
		System.out.println(b);
		System.out.println(str);
		System.out.println(x);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab98.java
Lab98.java:5: error: incompatible types: int cannot be converted to boolean
                boolean b = (boolean)1;
                                     ^
Lab98.java:6: error: incompatible types: int cannot be converted to String
                String str = (String)99;
                                     ^
Lab98.java:7: error: incompatible types: String cannot be converted to int
                int x = (int)"JLC";
                             ^
3 errors
*/