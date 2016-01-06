package com.claup.classe;

import java.io.Serializable;

/**
 * Created by Sidney on 05/01/2016.
 */
public class Contador implements Serializable {

    private int numero = 0;

    public int getNumero() {

        return numero;
    }

    public void setNumero(int _numero) {
        numero = _numero;
    }

    public void addNumero() {
        numero = numero + 1;
    }

    public int addgetNumero() {
        numero = numero + 1;
        return numero;
    }
}
