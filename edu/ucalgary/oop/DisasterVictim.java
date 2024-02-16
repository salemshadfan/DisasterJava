// DisasterVictim Code File

package edu.ucalgary.oop;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private MedicalRecord[] medicalRecords;
    private FamilyRelation[] familyConnections;
    private String ENTRY_DATE;
    private Supply[] personalBelongings;
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
        this.medicalRecords = new MedicalRecord[10];
        this.ASSIGNED_SOCIAL_ID = ++counter;
        this.familyConnections = new FamilyRelation[10];
        this.personalBelongings = new Supply[10];
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
    public MedicalRecord[] getMedicalRecords(){
        return this.medicalRecords;
    }
    public String getEntryDate(){
        return this.ENTRY_DATE;
    }
    public int getAssignedSocialID(){
        return this.ASSIGNED_SOCIAL_ID;
    }
    public Supply[] getPersonalBelongings(){
        return personalBelongings;
    }
    public FamilyRelation[] getFamilyConnections(){
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
    public void setMedicalRecords(MedicalRecord[] medicalRecords){
        this.medicalRecords = medicalRecords;
    }
    public void setPersonalBelongings(Supply[] supplies){
        this.personalBelongings = supplies;
    }
    public void setFamilyConnections(FamilyRelation[] relation){
        this.familyConnections = relation;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    
    // setters/getters involving use of other classes
    public void addPersonalBelonging(Supply supply){
        for (int i = 0; i < personalBelongings.length; i++) {
            if (personalBelongings[i] == null) {
                personalBelongings[i] = supply;
                break;
            }
        }
    }
    public void removePersonalBelonging(Supply supply){
        if (personalBelongings != null) {
            for (int i = 0; i < personalBelongings.length; i++) {
                if (personalBelongings[i] != null && personalBelongings[i].equals(supply)) {
                    personalBelongings[i] = null;
                    break;
                }
            }
        }
    }
    public void addFamilyConnection(FamilyRelation familyConnection){
        for (int i = 0; i < familyConnections.length; i++) {
            if (familyConnections[i] == null) {
                familyConnections[i] = familyConnection;
                break;
            }
        }
    }
    public void removeFamilyConnection(FamilyRelation familyConnection){
        if (familyConnections != null) {
            for (int i = 0; i < familyConnections.length; i++) {
                if (familyConnections[i] != null && familyConnections[i].equals(familyConnection)) {
                    familyConnections[i] = null;
                    break;
                }
            }
        }
    }
    public void addMedicalRecord(MedicalRecord medicalRecord){
        for (int i = 0; i < medicalRecords.length; i++) {
            if (medicalRecords[i] == null) {
                medicalRecords[i] = medicalRecord;
                break;
            }
        }
    }
}
