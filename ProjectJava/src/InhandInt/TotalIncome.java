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
public class TotalIncome extends PlayerIncome {
    
    public double bonus;

    
    public TotalIncome(String name) {
        super(name);
        
    }
    public TotalIncome(String name, double income, double rate, int level, double bonus){
        super(name);
        
        this.tax = income * TAX_PERCENT;
        this.income = income;
        this.bonus = bonus;
        this.level = level;
        this.rate = rate;
        
    }
    @Override
    public void displayDetail() {
        System.out.println("Name: " + this.getName());
        System.out.println("Income: " + income);
        System.out.println("Income after tax: " + tax);
        System.out.println("Rate : " + this.rate);
        System.out.println("Level: " + this.level);
        System.out.println("Bonus Tournament: " + this.bonus + "$");
    }
    public void calculateBonus(){
        switch (level) {
            case 1:
                this.bonus = 0.8 * income * rate;
                break;
            case 2:
                this.bonus = 0.5 * income * rate;
                break;
            case 3:
                this.bonus = 0.3 * income * rate;
                break;
            default:
                break;
        }
    }
}
