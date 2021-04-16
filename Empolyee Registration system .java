import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee
{
private String empName,empAddress;
private Long empId;
private int empAge;


public Employee(String empName,String empAddress, Long empId, int empAge)
{
this.empName=empName;
this.empAddress=empAddress;
this.empId=empId;
this.empAge=empAge;
}


public String getempName() {
return empName;
}
public void setName(String Name) {
empName = Name;
}
public String getempAddress() {
return empAddress;
}
public void setempAddress(String Address) {
empAddress = Address;
}
public Long getempId() {
return empId;
}
public void setempId(Long Id) {
empId = Id;
}
public int getempAge() {
return empAge;
}
public void setempAge(int Age) {
empAge =Age;
}


    
      
}  

public class Main
{
	public static void main(String[] args)
{



Scanner sc=new Scanner(System.in);
List<Employee> ListForEmployee= new ArrayList<Employee>();
List<Employee> templist= new ArrayList<Employee>();
String empName;
String empAddress;
long empId;
int empAge;
int count=0;
while(true)
{
System.out.print("\nThe Choices:\n1>Add\n2>Update\n3>Delte\n4>GET\n\n");
System.out.println("Enter the choice: ");
System.out.println("To quit type -1");
int num=sc.nextInt();
if(num == -1)
{
break;
}

switch(num)
{
case 1:
{
System.out.print("\nempName: ");
empName=sc.next();
System.out.print("\nempAddress: ");
empAddress=sc.next();

empId=(long)10125+count;
count++;
System.out.print("\nempAge: ");
empAge=sc.nextInt();

Employee employee1=new Employee(empName,empAddress,empId,empAge);
ListForEmployee.add(employee1);
System.out.println("Remember Employee Id : "+empId);
break;
}

case 2:
{
System.out.println("Enter the empId");
empId=sc.nextLong();

for(int j=0;j<ListForEmployee.size();j++)
     { 
         Employee temp=ListForEmployee.get(j) ;
         System.out.println(ListForEmployee.size()+" "+empId+" "+temp.getempId()+" "+j);
         if(empId==temp.getempId())
         {
             ListForEmployee.remove(j);
             System.out.println("Update values");
System.out.println("1 Name: ");

System.out.println("2 Age: ");

System.out.println("3 Address: ");

System.out.print("Enter your choice : ");
            int m = sc.nextInt();
            Employee employee1=null;
            switch(m)
            {
                case 1:
                    {
                        System.out.print("New Name :");
                        String name1=sc.next();
                        employee1=new Employee(name1,temp.getempAddress(),temp.getempId(), temp.getempAge());
                        ListForEmployee.add(j,employee1);
                        m=999;
                        break;
                    }
                case 2:
                    {
                        System.out.print("New Age :");
                        int ag = sc.nextInt();
                        employee1=new Employee(temp.getempName(),temp.getempAddress(),temp.getempId(),ag);
                        ListForEmployee.add(j,employee1);
                        m=999;
                        break;
                    }
                case 3:
                    { 
                        System.out.print("New Address :");
                        String name1=sc.next();
                        employee1=new Employee(temp.getempName(),name1,temp.getempId(),temp.getempAge());
                        ListForEmployee.add(j,employee1);
                        m=999;
                        break;
                    }
            }

if(m==999){
    break;
}




       
         }
         
     }




System.out.println("Employee Id not present...");
break;
}
case 3:
{
System.out.println("Enter the empId");
empId=sc.nextLong();
int mm=0;
for(int j=0;j<ListForEmployee.size();j++)
     { 
         Employee temp=ListForEmployee.get(j) ;
         System.out.println(empId+" "+temp.getempId());
         if(empId==temp.getempId())
         {
             ListForEmployee.remove(j);
             System.out.println("Employee deleted ....");
             mm=999;
             break;
}
}
if(mm!=999)
{
System.out.println("Employee Id not present...");
}
break;
}








case 4:
{





             System.out.println("=========================================================");
     for(int j=0;j<ListForEmployee.size();j++)
     {   
         Employee temp=ListForEmployee.get(j) ;

System.out.println( " empId : "+temp.getempId()+"\n empName : "+temp.getempName()+"\n empAddress : "+temp.getempAddress()+"\n empAge : "+temp.getempAge());
System.out.println("=========================================================");
     }  
              System.out.println("=========================================================");

break;
}

}


}
}

}