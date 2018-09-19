
package main;
import models.ModelRfc;
import views.ViewRfc;
import controllers.ControllerRfc;


public class Main {

    public static void main(String[] args) {
         ModelRfc modelRfc = new ModelRfc();
        ViewRfc viewRfc = new ViewRfc();
        ControllerRfc controllerRfc = new ControllerRfc(modelRfc, viewRfc);
        
        controllerRfc.iniciar_vista();
        viewRfc.setVisible(true);
        
    }
    
}
