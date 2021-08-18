import java.util.List;

public class Program {

  public int enrolledStudents;

  public int units;

    public List<Administration> administration;
      public List<Program> program;
    public List<Teachers> teachers;
    public List<Students> students;

  public void getEnrolledStudents() {
  }

  public void setEnrolledStudents(int enrolledStudents) {
    this.enrolledStudents = enrolledStudents;
  }

  public int getUnits() {
    return units;
  }

  public void setUnits(int units) {
    this.units = units;
  }

  public List<Administration> getAdministration() {
    return administration;
  }

  public void setAdministration(List<Administration> administration) {
    this.administration = administration;
  }

  public List<Program> getProgram() {
    return program;
  }

  public void setProgram(List<Program> program) {
    this.program = program;
  }

  public List<Teachers> getTeachers() {
    return teachers;
  }

  public void setTeachers(List<Teachers> teachers) {
    this.teachers = teachers;
  }

  public List<Students> getStudents() {
    return students;
  }

  public void setStudents(List<Students> students) {
    this.students = students;
  }
}