package com.studentmgr;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentManger {
    private ArrayList<Student> listStudent = new ArrayList<>();

    public void addStudentFromFile(String path) {
        File file = new File(path);
        StringBuilder text = new StringBuilder();

        try {
            if ( !file.exists() ) {
                System.out.println("File khong ton tai");
                return;
            }

            FileInputStream in = new FileInputStream(file);
            byte[] gioByte = new byte[1024];
            int soLuongByte = in.read(gioByte);

            while (soLuongByte > 0) {
                String chuoi = new String(gioByte, 0, soLuongByte);
                text.append(chuoi);

                soLuongByte = in.read(gioByte);
            }

            if ( !text.isEmpty() ) {
                String[] students = text.toString().split(",");

                for (String student : students) {
                    String[] info = student.split("-");
                    String name = info[0];
                    String id = info[1];
                    String dob = info[2];
                    double point = ( info.length > 3 ) ? Double.parseDouble(info[3]) : 0.0;

                    listStudent.add(new Student( name, id, dob, point ));
                }

                for ( Student student : listStudent ) {
                    student.printStudents();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
