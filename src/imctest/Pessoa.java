package imctest;


public class Pessoa {
    
   
   float imc;
    
    public void imc(float altura,float peso){
        imc=peso/(altura*altura);
        System.out.println("====================="
                + "\nPESO -> "+peso+" Kg"
                + "\nALTURA -> "+altura+" m"
                + "\nIMC -> ["+imc+"]");
        
        
        
        
    }
}
