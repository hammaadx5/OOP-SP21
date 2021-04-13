package cons;

public class PizzaOrder_runner {
	public static void main(String[] args)
	{
		Pizza pizza1 = new Pizza("large", 1, 2, 2);
		Pizza pizza2 = new Pizza("medium", 3, 5, 4);
		PizzaOrder order = new PizzaOrder();
		order.setNumPizzas(2);
		order.setPizza1(pizza1);
		order.setPizza2(pizza2);
		double total = order.calcTotal();
		
		System.out.println(pizza1.getDescription());
		System.out.println(pizza2.getDescription());
		System.out.println("Total cost: $" + total);
	}
}
