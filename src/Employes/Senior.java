package Employes;

public class Senior extends Employe {
    public Senior(String name, String adress, String phone, double souBrutMensual){
        super(name, adress, phone, souBrutMensual);
    }
    
    public void validarSenior(double souBrutMensual) throws ArithmeticException{
        if(souBrutMensual >= 2700 && souBrutMensual < 4000){
            souNetMensual = souBrutMensual * 0.85;
        } else {
            throw new ArithmeticException("El sou d´un Senior oscil.la " +
                    "entre 2700 i 3999 euros!");
        }
    }
    
    public void setSouNetAnualSenior(double souBrutMensual){
        souNetAnual = (souBrutMensual * 0.76) * 12;
    }
}