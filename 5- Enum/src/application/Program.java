package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(order);
	}
	
}
