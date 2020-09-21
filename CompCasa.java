package composite;

import java.util.List;
import java.util.ArrayList;

public class CompCasa implements Casa{
	
	private List<Casa> modeloCasas = new ArrayList<Casa>();

	@Override
	public void ConstruirCasa() {
		for (Casa modeloCasa: modeloCasas ) {
			modeloCasa.ConstruirCasa();
		}
		
	}
	
	void adicionarModeloCasa( Casa modeloCasa) {
		modeloCasas.add(modeloCasa);
	}
	
	void apagarModeloCasa(Casa modeloCasa) {
		modeloCasas.remove(modeloCasa);
	}

}
