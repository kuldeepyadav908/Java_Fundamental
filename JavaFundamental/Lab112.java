class Lab112
{
	public static void main(String[] args)
	{
		System.out.println(true >= true);
		System.out.println(true == 0);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab112.java
Lab112.java:5: error: bad operand types for binary operator '>='
                System.out.println(true >= true);
                                        ^
  first type:  boolean
  second type: boolean
Lab112.java:6: error: incomparable types: boolean and int
                System.out.println(true == 0);
                                        ^
2 errors
*/