/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublependulum;

/**
 *
 * @author arthurmanoha
 */
public class DoublePendulumMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Create two windows
//        The first one represents the "physical world", where the pendulums are represented graphically in their (x, y) space;
//        The second one represents the "phase space", where a pendulum is a single point whose coordinates are the angles of the two sticks.
        World w = new World(10, 45, 45);

        w.print();
    }

}
