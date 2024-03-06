import java.util.Scanner;
class Student {
    String name;
    int ma,hin,eng,his,math,sci,Total,avg;
    void std(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        name = sc.next();
    }

    void Displaystd(){
        System.out.println(name);
    }

    void marks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marathi Subjcet Marks(out of 100) :");
        ma = sc.nextInt();
        System.out.println("Enter Hindi Subjcet Marks (out of 100) :");
        hin = sc.nextInt();
        System.out.println("Enter English Subjcet Marks (out of 100) :");
        eng = sc.nextInt();
        System.out.println("Enter History Subjcet Marks (out of 100) :");
        his = sc.nextInt();
        System.out.println("Enter Maths Subjcet Marks (out of 100) :");
        math = sc.nextInt();
        System.out.println("Enter Science Subjcet Marks (out of 100) :");
        sci = sc.nextInt();
    }

    void total(){

        Total = ma+hin+eng+his+math+sci;
        System.out.println("Total Marks is:"+Total);
    }

    void avg(){
        avg = Total/6;
        System.out.println("Your Average Percentages is:"+avg+"%");
    }

    void grade(){
        if(Total>600){
            System.out.println("Please Enter Valid Marks"); 
        }

         else if (avg>60){
            System.out.println("Congratulations!!!! You Got First Class");
        }
        else if (avg<=59){
            System.out.println(" You Got Second Class"); 
        }
        else if (avg<=34){
            System.out.println(" Study Harder Next Time You Are Fail!!!!");
        }
    }   
}
public class GradeCal {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.std();
    s1.marks();
    s1.Displaystd();
    s1.total();
    s1.avg();
    s1.grade();



    
}
}