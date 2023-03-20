package br.com.mdias.target.pergunta3;

public class MaiorFaturamentoDiario extends Faturamento{

    public void getMaiorValorFaturamento() {
        double maior = 0;
        int dayMaiorFaturamento = 0;
        for (int i = 0; i < getFaturametoDiario().length; i++) {
            if (getFaturametoDiario()[i] > maior) {
                dayMaiorFaturamento = getDiaMes()[i];
                maior = getFaturametoDiario()[i];
            }
        }
        System.out.println("No dia " + dayMaiorFaturamento + " foi o maior faturamento do mês no valor de " + maior);
    }
}
