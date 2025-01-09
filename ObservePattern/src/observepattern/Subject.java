/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observepattern;

/**
 *
 * @author NooR
 */
public interface Subject {
    public void register(Observer observer);
    public void unregister (Observer observer);
    public void notifyallObservers();
}
