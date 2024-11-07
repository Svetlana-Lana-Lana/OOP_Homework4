public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String lastName, String middleName){
        teacherService.create(firstName, lastName, middleName);
    }

    public void sendOnConsoleStudent(){
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }

}
