package exemploscaixasdedialogos;

import javax.swing.JOptionPane;

public class ExemplosCaixasDeDialogos {

    public static void main(String[] args) {
        //showMessageDialog saída de dados
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");

        //showComfirmDialog
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?");

        if (resposta == JOptionPane.YES_NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Saindo do sistema.");
        } else {
            JOptionPane.showMessageDialog(null, "Continuando no sistema.");
        }

        //showInputDialog
        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        JOptionPane.showMessageDialog(null, "Nome do usuario: " + nome);

        //showOptionDialog
        String[] opcoes = {"Sim", "Não", "Batata"};

        int escolha = JOptionPane.showOptionDialog(
                null,                               //sempre null
                "Continuar?",                       //Mensagem para o usuario
                "Escolha opções",                   //Titulo da caixa
                JOptionPane.DEFAULT_OPTION,         //Botões desabilitados
                JOptionPane.INFORMATION_MESSAGE,    //Icones
                null,                               //Sempre null
                opcoes,                             //Vetor 
                opcoes[0]);                         //Inicio do vetor

        
        //showInputDialog List-Object
        Object[] itens = {"Teclado", "Mouse", "Monitor"};

        Object opcaoEscolhida = JOptionPane.showInputDialog(
                null,
                "Escolha um item: ",
                "Lista de opções",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                itens,
                itens[0]);

    }

}
