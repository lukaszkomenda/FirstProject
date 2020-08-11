package CodeWars;

public class Solution {
    public int solution(int number) {
        //TODO: Code stuff here

        int counter = 0;
        int multipier = 1;
        int numberThree = 3;
        int numberFive = 5;

        if (number < numberThree){
            return counter;
        } else if (number == numberThree){
            return numberThree;
        } else if (number == numberFive){
            return numberFive;
        } else {
            while ((numberThree * multipier) < number){
                counter += (numberThree * multipier);
                multipier++;
            }

            multipier = 1;

            while ((numberFive * multipier) < number){
                counter += (numberFive * multipier);
                multipier++;
            }

            return counter;
        }


    }
}
