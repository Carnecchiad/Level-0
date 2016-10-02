import javax.swing.JOptionPane;

public class PrimeNumber2 {
		
	static void primeOrNot(int num){
		int ans = 0;
		for(int i = 1; i < num; i++){
			
			if(num%i == 0){
				ans++;
			}
		}
		if(ans == 1){
			System.out.println(num + " is prime");
		}
	}
	
	public static void main(String[] args) {
		int b = 1;
		while(true){
		
		b++;
			
		primeOrNot(b);
	}
}
}