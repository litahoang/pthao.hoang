/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InhandInt;

/**
 *
 * @author hoangthao
 */
public class PlayerIncome extends Player implements ITax {
    
    public double tax;

    public PlayerIncome(String name) {
        super(name);
    }
    
    public PlayerIncome(String name, double _income) {
        
        super(name);
        income = _income;
    }
    
    @Override
    public void calculateTax() {
        this.tax = income * TAX_PERCENT;
    }

    @Override
    public void displayDetail() {
        System.out.println("Name: " + this.getName());
        System.out.println("Income: " + income);
        System.out.println("Income after tax: " + tax);
    }

   
}
