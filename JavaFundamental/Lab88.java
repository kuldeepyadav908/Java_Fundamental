class Lab88
{
	public static void main(String[] args)
	{
		int a = 90;
		//String str = a;
		String str1 = ""+a;
		String str2 = a+"";
		System.out.println(a);
		System.out.println(str1);
		System.out.println(str2);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab88.java
Lab88.java:6: error: incompatible types: int cannot be converted to String
                String str = a;
                             ^
1 error
*/


/*
Output
======

E:\JLC Fundamental Lab>javac Lab88.java

E:\JLC Fundamental Lab>java Lab88
90
90
90
*/