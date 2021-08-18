import java.util.List;

public class Exams {

  private int idNumber;

  public int getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(int idNumber) {
    this.idNumber = idNumber;
  }

  public char getName() {
    return name;
  }

  public void setName(char name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Subjects> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<Subjects> subjects) {
    this.subjects = subjects;
  }

  private char name;

  private String password;

    public List<Subjects> subjects;

}