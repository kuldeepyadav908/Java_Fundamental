class Lab206
{
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		System.out.println(arr+1);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab206.java
Lab206.java:6: error: bad operand types for binary operator '+'
                System.out.println(arr+1);
                                      ^
  first type:  int[]
  second type: int
1 error
*/