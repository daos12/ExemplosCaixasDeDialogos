package exemploscaixasdedialogos;

import javax.swing.JOptionPane;

public class ExemplosCaixasDeDialogos {
    public static void main(String[] args) {
//        System.out.println("");
//        //showMessageDialog saída de dados
//        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");
//        
//        //showComfirmDialog
//        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair?");
//        
//        if(resposta == JOptionPane.YES_NO_OPTION){
//            JOptionPane.showMessageDialog(null, "Saindo do sistema.");
//        }else{
//            JOptionPane.showMessageDialog(null, "Continuando no sistema.");
//        }
        
        //showInputDialog
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        
        JOptionPane.showMessageDialog(null, "Nome do usuario: " + nome);
        
        
    }
}
