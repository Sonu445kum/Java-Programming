package CollectionFrameWork;
import java.util.Scanner;
import java.util.Vector;
import java.util.Iterator;
class Student{
   private int id;
   private String Name;
   private String phNo;
    //set the value for these Attributes;
     public void setId(int id1){
        this.id=id1;
    }
    int getId(){
        return id;
    }


     public void setName(String name1){
        this.Name=name1;
    }
    String getName(){
        return Name;
    }
    public void setPhNo(String phNo1){
        this.phNo=phNo1;
    }
    String getPhNo(){
        return phNo;
    }

    // Default constructor;
    public Student(){

    }

    // constructor with parameter;
    public Student(int i,String j,String k){
        this.id=i;
        this.Name=j;
        this.phNo=k;
    }
    @Override
    public String toString(){
        return "id:"+this.id+ "name:"+this.Name+ " PhNo:"+this.phNo;
    }
}
    public class StudentEx {
        public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Vector<Student>vi= new Vector<>();
        for(int i=0; i<3; i++) {

        System.out.println(" Id :");
        int   input1 = sc.nextInt();
        System.out.println("name :");
        String input2 = sc.nextLine();
        System.out.println(" Phone :");
        String  input3 = sc.nextLine();
        Student s = new Student(input1,input2,input3);
            vi.add(s);
    }
    // Print the Elements of vector with Iterator;
        Iterator<Student> itr=vi.iterator();
         while(itr.hasNext()){
         System.out.println(itr.next().toString()+" ");
    }

    }
}
