public class Eau14 {
  public static void main(String[] args){
    int[] tab = new int[args.length];
    
    /* Vérification des arguements */
    if((args.length <2) || !estTabEntier(args)){
      System.out.println("Erreur...\nVeillez entrer au moins 2 arguments entrers !");
    }
    else{
      /* Remplissage du tableau <tab> à partir du tableau <args> */
      for (int i=0; i<tab.length; i++) {
        tab[i] = Integer.parseInt(args[i]);
      }

      int min = 0;
      int tmp = 0;
      int taille_tab = tab.length;

      /* Tri du tableau  */
      for (int i=0; i < taille_tab-1; i++) {
        min = i;
        for (int j=i+1; j<taille_tab; j++) {
          if (tab[j] < tab[min]) {
            min = j;
          }
        }
        if (min != i) {
          tmp = tab[i];
          tab[i] = tab[min];
          tab[min] = tmp;
        }
      }

      /* Affichage du résultat */
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
