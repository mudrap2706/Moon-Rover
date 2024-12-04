/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author mudra
 */
import com.mycompany.moonrover.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoverContextTest {

    @Test
    public void testInitialState() {
        RoverContext context = new RoverContext();
        assertTrue(context.getCurrentState() instanceof IdleState);
    }

    @Test
    public void testTransitionToAccelerateForward() {
        RoverContext context = new RoverContext();
        context.pressLeftPedal();
        assertTrue(context.getCurrentState() instanceof AccelerateForwardState);
    }

    @Test
    public void testTransitionToIdleFromAccelerateForward() {
        RoverContext context = new RoverContext();
        context.pressLeftPedal();
        context.releasePedals();
        assertTrue(context.getCurrentState() instanceof IdleState);
    }

    @Test
    public void testTransitionToAccelerateBackward() {
        RoverContext context = new RoverContext();
        context.holdLeftPedal(4);
        assertTrue(context.getCurrentState() instanceof AccelerateBackwardState);
    }
}
