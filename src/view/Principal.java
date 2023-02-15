package view;
import javax.swing.JOptionPane;
import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		int opc = 0;
		OperacoesController op = new OperacoesController();
		//Criação de menu para chamar os Exercícios da Aula 1
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha o Exercício:\n1 - Ex 1\n2 - Ex 2\n3 - Ex 3\n9 - FIM\n"));
			switch(opc) {
			//Chamada do Exercício 1
			case 1:
			int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A: "));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B: "));
			JOptionPane.showMessageDialog(null, "Resultado ==> "+op.Ex1(a, b));
			break;
			//Chamada do Exercício 2
			case 2:
			JOptionPane.showMessageDialog(null, "Teste será feito com os Números 13 (Dividendo) e 5 (Divisor)");
			int Divid = 13;
			int Divis = 5;
			JOptionPane.showMessageDialog(null, "Resultado ==> "+op.Ex2(Divid, Divis));
			break;
			//Chamada do Exercício 3
			case 3:
			int[] Vet = new int [5];
			int Len = Vet.length;
			for(int i = 0; i < Vet.length; i++) {
				Vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Índice "+i+" :"));			
			}
			JOptionPane.showMessageDialog(null, "Resultado ==> "+op.Ex3(Vet, Len - 1));
			break;
			//Fecha o Menu
			case 9: JOptionPane.showMessageDialog(null, "FIM");
			break;
			default:JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
			}
		}
		

	}

}
