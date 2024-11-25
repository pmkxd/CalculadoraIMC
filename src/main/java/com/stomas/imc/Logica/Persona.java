/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stomas.imc.Logica;

import com.stomas.imc.Exceptions.PersonaException;

/**
 *
 * @author parag
 */
public class Persona {
    private String nombre;
    private Integer edad;
    private String rut;
    private String sexo;
    private Double peso;
    private Double altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws PersonaException {
        if (!nombre.matches("[a-zA-Z\\s]+")){
            throw new PersonaException("El nombre solo debe contener letras y espacios");
        }else{
            this.nombre = nombre;
        }
    }

    public Integer getEdad() throws PersonaException{
        if(edad < 0){
            throw new PersonaException("La Edad no puede ser menor a 0");
        }else if(edad > 150){
            throw new PersonaException("La Edad no puede ser mayor a 150");
        }else{
            return edad;
        }
        
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Persona() {
        nombre = "";
        edad = 0;
        rut = "";
        sexo = "H";
        peso = 0.0;
        altura = 0.0;
        
    }

    public Persona(String nombre, Integer edad, String rut, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public Integer calcularIMC(){
        Double peso_ideal;
        Integer num;
        peso_ideal = peso / (Math.pow(altura, 2));
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
    public void esMayorDeEdad(Boolean si){
        if(edad > 17){
            si = true;
        }else{
            si = false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", rut=" + rut + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
   
}
