package lecture1;


import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("-------------");
				for (int i = 0; i < 3; i++)
					System.out.println("|   |   |   |");
				System.out.println("-------------");

				Scanner sc = new Scanner(System.in);
				boolean w1 = false, w2=false;
				char [][] p1 = new char[4][4];
				char [][] p2 = new char[4][4];
				int count= 0;
				while (w1==false && w2 == false && count!=9)
				{
					System.out.println("Enter a row (0, 1, or 2) for player X: ");
					int r1= sc.nextInt();
					System.out.println("Enter a column (0, 1, or 2) for player X: ");
					int c1 = sc.nextInt();

					p1[r1][c1]= 'X';
					System.out.println("-------------");
				for (int i=0; i< 3; i++)
				{
					{
					for (int j=0; j< 4; j++)
						if (p1[i][j]!='X' && p1[i][j]!='0')
					System.out.print("|   "+ p1[i][j]);
						else
							System.out.print("| "+ p1[i][j]+" ");
					}
					System.out.println();
				}
					System.out.println("-------------");
					
					for (int i=0; i< 3; i++)
					{
					if ((p1[0][0] == 'X' && p1[1][1]=='X' && p1[2][2]=='X')||(p1[i][0]=='X' && p1[i][1]=='X' && p1[i][2]=='X')||(p1[0][i]=='X' && p1[1][i]=='X' && p1[2][i]=='X')|| (p1[0][2] == 'X' && p1[1][1]=='X' && p1[2][0]=='X'))
					{
						w1 = true;
						break;
						
					}
					else
						w1= false;
					}
					
					if (w1)
						break;
							
							//player 2 code
					System.out.println("Enter a row (0, 1, or 2) for player 0: ");
					int r2= sc.nextInt();
					System.out.println("Enter a column (0, 1, or 2) for player 0: ");
					int c2 = sc.nextInt();
					
					p1[r2][c2]= '0';
					System.out.println("-------------");
					
					for (int i=0; i< 3; i++)
					{
						{
						for (int j=0; j< 4; j++)
							if (p1[i][j]!='X' && p1[i][j]!='0')
						System.out.print("|   "+ p1[i][j]);
							else
								System.out.print("| "+ p1[i][j]+" ");
						}
						System.out.println();
					}
						System.out.println("-------------");
				
						
						
					for (int i=0; i< 3; i++)
					{
						if ((p1[0][0] == '0' && p1[1][1]=='0' && p1[2][2]=='0')||(p1[i][0]=='0' && p1[i][1]=='0' && p1[i][2]=='0')||(p1[0][i]=='0' && p1[1][i]=='0' && p1[2][i]=='0')|| (p1[0][2] == '0' && p1[1][1]=='0' && p1[2][0]=='0'))
						{
							w2 = true;
							break;
						}
						else 
							continue;
					}
					count++;
					if (count == 9)
						break;
				}
				
				if (w1)
					System.out.println("Player X wins");
				else
					if (w2)
						System.out.println("Player 0 wins :");
					else
						System.out.println("Its a draww.");
			}

		}
