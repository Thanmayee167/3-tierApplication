/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saithanmayeebukkittu
 */
public class StudentService {
    public static Student getStudentById(int id) {
        return StudentDAO.getStudentById(id); // Calls Data Layer
    }
}
