package com.br.sincronizacaoreceita.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

public class Utils {

    public boolean escreveCSV(List<String> teste, String inputName) throws IOException {
        FileWriter arq = new FileWriter("data\\out\\" + inputName + "Out.csv");
        PrintWriter gravarArq = new PrintWriter(arq);

        for (String s : teste) {
            gravarArq.println(s);
        }
        arq.close();
        return true;
    }

    public double convertDouble(String saldo) throws ParseException {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        Number number = format.parse(saldo);
        return number.doubleValue();
    }
}
