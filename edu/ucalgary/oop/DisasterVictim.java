// DisasterVictim Code File

package edu.ucalgary.oop;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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
    private static int counter;

    // Constructor
    public DisasterVictim(String firstName, String ENTRY_DATE){
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
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
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
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

    }
    public void removePersonalBelonging(Supply supply){

    }
    public void addFamilyConnection(FamilyRelation familyConnection){

    }
    public void removeFamilyConnection(FamilyRelation familyConnection){

    }
    public void addMedicalRecord(MedicalRecord medicalRecord){

    }

    // Functions to throw illeagal Argument Exceptions
    public void DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException{

    }

    public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException{

    }
    
}