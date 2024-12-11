/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import Model.Patient;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author ERNEST || OBED || PROSPER || ABRAHAM ||
 */
public class DatabaseConnector {
    // data members
    private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "my-secret-pw";
    
    // CRUD Operations on Database
    
    // C - Create: Inserting data into the database
    public static void addPatient(Patient p1) throws SQLException{
        String query="INSERT INTO patient(firstname, lastname, age, phonenumber, emailAddress, gender, patientType, comment) values(?, ?, ?, ?, ?, ?, ?, ?)";
        // String query = "INSERT INTO patient(first_name, last_name, gender, patient_type, age) VALUES (?, ?, ?, ?, ?) ";
        //INSERT INTO patient(firstname,lasttname,age,phonenumber,emailAddress,gender,patientType,comment,dateOfBirth) values('Kofi'','kay',20,'949','kodfi@ew.com','Male','Walk in','Okay','01/05/2004');
        
        try{
            // Create a connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1,p1.getFirstname());
            stmt.setString(2, p1.getLastname());
            stmt.setString(3, p1.getAge());
            stmt.setString(4, p1.getPhonenumber());
            stmt.setString(5, p1.getEmailAddress());
            stmt.setString(6, p1.getGender());
            stmt.setString(7, p1.getPatientType());
            stmt.setString(8, p1.getComment());
            //stmt.setDate(9, (Date) p1.getDateOfBirth());
            //stmt.setDate(9, new Date(p1.getDateOfBirth().getTime()));
                  
            //stmt.setInt(5, p1.getAge());
            int rows = stmt.executeUpdate();
            System.out.println("Rows inserted: "+rows);
            // After this query will look like:
//            "INSERT INTO patient(first_name, gender, patient_type) VALUES ('Rish', 'Male', 'Appointment') "
            
            // Close the connection
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        
        
    }
    // R - Read: Getting all the values from the database
    public static ArrayList<Patient> getPatients(){
        ArrayList <Patient> patients = new ArrayList();
        String query = "SELECT * FROM patient";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Patient p1 = new Patient();
                p1.setId(rs.getInt("id"));
                p1.setFirstname(rs.getString("firstName"));
                p1.setLastname(rs.getString("lastName"));
                p1.setAge(rs.getString("age"));
                p1.setPhonenumber(rs.getString("phonenumber"));
                p1.setEmailAddress(rs.getString("emailAddress"));
                p1.setGender(rs.getString("gender"));
                p1.setPatientType(rs.getString("patientType"));
                p1.setComment(rs.getString("comment"));
                p1.setDateOfBirth(rs.getDate("dateOfBirth"));
                patients.add(p1);
            }
            rs.close();
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
        return patients;
    }
    
    public static void getPatientName(){
        String query = "SELECT first_name, last_name FROM patient";
    }
    
    // U - Update: Changing a value in the database
    public static void updatePatient(Patient oldPatient, Patient updatedPatient){
            String query = "UPDATE patient SET firstname = ?, lastname=?, age=?, phonenumber=?, emailAddress=?, gender = ?,  patientType = ?, comment=? WHERE id = ? ";
            // Update the query
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, updatedPatient.getFirstname());
            stmt.setString(2, updatedPatient.getLastname());
            stmt.setString(3, updatedPatient.getAge());
            stmt.setString(4, updatedPatient.getPhonenumber());
            stmt.setString(5, updatedPatient.getEmailAddress());
            stmt.setString(6, updatedPatient.getGender());
            stmt.setString(7, updatedPatient.getPatientType());
            stmt.setString(8, updatedPatient.getComment());
            //stmt.setDate(9, (Date) updatedPatient.getDateOfBirth());
            
            
            stmt.setInt(9, oldPatient.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows updated: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    // D - Delete 
    public static void deletePatient(Patient p1){
        String query = "DELETE FROM patient WHERE id = ? ;";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, p1.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows deleted: "+rows);
            conn.close();
        } catch (SQLException sqle){
            System.out.println("SQL Exception Occured.");            
            System.out.println(sqle);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}
