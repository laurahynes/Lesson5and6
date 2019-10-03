package Lesson6;

import java.util.Scanner;

public class PayrollInterface {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp;
        String name;
        int type;
        double rate;
        int hours;        

        while (true) {
            emp = new Employee();
            //ask for name
            System.out.println("Enter data for new Employee\n==================\n");
            System.out.print("  >>  Name or <enter> to quit ");
            name = scan.nextLine();
            //try to set name, if fail get out of program
            if (emp.setName(name) == false) {
                break;
            }
            //if no break fill in rest of data for employee
            //type
            while (true) {
                System.out.print("  >>  Type: (" + emp.getTypeRules() + "): ");
                type = scan.nextInt();
                if (emp.setType(type)) {
                    break;
                }

            }
            //rate
            while (true) {
                System.out.print("  >>  Rate: (" + emp.getRateRules() + "): ");
                rate = scan.nextDouble();
                if (emp.setRate(rate)) {
                    break;
                }

            }
            //hours
            while (true) {
                System.out.print("  >>  Hours: (" + emp.getHourRules() + "): ");
                hours = scan.nextInt();
                if (emp.setHours(hours)) {
                    break;
                }

            }
            //when i get to here the employee has all VALID data set to its properties
            //print the pay
            System.out.println("");
            System.out.format("Weekly pay for %s is $%.2f\n", emp.getName(), emp.getPay());
            System.out.println("");
            scan.nextLine();
        }
        System.out.println("Program Ended");

    }

}
/*
Testing Log
Attempt              Data              Expected           Actual
=======              ====              ========           ======
1                    type=0            Type not set       Type not set
2                    type=1            Type set           Type set
3                    type=2            Type set           Type set
4                    type=3            Type not set       Type not set
5                    rate=6.74         Rate not set       Rate not set
6                    rate=6.75         Rate set           Rate set
7                    rate=30.50        Rate set           Rate set
8                    rate=30.51        Rate not set       Rate not set
9                    hours=-1          Hours not set      Hours not set
10                   hours=0           Hours not set      Hours not set
11                   hours=1           Hours set          Hours set
12                   hours=59          Hours set          Hours set
13                   hours=60          Hours set          Hours set
14                   hours=61          Hours not set      Hours not set
15                   type=-1000        Type not set       Type not set
16                   type=1000         Type not set       Type not set
17                   rate=-100         Rate not set       Rate not set
18                   rate=100          Rate not set       Rate not set
19                   hours=-100        Hours not set      Hours not set
20                   hours=100         Hours not set      Hours not set
*/ 