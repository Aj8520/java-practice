package main.coveriant;

/*
 * Covariant return type in JAVA expects that the overriding function 
 * in sub-class can have different return data type and not the same
 *  return type as that of parent class function, provided that the return
 *  type of the overriding function in the sub-class is a sub-type of Parent’s
 *  return type.
 */

class Marks {

}

class SubjectMarks extends Marks {

}

class Departments {
    public Marks getMarks() {
        System.out.println("getMarks() function from Department class");
        return new Marks();
    }
}

class Students extends Departments {
    @Override
    public Marks getMarks() {
        System.out.println("getMarks() function from students class");
        return new SubjectMarks();
    }
}

public class coverient {

    public static void main(String[] args) {
        Departments dept = new Departments();
        dept.getMarks();

        Students stud = new Students();
        stud.getMarks();
    }

}
