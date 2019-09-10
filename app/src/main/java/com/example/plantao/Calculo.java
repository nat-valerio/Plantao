package com.example.plantao;

public class Calculo {



    public double Media(double[] valores){
        double media = 0;

        for (int i = 0; i < valores.length; i++){
            media += valores[i];
        }
        return media/valores.length;
    }

    public double Maior (double[] valores){
        double maior = valores[0];


        for(int i = 1; i < valores.length; i++){

            if (valores[i] > maior){
                maior = valores[i];
            }

        }return maior;
    }

    public double PorcentagemAcertos (boolean[] respostas){
     double porcentagem = 0;
        return porcentagem;
     }



}
