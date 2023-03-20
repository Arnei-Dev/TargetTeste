package br.com.mdias.target.pergunta3;

public class RunFaturamento {
    public static void main(String[] args){

        MenorFaturamentoDiario menor = new MenorFaturamentoDiario();
        MaiorFaturamentoDiario maior = new MaiorFaturamentoDiario();
        FaturamentoMedia mediaFaturamento = new FaturamentoMedia();

        menor.getMenorValorFaturamento();
        maior.getMaiorValorFaturamento();
        mediaFaturamento.getFaturamentoSuperiorMedia();


    }
}
