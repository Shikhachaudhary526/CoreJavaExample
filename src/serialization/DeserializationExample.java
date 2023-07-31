package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args){
        try{
            FileInputStream fileInputStream = new FileInputStream("Student.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student.id + " " +student.name);
            objectInputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
