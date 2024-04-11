package com.task;

public class HighScorePosition {

	public static void main(String[] args) {
		int score=1500;
		displayHighScorePosition("player1",calculateHighScorePosition(score));
		score=900;
		displayHighScorePosition("player2",calculateHighScorePosition(score));
		score=400;
		displayHighScorePosition("player3",calculateHighScorePosition(score));
		score=50;
		displayHighScorePosition("player4",calculateHighScorePosition(score));
	}
	Public static void displayHighScorePosition(String playerName,int position)
	{
		System.out.println(playerName +"managed to get in to position "+position +"on the high score table");
	}
	public static int calculateHighScorePosition(int playerScore)
	{
		if(playerscore>=1000)
		{
			return 1;
		}
		else if(playerscore>=500)
		{
			return 2;
		}
		else if(playerscore>=100)
			{
			return 3;
			}
			else
			{
				return 4;
			}
	
			}
			
		
		

	}

}
