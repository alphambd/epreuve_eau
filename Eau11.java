public class Eau11 {
  public static void main(String[] args){
    boolean existe = false; 
    
    /* Vérification des arguements */
    if(args.length <2){
      System.out.println("Erreur...\nVeillez entrer au moins 2 arguments !");
    }
    else{
      for (int i=0; i<args.length-1; i++) {
        if(args[i].equals(args[args.length-1])){
          existe = true;
          System.out.println(i);
          break;
        }
      }
      if(!existe)
        System.out.println("-1");
    }
  }
}
