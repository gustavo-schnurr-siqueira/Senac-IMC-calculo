
package imctest;

import java.util.Scanner;

public class IMCtest {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        float altura,peso,imc;
        Pessoa p1=new Pessoa();
        
        System.out.print("-Digite o seu nome"
                + "\n-> ");
        nome=ler.next();
        
        System.out.println("-- Olá, "+nome+"! --");
        
        System.out.print("\n-Digite sua altura"
                + "\n-> ");
        altura=ler.nextFloat();
        
        System.out.print("\n-Digite seu peso"
                + "\n-> ");
        peso=ler.nextFloat();
        
        p1.imc(altura,peso);
        
        
    }
    
}
