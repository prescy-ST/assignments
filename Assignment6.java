package practice;

class Shop{
	
	public void addToCart(){
		System.out.println("Add To Cart");
		return;
	}
	
	public void payment() {
		System.out.println("Payment");
		return;
	}
	
	public void cancel() {
		System.out.println("Cancel");
		return;
	}
}

public class Assignment6 {

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.addToCart();
		shop.payment();
		shop.cancel();
	}
}
