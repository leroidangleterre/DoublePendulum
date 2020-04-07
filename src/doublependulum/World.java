package doublependulum;

import java.util.ArrayList;

/**
 *
 * @author arthurmanoha
 *
 * The World contains and animates all the pendulums. It can be displayed in two
 * different ways: physical space and phase space.
 */
class World {

    private ArrayList<Pendulum> list;
    private double gravity;

    /**
     *
     * @param nbPendulums
     * @param rootAngle angle from vertical down, positive when on the right
     * @param tailAngle
     */
    public World(int nbPendulums, double rootAngle, double tailAngle) {
        this.list = new ArrayList<>();
        for (int i = 0; i < nbPendulums; i++) {
            list.add(new Pendulum(rootAngle, tailAngle));
        }
        gravity = -9.8;
    }

    public void print() {
        System.out.println("World:");
        for (Pendulum p : list) {
            System.out.println("\t" + p);
        }
    }

    public void evolve(double dt) {
        for (Pendulum p : list) {
            p.evolve(dt, gravity);
        }
    }
}
