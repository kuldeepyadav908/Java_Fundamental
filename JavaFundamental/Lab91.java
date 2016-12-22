class Lab91
{
	public static void main(String[] args)
	{
		//10 = 29;
		int a = 12 < 23;
		int b = 123L;
		long c = 123.45;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

/*
Output
======

Lab91.java:5: error: unexpected type
                10 = 29;
                ^
  required: variable
  found:    value
Lab91.java:6: error: incompatible types: boolean cannot be converted to int
                int a = 12 < 23;
                           ^
Lab91.java:7: error: incompatible types: possible lossy conversion from long to int
                int b = 123L;
                        ^
Lab91.java:8: error: incompatible types: possible lossy conversion from double to long
                long c = 123.45;
                         ^
4 errors
*/