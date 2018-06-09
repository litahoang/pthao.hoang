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
public class TournamentIncome extends Player implements IGradeBonus{
    
        public double bonus;
                
    public TournamentIncome(String name) {
        super(name);
    }

    public TournamentIncome(String name, double income,double rate, double bonus, int level) {
        super(name);              
            this.bonus = bonus;
            this.income = income;
            this.level = level;
            this.rate = rate;
    }
    
    @Override
    public void calculateGradeBonus() {
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

    @Override
    public void displayDetail() {
        System.out.println("Rate : " + this.rate);
        System.out.println("Level: " + this.level);
        System.out.println("Bonus Tournament: " + this.bonus + "$");
    }  
}
