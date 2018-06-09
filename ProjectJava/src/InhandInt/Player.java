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
public abstract class Player {
    
    public String name;
    
    public int level;
    
    public double income;
    
    public double rate;


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    abstract void displayDetail();    
}
