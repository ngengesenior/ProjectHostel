package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Student {
    private StringProperty name;
    private StringProperty ubNumber;
    private StringProperty hostel;


    public Student(String name, String ubNumber, String
            hostel) {
        this.name = new SimpleStringProperty(name);
        this.ubNumber = new SimpleStringProperty(ubNumber);
        this.hostel = new SimpleStringProperty(hostel);
    }


    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getUbNumber() {
        return ubNumber.get();
    }

    public void setUbNumber(String ubNumber) {
        this.ubNumber.set(ubNumber);
    }

    public StringProperty ubNumberProperty() {
        return ubNumber;
    }

    public String getHostel() {
        return hostel.get();
    }

    public void setHostel(String hostel) {
        this.hostel.set(hostel);
    }

    public StringProperty hostelProperty() {
        return hostel;
    }

}
