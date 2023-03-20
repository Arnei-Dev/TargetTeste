package br.com.mdias.target.pergunta3;

public class MenorFaturamentoDiario extends Faturamento{
    //O menor valor de faturamento ocorrido em um dia do mês
    public void getMenorValorFaturamento() {
        int dayMenorFaturamento = 0;
        double menor = 0, dayOff = 0;
        for (int i = 0; i < getFaturametoDiario().length; i++) {
            if (getFaturametoDiario()[0] > getFaturametoDiario()[i] && getFaturametoDiario()[i] != dayOff) {
                dayMenorFaturamento = getDiaMes()[i];
                menor = getFaturametoDiario()[i];
                getFaturametoDiario()[0] = menor;
            }
        }
        System.out.println("No dia " + dayMenorFaturamento + " foi o menor faturamento do mês no valor de " + menor);
    }
}
