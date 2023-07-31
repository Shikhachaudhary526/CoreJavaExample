package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
public static void main(String[] args) {
    Student student = new Student();
    student.setId(1);
    student.setName("Pushkar");
    try {
        FileOutputStream fileOutputStream = new FileOutputStream("Student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        System.out.println("Serialization is successful");

    }
    catch (Exception ex){
        ex.printStackTrace();
    }
}
}
