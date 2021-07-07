package Employes;

public class Boss extends Empleat {
    public Boss(String name, String adress, String phone, double souBrutMensual){
        super(name, adress, phone, souBrutMensual);
    }
    
    public void validarBoss(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual > 8000){
            souNetMensual = souBrutMensual * 0.68;
        } else {
            throw new ArithmeticException("El sou mensual brut del Boss té " +
                    "que ser major de 8000 euros!");
        }
    }
    
    public void setSouNetAnualBoss(double souBrutMensual){
        souNetAnual = (souBrutMensual * 0.68) * 12; 
    }
}
