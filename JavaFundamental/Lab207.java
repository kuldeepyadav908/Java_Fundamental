class Lab207
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30};
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		String names[] = {"Sri","Manish","DK"};
		System.out.println("Len: "+names.length);
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]);
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab207.java

E:\JLC Fundamental Lab>java Lab207
3
10
20
30
Len: 3
Sri
Manish
DK
*/