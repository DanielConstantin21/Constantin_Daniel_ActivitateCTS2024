package program;

import clase.ClientFlyweightFactory;
import clase.IReteta;
import clase.Reteta;

public class Main {
    public static void main(String[] args) {

        IReteta reteta1 = new Reteta(ClientFlyweightFactory.getClient(1,"Strinculescu"),1,3,200);
        IReteta reteta2 = new Reteta(ClientFlyweightFactory.getClient(2,"Lola"),2,3,200);
        IReteta reteta3 = new Reteta(ClientFlyweightFactory.getClient(2,"Lola"),3,3,200);
        IReteta reteta4 = new Reteta(ClientFlyweightFactory.getClient(1,"Strinculescu"),4,3,200);

        System.out.println(reteta1);
        System.out.println(reteta2);
        System.out.println(reteta3);
        System.out.println(reteta4);

        ClientFlyweightFactory.getNrClienti();
        ClientFlyweightFactory.getNrReteteProcesate();


        if(reteta1.getClient() == reteta4.getClient()){
            System.out.println("aceeasi instanta");
        }else{
            System.out.println("instante diferite");
        }

    }
}
