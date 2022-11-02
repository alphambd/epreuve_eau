public class Eau05 {
  public static void main(String[] args){
    int n = 0;
    int borne = 1000000;

    if((args.length != 1) || !estUnNombre(args[0])){
      System.out.println("Erreur...\nVeillez entrer un nombre premier !");
    }
    else{
      n = Integer.parseInt(args[0]);
      for (int i=n+1; i<borne; i++) {
        if (estPremier(i)) {
          System.out.println(i);
          break;
        }
      }
    }
  }

  // Méthode qui vérifie s'il sagit d'un nombre
  public static boolean estUnNombre(String chaine){
    try{
      Integer.parseInt(chaine);
    }
    catch(NumberFormatException e){
      return false;
    }
    return true;
  }

  // Méthode pour trouver les N premiers termes de la suite Fibonacci
  public static boolean estPremier(int n){
    boolean est_premier = true;
    for(int i = 1; i<=n/2; i++){
      if((n%i ==0) && (i != 1)) {
        est_premier = false;
      }
    }
    return est_premier;
  }
}
