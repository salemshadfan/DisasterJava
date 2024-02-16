// Location Code File

package edu.ucalgary.oop;
import java.util.ArrayList;
public class Location {
 
    private String name;
 
    private String address;
 
    private ArrayList<DisasterVictim> victims;
 
    private ArrayList<Supply> supplies;
 
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.victims = new ArrayList<>();
        this.supplies = new ArrayList<>();
    }
 
    public String getName() {
        return this.name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAddress() {
        return this.address;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public ArrayList<Supply> getSupplies() {
        return this.supplies;
    }
 
    public void setSupplies(ArrayList<Supply> supplies) {
        this.supplies = supplies;
    }
 
    public void addSupply(Supply supply) {
        this.supplies.add(supply);
    }
 
    public void removeSupply(Supply supply) {
        this.supplies.remove(supply);
    }
 
    public ArrayList<DisasterVictim> getOccupants() {
        return this.victims;
    }
 
    public void addOccupant(DisasterVictim victim) {
        this.victims.add(victim);
    }
 
    public void removeOccupant(DisasterVictim victim) {
        this.victims.remove(victim);
    }
 
    public void setOccupants(ArrayList<DisasterVictim> victims) {
        this.victims = victims;
    }
 
    public void updateLog(String name, String address) {
        this.name = name;
        this.address = address;
    }
 
 
 
 
 
}