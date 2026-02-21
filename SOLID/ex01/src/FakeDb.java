import java.util.ArrayList;
import java.util.List;

class FakeDb implements StudentRepository {

    private List<StudentRecord> students = new ArrayList<>();

    public void save(StudentRecord record) {
        students.add(record);
    }

    public int count() {
        return students.size();
    }

    public void dump() {
        System.out.println("\n-- DB DUMP --");
        System.out.println("| ID             | NAME | PROGRAM |");
        for (StudentRecord s : students) {
            System.out.printf("| %-15s | %-4s | %-7s |\n",
                    s.getId(), s.getName(), s.getProgram());
        }
    }
}