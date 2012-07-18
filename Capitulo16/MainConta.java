package Capitulo16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainConta {
	public static void main(String[] args) {
		
     	ContaPoupanca c = new ContaPoupanca();
		ContaPoupanca cc = new ContaPoupanca();
		ContaPoupanca cp = new ContaPoupanca();
		
		List<ContaPoupanca> contasList = new ArrayList<ContaPoupanca>();
		
		c.setNumero(1973);
		cc.setNumero(1462);
		cp.setNumero(1854);
		
		contasList.add(c);
		contasList.add(cc);
		contasList.add(cp);
		
		
		
		Collections.sort(contasList);
		Collections.reverseOrder();
		for (int i = 0; i < contasList.size(); i++) {
			System.out.println(contasList.get(i).getNumero());
			
		}

	}

}
