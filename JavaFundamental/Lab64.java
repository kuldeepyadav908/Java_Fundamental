class Lab64
{
	public static void main(String[] args)
	{
		int a = 234_;
		int b = 0b_101;
		int c = 0X_1_A_F;
		double d1 = 123_.45;
		double d2 = 123._45;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d1);
		System.out.println(d2);
	}
}


/*
Output
======

E:\JLC Fundamental Lab>javac Lab64.java
Lab64.java:5: error: illegal underscore
                int a = 234_;
                           ^
Lab64.java:6: error: illegal underscore
                int b = 0b_101;
                          ^
Lab64.java:7: error: illegal underscore
                int c = 0X_1_A_F;
                          ^
Lab64.java:8: error: illegal underscore
                double d1 = 123_.45;
                               ^
Lab64.java:9: error: illegal underscore
                double d2 = 123._45;
                                ^
5 errors
*/