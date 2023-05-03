package parcial2.prueba1;
public class Main {
    public static void main(String[] args) {
        Account cuenta1 = new Account();
        Account cuenta2 = new Account();
        cuenta1.setId(1);
        cuenta1.setName("Ana");
        cuenta1.setDocument("documento de cuenta 1");
        cuenta2.setId(2);
        cuenta2.setDocument("documento de cuenta 2");
        cuenta2.setName("Alex");
        System.out.println(cuenta1);
        System.out.println(cuenta2);

        Driver conductor1 = new Driver();
        Driver conductor2 = new Driver();
        conductor1.setId(101);
        conductor1.setName("Efrain");
        conductor1.setDocument("Documento del conductor 1");
        conductor1.setEmail("Elefraconduce@gmail.com");
        conductor1.setPassword("unacontraceña");
        conductor2.setId(202);
        conductor2.setName("Bradon");
        conductor2.setDocument("Documento del conductor 2");
        conductor2.setEmail("Elbrandon@gmail.com");
        conductor2.setPassword("lacontraceña");
        System.out.println(conductor1);
        System.out.println(conductor2);

        User usuario1 = new User();
        User usuario2 = new User();
        usuario1.setId(11);
        usuario1.setName("Felix");
        usuario1.setDocument("Documento del usuario 1");
        usuario2.setId(22);
        usuario2.setName("Don Pablo");
        usuario2.setDocument("Documento del usuario 2");
        System.out.println(usuario1);
        System.out.println(usuario2);

        Trip viaje1 = new Trip();
        Trip viaje2 = new Trip();
        viaje1.setId(1001);
        viaje2.setId(2002);
        System.out.println(viaje1);
        System.out.println(viaje2);

        Car auto1 = new Car();
        Car auto2 = new Car();
        auto1.setId(1011);
        auto1.setLicense(10101);
        auto1.setDriver(conductor1);
        auto1.setPassenger(usuario1);
        auto2.setId(2022);
        auto2.setLicense(20202);
        auto2.setDriver(conductor2);
        auto2.setPassenger(usuario2);
        System.out.println(auto1);
        System.out.println(auto2);

        Route ruta1 = new Route();
        Route ruta2 = new Route();
        ruta1.setId(11011);
        ruta1.setStart("Sacaba");
        ruta1.setEnd("Uyuni");
        ruta2.setId(22022);
        ruta2.setStart("Muyurina");
        ruta2.setEnd("Calama");
        System.out.println(ruta1);
        System.out.println(ruta2);

        Payments pago1 = new Payments();
        Payments pago2 = new Payments();
        pago1.setId(110);
        pago2.setId(220);

        UberX calidadA1 = new UberX();
        UberX calidadA2 = new UberX();
        calidadA1.setId(1011);
        calidadA1.setLicense(auto1.getLicense());
        calidadA1.setDriver(conductor1);
        calidadA1.setPassenger(usuario1);
        calidadA1.setBrand("Pobre 1");
        calidadA1.setModel("MA1");
        calidadA2.setId(2022);
        calidadA2.setLicense(auto2.getLicense());
        calidadA2.setDriver(conductor2);
        calidadA2.setPassenger(usuario2);
        calidadA2.setBrand("Pobre 2");
        calidadA2.setModel("MA2");
        System.out.println(calidadA1);
        System.out.println(calidadA2);

        UberPool calidadB1 = new UberPool();
        UberPool calidadB2 = new UberPool();
        calidadB1.setId(1011);
        calidadB1.setLicense(auto1.getLicense());
        calidadB1.setDriver(conductor1);
        calidadB1.setPassenger(usuario1);
        calidadB1.setBrand("Medio 1");
        calidadB1.setModel("MB1");
        calidadB2.setId(2022);
        calidadB2.setLicense(auto2.getLicense());
        calidadB2.setDriver(conductor2);
        calidadB2.setPassenger(usuario2);
        calidadB2.setBrand("Medio 2");
        calidadB2.setModel("MB2");
        System.out.println(calidadB1);
        System.out.println(calidadB2);

        UberBlack calidadC1 = new UberBlack();
        UberBlack calidadC2 = new UberBlack();
        calidadC1.setId(10111);
        calidadC1.setLicense(auto1.getLicense());
        calidadC1.setDriver(conductor1);
        calidadC1.setPassenger(usuario1);
        calidadC1.setTypeCarAccepted("tipo c1");
        calidadC1.setSeatsMaterial("asientos c1");
        calidadC2.setId(20222);
        calidadC2.setLicense(auto2.getLicense());
        calidadC2.setDriver(conductor2);
        calidadC2.setPassenger(usuario2);
        calidadC2.setTypeCarAccepted("tipo c2");
        calidadC2.setSeatsMaterial("asientos c2");
        System.out.println(calidadC1);
        System.out.println(calidadC2);

        UberVan calidadD1=new UberVan();
        UberVan calidadD2=new UberVan();
        calidadD1.setId(100110);
        calidadD1.setLicense(auto1.getLicense());
        calidadD1.setDriver(conductor1);
        calidadD1.setPassenger(usuario1);
        calidadD1.setTypeCarAccepted("tipo d1");
        calidadD1.setSeatsMaterial("asientos d1");
        calidadD2.setId(200220);
        calidadD2.setLicense(auto2.getLicense());
        calidadD2.setDriver(conductor2);
        calidadD2.setPassenger(usuario2);
        calidadD2.setTypeCarAccepted("tipo d2");
        calidadD2.setSeatsMaterial("asientos d2");
        System.out.println(calidadD1);
        System.out.println(calidadD2);

        Cash dinero1=new Cash();
        Cash dinero2=new Cash();
        dinero1.setId(pago1.getId());
        dinero2.setId(pago2.getId());

        Card tarjeta1=new Card();
        Card tarjeta2=new Card();
        tarjeta1.setId(pago1.getId());
        tarjeta1.setNumber(191999);
        tarjeta1.setCvv(11111);
        tarjeta1.setDate(12_12_20);
        tarjeta2.setId(pago2.getId());
        tarjeta2.setNumber(292999);
        tarjeta2.setCvv(22222);
        tarjeta2.setDate(22_2_10);
        System.out.println(tarjeta1);
        System.out.println(tarjeta2);

        Paypal pal1=new Paypal();
        Paypal pal2=new Paypal();
        pal1.setId(pago1.getId());
        pal1.setEmail("mipaypal@gmail.com");
        pal2.setId(pago2.getId());
        pal2.setEmail("estepalpay@gmail.com");
        System.out.println(pal1);
        System.out.println(pal2);
    }
}
