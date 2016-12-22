class Lab202
{
	public static void main(String[] args)
	{
		int arr[] = null;
		System.out.println("Len: "+arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[-1]);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab202.java

E:\JLC Fundamental Lab>java Lab202
Exception in thread "main" java.lang.NullPointerException
        at Lab202.main(Lab202.java:6)
        */