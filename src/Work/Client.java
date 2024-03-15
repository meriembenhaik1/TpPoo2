package Work;

import java.util.Date;


public class Client {
    static int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String password;
   

    public Client(int id, String nom, String prenom, String email, String telephone,String password){
        this.id = id++;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.password=password;
    }

    public int getid(){
        return this.id;
    }

    public String getnom(){
        return this.nom;
    }

    public void setnom(String nom){
        this.nom = nom;
    }

    public String getprenom(){
        return this.prenom;
    }

    public void setprenom(String prenom){
        this.prenom = prenom;
    }

    public String getemail(){
        return this.email;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String gettelephone(){
        return this.telephone;
    }

    public void settelephone(String tel){
        this.telephone = tel;
    }


    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
    public String toString() {
        return super.toString();
    }

}