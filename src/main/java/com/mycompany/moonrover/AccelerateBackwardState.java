/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moonrover;

/**
 *
 * @author mudra
 */
public class AccelerateBackwardState implements RoverState {
    private final RoverContext context;

    public AccelerateBackwardState(RoverContext context) {
        this.context = context;
    }

    @Override
    public void enterState() {
        System.out.println("Accelerating Backward");
    }

    @Override
    public void pressLeftPedal() {
        System.out.println("No action in Accelerate Backward State");
    }

    @Override
    public void pressRightPedal() {
        System.out.println("No action in Accelerate Backward State");
    }

    @Override
    public void holdRightPedal(int seconds) {
        System.out.println("No action in Accelerate Backward State");
    }

    @Override
    public void releasePedals() {
        System.out.println("Transitioning to Idle State");
        context.setState(new IdleState(context));
    }

    @Override
    public void holdLeftPedal(int seconds) {
        System.out.println("No action in Accelerate Backward State");
    }
}

