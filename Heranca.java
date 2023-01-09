class Heranca {
    public static void main(String[] args) {

        Carro c1 = new Carro("Golf");
      
        CarroCombate c2 = new CarroCombate("Leopardo", 100);

        CarroCombate c3 = new CarroCombate("Pantera", 50);

        c3.setQtdArmamento(300);

        c1.sofrerDano(30);


        c1.info();
        c2.info();
        c3.info();
        
        


        
    }
}