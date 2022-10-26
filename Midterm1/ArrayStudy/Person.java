package Midterm1.ArrayStudy;

public class Person {
    private String _fName;
    private String _lName;
    private String _task;

    Person(String fName, String lName, String task) {
        setFName(fName);
        setLName(lName);
        setTask(task);
    }

    public void setFName(String fName) {
        _fName = fName;
    }

    public void setLName(String lName) {
        _lName = lName;
    }

    public void setTask(String task) {
        _task = task;
    }

    public String getFName() {
        return _fName;
    }

    public String getLName() {
        return _lName;
    }

    public String getTask() {
        return _task;
    }
}
