package cons;

public class Pizza {
	private String pizzaSize;
	private int cheeseCount;
	private int pepperoniCount;
	private int hamCount;
	
	public Pizza()
	{
		pizzaSize = "";
		cheeseCount = 0;
		pepperoniCount = 0;
		hamCount = 0;
	}
	public Pizza(String a, int b, 
			int c, int d){
    this.pizzaSize = a;
    this.cheeseCount = b;
    this.pepperoniCount = c;
    this.hamCount = d;
}
	public String getPizzaSize()
	{
		return pizzaSize;
	}
	public void setPizzaSize(String pizzaSize)
	{
		this.pizzaSize = pizzaSize;
	}
	public int getNumofCheese()
	{
		return cheeseCount;
	}
	public void setNumofCheese(int cheeseCount)
	{
		this.cheeseCount = cheeseCount;
	}
	public int getNumofPepperoni()
	{
		return pepperoniCount;
	}
	public void setNumofPepperoni(int pepperoniCount)
	{
		this.pepperoniCount = pepperoniCount;
	}
	

	public int getNumofHam()
	{
		return hamCount;
	}
	public void setNumofHma(int hamCount)
	{
		this.hamCount = hamCount;
	}
	public double calcCost()
	{		
		if(pizzaSize.equalsIgnoreCase("small"))
		{
			return 10 + (cheeseCount + pepperoniCount + hamCount) * 2;
		}
		else if(pizzaSize.equalsIgnoreCase("medium"))
		{
			return 12 + (cheeseCount + pepperoniCount + hamCount) * 2;
		}
		else if(pizzaSize.equalsIgnoreCase("large"))
		{
			return 14 + (cheeseCount + pepperoniCount + hamCount) * 2;
		}
		else
		{
			return 0.0;
		}
	}
		public String getDescription()
		{
			return "Pizza size: " + pizzaSize + "\n Cheese toppings: " 
					+ cheeseCount + "\n Pepperoni toppings: "
					+ pepperoniCount + "\n Ham toppings: " + hamCount
					+ "\n Pizza cost: $" + calcCost() + "\n";
		}
	
	}



	


