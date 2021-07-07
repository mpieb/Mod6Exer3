package Employes;

public class Volunteer extends Empleat {
    public Volunteer(String name, String adress, String phone, double souBrutMensual){
        super(name, adress, phone, souBrutMensual);
    }
    
    public void validarVolunteer(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual < 300){
            souNetMensual = souBrutMensual;
        } else {
            throw new ArithmeticException("El Volunter no cobra!");
        }
    }
    
    public void setSouNetAnualVolunteer(double souBrutMensual){//Setter
        souNetAnual = souBrutMensual * 12;
    }
}