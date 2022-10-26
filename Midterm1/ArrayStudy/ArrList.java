package Midterm1.ArrayStudy;

public class ArrList implements ArrInt{
    int _maxPerson = 10;
    Person[] _pList = new Person[_maxPerson];
    int _iteration = 0;

    @Override
    public void insert(String fName, String lName, String task) {
        Person newPerson = new Person(fName, lName, task);
        _pList[_iteration] = newPerson;
        _iteration ++;
    }

    @Override
    public void delete(String fName) {
        for (int i=0; i < _iteration; i++) {
            if (_pList[i].getFName().equals(fName)) {
                _pList[i].setFName(null);
                _pList[i].setLName(null);
                _pList[i].setTask(null);
            }
        }
    }

    @Override
    public void show() {
        for (int i=0; i < _iteration; i++) {
            String fName = _pList[i].getFName();
            String lName = _pList[i].getLName();
            String task = _pList[i].getTask();
            System.out.println(fName + " " + lName + " has the task of " + task);
        }
    }
}
