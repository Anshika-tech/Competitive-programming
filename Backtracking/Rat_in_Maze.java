import java.util.*;

public class Rat_in_Maze {
	static boolean f = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				maze[i][j] = str.charAt(j);
			}

		}
        String str="TDLR";
        String ans1="";
		int[][] ans=new int[n][m];
		HasPath(maze,str, 0, 0,ans,ans1);

		if (f == false) {
			System.out.println("NO PATH FOUND");
		}
	}
	public static void HasPath(char[][] maze,String str, int cc, int cr,int[][] ans,String ans1) {

		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
            System.out.println(ans1);
			Display(ans);
			f = true;
			return;
		}

		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {

			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int r[] = { -1, 1, 0, 0 };
		int c[] = { 0, 0, -1, 1 };

		for (int i = 0; i < c.length; i++) {
			HasPath(maze,str, cc + c[i], cr + r[i], ans,ans1+str.charAt(i));
		}
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}