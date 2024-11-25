/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stomas.imc.Logica;

import com.stomas.imc.Exceptions.CalculadoraException;
import java.util.ArrayList;

/**
 *
 * @author parag
 */
public class Calculadora {
    
    private Double peso_ideal;
    private Persona persona;
    ArrayList<String> lista_personas = new ArrayList<String>();

    public Double getPeso_ideal() {
        return peso_ideal;
    }

    public void setPeso_ideal(Double peso_ideal) throws CalculadoraException{
        if (peso_ideal.isNaN()){
            throw new CalculadoraException("falta agregar peso o altura");
        }else{
            this.peso_ideal = peso_ideal;
        }
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public ArrayList<String> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(ArrayList<String> lista_personas) {
        this.lista_personas = lista_personas;
    }

    public Calculadora() {
    }

    public Calculadora(Double peso_ideal, Persona persona, ArrayList<String> lista_personas) {
        this.peso_ideal = peso_ideal;
        this.persona = persona;
        this.lista_personas = lista_personas;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "peso_ideal=" + peso_ideal + ", persona=" + persona + ", lista_personas=" + lista_personas + '}';
    }

    
    
    public Integer calcularIMC(){
        Integer num;
        peso_ideal = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        peso_ideal = Double.valueOf(Math.round(peso_ideal));
        System.out.println(peso_ideal);
        if(peso_ideal < 20){
            num = -1;
        }else if(peso_ideal >=20 && peso_ideal <=25){
            num = 0;
        }else{
            num = 1;
        }
        return num;
    }
    
}
