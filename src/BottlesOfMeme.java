import javax.swing.plaf.synth.SynthSpinnerUI;

public class BottlesOfMeme {
	public static void main(String[] args) {
	
	for(int i = 99; i > 0; i--){
		String newLine = System.getProperty("line.separator");
		String beginning =  i + " bottles of meme";
		String beginning2 = i - 1 + " bottles of meme on the wall";
		String end = " on the wall";
		String j = "You take one down and pass it around,";
		String comma = ",";
		String period = ".\n";
		
		
			System.out.println(beginning + end  +  comma + newLine + beginning  + comma + newLine+  j + newLine +  beginning2 + period);	
		
		
		
	}
	}
}
