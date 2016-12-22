class Lab198
{
	public static void main(String[] args)
	{
		int arr[] = new int[5L];
		int arr1[] = new int[5.0f];

		int arr2[] = new int[2147483647];
		System.out.println(arr2.length);

		int arr3[] = new int[2147483648];
		System.out.println(arr3.length);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab198.java
Lab198.java:11: error: integer number too large: 2147483648
                int arr3[] = new int[2147483648];
                                     ^
1 error

E:\JLC Fundamental Lab>javac Lab198.java
Lab198.java:5: error: incompatible types: possible lossy conversion from long to int
                int arr[] = new int[5L];
                                    ^
Lab198.java:6: error: incompatible types: possible lossy conversion from float to int
                int arr1[] = new int[5.0f];
                                     ^
2 errors
*/