/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moonrover;

/**
 *
 * @author mudra
 */


public class RoverContext {

    private RoverState state;

    public RoverContext() {
        state = new IdleState(this);
        state.enterState();
    }

    public void setState(RoverState newState) {
        this.state = newState;
        state.enterState();
    }

    public RoverState getCurrentState() {
        return state;
    }

    public void pressLeftPedal() {
        state.pressLeftPedal();
    }

    public void pressRightPedal() {
        state.pressRightPedal();
    }

    public void holdRightPedal(int seconds) {
        state.holdRightPedal(seconds);
    }

    public void releasePedals() {
        state.releasePedals();
    }

    public void holdLeftPedal(int seconds) {
        state.holdLeftPedal(seconds);
    }
}