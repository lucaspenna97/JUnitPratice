import java.util.Objects;

public class User {

    private String cpf;
    private String cep;

    public User() { }

    public User(String cpf, String cep) {
        this.cpf = cpf;
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;
        return Objects.equals(cpf, user.cpf) &&
                Objects.equals(cep, user.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, cep);
    }
}
