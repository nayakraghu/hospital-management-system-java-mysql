package model;
public class Patient {
    private int id; private String name,email,disease,doctor,admitDate; private double fees;
    public Patient(){}
    public Patient(String name,String email,String disease,String doctor,double fees,String admitDate){this.name=name;this.email=email;this.disease=disease;this.doctor=doctor;this.fees=fees;this.admitDate=admitDate;}
    public int getId(){return id;} public void setId(int id){this.id=id;}
    public String getName(){return name;} public void setName(String n){this.name=n;}
    public String getEmail(){return email;} public void setEmail(String e){this.email=e;}
    public String getDisease(){return disease;} public void setDisease(String d){this.disease=d;}
    public String getDoctor(){return doctor;} public void setDoctor(String d){this.doctor=d;}
    public double getFees(){return fees;} public void setFees(double f){this.fees=f;}
    public String getAdmitDate(){return admitDate;} public void setAdmitDate(String d){this.admitDate=d;}
}
