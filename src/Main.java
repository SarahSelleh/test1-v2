import java.util.Scanner;
public class Main{
    static double calculatePayMonthlyWorker(int noWorker){
        double tSalary = 2000 * noWorker;
        return tSalary;
    }
    static double calculatePayHourlyWorker(int noWorker, int hourWork){
        double tSalary;
        if (hourWork <= 40){
            tSalary = noWorker * hourWork * 30;
        }
        else{
            tSalary = noWorker * (30*40 + (hourWork-40)*(1.5*30));
        }
        return tSalary;
    }
    static double calculatePayCommWorker(int noWorker, double wSales){
        double tSalary = noWorker*(500 + (0.055*wSales));
        return tSalary;
    }
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        boolean code1,code2,code3;
        code1 = code2 = code3 = false;
        int noWorker, hourWork;
        double wSales,salary1,salary2,salary3;
        salary1 = salary2 = salary3 = 0;
        System.out.println("Welcome MagicCopy Sdn. Bhd.");
        while (true){
            System.out.print("Enter pay code: ");
            int code = scan.nextInt();

            if (code == -1){
                break;
            }
            switch (code) {
                case 1:
                    if (code1){
                        System.out.println("The monthly salary has been calculated!");
                    }
                    else{
                        System.out.print("Enter the number of workers: ");
                        noWorker = scan.nextInt();
                        salary1 = calculatePayMonthlyWorker(noWorker);
                        System.out.printf("Salary is RM%.2f\n",salary1);
                        code1 = true;
                    }
                    break;
                case 2:
                    if (code2){
                        System.out.println("The monthly salary has been calculated!");
                    }
                    else{
                        System.out.print("Enter the number of workers: ");
                        noWorker = scan.nextInt();
                        System.out.print("Enter the number of hours worked: ");
                        hourWork = scan.nextInt();

                        salary2 = calculatePayHourlyWorker(noWorker,hourWork);
                        System.out.printf("Salary is RM%.2f\n",salary2);
                        code2 = true;
                    }
                break;
                case 3:
                    if (code3){
                        System.out.println("The monthly salary has been calculated!");
                    }
                    else{
                        System.out.print("Enter the number of workers: ");
                        noWorker = scan.nextInt();
                        System.out.print("Enter the amount of sales weekly: ");
                        wSales = scan.nextDouble();

                        salary3 = calculatePayCommWorker(noWorker,wSales);
                        System.out.printf("Salary is RM%.2f\n",salary3);
                        code3 = true;
                    }
                    break;
                default:
                    System.out.println("Invalid code!");
                    break;
            }

        }
        double totalSalary = salary1 + salary2 + salary3;
        System.out.println("-------------------------------------------");
        System.out.printf("Total Salaries need to be paid = RM%.2f\n",totalSalary);
        System.out.println("-------------------------------------------");
        System.out.println("Thank You MagicCopy Sdn. Bhd.");
    }
}