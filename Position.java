/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubfc.embedded.nlaterationproblem;

/**
 *
 * @author Tsevi Fiacre & Rifat Jahan Lia
 */
public class Position {
    private float x;
    private float y;
    private float z;
    
    public Position(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void setPosition(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
    public float getZ() {
        return z;
    }
    
    @Override
    public String toString() {
        return String.format("X: %.2f, Y: %.2f, Z: %.2f", x, y, z);
    }
}
