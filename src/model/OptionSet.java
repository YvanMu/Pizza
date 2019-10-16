/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author bertin
 */
public class OptionSet implements Serializable{

    private String name;
    private Option[] choices;

    
    protected String getName() {
        return name;
        
        
    }

    public OptionSet() {
 
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Option[] getChoices() {
        return choices;
    }

    protected void setChoices(Option[] choices) {
        this.choices = choices;
    }

    protected class Option {

        private String name;
        private double price;

        public Option() {
        }

        public Option(String name) {
            this.name = name;
        }

        protected Option(String name, double price) {

            this.name = name;
            this.price = price;
        }

        protected String getName() {
            return name;
        }

        protected void setName(String name) {
            this.name = name;
        }

        protected double getPrice() {
            return price;
        }

        protected void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return super.toString(); 
        }

       
        

        
      
    }

}
