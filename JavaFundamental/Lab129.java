class Lab129
{
	public static void main(String[] args)
	{
		int a = 20>10 ? 10:20.0;
		double d = 20>10 ? 10:20.0;
		int x = 10>20 ? 10:"TWENTY";
		String str = 10>20 ? 10:"TWENTY";
		System.out.println(a);
		System.out.println(d);
		System.out.println(x);
		System.out.println(str);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab129.java
Lab129.java:5: error: incompatible types: possible lossy conversion from double
to int
                int a = 20 > 10 ? 10 : 20.0;
                                ^
Lab129.java:7: error: incompatible types: bad type in conditional expression
                int x = 10 > 20 ? 10 : "TWENTY";
                                       ^
    String cannot be converted to int
Lab129.java:8: error: incompatible types: bad type in conditional expression
                String str = 10 > 20 ? 10 : "TWENTY";
                                       ^
    int cannot be converted to String
3 errors
*/