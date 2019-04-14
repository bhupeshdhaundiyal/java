package patternAndBasic;

/*
1
11
101
1001
10001

*/


public class Pattern101 {
	public static void main(String[] args) {
		
		
		for (int i = 1; i <=5; i++) {
			
			for (int j = 1; j <=i; j++) {
				
				if(j==1 || j==i){
					System.out.print("1");
					
				}
				else
					System.out.print("0");
				
				
			}
			
			System.out.println();
			
			
			
		}
		
		
	}

}
