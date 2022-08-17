package Core.BuoiBonus.ExtraExcercise.BaiTap2.Service;

public interface GeneralService<T> {
    int findIndexById(int id);

    void add(T t);

    void update(T t, int id);

    void deleteById(int id);

    void print();

    void sort();
    void sortMinToMaxOfMath();
    void sortMaxToMinOfPhys();
    T getNameStudent(int id);
}
