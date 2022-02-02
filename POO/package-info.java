package aula03;

public class ex01Class 
{
    //atributos
    String nome;
    int idade;
    String cpf;
    String rg;
    //metodos

    public ex01Class()
    {
        this.nome="roberto";
        this.idade=32;
        this.cpf="145.657.158-45";
        this.rg="45.456.438-x";
    }

        public void informarNome()
        {
            System.out.println("seu nome: "+nome);
        }

        public void informarIdade()
        {
            System.out.println("sua idade: "+idade);
        }

        public void informarCpf()
        {
            System.out.println("seu cpf: "+cpf);
        }

        public void informarRg()
        {
            System.out.println("seu rg: "+ rg);
        }

}