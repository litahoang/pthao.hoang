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
public class PlayerTest {
    public static void main(String[] args) {
        
        TotalIncome total = new TotalIncome("Ronaldo", 890, 0.25, 1, 1000);
        total.calculateBonus();
        total.displayDetail();
        
//        PlayerIncome playerincome = new PlayerIncome("Torress");
////       playerincome.income = 100;
//        playerincome.calculateTax();
//        playerincome.displayDetail();
//        TournamentIncome tournamentin = new TournamentIncome("Ronaldo", 689, 0.25,1000, 1);
//        tournamentin.calculateGradeBonus();
//        tournamentin.displayDetail();
    }
    
    
}
