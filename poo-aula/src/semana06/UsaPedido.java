package semana06;

public class UsaPedido {
	
	public static void main(String[] args) {
		

	Cliente c1 = new Cliente();
	Pedido p1 = new Pedido();
	
	p1.item1.numero = 1;
	p1.item1.produto = "Maionese";
	p1.item1.quantidade = 10;
	
	Pedido p2 = new Pedido();
	
	p2.item1.numero = 2;
	p2.item1.produto = "Batata";
	p2.item1.quantidade = 5;
	p1.setCliente(c1);
	p2.setCliente(c1);
	
	}	
	
	

}
