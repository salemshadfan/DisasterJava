// DisasterVictim Code File

package edu.ucalgary.oop;

import java.util.List;
import java.util.ArrayList;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private List<MedicalRecord> medicalRecords;
    private List<FamilyRelation> familyConnections;
    private String ENTRY_DATE;
    private List<Supply> personalBelongings;
    private String gender;
    private static int counter = 0;
    private static final String regex = "\\d{4}-\\d{2}-\\d{2}";

    // Constructor
    public DisasterVictim(String firstName, String ENTRY_DATE){
        this.firstName = firstName;
        if (ENTRY_DATE.matches(regex)) {
            this.ENTRY_DATE = ENTRY_DATE;
        } 
        else {
        throw new IllegalArgumentException("Entry date must be in the format YYYY-MM-DD");
        }
        this.medicalRecords = new ArrayList<>();
        this.ASSIGNED_SOCIAL_ID = ++counter;
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
    }

    // getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public String getComments(){
        return this.comments;
    }
    public List<MedicalRecord> getMedicalRecords(){
        return this.medicalRecords;
    }
    public String getEntryDate(){
        return this.ENTRY_DATE;
    }
    public int getAssignedSocialID(){
        return this.ASSIGNED_SOCIAL_ID;
    }
    public List<Supply> getPersonalBelongings(){
        return personalBelongings;
    }
    public List<FamilyRelation> getFamilyConnections(){
        return this.familyConnections;
    }
    public String getGender(){
        return this.gender;
    }
    
    // setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        if (dateOfBirth.matches(regex)) {
            this.dateOfBirth = dateOfBirth;
        } 
        else {
        throw new IllegalArgumentException("Date of birth must be in the format YYYY-MM-DD");
        }
    }
    public void setComments(String comments){
        this.comments = comments;
    }
    public void setMedicalRecords(List<MedicalRecord> medicalRecords){
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelongings(List<Supply> supplies){
        this.personalBelongings = supplies;
    }
    public void setFamilyConnections(List<FamilyRelation> relation){
        this.familyConnections = relation;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
    // setters/getters involving use of other classes
    public void addPersonalBelonging(Supply supply){
        if (personalBelongings == null) {
            personalBelongings = new ArrayList<>();
        }
        personalBelongings.add(supply);
    }
    public void removePersonalBelonging(Supply supply){
        if (personalBelongings != null) {
            personalBelongings.remove(supply);
        }
    }
    public void addFamilyConnection(FamilyRelation familyConnection){
        if (familyConnections == null) {
            familyConnections = new ArrayList<FamilyRelation>();
        }
        familyConnections.add(familyConnection);
    }
    public void removeFamilyConnection(FamilyRelation familyConnection){
        if (familyConnections != null) {
            familyConnections.remove(familyConnection);
        }
    }
    public void addMedicalRecord(MedicalRecord medicalRecord){
        if (medicalRecords == null) {
            medicalRecords = new ArrayList<MedicalRecord>();
        }
        medicalRecords.add(medicalRecord);
    }
}
