/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziocarbonereal;

import java.time.LocalDate;

/**
 *
 * @author marco
 */
public class Passeggero {

    private final String nome, cognome, codiceFiscale;
    private final LocalDate dataDiNascita;
    private final boolean MalatoDiCuore;

    public Passeggero(String nome, String cognome, String codiceFiscale, LocalDate dataDiNascita, boolean MalatoDiCuore) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.dataDiNascita = dataDiNascita;
        this.MalatoDiCuore = MalatoDiCuore;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public boolean isMalatoDiCuore() {
        return MalatoDiCuore;
    }

    @Override
    public String toString() {
        return "Passeggero{" + "nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + ", dataDiNascita=" + dataDiNascita + ", MalatoDiCuore=" + MalatoDiCuore + '}';
    }
    
    
    
    
}
