package model;

public class App {
    public static void main(String[] args) {
        Billet lightTest = new GoLightBillet("GoLight", "0 baggage", 400.0, true, false, false, false);
        Billet smartTest = new GoSmartBillet("GoSmart", "1 håndbaggage + 1 indchecket baggage", 650.0, false, true, false, true, 1, 1);
        Billet businessTest = new BusinessBillet("Business", "1 håndbaggage + 2 indchecket baggage", 900.0, true, true, true, true, 1, 2);

        System.out.println(lightTest);
        System.out.println(smartTest);
        System.out.println(businessTest);
    }
}
