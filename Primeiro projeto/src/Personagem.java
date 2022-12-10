public class Personagem {
    String nome;
    int saude;
    int energia;

    Personagem ( String nome, int saude, int energia){
        this.nome = nome;
        this.saude = saude;
        this.energia = energia;
    }

    void alterarSaude (int alteração) {
        if (alteração > 0) {
            this.saude += alteração;
            System.out.println(this.nome + " recuperou " + alteração + " de saúde.");
        }

        if (alteração < 0) {
            this.saude += alteração;
            System.out.println(this.nome + " perdeu " + alteração + " de saúde.");
        }

        if (this.saude > 100) {
            this.saude = 100;
        }

        if (this.saude < 0) {
            this.saude = 0;
            System.out.println(this.nome + "morreu!!.");
        }
    }
}

