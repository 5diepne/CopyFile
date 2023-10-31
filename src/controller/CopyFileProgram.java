/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import view.Menu;

/**
 *
 * @author DiepTCNN
 */
public class CopyFileProgram extends Menu{
    Algorithm ar;
    public CopyFileProgram() {
        super("========== COPY PROGRAM ==========");
        ar = new Algorithm();
    }

    @Override
    public void execute() {
        ar.readFileConfig();
    }
    
}
