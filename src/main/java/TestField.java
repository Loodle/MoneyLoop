import java.util.Scanner;
import java.text.DecimalFormat;
public class TestField {
    public static void main(String[] args) {
        
        int qq = 1;
        
        while (qq == 1) {
        //amount
        Scanner my_bet_scan = new Scanner(System.in);
        System.out.println("Put your cash here: ");
        String my_bet_s = my_bet_scan.nextLine();
        int my_bet = Integer.parseInt(my_bet_s);
        
        //chance
        Scanner my_chance_scan = new Scanner (System.in);
        System.out.println("Input win percent here: ");
        String my_chance_s = my_chance_scan.nextLine();
        double my_chance = Double.parseDouble(my_chance_s);
            System.out.println("Profit: " + (99.49995/my_chance * my_bet - my_bet) );
        
        //iterations
        Scanner my_choise_scan = new Scanner (System.in);
        System.out.println("Multiple bet? Yes|No: ");
        String my_choise = my_choise_scan.nextLine();
        
        if (my_choise.contains("Y")) {
        Scanner my_iterations_scan = new Scanner (System.in);
        System.out.println("Input amount of iterations: ");
        String my_iterations_s = my_iterations_scan.nextLine();
        int my_iterations = Integer.parseInt(my_iterations_s);
            int iii = 1;
            System.out.println(iii);
        } else {
            int eee = 1;
        }
        
        double balance = 1000;
        DecimalFormat res_s = new DecimalFormat("0.00");
        
        
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
        }
    }
    }
}
