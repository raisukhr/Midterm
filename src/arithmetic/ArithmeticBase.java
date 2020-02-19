/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan modified by Sukhreet
 * date 02/19
 */
public class ArithmeticBase 
{
   public enum Operation {PLUS,MINUS,DIVIDE,TIMES};
   public enum Value{NUM1,NUM2};
   private Operation operation;
   private Value value;
   public ArithmeticBase(Operation operation,Value value)
   {
     this.operation=operation;
     this.value=value;
   }

    /**
     * @return the operation
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }
}
