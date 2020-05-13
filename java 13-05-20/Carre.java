import java.lang.Math;
public   class Carre extends Figure{
    
       //Surcharge
        //Constructeur par defaut
         public Carre(){
         }
      //Constructeur surchargé
         public Carre(double longueur){
             this.longueur= longueur;
        }
      //Regles de Surcharge
         //1-deux Methodes qui portent le meme nom et qui ont le meme type de retour
         //2-Les deux Methodes ne doivent pas avoir le meme nombre d'arguments
          //OU
         //2-Si les deux Methodes ont le meme nombre d'arguments alors les arguments
         // ne doivent pas etre du meme type
      /* 
        public double somme(double a,double b){
        }
         public double somme(double a,float b){
        }
         

      */

     //Methodes Metiers abstraites instances

     //Redefinition
         @Override
           public double demiPerimetre(){
               return this.longueur*2;
           }

          @Override
           public double surface(){
              return this.longueur*this.longueur;
           }

             @Override
            public  double diagonale(){
                return Math.sqrt(Math.pow(this.longueur,2)+Math.pow(this.longueur,2));
            }
   
 
   
}