import java.util.Random;

public class Carro implements Runnable{
    float corX = 0;
    float corY = 0;   
    String nombre;
    
    Carro(String nombre){
        this.nombre=nombre;
    }
    
    public static void main(String args[]){
        
       new Thread(new Carro("Carro1")).start();
       new Thread(new Carro("Carro2")).start();
       new Thread(new Carro("Carro3")).start();
       new Thread(new Carro("Carro4")).start();
       new Thread(new Carro("Carro5")).start();
    }
    
    public void run() {
        while (true){
        try{
            Random r = new Random();
            corX= r.nextFloat() * 2-1;
            corY= r.nextFloat() * 2-1;
            System.out.println(nombre + " ( " + corX + " , " + corY +" )");
            Thread.sleep(2000);
        }catch (InterruptedException ex) {}
        }
    }
   
}

    

