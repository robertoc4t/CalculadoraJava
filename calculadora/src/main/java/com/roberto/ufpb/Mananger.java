package com.roberto.ufpb;

public class Mananger {
    private int value1;
    private int value2;
    private String valueOperation;
    private int total;
    private boolean isNumeric = false;

    public Mananger(String valueOp){
        
        this.valueOperation = valueOp;
        isNumeric = valueOp.matches("[0-9]+");
        
    }


    

    public int actionCalculate(){

        if(valueOperation == "+"){ 
           return  this.value1 + this.value2;
        }else if (valueOperation == "-") {
            return this.value1 + this.value2;
        }else if (valueOperation == "x") {
            return  this.value1 + this.value2;
        }else if (valueOperation == "=") {
            return this.value1 + this.value2;
        }else if (valueOperation == "%") {
            return this.value1 + this.value2;
        }else if (valueOperation == "/") {
            return this.value1 + this.value2;
        }
        return 0;
    }




    

}
