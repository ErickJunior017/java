package cursoJava.secao10.desafios;

public class Quarto {
    private String name, email;
    private int numero;

    public Quarto(String name, String email, int numero) {
        this.name = name;
        this.email = email;
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString(){
        return getNumero()+": "
                +getName()
                +", "
                +getEmail();
    }
}
