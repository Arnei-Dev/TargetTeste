package br.com.mdias.target.pergunta3;

public class Faturamento {
    //Dia do mês
    private int[] diaMes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

    //Faturamento diario
    private double[] faturametoDiario = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0,
            3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0,
            25681.8318, 1718.1221, 13220.495, 8414.61};

    public int[] getDiaMes() {
        return diaMes;
    }
    public double[] getFaturametoDiario() {
        return faturametoDiario;
    }
}
