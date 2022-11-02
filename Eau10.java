public class Eau10 {
  public static void main(String[] args){
    /* Déclaration des variables utiles */
    int min = 0;
    int max = 0;

    /* Vérification des arguements */
    if((args.length != 2) || !estUnNombre(args[0]) || !estUnNombre(args[1])){
      System.out.println("Erreur...\nVeillez entrer 2 entiers !");
    }
    else{
      /* Récuperation des arguments */
      if(Integer.parseInt(args[0]) < Integer.parseInt(args[1])){
        min = Integer.parseInt(args[0]);
        max = Integer.parseInt(args[1]);
      }
      else{
        max = Integer.parseInt(args[0]);
        min = Integer.parseInt(args[1]);
      }
      /* Affichage du résultat */
      for (int i=min; i<max; i++) {
        System.out.print(i+" ");
      } System.out.println();
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
}
