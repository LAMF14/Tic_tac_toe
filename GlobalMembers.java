//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per file.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class GlobalMembers
{
	public static char[][] T =
	{
		{'1', '2', '3'},
		{'4', '5', '6'},
		{'7', '8', '9'}
	};
	public static char x = 'X';
	public static char p = '1';

	public static void grafica()
	{

		system("cls");
		System.out.print("");
		System.out.print("\n");
		System.out.print("                        TIC TAC TOE                                       ");
		System.out.print("\n");
		System.out.print("");
		System.out.print("\n");
		System.out.print("         Player 1 (X)                 Player 2 (0)                              ");
		System.out.print("\n");
		System.out.print("");
		System.out.print("\n");
		System.out.print("                 |                   |       ");
		System.out.print("\n");
		 for (int i = 0;i < 3;i++)
		 {
		  for (int j = 0;j < 3;j++)
		  {
			System.out.print("      ");
			System.out.print(T[i][j]);
			System.out.print("       ");
			if (j < 2)
			{
			System.out.print("   |  ");
			}
		  }
		  System.out.print("     \n     ");
		  if (i < 2)
		  {

			System.out.print("------------+-------------------+------------");
			System.out.print("\n");
		  }
		 }
		 System.out.print("            |                   |             ");
		 System.out.print("\n");

	}

	public static void juego()
	{

		int y;
		 System.out.print("PLAYER ");
		 System.out.print(p);
		 System.out.print("(");
		 System.out.print(x);
		 System.out.print(")");
		 System.out.print(", ENTER A NUMBER: ");
		 y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		 if (y == 1)
		 {
			if (T[0][0] == '1')
			{
			T[0][0] = x;
			}
			else
			{
				juego();
			}
		 }
		  else if (y == 2)
		  {
			if (T[0][1] == '2')
			{
			T[0][1] = x;
			}
			else
			{
				juego();
			}
		  }
		  else if (y == 3)
		  {
			if (T[0][2] == '3')
			{
			T[0][2] = x;
			}
			else
			{
				juego();
			}
		  }
		  else if (y == 4)
		  {
			if (T[1][0] == '4')
			{
			T[1][0] = x;
			}
			else
			{
				juego();
			}
		  }
		  else if (y == 5)
		  {
			if (T[1][1] == '5')
			{
			T[1][1] = x;
			}
			else
			{
				juego();
			}
		  }
		  else if (y == 6)
		  {
			if (T[1][2] == '6')
			{
			T[1][2] = x;
			}
			else
			{
				juego();
			}
		  }
		  else if (y == 7)
		  {
			if (T[2][0] == '7')
			{
			T[2][0] = x;
			}
			else
			{
				juego();
			}
		  }
		 else if (y == 8)
		 {
			if (T[2][1] == '8')
			{
			T[2][1] = x;
			}
			else
			{
				juego();
			}
		 }
		   else if (y == 9)
		   {
			if (T[2][2] == '9')
			{
			T[2][2] = x;
			}
			else
			{
				juego();
			}
		   }



	}

	public static void turno()
	{

		 if (x == 'X')
		 {
			x = '0';
		 }
		else
		{
			x = 'X';
		}
		 if (p == '1')
		 {
			p = '2';
		 }
		else
		{
			p = '1';
		}
	}

	public static char gano()
	{


//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
