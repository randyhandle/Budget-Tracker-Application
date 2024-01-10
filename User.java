import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Transaction> transactions;
    

    public User(String name){
        this.name = name;
        this.transactions = new ArrayList<Transaction>();
    }

    public void update(String name , double amount, String memo){
        Transaction transaction = new Transaction(name, amount, memo);

        this.transactions.add(transaction);

        this.printBalance();
    }

    public void printBalance(){
        double balance = 0;

        for(Transaction t : this.transactions){
            balance += t.getAmount();
        }

        System.out.printf("\n%s's Current Budjet : ₹%.02f\n",this.name,balance);
        System.out.println();
    }

    public void showAllTransactions(){
        for(Transaction t : this.transactions){
            System.out.printf("%s : %s : %.02f : %s\n",t.getDate(),t.getName(),t.getAmount(),t.getMemo());
        }
        System.out.println();
    }

    public void showAllIncomes(){
        for(Transaction t : this.transactions){
            if(t.getName() == "Income"){
                System.out.printf("%s : %s : %.02f : %s\n",t.getDate(),t.getName(),t.getAmount(),t.getMemo());
            }
        }
        System.out.println();
    }

    public void showAllExpenses(){
        for(Transaction t: this.transactions){
            if(t.getName() == "Expense"){
                System.out.printf("%s : %s : %.02f : %s\n",t.getDate(),t.getName(),t.getAmount(),t.getMemo());
            }
        }
        System.out.println();
    }


}
