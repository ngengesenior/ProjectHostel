package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentListController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Student> studentTableView;

    @FXML
    private TableColumn<Student, String> nameColumn;

    @FXML
    private TableColumn<Student, String> ubNumberColumn;

    @FXML
    private TableColumn<Student, String> hostelColumn;

    @FXML
    void itemClicked(MouseEvent event) {
        Student student = studentTableView.getSelectionModel().getSelectedItem();
        System.out.println(student.getName());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        ubNumberColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("ubNumber"));
        hostelColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("hostel"));

        //load dummy data

        studentTableView.setItems(getPeople());


    }

    private ObservableList<Student> getPeople() {

        ObservableList<Student> students = FXCollections.observableArrayList();
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Junior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        students.add(new Student("Ngenge Senior", "SC1$B373", "St. Martin Hostel"));
        return students;
    }
}
