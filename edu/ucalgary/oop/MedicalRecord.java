/**
 * Medical record contains the medical records tat the doctors/ healthcare/ first responders
 * would need to provide care. It is as detailed as possible. 
 *
 *
 * @author svara 
 * @version 2.1
 * @since 1.0
 */

 package edu.ucalgary.oop;
 import edu.ucalgary.oop.Location;
 
 public class MedicalRecord {
     private Location location;
     private String treatmentDetails;
     private String dateOfTreatment;
 
     public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
         if (location == null || treatmentDetails == null || dateOfTreatment == null) {
             throw new IllegalArgumentException("Null arguments are not permitted");
         }
         if (!isValidDateFormat(dateOfTreatment)) {
             throw new IllegalArgumentException("Date format is invalid for date of treatment. ");
         }
         this.location = location;
         this.treatmentDetails = treatmentDetails;
         this.dateOfTreatment = dateOfTreatment;
     }
 
     public void setLocation(Location location) {
         this.location = location;
     }
 
     public Location getLocation() {
         return location;
     }
 
     public void setTreatmentDetails(String treatmentDetails) {
         this.treatmentDetails = treatmentDetails;
     }
 
     public String getTreatmentDetails() {
         return treatmentDetails;
     }
 
     public void setDateOfTreatment(String dateOfTreatment) {
         if (!isValidDateFormat(dateOfTreatment)) {
             throw new IllegalArgumentException("Date format is invalid for date of treatment. " );
         }
         this.dateOfTreatment = dateOfTreatment;
     }
 
     public String getDateOfTreatment() {
         return dateOfTreatment;
     }
 
 private boolean isValidDateFormat(String date) {
     String dateFormatRegex = "^\\d{4}-\\d{2}-\\d{2}$"; // get the format 
     return date.matches(dateFormatRegex); // check the date format 
 }
 }
 
 
 
 