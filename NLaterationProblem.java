/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ubfc.embedded.nlaterationproblem;

/**
 *
 * @author Tsevi Fiacre & Rifat Jahan Lia
 */
public class NLaterationProblem {
    
    public static int N = 4;
    public static float Step = 0.1f;

    public static void main(String[] args) {
        
        // Creation of Emitters
        Emitter[] ems = new Emitter[N];
        // Positions
        Position[] pos = {
                new Position(0.5f, 0.5f, 0.5f),
                new Position(4.0f, 0, 0),
                new Position(4.0f, 5.0f, 5.0f),
                new Position(3.0f, 3.0f, 3.0f)
        };
        // Distances
        float[] dis = {3.0f, 2.0f, 4.2f, 2.5f};
        
        // Initialisation of Emitters
        for(int i = 0; i < N; i++) {
            ems[i] = new Emitter(pos[i], dis[i]);
        }
        
        // Initialisation of Receiver
        Position receiver = new Position(0, 0, 0);
        
        // Minimal Sum Distances
        double mini_sum_dist = 0;
        float max_x = 0, max_y = 0, max_z = 0;
        // First Calculation From Origine (0, 0, 0)
        for(Emitter e: ems) {
            mini_sum_dist += e.getDistanceFrom(receiver);
            max_x = Math.max(max_x, e.getPosition().getX());
            max_y = Math.max(max_y, e.getPosition().getY());
            max_z = Math.max(max_z, e.getPosition().getZ());
        }
        // Processing Min Sum Dist
        for(float x = 0; x < max_x+1; x += Step) {
            for(float y = 0; y < max_y+1; y += Step) {
                for(float z = 0; z < max_z+1; z += Step) {
                    Position tmp_pos = new Position(x, y, z);
                    double dist = 0;
                    for(Emitter e: ems) {
                        dist += e.getDistanceFrom(tmp_pos);
                    }
                    // Emitter tmp_e = new Emitter(tmp_pos, 0);
                    // double dist = tmp_e.getDistanceFrom(receiver);
                    System.out.println(dist);
                    if(dist < mini_sum_dist) {
                        mini_sum_dist = dist;
                        receiver.setPosition(x, y, z);
                    }
                }
            }
        }
        
        // Print Output
        System.out.println(String.format("Mini Sum Distances = %.2f", mini_sum_dist));
        System.out.println(String.format("Receiver Coords: %s", receiver.toString()));
        
    }
}
