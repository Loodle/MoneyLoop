import java.util.Scanner;
public class Roll {
    public static void main(String[] args) {
        
        Scanner my_bet_scan = new Scanner(System.in);
        System.out.println("How much are you risky today, honey? Put cash here:");
        String my_bet_s = my_bet_scan.nextLine();
        int my_bet = Integer.parseInt(my_bet_s);
        
        int balance = 10000;
        
        
        //main loop
        while (balance > my_bet && balance < 1000000) {
            double m_d = Math.random();
            
            if (m_d < 0.5) {
                balance = balance - my_bet;
                System.out.println("Lose! Balance is: " + balance + "$");
            } else {
                balance = balance + my_bet;
                System.out.println("Win! Balance is: " + balance + "$");
            }
        }
        
        
        //ending
             if (balance <= my_bet){
                 System.out.println("Go work, idiot!");
             } else {
                 System.out.println("You're a millionaire!");
             }
}
           
}
