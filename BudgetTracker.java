import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = "Ranjith";
        User user = new User(name);

        while(true){
            System.out.printf("Hello %s, What operation do you wants to perform?\n",name);

            int choice ;
            do{
                System.out.println("1. Update\n2. Show All Transactions\n3. Show All Incomes\n4. Show All Expenses\n5. Exit");
                System.out.print("Enter your choice : ");
                choice = scan.nextInt();
                System.out.println();

                if(choice < 1 || choice > 5){
                    System.out.println("Invalid option.......\nTRY AGAIN.........\n");
                }

            }while(choice < 1 || choice > 5);
            

            switch(choice){
                case 1:
                    int choi ;
                    do{
                        System.out.println("1. Income\n2. Expense");
                        System.out.print("Enter your choice : ");
                        choi = scan.nextInt();
                        if(choi < 1 || choi > 2){
                            System.out.println("Invalid option........\nTRY AGAIN........\n");
                        }
                    }while(choi < 1 || choi > 2);
                    
                    double amount ;
                    System.out.print("Enter the amount : ");
                    amount = scan.nextDouble();
                    scan.nextLine();

                    String memo;
                    System.out.print("Enter the memo : ");
                    memo = scan.nextLine();
                    // scan.nextLine();

                    if (choi == 1){
                        user.update("Income", amount, memo);
                    }
                    else{
                        user.update("Expense", -1*amount, memo);
                    }



                    break;

                case 2 :
                    user.showAllTransactions();
                    break;

                case 3:
                    user.showAllIncomes();
                    break;

                case 4:
                    user.showAllExpenses();
                    break;

                case 5:
                    System.out.println("THANK YOU FOR YOUR SERVICE :)");
                    System.exit(0);
                    
            }

        }
    }
    
}
