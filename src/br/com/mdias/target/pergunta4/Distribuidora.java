package br.com.mdias.target.pergunta4;

public class Distribuidora {
    private String[] filial = {"SP", "RJ", "MG", "ES", "Outras UF"};
    private double[] filialFaturamento = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};

    //Calculo do valor de todas as filiais
    private double filialValores(){
        double faturamentoTotal = 0;
        for (double fat:filialFaturamento) {
            faturamentoTotal += fat;
        }
        return faturamentoTotal;
    }
    //Calculo porcentagem por filial ao valor total do faturamento geral
    public void margemPorFilial(){
        String uf = "";
        int total = 100;
        double porcentagemUf;
        for (int i = 0; i < filial.length; i++){
           uf = filial[i];
           porcentagemUf = filialFaturamento[i] * 100 / filialValores();
           System.out.println("Filial "+uf+" teve representação de "+porcentagemUf+"% no faturamento geral");
        }
    }
}
