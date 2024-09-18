public class TestPerson {
    public static void main(String[] args) {
        
        Student student = new Student("Badhri", "123 Main St", "Computer Science", 2024, 5000.00);
        System.out.println();
        System.out.println(student.toString());

        
        student.setProgram("Data Science");
        student.setYear(2025);
        student.setFee(6000.00);
        System.out.println(student.toString());
        System.out.println();

        
        Staff staff = new Staff("Lakshmi", "214 Gandhi Road", "High School", 40000.00);
        System.out.println(staff.toString());

        
        staff.setSchool("GCT");
        staff.setPay(45000.00);
        System.out.println(staff.toString());
        System.out.println();
    }
}
