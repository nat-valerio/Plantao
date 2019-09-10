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
        double maior = 0;


        for(int i = 0; i < valores.length; i++){
            double var = 0;

            if (var <= valores.length){

            }
            else if (var > valores.length){
                maior = valores[i];
            }

        }return maior;
    }

    //public boolean



}
