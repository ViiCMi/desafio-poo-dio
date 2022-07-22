package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
       private LocalDate date;

    @Override
    public double calcularXp() {
     return XP_PADRAO + 20d;
    }
       

    public Mentoria(){
        
    }


    public LocalDate getDate() {
    return date;
}

public void setDate(LocalDate date) {
    this.date = date;
}


@Override
public String toString() {
    return "Mentoria [date=" + date + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";}





}


