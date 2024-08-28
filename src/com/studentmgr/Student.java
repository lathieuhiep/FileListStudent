package com.studentmgr;

public class Student {
    private String name, id, dob;
    private double point;

    // phương thức khởi tạo
    public Student(String name, String id, String dob, double point) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.point = point;
    }

    // phương thức in thông tin sinh viên
    public void print() {
        System.out.println("Tên: " + name + ", Mã sinh viên: " + id + ", Ngày sinh: " + dob + ", Điểm: " + point);
    }
}
