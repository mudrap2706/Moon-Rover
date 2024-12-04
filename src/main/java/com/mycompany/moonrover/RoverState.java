/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moonrover;

/**
 *
 * @author mudra
 */
public interface RoverState {
    void enterState();
    void pressLeftPedal();
    void pressRightPedal();
    void holdRightPedal(int seconds);
    void releasePedals();
    void holdLeftPedal(int seconds);
}