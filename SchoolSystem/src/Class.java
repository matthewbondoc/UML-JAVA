import java.util.List;

public class Class {

  private int classCode;

  private char enrolledStudents;

  public int getClassCode() {
    return classCode;
  }

  public void setClassCode(int classCode) {
    this.classCode = classCode;
  }

  public char getEnrolledStudents() {
    return enrolledStudents;
  }

  public void setEnrolledStudents(char enrolledStudents) {
    this.enrolledStudents = enrolledStudents;
  }

  public char getAssignedTeacher() {
    return assignedTeacher;
  }

  public void setAssignedTeacher(char assignedTeacher) {
    this.assignedTeacher = assignedTeacher;
  }

  public List<Teachers> getTeachers() {
    return teachers;
  }

  public void setTeachers(List<Teachers> teachers) {
    this.teachers = teachers;
  }

  public List<Subjects> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<Subjects> subjects) {
    this.subjects = subjects;
  }

  public List<Students> getStudents() {
    return students;
  }

  public void setStudents(List<Students> students) {
    this.students = students;
  }

  private char assignedTeacher;

    public List<Teachers> teachers;
      public List<Subjects> subjects;
    public List<Students> students;

  public void classList() {
  }

}