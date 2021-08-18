import java.util.List;

public class Subjects {

  private int subjectCode;

  private int lectureHours;

  private int labHours;

    public List<Class> classes;
    public List<Exams> exams;

  public void lectures() {
  }

  public void experiments() {
  }

  public int getSubjectCode() {
    return subjectCode;
  }

  public void setSubjectCode(int subjectCode) {
    this.subjectCode = subjectCode;
  }

  public int getLectureHours() {
    return lectureHours;
  }

  public void setLectureHours(int lectureHours) {
    this.lectureHours = lectureHours;
  }

  public int getLabHours() {
    return labHours;
  }

  public void setLabHours(int labHours) {
    this.labHours = labHours;
  }

  public List<Class> getClasses() {
    return classes;
  }

  public void setClasses(List<Class> classes) {
    this.classes = classes;
  }

  public List<Exams> getExams() {
    return exams;
  }

  public void setExams(List<Exams> exams) {
    this.exams = exams;
  }
}