package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enuns.A027_Order_Status;


public class A027_Order {
	
private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private A027_Order_Status status;
	
	private A027_Client client;
	private List<A027_OrderItem> items = new ArrayList<>();
	
	public A027_Order(Date moment, A027_Order_Status status, A027_Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public A027_Order_Status getStatus() {
		return status;
	}

	public void setStatus(A027_Order_Status status) {
		this.status = status;
	}

	public A027_Client getClient() {
		return client;
	}

	public void setClient(A027_Client client) {
		this.client = client;
	}

	public List<A027_OrderItem> getItems() {
		return items;
	}
	
	public void addItem(A027_OrderItem item) {
		items.add(item);
	}

	public void removeItem(A027_OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (A027_OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (A027_OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
