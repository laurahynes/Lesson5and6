
package Lesson5;


public class StudentTester {

    
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Bob Smith");
        System.out.println("Student name is " + s.getName());
        
        //setting tests
        s.setScore(1, 76);
        s.setScore(2, 85);
        s.setScore(3, 99);
        
        System.out.println("Here are " + s.getName() + "'s 3 scores");
        for (int i = 1; i <= 3; i++) {
            System.out.println(s.getScore(i));
        }
        
        System.out.format("The top score for %s is %d\n",s.getName(), s.getHighScore());
        System.out.format("The average score for %s is %d\n",s.getName(),s.getAverage());
        
        System.out.println(s);//will run toString automatically
        
        Student s2 = new Student("Jenn Hopper",76,82,90);
        System.out.println(s2);
        
        //make student using other students properties
        Student s3 = new Student(s);
        System.out.println("This is student 3");
        System.out.println(s3);
        
        //4th student ?? -> NO, just another reference to s
        Student s4 = s;
        System.out.println("This is student 4");
        System.out.println(s4);
        s4.setName("Jill");
        System.out.println("Original student is " + s.getName());
        
    }
    
}
