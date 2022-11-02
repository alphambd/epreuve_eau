public class Eau09 {
  public static void main(String[] args){
    /* Déclaration des variables utiles */
    String chaine = "";
    String new_chaine = "";

    /* Vérification des arguements */
    if((args.length != 1) || (args[0] == "")){
      System.out.println("Erreur...\nVeillez entrer une chaine de chiffres !");
    }
    else{
      chaine = args[0];
      /* Affichage du résulat */
      System.out.println(estUnNombre(args[0]));
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
