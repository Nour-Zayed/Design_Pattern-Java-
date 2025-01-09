package observepattern;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {

    private String name; 
    private String availabilityMessage; // Updated to availabilityMessage for clarity
    private List<Observer> observerlist;

    public Course(String name) {
        this.name = name;
        observerlist = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observerlist.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerlist.remove(observer);
    }

    @Override
    public void notifyallObservers() {
        for (Observer obs : observerlist) {
            obs.update(availabilityMessage); // Correct message passed here
        }
    }

    public void setAvailability(boolean available) {
        // Constructing the message correctly
        availabilityMessage = "The course \"" + name + "\" is now " + 
                              (available ? "Available" : "Not Available");
        notifyallObservers();
    }

    void setAvaibility(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
