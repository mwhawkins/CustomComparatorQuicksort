/*
 * @author: Michael Hawkins
 * @description: The student class for use in doing custom comparisons
 */
package ComSci;

class Student {
    public int projectGrade = 0;
    
    public Student(int grade)
    {
        this.projectGrade = grade;
    }
    
    @Override
    public String toString(){
        return "Student With Grade: " + Integer.toString(projectGrade) + "\n";
        
    }
}
