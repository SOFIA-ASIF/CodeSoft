import java.util.Scanner;
import java.util.Random;
class numberGame {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Random random = new Random();
        Boolean confirmation = true;
        int score = 0;
        while(confirmation){
        for(int i = 0; i < 6; i++){
        
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        int guessNumber = myObj.nextInt();
        if(i == 5){
            System.out.println("You run out of attempts");
                        System.out.println("Your score is: 0");

            break;
        }
        if(randomNumber == guessNumber){
            System.out.println("Your guess is correct!! Congratulations:)");
            if(i==0)
            score = 100;
            else if(i == 1)
                        score = 80;
             else if(i == 2)
                        score = 60 ;           
 else if(i == 3)
                        score = 40;
                        else if(i == 4)
                        score = 20;
            System.out.println("Your score out of 100 is:" + score);
            break;
        }else if(randomNumber > guessNumber){
            System.out.println("Your Guess is too low");
        }else if(randomNumber < guessNumber){
            System.out.println("Your guess is too High");
        } 
       
}

        System.out.println("Do you want to play again? (true/false). Default will be false");
try {
                confirmation = myObj.nextBoolean();
            } catch (Exception e) {
                confirmation = false;
                myObj.nextLine(); 
            }    
        
    }
}
}