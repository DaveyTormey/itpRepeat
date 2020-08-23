/**
 * @(#)Subjects.java
 *
 *
 * @author David Tormey
 * @version 1.00 2020/3/8
 */
package studenthelpapplication;

/**
 *
 * This class is used to find out the subject of a student based on the student
 * Id
 */

public class Subjects {

    private String subjectData[] = {"Maths", "Maths", "Geography", "Geography", "History", "History", "Irish", "Irish", "Science", "Science"};
    public String studentId;

    //Constructor
    public Subjects(String studId) {
        this.studentId = studentId;
    }

    public Subjects() {
    }


    public String getSpecificSubjectData(int index) {
        if (index >= 0 && index < this.subjectData.length) {
            return subjectData[index];
        } else {
            return "";
        }
    }

    //Getter/Setter
    public String[] getSubjectData() {
        return subjectData;
    }

    public void setSubjectData(String[] subjectData) {
        this.subjectData = subjectData;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     *
     * @return the string describing the student's subject
     */

    public String educationOutput() {

        return "The Subject for Student having ID " + this.getStudentId() + " is " + this.getSpecificSubjectData(Integer.parseInt(  ""+this.getStudentId().charAt( this.getStudentId().length() -2)));

    }

}
