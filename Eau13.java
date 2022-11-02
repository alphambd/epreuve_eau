public class Eau13 {
  public static void main(String[] args){
    int[] tab = new int[args.length];
    
    /* Vérification des arguements */
    if((args.length <2) || !estTabEntier(args)){
      System.out.println("Erreur...\nVeillez entrer au moins 2 arguments entrers !");
    }
    else{
      int tmp = 0;

      // Remplissage du tableau <tab> à partir du tableau <args>
      for (int i=0; i<tab.length; i++) {
        tab[i] = Integer.parseInt(args[i]);
      }

      // Tri du tableau
      for (int i=tab.length-1; i>=1; i--) {
        for (int j=0; j<i; j++) {
          if (tab[j+1] < tab[j]) {
            tmp = tab[j];
            tab[j] = tab[j+1];
            tab[j+1] = tmp;
          }
        }
      }

      /* Affichage du résultat	*/
      for (int i=0; i<tab.length; i++) {
        System.out.print(tab[i]+" ");
      }
      System.out.println();
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

  // Méthode pour vérifier que le tableau ne contient que des entiers
  public static boolean estTabEntier(String[] tab){
    for (int i=0; i<tab.length; i++) {
      if (!estUnNombre(tab[i])) {
        return false;
      }
    }
    return true;
  }
}
