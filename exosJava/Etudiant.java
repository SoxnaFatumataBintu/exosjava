import java.time.LocalDate;

LocalDate localdate=new LocalDate.now();
public class Etudiant extends Personne{

	private String datenaiss;
	private String tuteur;

	public Etudiant(String fullname){

	this.fullname=fullname;

}
	public String getDateNaiss(){

		return datenaiss;
	}
	public String setDateNaiss(String datenaiss){

		this.datenaiss=datenaiss;
	}

	public String getTuteur(){

	return tuteur;
	}

	public String setTuteur(String tuteur){

	this.tuteur=tuteur;
	}

	
	public int CalculDate(){

		
	}

	
	





} 