package MoneyLoop;

import java.util.Scanner;
public class MoneyLoop {
    public static void main(String[] args) {
        
        Scanner my_bet_scan = new Scanner(System.in);
        System.out.println("How much are you risky today, honey? Put yo cash here:");
        String my_bet_s = my_bet_scan.nextLine();
        int my_bet = Integer.parseInt(my_bet_s);
        
        int balance = 1000;
        int y = 0;
        int q = 8192;
        
        //main loop
        while (balance >= my_bet && balance < 229000) {
            double m_d = Math.random();
            
            
            
            while (m_d >= 0.5){
            if (y == 0) {
                balance = balance + my_bet;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (y == 1) {
                balance = balance + my_bet * 2 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (y == 2) {
                balance = balance + my_bet * 4 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (m_d >= 0.5 && y == 3) {
                balance = balance + my_bet * 8 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (m_d >= 0.5 && y == 4) {
                balance = balance + my_bet * 16 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (m_d >= 0.5 && y == 5) {
                balance = balance + my_bet * 32 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (m_d >= 0.5 && y == 6) {
                balance = balance + my_bet * 64 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (m_d >= 0.5 && y == 7) {
                balance = balance + my_bet * 128 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (m_d >= 0.5 && y == 8) {
                balance = balance + my_bet * 256 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (m_d >= 0.5 && y == 9) {
                balance = balance + my_bet * 512 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (m_d >= 0.5 && y == 10) {
                balance = balance + my_bet * 1024 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            else if (m_d >= 0.5 && y == 11) {
                balance = balance + my_bet * 2048 ;
                y = 0;
                System.out.println("Win, balance:" + balance);
            }
            }
            
            while {
            else if (balance >= my_bet && m_d < 0.5 && y == 0) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
                
            }
            else if (balance >= my_bet * 2 && m_d < 0.5 && y == 1) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 2;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
                
            }
            else if (balance >= my_bet * 4 && m_d < 0.5 && y == 2) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 4;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
                
            }
            else if (balance >= my_bet * 8 && m_d < 0.5 && y == 3) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 8;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
                
            }
            else if (balance >= my_bet * 16 && m_d < 0.5 && y == 4) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 16;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * 32 && m_d < 0.5 && y == 5) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 32;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * 64 && m_d < 0.5 && y == 6) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 64;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * 128 && m_d < 0.5 && y == 7) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 128;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * 256 && m_d < 0.5 && y == 8) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 256;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * 512 && m_d < 0.5 && y == 9) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 512;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * 1024 && m_d < 0.5 && y == 10) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 1024;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * 2048 && m_d < 0.5 && y == 11) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 2048;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * 4096 && m_d < 0.5 && y == 11) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 4096;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * 8192 && m_d < 0.5 && y == 11) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * 8192;
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * (q * 2) && m_d < 0.5 && y == 11) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * (q * 2);
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * (q * 4) && m_d < 0.5 && y == 11) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * (q * 4);
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            else if (balance >= my_bet * (q * 8) && m_d < 0.5 && y == 11) {
                my_bet = Integer.parseInt(my_bet_s);
                balance = balance - my_bet * (q * 8);
                y = y + 1;
                System.out.println("Lose, balance:" + balance);
            }
            }
            
            while (balance < my_bet){
                System.out.println("You can't bet lol, go jerk yourself!");
            }
            }
            
            //ending
             if (balance <= my_bet){
                 System.out.println("Go back to work, idiot!");
             } else {
                 System.out.println("You're the winner!");
             }
}
}