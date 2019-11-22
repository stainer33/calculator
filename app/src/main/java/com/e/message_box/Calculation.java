package com.e.message_box;

public class Calculation {
     float i1,i2,result;
    boolean callAdd,callSub,callMulti,callDiv,Com=false;
    //For addition
    public float add()
    {
        this.result = this.i1+ this.i2;
        return result;
    }
    //for subtraction
    public float sub()
    {
        return this.result = this.i1-this.i2;

    }
    //for multiplication
    public float multipy()
    {
        return  this.result = this.i1*this.i2;
    }
    //for division
    public float div()
    {
        return this.result = this.i1/this.i2;

    }
}
