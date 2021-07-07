package Employes;

public class Mind extends Employe {
    public Mind(String name, String adress, String phone, double souBrutMensual){
        super(name, adress, phone, souBrutMensual);
    }
    
     public void validarMind(double souBrutMensual) throws ArithmeticException{ 
        if(souBrutMensual >= 1800 && souBrutMensual < 2500){
            souNetMensual = souBrutMensual * 0.9;
        } else {
            throw new ArithmeticException("El sou d´un Mind oscil.la " +
                    "entre 1800 i 2499 euros!");
        }
    }
     
    public void setSouNetAnualMind(double souBrutMensual){
        souNetAnual = (souBrutMensual * 0.85) * 12;
    }
}
