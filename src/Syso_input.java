import java.util.Scanner;
public class Syso_input {
public static void main(String[] args) {
	
	int spicyMemes = 1;
	String randMemeAdjective = "spicy";
	
	Scanner s = new Scanner(System.in);
	System.out.println("Pick a number between 1 and 4");
	String resp = s.next();
	switch(resp){
	case "1":
		randMemeAdjective = ("spicy");
		break;
	case "2":
		randMemeAdjective = ("dank");
		break;
	case "3":
		randMemeAdjective = ("zesty");
		break;
	case "4":
	randMemeAdjective = ("bitter");
		break;
	
	}
	System.out.println("There is a door blocking your path to the throne, it requires 5 " + randMemeAdjective + " memes to open.");
	resp = s.nextLine();
	while(spicyMemes < 5){
	switch(resp){
	case "dat boi":
		spicyMemes++;
		System.out.println("That's " + (spicyMemes-1) + "!" + "\n                                            ,╓╖╗╗╗╣╣▄╦,                          \n                                  ,╓╦╗╬╣╬▓▓▓▓▓▓▓▓▓▓█▓▓▌⌐                        \n                                ╣▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓µ                       \n                                ▀█████▓▓▓▓▓▓▓▓▓▓▓██████▓▓▄                      \n                                 ▀███████████▓▓▓▓█████████▓µ                    \n                                  ╙██████████████▓▓▓▓▓▓▓▓▓▓▓⌐                   \n                                    ▓████████████████▓▓▓▓▓▓▓▌                   \n                                     ╙█████████████████▓▓▓▓▓▓▒                  \n                                       ▐██████████████▓▓▓▓▓▓▓▓µ                 \n                                        ╫███████████▓▓▓▓▓▓▓▓▓▓▓⌐                \n                                        ╫███████████▓▓▓▓▓▓▓▓▓▓█▓⌐               \n                                       ▄████████████▓▓▓▓▓▓▓▓▓███▓               \n                                     ╓▓▓█████████████████▓▓▓▓▓███▓              \n                             ,,╗▄▓▓▓▓█▓███████████████████▓▓▓▓▓▓▓█▓⌐            \n                       ,╓╓╦╬▓▓▓▓█████████▀╠████████▓▓▓██████▓▓▓▓▓▓█▓            \n                  ╓╦╣▓▓▓▓▓▓▓▓▓▓███████▀`  ╫█████▓▓▓▓▓▓▓█▓▓████▓▓▓▓▓█▄,,╓▄       \n              ╥╬▓▓▓▓▓▓▓▓▓▓██████▓▀▀▀      ▓████▓▓▓▓▓▓▓▓█████▓▓█▓▓▓▓▓▓▓▓▀        \n          ,╗╣▓▓▓▓▓████████▀▀╙            ]█████▓▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓██╨          \n  ╦▄▄▄▓▓▓▓▓▓███▀▀▀▀▀▀╙                   ║████▓▓▓▓▓▓▓███████▓▓▓▓▓███▓           \n  ╙╙▀▀████████▀                          ║███████▓▓▓████████▓▓▓█████▌           \n      ╙╙`╙▀▀                             '██████████████████████▓▓▓█Ö           \n                                          ╠█████████████████████▓▓▓▓▌⌐          \n                                         ,▓██████████████████████▓▓▓▓▓ç         \n                                        ╓▓███████████████████████▓▓▓▓▓▓▓╦       \n                                       ╬██████████████████████████▓▓▓▓▓▓▓µ      \n                                      ╫███████████████████████████▓▓▓▓▓▓█▓▄     \n                                     ▓████████████████████████████▓▓▓▓▓▓▓██µ    \n                                    ▓███████████████▀▀▀▓███████████▓▓▓▓▓▓▓█▌    \n                                   ╫█████████████▀▄▓███████████████▓▓▓▓▓▓▓▓█∩   \n                                 ▄▓██████████▀▐▄████████████████████▓▓▓▓▓▓▓█▄   \n                               ,▓███████▀▀    ╫██████▓██▓▓▀▀▀▀▀▀▀▀▓█▓▓▓▓▓███▌   \n                               ╣██████▒               ▓▓          ▓█▓▓▓▓███▀   \n                              ╓▓▓▓█████╕              ▓▓           `▓█▓▓▓███∩   \n                               ▓█▓▓▓████▄             ▓▌            └▓▓▓▓███    \n                                ▀██▓▓▓████Q          ▐▓▌            ╓▓▓▓▓██▌    \n                                 `▀▓███████▄         ╠╬▌           ║▓▓▓▓▓▓█∩    \n                                    ╙▀██▓███▓╕     ╓╬▓▌╬╬⌐        ╔▓▓▓▓▓▓▓█∩    \n                                       ╙▀▓████▌▄▄▄▄▓▓█▄╬╬▄,      ,▓▓▓▓▓▓███∩    \n                                          ▐▓███████████▒▓███▓▄,  ╬█▓▓▓▓▓██▌     \n                                        ╓▄█████████████▒▓███████▄▓▓▓▓▓▓███∩     \n                                      ╗▓█████████████▌╠╬▓█████████▓▓▓▓▓██▓      \n                                    ╓▓█████████▄▓██▓█▒╫╬▓▌█Ü▀████▓▓▓▓▓███∩      \n                                   ▄█████████████▓▓██Ö╠╬▓█▀  .▓██▓▓▓▓███▌       \n                                 .▓████▓█╨  ╙██▌ ╠▓█▓ ╠╬█▓   ╫▓▓█▓▓▓▓███∩       \n                                ╓▓███▓█▓▓,   ╙██µ╠▓▓█⌐▌╬█∩  ╬█▀▓▓▓▓▓████        \n                               ╓▓███▓██▄▒▀▄    ██╠╬▓▓⌐▌╫▌  ▄█╨╓█▓▓▓▓████▌       \n                               ▓███▓█▀ ╙▀▓▄▓▄   ▓▓╬╫█µ╬▌  ▄▌  ╠█▓▓▓██████∩      \n                              ║████▓▌     ╙▓█▓⌐ ²█▓▓█▄╬▓╦▓▌  ╓▓▓▓▓▓██████▌      \n                              ████▓█▀▄▄,     ▀█▄ ╠████╬▓█▌ ╓▓▓▓▓▓▓██▀█████      \n                             ╓████▓█▓▄▄▓▓▓▄▄   ╙█▓▓█▓█╬▓▓▄▓╨ ╓▓▓▓██▓▓█████      \n                             ╠███▓█▒    ╙╙▀▀▓▓▓▄▓▓████╬▓█▄▄▄▄▓▓▓▓█▓╝╝█████      \n                             ▓███▓█           ;▓▓████▌▒▒╬╬▌╙╠▓▓▓█▓   █████      \n                             ▓███▓█╦▄▄╣▀▓▓███▓▀▀▒▓█████▓▓▀▓▓▓▓▓▓█▒  ┌█████      \n                             ▓███▓█▄▄╣▀▀▀`'  ,▄▓▀▓█████▒▓▄µ╠▓▓▓██▓▀▀▓████▌      \n                             ▀███▓█▌      ,▄██▀╓▓█╢███▓▒▌ ▀█▓▓██╨╙▀▀█████▒      \n                             ]██████   ╓▄▓▓▓╨ ╓██Ü▓█▓██▒▓▌╠▓▓▓█▒   ▄████▓       \n                              ▓███▓█▌▓▀▀▓▓╨  ▄██∩╔█▌╫█▓╬▓█▓▓▓█▓▀▄ ╓█████∩       \n                              ╚██████▄▓▀   ,▓▓▓  ▓█▒]█▓╫▒█▓▓▓█∩ `▓█████▀        \n                               ▀████▓█╦   ╓▓▄▓  ╫▓▓ ]█▓╫Q╣▓▓█▀  ▄█████▀         \n                                ▓██████▄ ╬▓▄▓  ╓█▓▌ ]█▌╫▒▓▓▓█▄╓▓█████▌          \n                                 ▀███████▌▓▓   ▓▌▓∩  ▓▒╬▄▓█▓▓▓▓▓████▀           \n                                  ╙████████▄  ╓█╢▌   ▓▓███████████▀▀Θ           \n                                    ▀██████████▓▓▄,╓▄████████████╨             \n                                      ▀███████████████████████▀╨                \n                                        ╙▀█████████████████▀╙                   \n                                            ╙╙▀▀▓██▀▀▀▀▀                       ");
		resp = s.nextLine();
		break;
	case "pepe":
		spicyMemes++;
		System.out.println("That's " + (spicyMemes-1) + "!" + " \n_______████████__██████\n_________█░░░░░░░░██_██░░░░░░█\n________█░░░░░░░░░░░█░░░░░░░░░█\n_______█░░░░░░░███░░░█░░░░░░░░░█\n_______█░░░░███░░░███░█░░░████░█\n______█░░░██░░░░░░░░███░██░░░░██\n_____█░░░░░░░░░░░░░░░░░█░░░░░░░░███\n____█░░░░░░░░░░░░░██████░░░░░████░░█\n____█░░░░░░░░░█████░░░████░░██░░██░░█\n___██░░░░░░░███░░░░░░░░░░█░░░░░░░░███\n__█░░░░░░░░░░░░░░█████████░░█████████\n█░░░░░░░░░░█████_████████_█████_█\n█░░░░░░░░░░█___█_████___███_█_█\n█░░░░░░░░░░░░█_████_████__██_██████\n░░░░░░░░░░░░░█████████░░░████████░░░█\n░░░░░░░░░░░░░░░░█░░░░░█░░░░░░░░░░░░█\n░░░░░░░░░░░░░░░░░░░░██░░░░█░░░░░░██\n░░░░░░░░░░░░░░░░░░██░░░░░░░███████\n░░░░░░░░░░░░░░░░██░░░░░░░░░░█░░░░░█\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n░░░░░░░░░░░█████████░░░░░░░░░░░░░░██\n░░░░░░░░░░█▒▒▒▒▒▒▒▒███████████████▒▒█\n░░░░░░░░░█▒▒███████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\n░░░░░░░░░█▒▒▒▒▒▒▒▒▒█████████████████\n░░░░░░░░░░████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\n░░░░░░░░░░░░░░░░░░██████████████████\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\n██░░░░░░░░░░░░░░░░░░░░░░░░░░░██\n▓██░░░░░░░░░░░░░░░░░░░░░░░░██\n▓▓▓███░░░░░░░░░░░░░░░░░░░░█\n▓▓▓▓▓▓███░░░░░░░░░░░░░░░██\n▓▓▓▓▓▓▓▓▓███████████████▓▓█\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█");
		resp = s.nextLine();
		break;
	case "rick harrison":
		spicyMemes++;
		System.out.println("That's " + (spicyMemes-1) + "!");
		resp = s.nextLine();
		break;
	case "cory in the house":
		spicyMemes++;
		System.out.println("That's " + (spicyMemes-1) + "!");
		resp = s.next();
		break;
	case "clippy":
		spicyMemes++;
		System.out.println("That's " + (spicyMemes-1) + "!" + "\n __ \n/  \\        _____________ \n|  |       /             \\\n@  @       | It looks    |\n|| ||      | like you    |\n|| ||   <--| are writing |\n|\\_/|      | a letter.   |\n\\___/      \\_____________/");
		resp = s.next();
		break;
	case "keemstar":
		spicyMemes++;
		System.out.println("That's " + (spicyMemes-1) + "!");
		resp = s.next();
		break;
	case "note 7":
		spicyMemes++;
		System.out.println("That's " + (spicyMemes-1) + "!");
		resp = s.next();
		break;
	case "exploding note 7":
		spicyMemes++;
		System.out.println("That's " + (spicyMemes-1) + "!");
		resp = s.next();
		break;
	case "1":
		break;
	case "2":
		break;
	case "3": 
		break;
	case "4":
		break;
	default:
		System.out.println("That's not " + randMemeAdjective + " enough!");
		resp = s.nextLine();
	}
	}
	if(spicyMemes == 5){
		System.out.println("You've done it! The memes have been returned you have regained your throne as the AllMighty Meme God!");
	}
}
}