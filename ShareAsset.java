public abstract class ShareAsset implements Asset {
   private String symbol; 
   private double totalCost; 
   private double currentPrice; 

   //Constructor
   public ShareAsset(String symbol, double currentPrice){
    this.symbol = symbol;
    this.currentPrice = currentPrice;
    totalCost = 0.0;
   }

   public abstract double getMarketValue();

   public double getProfit(){
      return getMarketValue() - totalCost;
   }
   public void addCost(double cost){
    totalCost += cost;
   }

   public double getCurrentPrice(){
    return currentPrice;
   }

   public double getTotalCost(){
    return totalCost;
   }

   public void setCurrentPrice(double currentPrice){
    this.currentPrice = currentPrice;
   }
   
}
