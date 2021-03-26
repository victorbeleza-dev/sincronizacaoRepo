package com.br.sincronizacaoreceita.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

public class Utils {

    public void escreveCSV(List<String> teste, String inputName) throws IOException {
        FileWriter arq = new FileWriter("data\\out\\" + inputName + "Out.csv");
        PrintWriter gravarArq = new PrintWriter(arq);

        for (String s : teste) {
            gravarArq.println(s);
        }
        arq.close();
    }

    public double convertDouble(String saldo) throws ParseException {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        Number number = format.parse(saldo);
        return number.doubleValue();
    }

    public String retiraSinais(String number){
        String result = number.replaceAll("\\p{Punct}", "");
        return result;
    }
}
