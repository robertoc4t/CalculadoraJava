package com.roberto.ufpb;

public class Mananger {
    private int value1;
    private int value2;
    private String valueOperation;
    private int total;

    public Mananger(int value1, int value2, String valueOp){
        this.value1 = value1;
        this.value2 = value2;
        this.valueOperation = valueOp;

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
