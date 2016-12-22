class Lab96
{
	public static void main(String[] args)
	{
		byte b1 = 12;
		byte b2 = 23;
		//byte b3 = b1 + b2;
		//byte b4 = (byte)b1 + (byte)b2;
		byte b5 = (byte)(b1 + b2);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b5);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab96.java
Lab96.java:7: error: incompatible types: possible lossy conversion from int to byte
                byte b3 = b1 + b2;
                             ^
Lab96.java:8: error: incompatible types: possible lossy conversion from int to byte
                byte b4 = (byte)b1 + (byte)b2;
                                   ^
Lab96.java:10: error: cannot find symbol
                System.out.println(a);
                                   ^
  symbol:   variable a
  location: class Lab96
Lab96.java:11: error: cannot find symbol
                System.out.println(b);
                                   ^
  symbol:   variable b
  location: class Lab96
4 errors
*/

/*
Output
======

E:\JLC Fundamental Lab>javac Lab96.java

E:\JLC Fundamental Lab>java Lab96
12
23
35
*/