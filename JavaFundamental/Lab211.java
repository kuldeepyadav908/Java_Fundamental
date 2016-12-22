class Lab211
{
	public static void main(String[] args)
	{
		show(new int[4]{99,88,66,77});
	}
	static void show(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab211.java
Lab211.java:5: error: ')' expected
                show(new int[4]{99,88,66,77});
                               ^
Lab211.java:5: error: not a statement
                show(new int[4]{99,88,66,77});
                                ^
Lab211.java:5: error: ';' expected
                show(new int[4]{99,88,66,77});
                                  ^
Lab211.java:5: error: illegal start of type
                show(new int[4]{99,88,66,77});
                                            ^
Lab211.java:7: error: class, interface, or enum expected
        static show(int arr[])
               ^
Lab211.java:9: error: class, interface, or enum expected
                for(int i=0;i<arr.length;i++)
                            ^
Lab211.java:9: error: class, interface, or enum expected
                for(int i=0;i<arr.length;i++)
                                         ^
Lab211.java:11: error: class, interface, or enum expected
        }
        ^
8 errors
*/