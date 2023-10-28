public class PredatoryCreditCard extends CreditCard{
    private double apr;

    public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double apr){
        super(customer, bank, account, limit, balance);
        this.apr = apr;
    }

    public boolean charge(double price){
        //todo
        boolean successfulTransaction = super.charge(price);
        if(!successfulTransaction){
            balance += 5;
        }
        return successfulTransaction;
    }

    public void processMonth(){
        if(balance > 0){
            double monthlyFactor = Math.pow(1 + apr, 1.0/12);
            balance *= monthlyFactor;
        }
    }
    
}
