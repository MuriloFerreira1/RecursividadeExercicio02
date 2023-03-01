package controller;

public class Controller {
	public String converteBinario(int valor) {
		if(valor>2000) {
			//declara o limite da função
			return "Valor inválido";
		}else {
			if(valor<=0) {
				//condiciona a parada onde o valor recebido é 0 ou menor
				return "";
			}else {
				if(valor%2==0) {
					//adiciona um 0 mais a direita do binário e compara o próximo
					return converteBinario(valor/2)+"0";
				}else {
					//adiciona um 1 mais a direita do binário e compara o próximo
					return converteBinario(valor/2)+"1";
				}
			}
		}
	}
}
