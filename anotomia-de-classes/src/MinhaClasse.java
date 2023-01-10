public class MinhaClasse {
    public static void main(String[] args) {
    
        string primeiroNome = "Alair";
        string segundoNome = "Alves";

        string nomeCompleto =  ( nomeCompleto, segundoNome);

        System.out.println(nomeCompleto);

    } 
    public static string nomeCompleto (String primeiroNome, string segundoNome) {
        return "resultado do método " + primeiroNome.concat("  ").concat(segundoNome);
    }
}
