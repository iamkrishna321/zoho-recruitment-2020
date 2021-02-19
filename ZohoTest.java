import java.util.Scanner;

public class ZohoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scanner = new Scanner(System.in);
		String string = scanner.next();
		
		int n = string.length();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			int index = n/2;
			for(int j=n-i;j<n;j++) {
				System.out.print(string.charAt(index++));
				if(index==n)
					index = 0;
			}
			System.out.println("");
		}
	}

}
