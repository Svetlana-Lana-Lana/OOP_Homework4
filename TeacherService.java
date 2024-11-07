import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{

    private final List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }



    @Override
    public void create(String firstName, String lastName, String middleName) {
        int maxID = 0;
        for (Teacher teacher : teacherList){
            if (maxID < teacher.getTeacherId())
            maxID = teacher.getTeacherId();

        }
        maxID++;
        teacherList.add(new Teacher(firstName, lastName, middleName, maxID));
    }

}
