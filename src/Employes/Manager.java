package Employes;

public class Manager extends Empleat {
    public Manager(String name, String adress, String phone, double souBrutMensual){
        super(name, adress, phone, souBrutMensual);
    }
    
    public void validarManager(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual >= 3000 && souBrutMensual < 5000){
            souNetMensual = souBrutMensual * 0.74;
        } else {
            throw new ArithmeticException("El sou brut mensual d´un " +
                    "Manager oscil.la entre 3000 i 4999 euros!");
        }
    }
    
    public void setSouNetAnualManager(double souBrutMensual){
        souNetAnual = (souBrutMensual * 0.74) * 12;
    }
}
