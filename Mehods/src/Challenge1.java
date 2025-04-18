//In this challenge we're going to create two methods:
//The first method should be named displayHighScorePosition.
//This method should have two parameters, one for a player's name, and one for a player's position in a high score list.
//This method should print a message like "Tim managed to get into position 2 on the high score list".
//The second method should be named calculateHighScorePosition.
//This method should have only one parameter, the player's score.
//This method should return a number between 1 and 4, based on the score values shown in this table.
//        Finally, we'll call both methods and display the results for the following scores: 1500, 1000, 500, 100, and 25.


public class Challenge1 {
    public static int calhs(int score){
        if(score>=1000){
            return 1;
        }else if(score >=500){
            return 2;
        }else if(score>=100){
            return 3;
        }else{
            return 4;
        }
    }

    public static void displayhsposition(String pname,int pos){
        System.out.println(pname+" manages to get "+pos+" on the list.");
    }


    public static void main(String[] args) {
        displayhsposition("a",calhs(500));
        displayhsposition("b",calhs(180));
        displayhsposition("c",calhs(1500));
    }
}
