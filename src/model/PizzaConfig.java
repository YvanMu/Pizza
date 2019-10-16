/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import model.OptionSet.Option;

/**
 *
 * @author bertin
 */
public class PizzaConfig implements Serializable{
    
    
    private double baseprice;   
    private String size;
    
    private double delivery;
    private String name;
    private OptionSet[] optionsets; 
    
    
    public PizzaConfig(){
        
    }

    public PizzaConfig(double baseprice,String size,double delivery,String name,OptionSet[] optionsets){
        
        this.baseprice = baseprice;
        this.size   = size;
        this.delivery = delivery;
        this.name     = name;
        this.optionsets = optionsets;
 
    }

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDelivery() {
        return delivery;
    }

    public void setDelivery(double delivery) {
        this.delivery = delivery;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public OptionSet[] getOptionsets() {
        return optionsets;
    }

    public void setOptionsets(String name,String[] option,double totalPrice) {
        this.optionsets = optionsets;
    }
    
    public void find(){
        
    }
    
    public void delete(){
        
    }
    
    public void update(){
        
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
}
    
    
