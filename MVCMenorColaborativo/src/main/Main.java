/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.ViewMenor;
import models.ModelMenor;
import controllers.ControllerMenor;


public class Main {
    
    public static void main(String alb[]){
        
        ModelMenor model_menor = new ModelMenor();
        ViewMenor view_menor = new ViewMenor();
        ControllerMenor controller_menor = new ControllerMenor(model_menor,view_menor);
        
    }
    
}
