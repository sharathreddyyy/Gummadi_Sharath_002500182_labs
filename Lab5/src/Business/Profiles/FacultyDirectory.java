/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import java.util.ArrayList;
import Business.Person.Person;
/**
 *
 * @author sharathreddy
 */
public class FacultyDirectory {
    ArrayList<FacultyProfile> facultyList;

    public FacultyDirectory() {
        facultyList = new ArrayList<>();
    }

    public FacultyProfile newFacultyProfile(Person p) {
        FacultyProfile fp = new FacultyProfile(p);
        facultyList.add(fp);
        return fp;
    }

    public ArrayList<FacultyProfile> getFacultyList() {
        return facultyList;
    }
}
