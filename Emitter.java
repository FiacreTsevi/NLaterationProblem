/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ubfc.embedded.nlaterationproblem;

/**
 *
 * @author Tsevi Fiacre & Rifat Jahan Lia
 */
public class Emitter {
    private final Position position;
    private final float distance;
    
    public Emitter(Position position, float distance) {
        this.position = position;
        this.distance = distance;
    }
    
    public double getDistanceFrom(Position pos) {
        return Math.abs(Math.sqrt(Math.pow(pos.getX() - position.getX(), 2))
               + Math.sqrt(Math.pow(pos.getY() - position.getY(), 2))
               + Math.sqrt(Math.pow(pos.getZ() - position.getZ(), 2)) - distance);
    }
    
    public boolean notSamePos(Position pos) {
        return (position.getX() != pos.getX())
                && (position.getY() != pos.getY())
                && (position.getZ() != pos.getZ());
    }
    
    public Position getPosition() {
        return position;
    }
    
    public float getDistance() {
        return distance;
    }
    
}
