package br.com.mdias.target.pergunta3;

public class FaturamentoMedia extends Faturamento{
    private double getMediaFaturamentoMensal(){
        double soma = 0, dayoff =0, media = 0;
        int day = 0, dayOn = 0;
        //Somando todos os faturamentos e ignorando feriados e finais de semana
        for (int i = 0; i < getFaturametoDiario().length; i++) {
            if (getFaturametoDiario()[i] != dayoff){
                dayOn ++;
                soma += getFaturametoDiario()[i];
            }
        }
        return media = soma/dayOn;
    }
    //Verifica faturamento superior à media mensal ingnorando fins de semana e feriados
    public void getFaturamentoSuperiorMedia(){
        double dayoff = 0, faturamentoDiarioMaiorMedia = 0;
        int dayOn = 0;
        System.out.println("Faturamento mensal com média de "+getMediaFaturamentoMensal());
        for (int y = 0; y < getFaturametoDiario().length; y++){
            if (getFaturametoDiario()[y] != dayoff && getFaturametoDiario()[y] > getMediaFaturamentoMensal()){
                dayOn = getDiaMes()[y];
                faturamentoDiarioMaiorMedia = getFaturametoDiario()[y];
                System.out.println("Faturamento superior a média mensal foi no dia "+ dayOn+ " com o valor de "+faturamentoDiarioMaiorMedia);
            }
        }
    }
}
