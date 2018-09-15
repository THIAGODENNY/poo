package semana06;

public class Pedido {
	
	public Item item1 , item2 , item3;
	public Cliente cliente;
	
	public Pedido() {
		item1 = new Item();
		item2 = new Item();
		item3 = new Item();
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
