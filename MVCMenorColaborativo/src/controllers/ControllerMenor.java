/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.ViewMenor;
import models.ModelMenor;

public class ControllerMenor {
    
   ViewMenor view_menor;
   ModelMenor model_menor;
   
   public ControllerMenor(ModelMenor model_menor,ViewMenor view_menor){
       
       this.model_menor = model_menor;
       this.view_menor = view_menor;
       initView();
       
       view_menor.jbtn_menor.addActionListener(e -> this.jbtn_menor_click());
       
   }
   
   public void initView(){
       
       view_menor.jtf_num1.setText(String.valueOf(model_menor.getN1()));
       view_menor.jtf_num2.setText(String.valueOf(model_menor.getN2()));
       view_menor.jtf_num3.setText(String.valueOf(model_menor.getN3()));
       view_menor.jtf_men.setText(String.valueOf(model_menor.getM()));
       view_menor.setVisible(true);
       
       
   }
   
   public void jbtn_menor_click(){
       
       model_menor.setN1(Integer.parseInt(view_menor.jtf_num1.getText()));
       model_menor.setN2(Integer.parseInt(view_menor.jtf_num2.getText()));
       model_menor.setN3(Integer.parseInt(view_menor.jtf_num3.getText()));
       model_menor.menor();
       
       view_menor.jtf_men.setText(String.valueOf(model_menor.getM()));
  
       
   }
    
}
