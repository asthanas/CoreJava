package com.zoomin;

public class MathodChallangeMain {

	public static void main(String[] args) {
		int pos1 = calculateHighScorePosition(1500);
		displayHighScorePostion("Saurabh",pos1);	
		int pos2 = calculateHighScorePosition(900);
		displayHighScorePostion("Supriya",pos2);
		int pos3 = calculateHighScorePosition(400);
		displayHighScorePostion("Viraj",pos3);
		int pos4 = calculateHighScorePosition(50);
		displayHighScorePostion("Asthana",pos4);
	}
	public static void displayHighScorePostion(String name, int position) {
		System.out.println(name + " Managed to get into position " +position+ " on the high score table");
	}
	
	public static int calculateHighScorePosition(int pScore) {
		if(pScore > 1000) {
			return 1;
		}
		else if(pScore >= 500 && pScore < 1000) {
			return 2;
		}
		else if(pScore > 100 && pScore < 500) {
			return 3;
		}
		else 
			return 4;
	}
}
