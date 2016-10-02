import javax.swing.JOptionPane;

public class PrimeNumbers {
		
	static void primeOrNot(int num){
		int ans = 0;
		for(int i = 1; i < num; i++){
			
			if(num%i == 0){
				ans++;
			}
		}
		if(ans == 1){
			System.out.println("it is prime");
		}
		else{
			System.out.println("it is not prime");
		}
	}
	
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Say a number");
		int answer = Integer.parseInt(a);
		primeOrNot(answer);
	}
}
