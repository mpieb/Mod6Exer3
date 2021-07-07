package Employes;

//Declaració de clase empleat
public class Empleat{
    
    //Declaració de variables de classe 
    protected String name;
    protected String adress;
    protected String phone;
    protected double souBrutMensual;
    protected double souNetMensual;
    protected double souBrutAnual;
    protected double souNetAnual;
    protected double bonus;
    
     //Declaració del constructor i paràmetres 
    public Empleat(String name, String adress, String phone, double souBrutMensual){
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.souBrutMensual = souBrutMensual;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return  name;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getPhone(){
        return  phone;
    }
    
    public void setSouBrutMensual(double souBrutMensual){
        this.souBrutMensual = souBrutMensual;
    }
    
    public double getSouBrutMensual(){
        return souBrutMensual; 
    }
    
    public double getSouNetMensual(){
        return souNetMensual;
    }
    
    public void setSouBrutAnual(double souBrutMensual){
        souBrutAnual = souBrutMensual * 12;
    }
    
    public double getSouBrutAnual(){
        return souBrutAnual;
    }
    
    public double getSouNetAnual(){
        return souNetAnual;
    }
    
    public void setBonus(double souBrutMensual){
        bonus = (souBrutMensual * 0.1) * 12;
    }
    
    public double getBonus(){
        return bonus;
    }
    
    public String getBonusVolunteer(){
        return "El Volunteer no té incentiu!";
    }
    
}

    
    
    
    
