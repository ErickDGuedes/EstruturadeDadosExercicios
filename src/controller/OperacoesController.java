package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	
	//Exercício 1 Recursivo
	public int Ex1(int x,int y) {
	//Condição de parada
		if(y == 0) {
			return 0;	
		} else {
			return x + Ex1(x, y-1);
		}
	}
	
	//Exercício 2 Recursivo
	public int Ex2(int a, int b) {
	//Condição de parada 
		if (a < b) {
			return a;
		}else{
			return Ex2(a-b, b);
		}
	}
	
	//Exercício 3 Recursivo
	public int Ex3(int[] V, int x) {
	//Condição de parada
		if(x < 0) {
			return 0;
		}else if(V[x] % 2 == 0) {
			return 1 + Ex3(V, x - 1);
		}
		return Ex3(V, x - 1);
	}
	

}
