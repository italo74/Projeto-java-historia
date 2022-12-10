import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in); 
            System.out.println("Olá, Sou o jARVIS, o sistema que foi criado para te dar o acesso ao jogo do IRON MAN !");
            System.out.println("Comece me informando seu nome:");
            String nome = sc.nextLine();
            
            System.out.println("Olá " +nome+ ", seja bem vindo, para se tornar um novo jogador escolha agora seu nickname:");

            String nick = sc.nextLine();
            System.out.println("Muito bom "+nick+", insira seu e-mail para receber as novidades sobre o jogo: ");

            String email = sc.nextLine();
            System.out.println(nick+ " seu e-mail: "+email+" esta registrado!\nDigite uma senha para sua conta"+nick+" :");
            String senha = sc.nextLine();
            System.out.println("Sua senha é: "+ senha +". Agora para finalizar "+nick+", informe sua idade: ");

            String idade = sc.nextLine();
            System.out.println("Voce tem"+ idade + ". Você está pronto para jogar o novo jogo do IRON MAN, quando precisar de ajuda eu Jarvis< estarei aqui para resolver :) !!!");
            
            sc.close();
 
        }     
    }

