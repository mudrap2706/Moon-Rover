/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moonrover;

/**
 *
 * @author mudra
 */
public class IdleState implements RoverState {
    private final RoverContext context;

    public IdleState(RoverContext context) {
        this.context = context;
    }

    @Override
    public void enterState() {
        System.out.println("Entering Idle State");
    }

    @Override
    public void pressLeftPedal() {
        System.out.println("Transitioning to Accelerate Forward State");
        context.setState(new AccelerateForwardState(context));
    }

    @Override
    public void pressRightPedal() {
        System.out.println("No action in Idle State");
    }

    @Override
    public void holdRightPedal(int seconds) {
        System.out.println("No action in Idle State");
    }

    @Override
    public void releasePedals() {
        System.out.println("No action in Idle State");
    }

    @Override
    public void holdLeftPedal(int seconds) {
        if (seconds > 3) {
            System.out.println("Transitioning to Accelerate Backward State");
            context.setState(new AccelerateBackwardState(context));
        }
    }
}
