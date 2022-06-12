package StructuralPatterns.Spare.Composite;

public class Main {
    public static void main(String [] args){
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales ", 200000);
        Employee headMarketing = new Employee("Michel", "Head Marketing ", 1000);


        Employee clerk1 = new Employee("salma", "Marketing ", 200000);
        Employee clerk2 = new Employee("kareem", "Marketing ", 1000);

        Employee salesExecutive1 = new Employee("rawan", "Sales ", 200000);
        Employee salesExecutive2 = new Employee("moataz", "Sales ", 1000);


        CEO.add(headMarketing);
        CEO.add(headSales);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        System.out.println(CEO);
        for(Employee headEmployee : CEO.getSubordinates()){
            System.out.println(headEmployee);
            for(Employee emp : headEmployee.getSubordinates()){
                System.out.println(emp);
            }
        }

    }
}
