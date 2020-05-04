import java.util.Scanner;
import java.text.DecimalFormat;
public class TestField {
    public static void main(String[] args) {
        
        int qq = 1;
        DecimalFormat res_s = new DecimalFormat("0.00");
        while (qq == 1) {
            
            
        double balance = 1000;
        int my_bet = 0;
        
        //amount
        while (my_bet == 0) {
        Scanner my_bet_scan = new Scanner(System.in);
        System.out.println("Put your cash here: ");
        String my_bet_s = my_bet_scan.nextLine();
        my_bet = Integer.parseInt(my_bet_s);
        if (my_bet > balance) {
            System.out.println("You do not have enough money");
        }
        }
        
        
        
        double my_chance = 0;
        
        //chance
        while (my_chance == 0 || my_chance > 98 || my_chance < 0) {
        Scanner my_chance_scan = new Scanner (System.in);
        System.out.println("Input win percent here: ");
        String my_chance_s = my_chance_scan.nextLine();
        my_chance = Double.parseDouble(my_chance_s);
        
        if (my_chance < 0) {
            System.out.println("Accepts positive number only");
        } else if (my_chance > 100) {
            System.out.println("Accepts up to 98% probability only");
        }
        }
        System.out.println("Profit: " + res_s.format((99.49995/my_chance * my_bet - my_bet)));
        
        
        //iterations
        Scanner my_choise_scan = new Scanner (System.in);
        System.out.println("Multiple bet? Yes|No: ");
        String my_choise = my_choise_scan.nextLine();
        
        
        if (my_choise.contentEquals("Y") || my_choise.contentEquals("Yes") || my_choise.contentEquals("1")) {
        
        Scanner my_iterations_scan = new Scanner (System.in);
        System.out.println("Input amount of iterations: ");
        String my_iterations_s = my_iterations_scan.nextLine();
        int my_iterations = Integer.parseInt(my_iterations_s);
        
        while (balance >= my_bet && my_iterations > 0) {
            double res = Math.random()*100;
            if (my_chance >= res) {
                balance = balance + (99.49995/my_chance * my_bet - my_bet);
                my_iterations = my_iterations - 1;
                System.out.println("Win! Balance: " + res_s.format(balance) + " xBet: " + 99.49995/my_chance + " My chance: " + res_s.format(my_chance) + " Proc: " + res_s.format(res));
            } else if (my_chance < res) {
                balance = balance - my_bet;
                my_iterations = my_iterations - 1;
                System.out.println("Lose. Balance: " + res_s.format(balance) + " Proc: " + res_s.format(res) + " Chance: " + res_s.format(my_chance));
            }
        }
    } else if (my_choise.contentEquals("N") || my_choise.contentEquals("No") || my_choise.contentEquals("2") || my_choise.isBlank()) {
            double res = Math.random()*100;
            if (my_chance >= res) {
                balance = balance + (99.49995/my_chance * my_bet - my_bet);
                System.out.println("Win! Balance: " + res_s.format(balance) + " xBet: " + res_s.format(99.49995/my_chance) + " My chance: " + res_s.format(my_chance) + " Proc: " + res_s.format(res));
            } else if (my_chance < res) {
                balance = balance - my_bet;
                System.out.println("Lose. Balance: " + res_s.format(balance) + " Proc: " + res_s.format(res) + " Chance: " + res_s.format(my_chance));
            }
        }
        }
            
    }
}
