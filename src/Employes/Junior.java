package Employes;

public class Junior extends Employe {
    public Junior(String name, String adress, String phone, double souBrutMensual){
        super(name, adress, phone, souBrutMensual);
    }
    
    public void validarJunior(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual >= 900 && souBrutMensual < 1599){
            souNetMensual = souBrutMensual* 0.95;
        } else {
            throw new ArithmeticException("El sou d´un Junior oscil.la " + 
                    "entre 900 i 1599 euros!");
        }
    }
    
    public void setSouNetAnualJunior(double souBrutMensual){
        souNetAnual = (souBrutMensual * 0.98) * 12;
    }
}
