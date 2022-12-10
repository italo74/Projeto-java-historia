import java.util.Scanner;

public class Historia { 
    public static void main(String[] args)  {
        Scanner leitor;
        leitor = new Scanner(System.in); 
        int escolha;

        Personagem drake = new Personagem("Drake", 100, 100);   
        Personagem ladraoTesouro = new Personagem("Ladrão de tesouros", 100, 100);

        String capituloA =
        "Drake era um caçador de tesouros e hoje em dia vive uma vida tranquila com sua esposa."+
        "Porem certo dia quando estava trabalhando, ele escuta alguns estrangeiros falando de um tesouro escondido, então ele...";

        String capAescolha1 =
        "Chegar mais perto disfarçadamente para ouvir.";
        String capAescolha2 =
        "Foca no trabalho e não se interessa na converssa. ";
        String capAescolha3 =
        "Vai falar com os estrangeiros.";

        System.out.println(capituloA);
        System.out.println("1 - "+ capAescolha1 + "( Custa [10] de energia. )");
        System.out.println("2 - "+ capAescolha2 + "( Custa [10] de energia. )") ;
        System.out.println("3 - "+ capAescolha3 + "( Custa [5] de energia. )");
        
        escolha = leitor.nextInt();

        if (escolha == 1) 
        {           
            System.out.println("Você decidiu " + capAescolha1);
            System.out.println(" Você descobriu que estavam falando de um tesouro e que ele esta localizado em uma floresta na Amazônia");
            System.out.println("Então você...");
           
            String capAescolha4 =
            "1 - Decide pegar o primeiro avião pra Amazônia e dizer a sua esposa que vai a uma viagem a trabalho";
            String capAescolha5 =
            "2 - Decide voltar para casa e explicar o que descobliu a sua esposa";
            String capAescolha6 =
            "3 - Ignora as informações que escutou e volta pra casa";
            
            System.out.println(capAescolha4);
            System.out.println(capAescolha5);
            System.out.println(capAescolha6);

           
            escolha = leitor.nextInt();

            if (escolha == 1) {
            System.out.println("Você decide pegar o primeiro avião pra Amazônia e dizer a ela que vai a uma viagem a trabalho.");
            System.out.println("Você chega a floresta e começa a ir atrás do tesouro.");
                System.out.println("Você tem um mapa, e com as informações que escutou, sabe que esxistem 3 caminhos.");
                System.out.println(" Qual você escolhe? ");

                String capCescolha1 = "Seguir pelas montanhas.";
                String capCescolha2 = "Atravessar a floresta.";
                String capCescolha3 = "Seguir o curso do rio.";

                System.out.println("1 - "+ capCescolha1 + "( Custa [20] de energia. )");
                System.out.println("2 - "+ capCescolha2 + "( Custa [15] de energia. )") ;
                System.out.println("3 - "+ capCescolha3 + "( Custa [10] de energia. )");

                if (escolha == 1) {
                    System.out.println(capCescolha1);
                    System.out.println("Você gasta muita energia e tempo mas consegue chegar primeiro ao tesouro, parabenss!");
                    
                }

                else if (escolha == 2) {
                    System.out.println(capCescolha2);
                    System.out.println("No meio do caminho vc encontra bandidos e luta contra eles para pegar o tesouro primeiro.");
                    System.out.println("Você vence e consegue o tesouro");                   
                }

                else {
                    System.out.println(capCescolha3);
                    System.out.println("Você enfrenta desafios na naturesa, porem consegue rapidamente chegar ao tesouro !!");
                }
               
            }

            else if ( escolha == 2) {
                System.out.println(capAescolha5);
                System.out.println("Você diz a sua esposa o que descobriu, mas ela tem medo de perder você, então você decide não ir.");

            }

            else {
                System.out.println(capAescolha6);
                System.out.println("Preferiu não voltar para essa vida perigosa e continuar bem com sua esposa");
            }

        }





        else if (escolha == 2)
        {
            System.out.println( capAescolha2);
            System.out.println("Após isso você volta pra casa, mas continua pensando no que poderia descobrir.");  
            System.out.println("Então voce decide...");

            String capBescolha1 = "Dizer a sua esposa o acontecido.";
            String capBescolha2 = "Tentar pesquisar sobre o tesouro.";
            String capBescolha3 = "Continuar tentando esquever.";

            System.out.println("1 - "+ capBescolha1 + "( Custa [10] de energia. )");
            System.out.println("2 - "+ capBescolha2 + "( Custa [15] de energia. )") ;
            System.out.println("3 - "+ capBescolha3 + "( Custa [5] de energia. )");
            
            escolha = leitor.nextInt();

            if (escolha ==1 ) {
                System.out.println(capBescolha1);
                System.out.println("Sua esposa te convence de que não é uma boa ideia e você desiste disso.");
            }
            
            else if (escolha == 2) {
                System.out.println(capBescolha2);
                System.out.println(" Você perde muito tempo pesquisando, mas não encontra nada, você perdeu a oportunidade.");
            }

            else {
                System.out.println(capBescolha3);
                System.out.println("O tempo passa e você consegue tirar isso da cabeça, então segue sua vida normal");
            }
        }
        
        
        
        
               
        else 
        {
            System.out.println(capAescolha3);
            System.out.println("Então você tenta conversar com os estrangeiros de forma amigável, mas eles não confiam em você");
            System.out.println("Então você decide...");

            String capBescolha1 = "Enganalos para conseguir respostas";
            String capBescolha2 = "Voltar disfarçado.";
            String capBescolha3 = "Desistir da ideia.";

            System.out.println("1 - "+ capBescolha1 + "( Custa [10] de energia. )");
            System.out.println("2 - "+ capBescolha2 + "( Custa [10] de energia. )") ;
            System.out.println("3 - "+ capBescolha3 + "( Custa [5] de energia. )");

            escolha = leitor.nextInt();

            if (escolha == 1||escolha ==2 ) {
                System.out.println("Você consegue descobrir que se trata de um tesouro em uma floresta na Amazônia");
                System.out.println("Então você...");
           
                String capAescolha4 =
                "1 - Decide pegar o primeiro avião pra Amazônia e dizer a sua esposa que vai a uma viagem a trabalho";
                String capAescolha5 =
                "2 - Decide voltar para casa e explicar o que descobliu a sua esposa";
                String capAescolha6 =
                "3 - Ignora as informações que escutou e volta pra casa";
                
                System.out.println(capAescolha4);
                System.out.println(capAescolha5);
                System.out.println(capAescolha6);
    
               
                escolha = leitor.nextInt();
    
                if (escolha == 1) {
                System.out.println("Você decide pegar o primeiro avião pra Amazônia e dizer a ela que vai a uma viagem a trabalho.");
                System.out.println("Você chega a floresta e começa a ir atrás do tesouro.");
                System.out.println("Você tem um mapa, e com as informações que escutou, sabe que esxistem 3 caminhos.");
                System.out.println(" Qual você escolhe? ");

                String capCescolha1 = "Seguir pelas montanhas.";
                String capCescolha2 = "Atravessar a floresta.";
                String capCescolha3 = "Seguir o curso do rio.";

                System.out.println("1 - "+ capCescolha1 + "( Custa [20] de energia. )");
                System.out.println("2 - "+ capCescolha2 + "( Custa [15] de energia. )") ;
                System.out.println("3 - "+ capCescolha3 + "( Custa [10] de energia. )");

                if (escolha == 1) {
                    System.out.println(capCescolha1);
                    System.out.println("Você gasta muita energia e tempo mas consegue chegar primeiro ao tesouro, parabenss!");
                    
                }

                else if (escolha == 2) {
                    System.out.println(capCescolha2);
                    System.out.println("No meio do caminho vc encontra bandidos e luta contra eles para pegar o tesouro primeiro.");
                    System.out.println("Você vence e consegue o tesouro");                   
                }

                else {
                    System.out.println(capCescolha3);
                    System.out.println("Você enfrenta desafios na naturesa, porem consegue rapidamente chegar ao tesouro !!");
                }
    


                System.out.println("Com seu conhecimento encontrou o tesouro e pegou ele primeiro que os bandidos.");    
                }
    
                else if ( escolha == 2) {
                    System.out.println(capAescolha5);
                    System.out.println("Você diz a sua esposa o que descobriu, mas ela tem medo de perder você, então você decide não ir.");
    
                }
    
                else {
                    System.out.println(capAescolha6);
                    System.out.println("Preferiu não voltar para essa vida perigosa e continuar bem com sua esposa");
                }

            }

            else {
                System.out.println(capBescolha3);
                System.out.println("O tempo passa e você consegue tirar isso da cabeça, então segue sua vida normal");
            }
                
            

            
        }

        leitor.close();    
        }            
        
    }

