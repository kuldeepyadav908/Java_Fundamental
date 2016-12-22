class Lab217
{
	public static void main(String[] args)
	{
		if(args.length>=2)
		{
			String str1 = args[0];
			String str2 = args[1];
			System.out.println(str1+str2);
			int a = Integer.parseInt(str1);
			int b = Integer.parseInt(str2);
			System.out.println(a+b);
		}
		else
			System.out.println("Enter two int values as CLA");
	}
}

/*
Output
======

E:\JLC Fundamental Lab>javac Lab217.java

E:\JLC Fundamental Lab>java Lab217
Enter two int values as CLA



E:\JLC Fundamental Lab>java Lab217 5 7
57
12
*/