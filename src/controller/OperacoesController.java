package controller;

public class OperacoesController {
	
	public OperacoesController() {
		super();
	}
	//Exercício 1 Recursivo
	public int Mult(int x,int y) {
	//Condição de parada
		if(y == 0) {
			return 0;	
		} else {
			return x + Mult(x, y-1);
		}
	}
	//Exercício 2 Recursivo
	public int DivResto(int a, int b) {
	//Condição de parada 
		if (a < b) {
			return a;
		}else{
			return DivResto(a-b, b);
		}
	}
	//Exercício 3 Recursivo
	public int VetPares(int[] V, int x) {
	//Condição de parada
		if(x < 0) {
			return 0;
		}else if(V[x] % 2 == 0) {
			return 1 + VetPares(V, x - 1);
		}
		return VetPares(V, x - 1);
	}
}
