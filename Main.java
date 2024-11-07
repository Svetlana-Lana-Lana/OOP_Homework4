public class Main {
    public static void main(String[] args) {

        TeacherController teacherController = new TeacherController();
        teacherController.create("Александр", "Жуков", "Сергеевич");
        teacherController.create("Ирина", "Спинко", "Игоревна");
        teacherController.create("Наталья", "Мотина", "Александровна");
        teacherController.sendOnConsoleStudent();

        
    }

}
