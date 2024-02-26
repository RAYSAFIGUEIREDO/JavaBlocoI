package POO;

public class PESSOA {
    private String PrimeiroNome;
    private String UltimoNome;
    private String NumeroCpf;
    
    // Correção do construtor
    public PESSOA(String Primeiro, String Ultimo) {
        PrimeiroNome = Primeiro;
        UltimoNome = Ultimo;
    }

    // Método para retornar o nome completo utilizando os atributos PrimeiroNome e UltimoNome
    public String getNomeCompleto() {
        return PrimeiroNome + " " + UltimoNome;
    }
}

