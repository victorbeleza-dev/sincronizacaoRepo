package com.br.sincronizacaoreceita.service;

public interface ReceitaService {

    public boolean atualizarConta (String agencia, String conta, double saldo, String status) throws InterruptedException;
}
