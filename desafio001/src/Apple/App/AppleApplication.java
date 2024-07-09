package Apple.App;

import Apple.IPhone.IPhone;

public class AppleApplication {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        IPhone iphone = new IPhone();
        System.out.println("Navegando na net");
        iphone.exibir();
        iphone.atualizar();
        iphone.addAba();
        System.out.println("---------------------------------------------");
        System.out.println("Usando o telefone para chamadas");
        iphone.ligando();
        iphone.atender();
        iphone.iniciar();
        System.out.println("---------------------------------------------");
        System.out.println("Usando o player de músicas");
        iphone.selectMusic();
        iphone.tocaMusica();
        iphone.pausa();
        System.out.println("---------------------------------------------");
        System.out.println("Finalizando uso do Iphone...");
    }
}
