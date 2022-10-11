public class homeworkFive {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov", "Programmer", "ivanov@mail.ru", "89123456",70000,45);
        empCorp[1] = new Employee("Petrov", "Qa engineer", "petrov@mail.ru", "892987744",50000,22);
        empCorp[2] = new Employee("Sidorov", "Programmer", "sidorov@mail.ru", "89456321",60000,41);
        empCorp[3] = new Employee("Alekseev", "Qa engineer", "alekseev@mail.ru", "89123456",20000,23);
        empCorp[4] = new Employee("Andreev", "Analyst", "andreev@mail.ru", "89741258",25000,32);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}
