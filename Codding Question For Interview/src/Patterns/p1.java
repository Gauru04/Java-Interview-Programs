package Patterns;

public class p1 {
	
	public static void main(String[] args) {
		/*
		out put : - 
		*****
		*****
		*****
		*****
		*/
		
		int n=4;
		int m=5;
		
		for( int i =1; i<=n; i++) {
			
			for(int j = 1; j<=m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
