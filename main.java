package composite;

public class main {

	public static void main(String[] args) {
	
		CasaSimples cs1 = new CasaSimples();

	
		CompCasa conjunto = new CompCasa();
	
	
		conjunto.adicionarModeloCasa(cs1);
	
		conjunto.ConstruirCasa();
	}

}
