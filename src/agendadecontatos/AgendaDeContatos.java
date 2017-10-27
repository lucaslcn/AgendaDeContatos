/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendadecontatos;
import Apoio.Funcoes;
import negocio.Contato;
import negocio.Tipo;
import apoio.Entrada;
import negocio.Mensagem;

/**
 *
 * @author lucas.lucian
 */
public class AgendaDeContatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contato contato[] = new Contato[10];
        int iContato = 0;
       
        
        Mensagem mensagem[] = new Mensagem[10000];
        int iMensagem = 0;
        
        String nome;
        
        
        Tipo tipos[] = new Tipo[3];        
        Tipo tipo1 = new Tipo(1,"Familia");
        Tipo tipo2 = new Tipo(2,"Amigo");
        Tipo tipo3 = new Tipo(3,"Trabalho");

   
        int tipoEscolhido = 0;
        
        int opcao = 1;
        
        while (opcao != 7)
        {
            switch (opcao = Entrada.leiaInt("Digite a opcao desejada:" 
                                           + "\n1 - Cadastrar contato"
                                           + "\n2 - Consultar contato"
                                           + "\n3 - Listar contatos por tipo"
                                           + "\n4 - Fazer o envio de uma mensagem"
                                           + "\n5 - Consultar numero de mensagens para algum contato"
                                           + "\n6 - Listar mensagens enviadas"
                    ))
            {
                
                case 1:
                {
                    if(iContato < contato.length)
                    {
                        Contato cont = new Contato();
                        
                        cont.setId(Contato.getNumeroSequencial());
                        cont.setNome(Entrada.leiaString("Digite o nome do contato"));
                        cont.setTelefone(Entrada.leiaString("Digite o telefone do contato"));
                        cont.setEmail(Entrada.leiaString("Digite o email do contato"));
                        tipoEscolhido = Entrada.leiaInt("Digite o tipo escolhido: \n"
                                + "\n1 - Familia"
                                + "\n2 - Amigo"
                                + "\n3 - Trabalho");
                        
                        cont.setTipo(tipos[tipoEscolhido]);
                        
                        contato[iContato] = cont;
                        iContato++;
                       
                    }
                        break;
                }
                
                case 2:
                {
                    nome = Entrada.leiaString ("Digite o nome do contato desejado:");
                    for (int i = 0; i < contato.length && contato[i] != null; i++)
                    {
                        if (nome.equalsIgnoreCase(contato[i].getNome()))
                        {
                            System.out.println(contato[i].getNome());
                            System.out.println(contato[i].getEmail());
                            System.out.println(contato[i].getTelefone());
                        }
                        
                        else System.out.println("Contato não encontrado");
                        
                    }
                    
                    break;
                }
                
                case 3:
                {
                    tipoEscolhido = Entrada.leiaInt("Digite o tipo que deseja consultar: \n"
                                + "\n1 - Familia"
                                + "\n2 - Amigo"
                                + "\n3 - Trabalho");
                
                    for (int i = 0; i<contato.length; i++)
                    {
                        if(contato[i].getTipo() == tipos[-1])
                        {
                            System.out.println(contato[i].getNome());
                            System.out.println(contato[i].getEmail());
                            System.out.println(contato[i].getTelefone());
                            System.out.println("\n");
                        }
                        
                        else System.out.println("Nenhum encontrado neste tipo :(");
                    }
                    break;
                }
                
                case 4:
                {
                    for (int i = 0; i < contato.length && contato[i] != null; i++)

                        {
                        System.out.println("ID: " + contato[i].getId() + ", Nome: " + contato[i].getNome());
                        }
                    
                    int escolha = Entrada.leiaInt("Digite o ID do contato que deseja enviar a mensagem:");
                    String msg = Entrada.leiaString("Digite a mensagem que deseja enviar ao contato:");
                    cadastrarMensagem(mensagem,contato[escolha-1],msg,iMensagem);
                    break;
                    
                }
                
                case 5:
                {
                    for (int i = 0; i < contato.length && contato[i] != null; i++)

                        {
                        System.out.println("ID: " + contato[i].getId() + ", Nome: " + contato[i].getNome());
                        }
                    
                    int escolha = Entrada.leiaInt("Digite o ID do contato que deseja consultar o numero de mensagems:");
                    
                    System.out.println("Foram enviadas " + contato[escolha-1].getNumeroMensagens() + " mensagens ao contato");
                    break;
                }
                
                case 6:
                    
                    System.out.println("\n------LOG DE MENSAGENS ENVIADAS------\n\n");
                    
                    for (int i = 0; i < mensagem.length && mensagem[i] != null; i++)
                    {
                        System.out.println(mensagem[i].getContato().getNome());
                        System.out.println(mensagem[i].getDataHora());
                        System.out.println(mensagem[i].getMensagem());
                        System.out.println("\n");
                    }
           
                        
                    }
                }
    }
                
                
            
    
    public static void cadastrarMensagem (Mensagem mensagem[], Contato contato, String msg, int iMensagem)
    {
        Mensagem m = new Mensagem();
        m.setContato(contato);
        m.setMensagem(msg);
        m.setDataHora(Funcoes.getDataHoraAtual());
        contato.addMessage();
        mensagem[iMensagem] = m;
        iMensagem++;
        
    }
            

            
        }
        
        
    
    

