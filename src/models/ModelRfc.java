/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class ModelRfc {
    private String nombre;
    private String paterno;
    private String materno;
    private String dia;
    private String mes;
    private String ano;
    
    private String RFC;
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    
    
    public String datosRfc(){
        
       
        
        
        
        this.paterno=this.paterno.substring(0,2).toUpperCase();
        this.materno=this.materno.substring(0,1).toUpperCase();
        this.nombre=this.nombre.substring(0,1).toUpperCase();
        this.ano=this.ano.substring(2,4).toUpperCase();
        this.mes=this.mes.substring(0,2).toUpperCase();
        this.dia=this.dia.substring(0,2).toUpperCase();
   
        this.RFC= this.paterno+this.materno+this.nombre+this.ano+this.mes+this.dia;  
        return this.RFC;
        
    }
    
    
    
    
    
}
