package Employes;

public class NewMain {

   public static void main(String[] args) {
        Boss boss = new Boss("Peto Boss", "Llibertat 2", "654789123", 8100);
        boss.validarBoss(8100);
        boss.setSouBrutAnual(8100);
        boss.setSouNetAnualBoss(8100);
        boss.setBonus(8100);
        System.out.println("name=" + boss.name + ", adress=" + boss.adress +
                ", phone=" + boss.phone + ", sou brut mensual=" +
                boss.souBrutMensual + ", sou net mensual=" + boss.getSouNetMensual() +
                ", sou brut anual=" + boss.getSouBrutAnual() + ", sou net anual=" +
                boss.getSouNetAnual() + ", incentiu=" + boss.getBonus());
        
        Manager manager = new Manager("Tito manager", "Pablo 23", "85236987", 4500);
        manager.validarManager(4500);
        manager.setSouBrutAnual(4500);
        manager.setSouNetAnualManager(4500);
        manager.setBonus(4500);
        System.out.println("name=" + manager.name + ", adress=" + manager.adress +
                ", phone=" + manager.phone + ", sou brut mensual=" +
                manager.souBrutMensual + ", sou net mensual=" + manager.getSouNetMensual() +
                ", sou brut anual=" + manager.getSouBrutAnual() + ", sou net anual=" +
                manager.getSouNetAnual() + ", incentiu=" + manager.getBonus());
        
        Senior senior = new Senior("Roque Senior", "Del pepo 9", "147852369", 3500);
        senior.validarSenior(3500);
        senior.setSouBrutAnual(3500);
        senior.setSouNetAnualSenior(3500);
        senior.setBonus(3500);
        System.out.println("name=" + senior.name + ", adress=" + senior.adress +
                ", phone=" + senior.phone + ", sou brut mensual=" +
                senior.souBrutMensual + ", sou net mensual=" + senior.getSouNetMensual() +
                ", sou brut anual=" + senior.getSouBrutAnual() + ", sou net anual=" +
                senior.getSouNetAnual() + ", incentiu=" + senior.getBonus());
        
        Mind mind = new Mind("Coque Mind", "Paracuellos 56", "369852147", 2400);
        mind.validarMind(2400);
        mind.setSouBrutAnual(2400);
        mind.setSouNetAnualMind(2400);
        mind.setBonus(2400);
        System.out.println("name=" + mind.name + ", adress=" + mind.adress +
                ", phone=" + mind.phone + ", sou brut mensual=" +
                mind.souBrutMensual + ", sou net mensual=" + mind.getSouNetMensual() +
                ", sou brut anual=" + mind.getSouBrutAnual() + ", sou net anual=" +
                mind.getSouNetAnual() + ", incentiu=" + mind.getBonus());
        
        Junior junior = new Junior("Siscu Junior", "Pere IV 11", "258461379", 1500);
        junior.validarJunior(1500);
        junior.setSouBrutAnual(1500);
        junior.setSouNetAnualJunior(1500);
        junior.setBonus(1500);
        System.out.println("name=" + junior.name + ", adress=" + junior.adress +
                ", phone=" + junior.phone + ", sou brut mensual=" +
                junior.souBrutMensual + ", sou net mensual=" + junior.getSouNetMensual() +
                ", sou brut anual=" + junior.getSouBrutAnual() + ", sou net anual=" +
                junior.getSouNetAnual() + ", incentiu=" + junior.getBonus());
        
        Volunteer volunteer = new Volunteer("Petit Volunteer", "Rasca 1", "666666666", 299);
        volunteer.validarVolunteer(299);
        volunteer.setSouBrutAnual(299);
        volunteer.setSouNetAnualVolunteer(299);
        System.out.println("name=" + volunteer.name + ", adress=" + volunteer.adress +
                ", phone=" + volunteer.phone + ", sou brut mensual=" +
                volunteer.souBrutMensual + "(ajuda)" + ", sou net mensual=" +
                volunteer.getSouNetMensual() + ", sou brut anual=" +
                volunteer.getSouBrutAnual() + ", sou net anual=" +
                volunteer.getSouNetAnual() + ", incentiu=" +
                volunteer.getBonusVolunteer());
    }
    
}
