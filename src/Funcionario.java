public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Float calcularINSS(){
        float descontoINSS = 0;
        if (salario <= 1412.00){
            descontoINSS = salario * 0.75f;
            salario = salario - descontoINSS; 
        } else if (salario > 1412.00 && salario > 2666.69){
            descontoINSS = salario * 0.09f;
            salario = salario - descontoINSS; 
        } else if (salario > 2666.69 && salario < 4000.00){
            descontoINSS = salario * 0.12f;
            salario = salario - descontoINSS; 
        } else if (salario > 4000.03 && salario < 7786.03);

        return descontoINSS;
    }

}
