package com.Examen.Examen.PERSON;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.ArrayList;

public class Training {

    String N_curso;
    int Lista_Person;
    ArrayList<Training> Lista = new ArrayList<>();

    public String getN_curso() {
        return N_curso;
    }

    public void setN_curso(String n_curso) {
        N_curso = n_curso;
    }

    public int getLista_Person() {
        return Lista_Person;
    }

    public void setLista_Person(int lista_Person) {
        Lista_Person = lista_Person;

        if (Lista == null){
            RETURN Lista;
        }
    }



}
