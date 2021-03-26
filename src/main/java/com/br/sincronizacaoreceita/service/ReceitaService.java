package com.br.sincronizacaoreceita.service;

import java.io.IOException;
import java.text.ParseException;

public interface ReceitaService {

    public boolean verificaConta (String inputFile) throws IOException, InterruptedException, ParseException;
}
