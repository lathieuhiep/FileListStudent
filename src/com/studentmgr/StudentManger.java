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

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
