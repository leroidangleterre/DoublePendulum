/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublependulum;

import java.util.Random;

/**
 *
 * @author arthurmanoha
 */
class Pendulum {

    private double rootLength, tailLength;
    private double rootMass, tailMass;
    // Angles in radians
    private double rootAngle, tailAngle;

    // How much error may exist between the required angles and their actual value at instanciation (in degrees)
    private static double precision = 1;
    private static Random random = new Random();

    private int id;
    private static int NB_PEND_CREATED = 0;

    /**
     *
     * @param newRootLength
     * @param newTailLength
     * @param newRootMasr
     * @param newTailMass
     * @param newRootAngle in degrees; angle from vertical down, positive when
     * on the right
     * @param newTailAngle in degrees; angle from vertical down, positive when
     * on the right
     */
    public Pendulum(double newRootLength, double newTailLength, double newRootMasr, double newTailMass, double newRootAngle, double newTailAngle) {
        rootLength = newRootLength;
        tailLength = newTailLength;
        rootMass = newRootMasr;
        tailMass = newTailMass;
        double angleErrorRoot = 2 * (random.nextDouble() - 0.5) * precision;
        double angleErrorTail = 2 * (random.nextDouble() - 0.5) * precision;
        rootAngle = deg2rad(newRootAngle + angleErrorRoot);
        tailAngle = deg2rad(newTailAngle + angleErrorTail);
        id = NB_PEND_CREATED;
        NB_PEND_CREATED++;
    }

    /**
     *
     * @param newRootLength
     * @param newTailLength
     * @param newRootAngle in degrees
     * @param newTailAngle in degrees
     */
    public Pendulum(double newRootLength, double newTailLength, double newRootAngle, double newTailAngle) {
        this(newRootLength, newTailLength, 1, 1, newRootAngle, newTailAngle);
    }

    /**
     *
     * @param newRootAngle in degrees
     * @param newTailAngle in degrees
     */
    public Pendulum(double newRootAngle, double newTailAngle) {
        this(1, 1, newRootAngle, newTailAngle);
    }

    public void evolve(double dt, double gravity) {
        System.out.println("Pendulum.evolve(): TODO");
    }

    public String toString() {
        return "Pendulum " + id + ": " + rad2deg(rootAngle) + ", " + rad2deg(tailAngle);
    }

    private static double deg2rad(double deg) {
        return 2 * Math.PI * deg / 360;
    }

    private static double rad2deg(double rad) {
        return rad * 360 / (2 * Math.PI);
    }
}
