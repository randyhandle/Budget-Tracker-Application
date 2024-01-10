import java.util.Date;

public class Transaction {
    private String name;
    private Date timestamp;
    private double amount;
    private String memo;
    
    public Transaction(String name, double amount, String memo){
        this.name = name;
        this.amount = amount;
        this.memo = memo;
        this.timestamp = new Date();
    }


    public double getAmount(){
        return this.amount;
    }

    public String getDate(){
        return this.timestamp.toString();
    }

    public String getName(){
        return this.name;
    }

    public String getMemo(){
        return this.memo;
    }
}
