package controller;

import model.EmployeeService;

public class EmployeeManagement {
    EmployeeService empService = new EmployeeService();
    public void choiceMenu (){
        boolean check = true;
        do{

        
            System.out.println("~~~~~~~~~~~~~Employee Management~~~~~~~~~~~~~");
            System.out.println(
                "1: Display list employees\n"+
                "2: Add new employee\n" + 
                "3: Edit employee\n"+
                "4:Return main menu"
            );

            int choice = Validation.getIntFromInput("choice");
            switch (choice) {
                case 1 -> empService.displayList();
                case 2 -> empService.addEmp();
                case 3 -> empService.editEmp(); 
                case 4 -> check = false;
                default -> System.out.println("Wrong input");
            }

        }while(check);
        
    }

   
}

