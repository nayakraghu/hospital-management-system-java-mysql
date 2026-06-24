package main; import java.util.Scanner; import dao.*; import model.Patient;
public class HospitalApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);PatientDAO dao=new PatientDAO();UserDAO u=new UserDAO();
        System.out.println("===== Admin Login =====");System.out.print("Username: ");String user=sc.nextLine();System.out.print("Password: ");String pass=sc.nextLine();
        if(!u.login(user,pass)){System.out.println("Invalid credentials");return;}System.out.println("Login Successful");
        while(true){
            System.out.println("\n===== Hospital Management System =====");
            System.out.println("1.Add Patient\n2.View All\n3.Search by ID\n4.Search by Doctor\n5.Update Fees\n6.Delete\n7.Count\n8.Highest Fees\n9.Sort by Fees\n10.Disease Report\n11.Exit");
            System.out.print("Choice: ");int ch=sc.nextInt();sc.nextLine();
            switch(ch){
                case 1:System.out.print("Name: ");String n=sc.nextLine();System.out.print("Email: ");String e=sc.nextLine();System.out.print("Disease: ");String d=sc.nextLine();System.out.print("Doctor: ");String doc=sc.nextLine();System.out.print("Fees: ");double f=sc.nextDouble();sc.nextLine();System.out.print("Admit Date: ");String dt=sc.nextLine();System.out.println(dao.add(new Patient(n,e,d,doc,f,dt))?"Patient Added":"Failed");break;
                case 2:dao.viewAll();break;case 3:System.out.print("ID: ");dao.searchById(sc.nextInt());break;
                case 4:System.out.print("Doctor: ");dao.searchByDoctor(sc.nextLine());break;
                case 5:System.out.print("ID: ");int uid=sc.nextInt();System.out.print("New Fees: ");System.out.println(dao.updateFees(uid,sc.nextDouble())?"Updated":"Failed");break;
                case 6:System.out.print("ID: ");System.out.println(dao.delete(sc.nextInt())?"Deleted":"Failed");break;
                case 7:dao.count();break;case 8:dao.highestFees();break;case 9:dao.sortByFees();break;case 10:dao.diseaseReport();break;
                case 11:System.out.println("Thank you!");return;default:System.out.println("Invalid");
            }
        }
    }
}
