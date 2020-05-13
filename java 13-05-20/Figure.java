

public abstract class Figure{

       //Attributs Instances 
          protected double longueur;
          
       //Attributs Classes ou Static
         protected static String unite;

      //Methodes Instances Concretes
          //Contructeurs
            public Figure(){

              }
         //Getters
           public double getLongueur(){
               return this.longueur;
            }

         //Setters
            public void setLongueur(double longueur){
              this.longueur=longueur;
            }

       //Methodes Static  Concretes
         //Getters
             public static String getUnite(){
               return Figure.unite;
             }
         
         //Setters

        public static void setUnite(String unite){
            Figure.unite=unite;
      }

     //Methodes Metiers abstraites(static ou instances)
        //Methodes Metiers abstraites instances
           public abstract double demiPerimetre();
           public abstract double surface();
           public abstract double diagonale();

    //Methodes Metiers concretes(static ou instances)
       //Methodes Metiers concretesinstances
        public double perimetre(){
               return this.demiPerimetre()*2;
         }





}