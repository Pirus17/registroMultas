/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registromultas;

import java.util.ArrayList;

/**
 *
 * @author Piruxb17
 */
public class Persona {
    private int dni;
    private String apellido;
    private String nombre;
    private ArrayList <Multa> Lista;

    public Persona() {
    }

    
    
    public Persona(int dni, String apellido, String nombre, ArrayList<Multa> Lista) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.Lista = Lista;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Lista
     */
    public ArrayList <Multa> getLista() {
        return Lista;
    }

    /**
     * @param Lista the Lista to set
     */
    public void setLista(ArrayList <Multa> Lista) {
        this.Lista = Lista;
    }
    
}
