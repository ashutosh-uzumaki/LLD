package org.example.bad_example;

public class Employee {
    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address){
        this.id = id; //Employee id
        this.name = name; //Employee name
        this.address = address; //Employee address
    }

    public void printPerformanceReport(){
        System.out.println("Printing performance report of the employee.");
    }

    public double computeSalary(){
        //compute salary
        return 1000.0;
    }

    public void updateEmployeeData(){
        System.out.println("Employee data updated successfully.");
    }

    public void fetchEmployeeData(){
        System.out.println("Employee data fetched successfully.");
    }
}

//ISSUES
//1) THE CLASS IS DOING TOO MANY THINGS AT ONCE
//2) TOO MANY REASON TO CHANGE THE SAME PIECE OF THE CODE

//REASONS FOR CHANGE
//COMPUTE SALARY
//    MIGHT INVOLVE MANY TAX DEDUCTION, SUPPOSE IF THE GOVT TOMORROW TRIES TO ADD ONE MORE TAX SLAB,
    //THE CODE WILL CHANGE
//UPDATE EMPLOYEE DATA
    //If data storage requirements change, then we might need to update the updateEmployeeData() will change
//PRINT PERFORMANCE REPORT
    //Currently printing in excel file but need in pdf file we might need to update the printperformancereport function

//VIOLATES THE SRP. -> SINGLE RESPONSIBILITY PRINCIPLE -> ONLY ONE REASON FOR THE CLASS/FUNCTION TO CHANGE
