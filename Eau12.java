public class Eau12 {
  public static void main(String[] args){

    /* Vérification des arguements */
    if((args.length <2) || !estTabEntier(args)){
      System.out.println("Erreur...\nVeillez entrer au moins 2 arguments entrers !");
    }
    else{

      int diff = 1000000;
      int diff_suiv = 0;
      
      //On cherche la différence minimale
      for (int i=0; i<args.length; i++) {
        for (int j=0; j<args.length; j++) {
          diff_suiv = Math.abs(Integer.parseInt(args[i]) - Integer.parseInt(args[j]));
          if(Integer.parseInt(args[i]) != Integer.parseInt(args[j])){
            if(diff> diff_suiv){
              diff = diff_suiv;
            }
          }
        }
      }
      
      /* Affichage du résultat */
      System.out.println(diff);
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

  // Méthode qui vérifie si le tableau ne contient que des entiers
  public static boolean estTabEntier(String[] tab){
    for (int i=0; i<tab.length; i++) {
      if (!estUnNombre(tab[i])) {
        return false;
      }
    }
    return true;
  }
}
