
public class TestaCaixa {
public static void main(String[] args) {
	Caixa c1 = new Caixa();
	
	c1.setAltura(15);
	c1.setLargura(9);
	c1.setProfundidade(10);
	System.out.println("Resultado: " + c1.cabeDentro(17));
}
}
