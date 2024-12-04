/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moonrover;

/**
 *
 * @author mudra
 */
public class MoonRover {
    public static void main(String[] args) {
        System.out.println("=== Moon Rover State Machine ===");

        // Create the RoverContext (starting in IdleState)
        RoverContext rover = new RoverContext();

        // Simulate actions
        System.out.println("\n[Action] Press Left Pedal:");
        rover.pressLeftPedal(); // Should transition to AccelerateForwardState

        System.out.println("\n[Action] Release Pedals:");
        rover.releasePedals(); // Should transition back to IdleState

        System.out.println("\n[Action] Hold Left Pedal for 4 seconds:");
        rover.holdLeftPedal(4); // Should transition to AccelerateBackwardState

        System.out.println("\n[Action] Release Pedals:");
        rover.releasePedals(); // Should transition back to IdleState

        System.out.println("\n[Action] Press Right Pedal:");
        rover.pressRightPedal(); // Should stay in IdleState, no transition

        System.out.println("\n=== End of Simulation ===");
    }
}
