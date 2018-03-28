/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortstudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortStudent {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Please key in total records to key in :" );
        int testCases = Integer.parseInt(in.nextLine());
        System.out.println("Key in records as format ID Name GPA :" );
        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
        }
        Collections.sort(studentList, new Comparator<Student>() {
              
        @Override
        public int compare(Student s1, Student s2) {
            if(s2.getGpa()>s1.getGpa()){
                return 1;
            }else if(s2.getGpa()<s1.getGpa()){
                return -1;
            }
            return s1.getFirstname().compareTo(s2.getFirstname());
        }
        });
         System.out.println("Result");
         System.out.println("========");
         for(Student st: studentList){
             
         System.out.println(st.getFirstname());
      }
    }
    
}
