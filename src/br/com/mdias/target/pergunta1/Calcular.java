package br.com.mdias.target.pergunta1;

public class Calcular {
    private int indice;
    private int soma;
    private int k;

    //Método para realizar o calculo final da variável soma

    public void calcularVariavel(){
        k = 0;
        indice = 13;
        while (k < indice){
            k += 1;
            soma += k;
        }
        System.out.println("Resultado = " + soma);
    }

}
