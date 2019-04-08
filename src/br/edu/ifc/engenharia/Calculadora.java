package br.edu.ifc.engenharia;

public class Calculadora {
		private double num1;
		private double num2;
		
		
		
		public double getNum1() {
			return num1;
		}
		public void setNum1(double num1) {
			this.num1 = num1;
		}
		public double getNum2() {
			return num2;
		}
		public void setNum2(double num2) {
			this.num2 = num2;
		}
		public double soma() {
			return(this.getNum1()+this.getNum2());
		}
		public double subtracao() {
			return(this.getNum1()-this.getNum2());
		}
		public double multiplicacao() {
			return(this.getNum1()*this.getNum2());
		}
		public double divisao() {
			return(this.getNum1()/this.getNum2());
		}
	
}
