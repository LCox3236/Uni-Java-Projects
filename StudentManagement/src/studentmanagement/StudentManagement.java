package studentmanagement;
public class StudentManagement {


    public static void main(String[] args) {
        /*Student stu = new Student("lewis","cox","cyber security");
                stu.setFeesPaidT();
        System.out.println(stu.getAllInfo());*/
        
        
        Admin students = new Admin();
        
        students.newStu("lewis", "cox", "cyber security");
        students.newStu("testing", "stuent", "computing");
        
        students.printAllinfo("lewis");
        students.printAllinfo("testing");
        
        
        
    }
    
}
