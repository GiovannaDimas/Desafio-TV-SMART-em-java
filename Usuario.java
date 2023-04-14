public class Usuario {
/**
 * @param args
 * @throws Exception
 */
public static void main(String[] args) throws Exception{
        
    SmartTv smartTv = new SmartTv();
    
    System.out.println("TV ligada ?" + smartTv.ligada);
    System.out.println("Canal atual :" + smartTv.canal);
    System.out.println("Volume atual :" + smartTv.volume);

    smartTv.ligar ();
    System.out.println("Novo Status -> TV ligada ?" + smartTv.ligada);
   } 
}
