import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO (String firstName, String lasttName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lasttName, middleName);

    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }

}
