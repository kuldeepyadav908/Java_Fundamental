class Lab152
{
	public static void main(String[] args)
	{
		char ch = 'A';
		if(ch>=65 && ch<=90)
		{
			switch(ch)
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				System.out.println("charecter is vowel");
				break;

				default:
				System.out.println("charecter is Consonant");
			}
		}
		else
			System.out.println("Invalid Alphabet");
	}
}


/*
Output
======

E:\JLC Fundamental Lab>javac Lab152.java

E:\JLC Fundamental Lab>java Lab152
charecter is vowel
*/