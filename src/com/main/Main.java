package com.main;

import com.studentmgr.StudentManger;

public class Main {
    public static void main(String[] args) {
        StudentManger studentManger = new StudentManger();

        studentManger.addStudentFromFile("D:/java-exercises/bai-tap-buoi-19/test-folder-file/ListStudent.txt");
    }
}