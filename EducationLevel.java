/**
 * @(#)EducationLevel.java
 *
 *
 * @author David Tormey
 * @version 1.00 2020/3/8
 */
package studenthelpapplication;

/**
 *
 * This class is used to find out the education level of a student based on the
 * student Id
 */
public class EducationLevel {

    //This arrray of string store the data of the education Level
    private String educationData[] = {"Primary School", "Primary School", "Primary School", "Secondary School – Junior Cycle", "Secondary School – Junior Cycle", "Secondary School – Junior Cycle", "Secondary School – Senior Cycle", "Secondary School – Senior Cycle", "Secondary School – Senior Cycle", "Secondary School – Senior Cycle"};
    public String studentId;

    //Constructor
    public EducationLevel(String studentId) {
        this.studentId = studentId;
    }

    public EducationLevel() {
    }

    //Getters/Setter
    public String[] getEducationData() {
        return educationData;
    }

    public void setEducationData(String[] educationData) {
        this.educationData = educationData;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public String getSpecificEducationDataData(int index) {
        if (index >= 0 && index < this.educationData.length) {
            return educationData[index];
        } else {
            return "";
        }
    }

    /**
     *
     * @return the string describing the student's education level
     */

    public String subjectOutput() {

        return "The Education Level for Student having ID " + this.getStudentId() + " is " + this.getSpecificEducationDataData(Integer.parseInt( ""+this.getStudentId().charAt(this.getStudentId().length()-1)) );

    }

}
