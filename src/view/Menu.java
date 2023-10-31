/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author DiepTCNN
 */
public abstract class Menu {
    protected String title;

    public Menu(String title) {
        this.title = title;
    }
    public void display() {
        System.out.println(title);
    }
    public abstract void execute();
    public void run() {
        execute();
    }
    
}
