package employee.pkg01;

/**
 *
 * @author jihad 
 */
public class Employee01 {

private String name;
private int idNumber;
private String department;
private String position;

public Employee01() {
}
public Employee01(String name, int idNumber, String department, String position) {
this.name = name;
this.idNumber = idNumber;
this.department = department;
this.position = position;
}

public String getName() {
return name;
}
public void setName(String name) {
  this.name = name;
}
public int getIdNumber() {
  return idNumber;
}
public void setIdNumber(int idNumber) {
  this.idNumber = idNumber;
}
public String getDepartment() {
 return department;
}
public void setDepartment(String department) {
 this.department = department;
}
public String getPosition() {
return position;
}
public void setPosition(String position) {
 this.position = position;
}
@Override
public String toString() {
return String.format("data: %s %s %s %s", name, idNumber, department, position);
}
  public static void main(String[] args) {
  Employee01 first = new Employee01("Susan Meyers", 47899, "Marketing", "Sales Rep");
  Employee01 second = new Employee01("Mark Jones", 39119, "IT",  "Programmer");
  Employee01 third = new Employee01("Joy Rogers", 81774, "Manufacturing", "Engineer");
  System.out.println(first);
  System.out.println(second);
  System.out.println(third);
    }   
}

