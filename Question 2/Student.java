/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortstudent;

import java.util.*;

public class Student {
    private int id;
    private String firstname;
    private double gpa;
    public Student(int id, String firstname, double gpa) {
      super();
      this.id = id;
      this.firstname = firstname;
      this.gpa = gpa;
    }
    public int getId() {
      return id;
    }
    public String getFirstname() {
      return firstname;
    }
    public double getGpa() {
      return gpa;
    }
}
