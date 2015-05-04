public class Trio implements MenuItem {
	Sandwich sandwich;
	Salad salad;
	Drink drink;
	
	public Trio(Sandwich sandwich, Salad salad, Drink drink) {
		this.sandwich = sandwich;
		this.salad = salad;
		this.drink = drink;
	}
	
	public String getName() {
		return sandwich.getName() + "/" + salad.getName() + drink.getName() + "/" + " Trio";
	}
	
	public double getPrice() {
		return sandwich.getPrice() + salad.getPrice() + drink.getPrice() - Math.min(sandwich.getPrice(), Math.min(salad.getPrice(), drink.getPrice()));
	}
}
