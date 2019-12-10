package com.zoomin;

public class MethodMain {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
		System.out.println("Your Last final Score " +highScore);
		
	    highScore = calculateScore(true,10000,8,200);
	    System.out.println("Your Last final Score " +highScore);
	    
	    
	}
	/*public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
	
		if(gameOver) {
			int finalScore = score + (levelCompleted + bonus);
			finalScore += 1000;
			System.out.println("Your Last final Score " +finalScore);
		}
	}*/
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if(gameOver) {
			int finalScore = score + (levelCompleted + bonus);
			finalScore += 1000;
			//System.out.println("Your Last final Score " +finalScore);
			return finalScore;
		}
		else {
			return -1; //indicates an error, value not available
		}
	}
	
}
