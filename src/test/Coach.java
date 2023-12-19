package test;

import java.util.Objects;

public class Coach extends Personne{
	
	private String nickName ;
	private typeDiplome diplome ;
	
	public Coach(String n , String p , String nickName, typeDiplome d) {
		super(n,p);
		this.diplome=d;
		this.nickName=n;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public typeDiplome getDiplome() {
		return diplome;
	}

	public void setDiplome(typeDiplome diplome) {
		this.diplome = diplome;
	}

	public String toString() {
		
		return super.toString() + " Coach [nickName=" + nickName + ", diplome=" + diplome + "]";
	}


	public int hashCode() {
		return Objects.hash(diplome, nickName);
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		Coach other = (Coach) obj;
		return diplome == other.diplome && Objects.equals(nickName, other.nickName);
	}
	
	

}
