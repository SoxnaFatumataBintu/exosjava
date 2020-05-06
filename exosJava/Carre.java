public class Carre extends Figure{
	
	public Carre(double longueur){

	this.longueur=longueur

}

		public double demiPerimetre(){
                     return this.longueur*2;
                }
              
                public double surface(){
                  return this.longueur * this.longueur;
                }
                public double diagonale(){
                  return Math.sqrt(Math.pow(this.longueur,2)+Math.pow(this.longueur,2));
                }




}