/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelRfc;
import views.ViewRfc;


public class ControllerRfc implements ActionListener  {
    
    private ModelRfc modelRfc;
     private ViewRfc viewRfc;

    public ControllerRfc(ModelRfc modelRfc, ViewRfc viewRfc) {
        this.modelRfc = modelRfc;
        this.viewRfc = viewRfc;
        this.viewRfc.jb_generar.addActionListener(this);
        
    }
     public void iniciar_vista(){
        viewRfc.setLocationRelativeTo(null);
    }
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
        modelRfc.setNombre(viewRfc.jtf_nombre.getText());
        modelRfc.setPaterno(viewRfc.jtf_apellido_paterno.getText());
        modelRfc.setMaterno(viewRfc.jtf_apellido_materno.getText());
        modelRfc.setDia(viewRfc.jtf_dia.getText());
        modelRfc.setMes(viewRfc.jtf_mes.getText());
        modelRfc.setAno(viewRfc.jtf_ano.getText());
        
        
   if(e.getSource()==viewRfc.jb_generar) modelRfc.datosRfc();
 
    viewRfc.jl_resultado.setText(modelRfc.getRFC());
    
    
   
    }
     private void initComponets() {
         viewRfc.setVisible(true);
        viewRfc.setVisible(true);
    }
}
