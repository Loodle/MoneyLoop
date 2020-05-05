import java.util.Scanner;
import java.text.DecimalFormat;
public class TestField {
    public static void main(String[] args) {
        
        DecimalFormat res_s = new DecimalFormat("0.00");
        
        int qq = 1;
        while (qq == 1) {
        
        //balance
        double balance = 0;
        while (balance == 0 || balance < 0){
        Scanner my_balance_scan = new Scanner (System.in);
        System.out.println("How much do you want to deposit? ");
        String my_balance_s = my_balance_scan.nextLine();
        balance = Double.parseDouble(my_balance_s);
        }
        System.out.println("Your balance is " + balance + "!");
        
        //bet_amount
        int my_bet = 0;
        while (my_bet == 0 || my_bet < 0 || my_bet > balance) {
        Scanner my_bet_scan = new Scanner(System.in);
        System.out.println("How big would be your bet: ");
        String my_bet_s = my_bet_scan.nextLine();
        my_bet = Integer.parseInt(my_bet_s);
        if (my_bet > balance) {
            System.out.println("You do not have enough money");
        } else if (my_bet < 0) {
            System.out.println("Bet should be a positive number");
        }
        }
        
        //chance
        double my_chance = 0;
        while (my_chance == 0 || my_chance > 98 || my_chance < 0) {
        Scanner my_chance_scan = new Scanner (System.in);
        System.out.println("Input win percent here: ");
        String my_chance_s = my_chance_scan.nextLine();
        my_chance = Double.parseDouble(my_chance_s);
        if (my_chance < 0) {
            System.out.println("Accepts positive number only");
        } else if (my_chance > 98) {
            System.out.println("Accepts up to 98% probability only");
        }
        }
        System.out.println("Profit: " + res_s.format((98.98/my_chance * my_bet - my_bet)));
        
        
        //changeover
        Scanner my_changeover_scan = new Scanner (System.in);
        System.out.println("Do you choose proc Under " + my_chance + " or Over the " + res_s.format(99.99 - my_chance));
        String my_changeover = my_changeover_scan.nextLine();
        
        
        
        //iterations
        String my_choise = "kek";
        while (my_choise == "kek" && my_choise != "Yes" && my_choise != "No" && my_choise != "1" && my_choise != "2" && my_choise != "N" && my_choise != "Y") {
        Scanner my_choise_scan = new Scanner (System.in);
        System.out.println("Multiple bet? Yes|No: ");
        my_choise = my_choise_scan.nextLine();
        }
        
        //iteration_positive
        if (my_choise.contentEquals("Y") || my_choise.contentEquals("Yes") || my_choise.contentEquals("1")) {
        
        //iteration_amount
        int my_iterations = 0;
        while (my_iterations == 0 || my_iterations < 0) {
        Scanner my_iterations_scan = new Scanner (System.in);
        System.out.println("Input amount of iterations: ");
        String my_iterations_s = my_iterations_scan.nextLine();
        my_iterations = Integer.parseInt(my_iterations_s);
        }
        while (balance >= my_bet && my_iterations > 0) {
            double res = Math.random()*100;
            
            //Under_Multiple
            if (my_changeover.contentEquals("Under") || my_changeover.contentEquals("1")) {
            if (my_chance > res) {
                balance = balance + (98.98/my_chance * my_bet - my_bet);
                my_iterations = my_iterations - 1;
                System.out.println("Win! Balance: " + res_s.format(balance) + " xBet: " + res_s.format(98.98/my_chance) + " My chance: " + res_s.format(my_chance) + " Proc: " + res_s.format(res));
            } else if (my_chance <= res) {
                balance = balance - my_bet;
                my_iterations = my_iterations - 1;
                System.out.println("Lose. Balance: " + res_s.format(balance) + " Proc: " + res_s.format(res) + " Chance: " + res_s.format(my_chance));
            }
            }
            
            //Over_Multiple
            else if (my_changeover.contentEquals("Over") || my_changeover.contentEquals("2")) {
                double my_chance_1 = 99.99 - my_chance;
                if (my_chance_1 < res) {
                balance = balance + ((98.98/8.08)/my_chance * my_bet - my_bet);
                my_iterations = my_iterations - 1;
                System.out.println("Win! Balance: " + res_s.format(balance) + " xBet: " + res_s.format(98.98/my_chance) + " My chance: " + res_s.format(my_chance_1) + " Proc: " + res_s.format(res));
            } else if (my_chance_1 >= res) {
                balance = balance - my_bet;
                my_iterations = my_iterations - 1;
                System.out.println("Lose. Balance: " + res_s.format(balance) + " Proc: " + res_s.format(res) + " Chance: " + res_s.format(my_chance_1));
            }
            }
            
        }  
        
        //iteration_negative
        } else if (my_choise.contentEquals("N") || my_choise.contentEquals("No") || my_choise.contentEquals("2") || my_choise.isBlank()) {
            double res = Math.random()*100;
            
            //Under_single
            if (my_changeover.contentEquals("Under") || my_changeover.contentEquals("1")) {
            if (my_chance >= res) {
                balance = balance + (98.98/my_chance * my_bet - my_bet);
                System.out.println("Win! Balance: " + res_s.format(balance) + " xBet: " + res_s.format(98.98/my_chance) + " My chance: " + res_s.format(my_chance) + " Proc: " + res_s.format(res));
            } else if (my_chance < res) {
                balance = balance - my_bet;
                System.out.println("Lose. Balance: " + res_s.format(balance) + " Proc: " + res_s.format(res) + " Chance: " + res_s.format(my_chance));
            } 
            }
            //Over_single
            else if (my_changeover.contentEquals("Over") || my_changeover.contentEquals("2")) {
                double my_chance_1 = 99.99 - my_chance;
                if (my_chance_1 <= res) {
                balance = balance + (98.98/my_chance * my_bet - my_bet);
                System.out.println("Win! Balance: " + res_s.format(balance) + " xBet: " + res_s.format(98.98/my_chance) + " My chance: " + res_s.format(my_chance_1) + " Proc: " + res_s.format(res));
            } else if (my_chance_1 > res) {
                balance = balance - my_bet;
                System.out.println("Lose. Balance: " + res_s.format(balance) + " Proc: " + res_s.format(res) + " Chance: " + res_s.format(my_chance_1));
            } 

            }
            
        }
        }
    }
}
