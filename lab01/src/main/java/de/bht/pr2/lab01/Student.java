package de.bht.pr2.lab01;

import java.util.ArrayList;
import java.util.List;

public class Student {


  //-------------------------------------------
  // Attribute
  private String name = "";

  // Matrikelnummer
  private int registrationNumber = 0;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private String courseOfStudies = "";

  // Rückmeldegebühr
  public static final double TUITION_FEE = 312;

  String[] studies = {""};
  

  private double paid_ammount = 0.0;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */


  
  public Student(String dataRow) throws StudentParseException, NotPaidTuitionFeeException, RegistrationNumberException, WrongCourseOfStudiesException{

          int commaCount = 0;
          for (int i = 0; i < dataRow.length(); i++) {
          if (dataRow.charAt(i) == ',') {
            commaCount++;
            }
          }
          
          //exception will be thrown here if there are less or more commas in dataRow.
          if(commaCount != 3){
            
          }

              String[] splitted_data = dataRow.trim().split(",");

              this.name = splitted_data[0].trim();
              
              
              this.registrationNumber = Integer.parseInt(splitted_data[1].trim());
              

              this.courseOfStudies = splitted_data[2].trim();


              this.paid_ammount = Double.parseDouble(splitted_data[3].trim());
              
              
            
           
        }
      }


