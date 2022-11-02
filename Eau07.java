public class Eau07 {
  public static void main(String[] args){
    /* Déclaration des variables utiles */
    String chaine = "";
    String new_chaine = "";

    /* Vérification des arguements */
    if((args.length != 1) || estUnNombre(args[0])){
      System.out.println("Erreur...\nVeillez entrer une chaine !");
    }
    else{
      chaine = args[0];

      /* Création de la nouvelle chaine */
      for (int i=0; i<chaine.length(); i++) {
        char c = chaine.charAt(i);

        if(i%2 == 0){
          new_chaine += Character.toUpperCase(c);
        }
        else{
          new_chaine += c;
        }
      }

      /* Affichage du résultat */
      System.out.println(new_chaine);
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

  // Méthode qui vérifie si la chaine ne contient que des lettres
  public static boolean estChaineAlphabet(String chaine){
    if(chaine == null)
      return false;
    for (int i=0; i<chaine.length(); i++) {
      char c = chaine.charAt(i);
      if(!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !Character.isWhitespace(c))
        return false;
    }
    return true;
  }
}
