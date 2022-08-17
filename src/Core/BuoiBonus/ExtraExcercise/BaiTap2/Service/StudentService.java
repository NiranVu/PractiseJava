package Core.BuoiBonus.ExtraExcercise.BaiTap2.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Core.BuoiBonus.ExtraExcercise.BaiTap2.Model.Student;

public class StudentService implements GeneralService<Student> {

    private List<Student> listStudent = new ArrayList<>();
    private int flagId;

    public StudentService() {
        listStudent.add(new Student(0, "GG", 22, 10, 10));
        listStudent.add(new Student(1, "HH", 10, 5, 6));
        listStudent.add(new Student(2, "DD", 15, 9, 8));
        listStudent.add(new Student(3, "CC", 18, 7, 6));
    }


    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Student student) {
        flagId = listStudent.size();
        student.setId(flagId);
        listStudent.add(student);
    }

    @Override
    public void update(Student student, int id) {
        int index = findIndexById(id);
        listStudent.set(index, student);
    }

    @Override
    public void deleteById(int id) {
        int index = findIndexById(id);
        listStudent.remove(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }
    }

    @Override
    public void sort() {
        listStudent.sort(Comparator.comparing(Student::getName));
    }

    @Override
    public void sortMinToMaxOfMath() {
        listStudent.sort(Comparator.comparing(Student::getPointMath));
    }

    @Override
    public void sortMaxToMinOfPhys() {
        listStudent.sort((o1, o2) -> {
            if (o1.getPointPhys() > o2.getPointPhys()) {
                return -1;
            } else if (o1.getPointPhys() == o2.getPointPhys()) {
                return 0;
            }
            return 1;
        }); 
    }


    @Override
    public Student getNameStudent(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return listStudent.get(i);
            }
        }
        return null;
    }
    
}
