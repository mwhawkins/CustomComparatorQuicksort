/*
 * @author: Michael Hawkins
 * @description: A custom comparator for the Student class
 */
package CompSci;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.projectGrade < s2.projectGrade){
            return -1;
        }else if (s1.projectGrade > s2.projectGrade){
            return 1;
        }else{
            return 0;
        }
    }
    
}
