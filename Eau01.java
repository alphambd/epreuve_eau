public class Eau01 {
  public static void main(String[] args){
    int born_sup = 9;
    String separateur = ", ";
    
    for (int i=0; i<born_sup-1; i++) {
      for (int j=1; j<born_sup; j++) {
        for (int k=2; k<=born_sup; k++) {
          if(i<j && j<k){
            // gestion des séparateurs
            if (i==7 && j==8 && k==9) {
              separateur = "";
            }
            System.out.print(i+""+j+""+k+separateur);
          }
        }
      }
    }
    System.out.println();
  }

}
