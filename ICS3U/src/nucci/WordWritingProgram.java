package nucci;

import java.util.Scanner;

public class WordWritingProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean playAgain = false;
		String userInput = "";

		do {
			System.out.println("Please enter a word:");
			drawWord(scan.nextLine());
			System.out.println("More?");
			userInput = scan.nextLine();
			if (userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("Y")) {
				playAgain = true;
			} else {
				playAgain = false;
			}
		} while (playAgain);
	}

	public static void drawWord(String word) {
		char[] charWord = word.toCharArray();

		for (int i = 0; i < charWord.length; i++) {
			if (charWord[i] == 'A' || charWord[i] == 'a') {
				drawA();
			} else if (charWord[i] == 'B' || charWord[i] == 'b') {
				drawB();
			} else if (charWord[i] == 'C' || charWord[i] == 'c') {
				drawC();
			} else if (charWord[i] == 'D' || charWord[i] == 'd') {
				drawD();
			} else if (charWord[i] == 'E' || charWord[i] == 'e') {
				drawE();
			} else if (charWord[i] == 'F' || charWord[i] == 'f') {
				drawF();
			} else if (charWord[i] == 'G' || charWord[i] == 'g') {
				drawG();
			} else if (charWord[i] == 'H' || charWord[i] == 'h') {
				drawH();
			} else if (charWord[i] == 'I' || charWord[i] == 'i') {
				drawI();
			} else if (charWord[i] == 'J' || charWord[i] == 'j') {
				drawJ();
			} else if (charWord[i] == 'K' || charWord[i] == 'k') {
				drawK();
			} else if (charWord[i] == 'L' || charWord[i] == 'l') {
				drawL();
			} else if (charWord[i] == 'M' || charWord[i] == 'm') {
				drawM();
			} else if (charWord[i] == 'N' || charWord[i] == 'n') {
				drawN();
			} else if (charWord[i] == 'O' || charWord[i] == 'o') {
				drawO();
			} else if (charWord[i] == 'P' || charWord[i] == 'p') {
				drawP();
			} else if (charWord[i] == 'Q' || charWord[i] == 'q') {
				drawQ();
			} else if (charWord[i] == 'R' || charWord[i] == 'r') {
				drawR();
			} else if (charWord[i] == 'S' || charWord[i] == 's') {
				drawS();
			} else if (charWord[i] == 'T' || charWord[i] == 't') {
				drawT();
			} else if (charWord[i] == 'U' || charWord[i] == 'u') {
				drawU();
			} else if (charWord[i] == 'V' || charWord[i] == 'v') {
				drawV();
			} else if (charWord[i] == 'W' || charWord[i] == 'w') {
				drawW();
			} else if (charWord[i] == 'X' || charWord[i] == 'x') {
				drawX();
			} else if (charWord[i] == 'Y' || charWord[i] == 'y') {
				drawY();
			} else if (charWord[i] == 'Z' || charWord[i] == 'z') {
				drawZ();
			} else if (charWord[i] == ' ') {
				drawSpace();
			} else {
				drawInvalid();
			}

		}

	}
	public static void drawA() {
		System.out.println("    A    ");// nine by five
		System.out.println("   A A   ");
		System.out.println("  AAAAA  ");
		System.out.println(" A     A ");
		System.out.println("A       A");
		System.out.println();
	}
	public static void drawB() {
		System.out.println("BBBBBB   ");// nine by five
		System.out.println("BB   BB  ");
		System.out.println("BBBBBB   ");
		System.out.println("BB   BB  ");
		System.out.println("BBBBBB   ");
		System.out.println();
	}
	public static void drawC() {
		System.out.println("  CCCCCC ");// nine by five
		System.out.println(" CC      ");
		System.out.println("CC       ");
		System.out.println(" CC      ");
		System.out.println("  CCCCCC ");
		System.out.println();
	}
	public static void drawD() {
		System.out.println("DDDDD    ");// nine by five
		System.out.println("DD  DD   ");
		System.out.println("DD   DD  ");
		System.out.println("DD  DD   ");
		System.out.println("DDDDD    ");
		System.out.println();
	}
	public static void drawE() {
		System.out.println("EEEEEEE  ");// nine by five
		System.out.println("EE       ");
		System.out.println("EEEEEE   ");
		System.out.println("EE       ");
		System.out.println("EEEEEEE  ");
		System.out.println();
	}
	public static void drawF() {
		System.out.println("FFFFFFFF ");// nine by five
		System.out.println("FF       ");
		System.out.println("FFFFF    ");
		System.out.println("FF       ");
		System.out.println("FF       ");
		System.out.println();
	}
	public static void drawG() {
		System.out.println(" GGGGGGG ");// nine by five
		System.out.println("G       G");
		System.out.println("G   GGG  ");
		System.out.println("G      GG");
		System.out.println(" GGGGGGG ");
		System.out.println();
	}
	public static void drawH() {
		System.out.println("HH     HH");// nine by five
		System.out.println("HH     HH");
		System.out.println("HHHHHHHHH");
		System.out.println("HH     HH");
		System.out.println("HH     HH");
		System.out.println();
	}
	public static void drawI() {
		System.out.println("IIIIII   ");// nine by five
		System.out.println("  II     ");
		System.out.println("  II     ");
		System.out.println("  II     ");
		System.out.println("IIIIII   ");
		System.out.println();
	}
	public static void drawJ() {
		System.out.println("JJJJJJJJ ");// nine by five
		System.out.println("   JJ    ");
		System.out.println("   JJ    ");
		System.out.println("JJ JJ    ");
		System.out.println(" JJJ     ");
		System.out.println();
	}
	public static void drawK() {
		System.out.println("KK  KKK ");// nine by five
		System.out.println("KK KK   ");
		System.out.println("KKK     ");
		System.out.println("KK KK   ");
		System.out.println("KK  KKK ");
		System.out.println();
	}
	public static void drawL() {
		System.out.println("LL       ");// nine by five
		System.out.println("LL       ");
		System.out.println("LL       ");
		System.out.println("LL       ");
		System.out.println("LLLLLLL  ");
		System.out.println();
	}
	public static void drawM() {
		System.out.println("MM     MM");// nine by five
		System.out.println("MM M M MM");
		System.out.println("MM  M  MM");
		System.out.println("MM     MM");
		System.out.println("MM     MM");
		System.out.println();
	}
	public static void drawN() {
		System.out.println("NNN    NN");// nine by five
		System.out.println("NN N   NN");
		System.out.println("NN  N  NN");
		System.out.println("NN   N NN");
		System.out.println("NN    NNN");
		System.out.println();
	}
	public static void drawO() {
		System.out.println("   OOO   ");// nine by five
		System.out.println(" OO   OO ");
		System.out.println("OO     OO");
		System.out.println(" OO   OO ");
		System.out.println("   OOO   ");
		System.out.println();
	}
	public static void drawP() {
		System.out.println("PPPPPP   ");// nine by five
		System.out.println("PP   PP  ");
		System.out.println("PPPPPP   ");
		System.out.println("PP       ");
		System.out.println("PP       ");
		System.out.println();
	}
	public static void drawQ() {
		System.out.println("   QQQ   ");// nine by five
		System.out.println(" QQ   QQ ");
		System.out.println("QQ  Q  QQ");
		System.out.println(" QQ   QQ ");
		System.out.println("   QQQ  Q");
		System.out.println();
	}
	public static void drawR() {
		System.out.println("PPPPPP   ");// nine by five
		System.out.println("PP   PP  ");
		System.out.println("PPPPPP   ");
		System.out.println("PP  RR   ");
		System.out.println("PP   RR  ");
		System.out.println();
	}
	public static void drawS() {
		System.out.println(" SSSSSS  ");// nine by five
		System.out.println("SS       ");
		System.out.println(" SSSSS   ");
		System.out.println("     SS  ");
		System.out.println("SSSSSS   ");
		System.out.println();
	}
	public static void drawT() {
		System.out.println("TTTTTTTTT");// nine by five
		System.out.println("   TTT   ");
		System.out.println("   TTT   ");
		System.out.println("   TTT   ");
		System.out.println("   TTT   ");
		System.out.println();
	}
	public static void drawU() {
		System.out.println("UU     UU");// nine by five
		System.out.println("UU     UU");
		System.out.println("UU     UU");
		System.out.println("UU     UU");
		System.out.println(" UUUUUUU ");
		System.out.println();
	}
	public static void drawV() {
		System.out.println("VV     VV");// nine by five
		System.out.println("VV     VV");
		System.out.println(" VV   VV ");
		System.out.println("  VV VV  ");
		System.out.println("   VVV   ");
		System.out.println();
	}
	public static void drawW() {
		System.out.println("WW     WW");// nine by five
		System.out.println("WW     WW");
		System.out.println("WW  W  WW");
		System.out.println("WW WWW WW");
		System.out.println(" WWW WWW ");
		System.out.println();
	}
	public static void drawX() {
		System.out.println("XX    XX ");// nine by five
		System.out.println(" XX  XX  ");
		System.out.println("  XXXX   ");
		System.out.println(" XX  XX  ");
		System.out.println("XX    XX ");
		System.out.println();
	}
	public static void drawY() {
		System.out.println("YY    YY  ");// nine by five
		System.out.println(" YY  YY   ");
		System.out.println("  YYYY    ");
		System.out.println("   YY    ");
		System.out.println("   YY    ");
		System.out.println();
	}
	public static void drawZ() {
		System.out.println("ZZZZZZZZZ");// nine by five
		System.out.println("     ZZZ ");
		System.out.println("   ZZZ   ");
		System.out.println(" ZZZ     ");
		System.out.println("ZZZZZZZZZ");
		System.out.println();
	}
	public static void drawSpace() {
		System.out.println();// nine by five
		System.out.println();
		System.out.println();
		System.out.println();
	}
	public static void drawInvalid() {
		System.out.println("#########");// nine by five
		System.out.println("#*******#");
		System.out.println("#*%%%%%*#");
		System.out.println("#*******#");
		System.out.println("#########");
		System.out.println();
	}

}
