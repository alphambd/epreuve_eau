public class Eau03 {
  public static void main(String[] args){
    int taille_chaine = 0;
    if(args.length <1){
      System.out.println("Erreur...\nVeillez entrer des chaines en arguments !");
    }
    else{
      taille_chaine = args.length-1;
      while(taille_chaine>=0){
        System.out.println(args[taille_chaine]);
        taille_chaine--;
      }
    }
  }
}
