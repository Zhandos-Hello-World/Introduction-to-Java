public class Stock{
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;

	public Stock(String symbol, String name, double currentPrice){
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = currentPrice;
	}
	

	public double getChangePercent(){
		return currentPrice / previousClosingPrice;
	}


	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setCurrentPrice(double currentPrice){
		this.currentPrice = currentPrice;
	}
	public String getSymbol(){
		return symbol;
	}
	public String getName(){
		return name;
	}
	public double getPreviousClosingPrice(){
		return previousClosingPrice;
	}
	public double getCurrentPrice(){
		return currentPrice;
	}

}