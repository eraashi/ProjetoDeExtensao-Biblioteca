/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import Conexao.Conexao;
import DTO.LivroDTO;
import DAO.LivroDAO;
import DTO.UserDTO;
import DAO.UserDAO;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author icaro
 */
public class PaginaInicial extends javax.swing.JFrame {
    private UserDTO objUserDTONovo;
    private AlterarUsuarioLogado altUsuarioFinal;
    PagMovimento denuncias;
    LivroDTO objLivroDTO = new LivroDTO();
    /**
     * Creates new form FormularioUnico
     */
    //fui obrigado a criar essas variáveis de conexão aqui apra fazer um
    //combobox IMPROVISADO funcionar, aquele do lado do botao pesquisar
    Conexao CONEXAO = new Conexao();
    public PreparedStatement pstm;
    public ResultSet rs;
    DefaultListModel modelo;
    int Enter = 0;
    
    String [] Codig;

    public PaginaInicial() {
       
        initComponents();
        //aqui a lista é atualizada assim que a página surge
        CONEXAO.conecta();
        listarLivros();
        listarLivrosRecentes();
        MostraPesquisa();
        //aqui a combox padrao é atualiza assim que a página surge
        //restaurarBoxLivros();
        //métodos para a combobox IMPROVISADA (do lado do botao pesquisar)
        listaPesquisaLivros.setVisible(false);
        
        modelo = new DefaultListModel();
        listaPesquisaLivros.setModel(modelo);
        txtId.setVisible(false);
        txtExcluirId.setVisible(false);
        txtAltLivro.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeUsuario = new javax.swing.JLabel();
        listaPesquisaLivros = new javax.swing.JList<>();
        txtOla = new javax.swing.JLabel();
        btnNovoLivro = new javax.swing.JButton();
        btnEditarDados = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivro = new javax.swing.JTable();
        btnAtualizarTabela = new javax.swing.JButton();
        btnExcluirLivro = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtExcluirId = new javax.swing.JTextField();
        btnAltLivro = new javax.swing.JButton();
        txtAltLivro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaLivros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Página Inicial");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1178, 734));
        setModalExclusionType(null);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        txtNomeUsuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        txtNomeUsuario.setForeground(new java.awt.Color(239, 125, 9));
        txtNomeUsuario.setToolTipText("");
        getContentPane().add(txtNomeUsuario);
        txtNomeUsuario.setBounds(20, 380, 260, 50);

        listaPesquisaLivros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        listaPesquisaLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPesquisaLivrosMouseClicked(evt);
            }
        });
        getContentPane().add(listaPesquisaLivros);
        listaPesquisaLivros.setBounds(480, 260, 500, 90);

        txtOla.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        txtOla.setForeground(new java.awt.Color(239, 125, 9));
        txtOla.setText("Olá,");
        getContentPane().add(txtOla);
        txtOla.setBounds(120, 330, 80, 50);

        btnNovoLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNovoLivro.setForeground(new java.awt.Color(255, 204, 0));
        btnNovoLivro.setText("Novo Livro");
        btnNovoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLivroActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoLivro);
        btnNovoLivro.setBounds(60, 450, 180, 50);

        btnEditarDados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarDados.setForeground(new java.awt.Color(255, 204, 0));
        btnEditarDados.setText("Editar Seus Dados");
        btnEditarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDadosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarDados);
        btnEditarDados.setBounds(60, 510, 180, 50);

        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(60, 570, 180, 50);

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("");
        btnPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(360, 230, 100, 30);

        txtPesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPesquisaMouseClicked(evt);
            }
        });
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });
        getContentPane().add(txtPesquisa);
        txtPesquisa.setBounds(480, 230, 500, 30);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 51));
        jLabel14.setText("Movimentações");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(860, 320, 180, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/pngtree-magnifier-and-background-glass-lens-png-image_4944280 1.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(800, 310, 48, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/lateral mero.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 300, 1160);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/livro icone laranja 1.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(990, 60, 90, 90);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Atualização de Catálogo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 320, 280, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/icone atualização (1).png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 310, 80, 50);

        tabelaLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "ISBN", "Editora", "Data", "Local"
            }
        ));
        jScrollPane1.setViewportView(tabelaLivro);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 380, 300, 200);

        btnAtualizarTabela.setText("Atualizar");
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarTabela);
        btnAtualizarTabela.setBounds(440, 600, 90, 23);

        btnExcluirLivro.setText("Excluir Livro");
        btnExcluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLivroActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirLivro);
        btnExcluirLivro.setBounds(560, 600, 94, 23);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Nova Reserva/Devolução");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 188, 630, 30);

        txtId.setEditable(false);
        getContentPane().add(txtId);
        txtId.setBounds(990, 230, 30, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setText("Bem Vindo à Biblioteca Mero Carneiro");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 90, 630, 48);

        txtExcluirId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExcluirIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtExcluirId);
        txtExcluirId.setBounds(570, 630, 80, 22);

        btnAltLivro.setText("Alterar Estado");
        getContentPane().add(btnAltLivro);
        btnAltLivro.setBounds(880, 600, 120, 23);
        getContentPane().add(txtAltLivro);
        txtAltLivro.setBounds(880, 630, 120, 22);

        listaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Cliente", "Data", "Hora"
            }
        ));
        jScrollPane2.setViewportView(listaLivros);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(780, 380, 310, 200);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDadosActionPerformed

        altUsuarioFinal.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnEditarDadosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        TelaDeLogin login = new TelaDeLogin();
        login.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        //aqui a lista improvisada desaparece de baixo do campo de escrever
        //assim que o usuario aperta Enter e a variável recebe 1
        listaPesquisaLivros.setVisible(false);
        Enter = 1;
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //em tese, era pra funcionar
        //esse botão pega o valor de txtId, joga na variável idLocal
        //depois, cria um objeto de LivroDTO que armazena na Id do DTO o valor
        //de idLocal
        //chamo um método de LivroDAO que faz a comparação com o banco de dados
        //do Id de LivroDTO com o do banco e retorna o valor para o objeto
        //que foi instanciado antes: objLivroDTO
        //cria-se um if onde se o resultado dessa operação do método for encotrado,
        //no caso se o Id for encontrado com um id do banco de dados,
        //todas as informações desse id do banco de dados são trazidas para o
        //objLivroDTO, no caso cada informação do livro
        //abre-se a página de movimento, onde automaticamente, preenche-se
        //cada campo label e campo textfield, com as informações da DTO
        
        try {
            String tituloLocal;

            tituloLocal = txtPesquisa.getText();

            LivroDAO objLivroDAO = new LivroDAO();
            ResultSet rsLivroDAO = objLivroDAO.compararTituloLivro(tituloLocal);

            if (rsLivroDAO.next()) {
                //checar se está funcionando

                objLivroDTO.setId(rsLivroDAO.getString("id"));
                objLivroDTO.setTitulo(rsLivroDAO.getString("titulo"));
                objLivroDTO.setAutor(rsLivroDAO.getString("autor"));
                objLivroDTO.setIsbn(rsLivroDAO.getString("isbn"));
                objLivroDTO.setEditora(rsLivroDAO.getString("editora"));
                objLivroDTO.setData(rsLivroDAO.getString("data"));
                objLivroDTO.setLocal(rsLivroDAO.getString("local"));
                objLivroDTO.setNome_cliente(rsLivroDAO.getString("nome_cliente"));
                objLivroDTO.setCpf_cliente(rsLivroDAO.getString("cpf_cliente"));
                objLivroDTO.setData_cliente(rsLivroDAO.getString("data_cliente"));
                objLivroDTO.setHora_cliente(rsLivroDAO.getString("hora_cliente"));
                objLivroDTO.setCelular_cliente(rsLivroDAO.getString("isbn"));
                objLivroDTO.setReservado(rsLivroDAO.getBoolean("reservado"));
                
                denuncias = new PagMovimento();
                
                denuncias.setobjLivroDTO(objLivroDTO);
                denuncias.setVisible(true);
                this.setVisible(false);
                
            } else {
                JOptionPane.showMessageDialog(null, "Livro não encontrado no banco de dados. ");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "btnPesquisarActionPerformed: " + erro);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaActionPerformed
        //botão para atualizar a tabela da interface
        listarLivros();
        listarLivrosRecentes();
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        //aqui se o usuario pressionar enter e a variável for 0
        //a lista IMPROVISADA é atualizada
        //se nao, se for 1, a variável recebe 0
        if (Enter == 0) {
            listaPesquisaParaTextfield();
        } else
            Enter = 0;
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void listaPesquisaLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPesquisaLivrosMouseClicked
        //criei uma acao que quando o usuario clicar na lista aberta
        //o campo de escrever também recebe o conteúdo que ele clicou da lista
        //depois ela se fecha
        //MostraPesquisa();
        //listaPesquisaLivros.setVisible(false);
    }//GEN-LAST:event_listaPesquisaLivrosMouseClicked

    private void txtPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPesquisaMouseClicked
        //aqui quando o campo de escrever é clicado a lista se mostra
        listaPesquisaParaTextfield();
        listaPesquisaLivros.setVisible(true);
    }//GEN-LAST:event_txtPesquisaMouseClicked

    private void btnNovoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLivroActionPerformed
        NovoLivro objNovoLivro = new NovoLivro();
        objNovoLivro.setVisible(true);
    }//GEN-LAST:event_btnNovoLivroActionPerformed

    private void btnExcluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLivroActionPerformed
        CarregarIdLivroExcluir();
        ExcluirLivro();
        listarLivros();
        listarLivrosRecentes();
        LimparCampoId();
    }//GEN-LAST:event_btnExcluirLivroActionPerformed

    private void txtExcluirIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExcluirIdActionPerformed
        
    }//GEN-LAST:event_txtExcluirIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltLivro;
    private javax.swing.JButton btnAtualizarTabela;
    private javax.swing.JButton btnEditarDados;
    private javax.swing.JButton btnExcluirLivro;
    private javax.swing.JButton btnNovoLivro;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaLivros;
    private javax.swing.JList<String> listaPesquisaLivros;
    private javax.swing.JTable tabelaLivro;
    private javax.swing.JTextField txtAltLivro;
    private javax.swing.JTextField txtExcluirId;
    private javax.swing.JTextField txtId;
    public javax.swing.JLabel txtNomeUsuario;
    private javax.swing.JLabel txtOla;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    public void BotaoEditar(AlterarUsuarioLogado altUsuario){
        this.altUsuarioFinal = altUsuario;
        altUsuarioFinal.setVisible(false);
    }
    
    public void setUserDTO(UserDTO objUserDTO) {
        this.objUserDTONovo = objUserDTO;
        try{
            String nomeUsuario;

            nomeUsuario = objUserDTONovo.getNome_completo();
            
            txtNomeUsuario.setText(nomeUsuario);
            
            System.out.print("Teste de recepção em setUserDTO, após abrir a PaginaInicial: \n");
            System.out.print("Id: " + objUserDTONovo.getId() + "\n");
            System.out.print("Login: " + objUserDTONovo.getLogin() + "\n");
            System.out.print("Senha: " + objUserDTONovo.getSenha() + "\n");
            System.out.print("Confirmar Senha: " + objUserDTONovo.getConfirmar_senha() + "\n");
            System.out.print("Nome Completo: " + objUserDTONovo.getNome_completo() + "\n");
            System.out.print("CPF: " + objUserDTONovo.getCpf() + "\n");
            System.out.print("Celular: " + objUserDTONovo.getCelular() + "\n");
            System.out.print("Cidade: " + objUserDTONovo.getCidade() + "\n");
            System.out.print("Uf: " + objUserDTONovo.getUf() + "\n");
            System.out.print("Num: " + objUserDTONovo.getNum() + "\n");
            System.out.print("Endereço: " + objUserDTONovo.getEndereço() + "\n");
            System.out.print("Email: " + objUserDTONovo.getEmail() + "\n");
            
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "setUserDTO em pagInicial: " + erro);
        }
        // Use o objeto UserDTO dentro deste JFrame
    }
    
    public void listaPesquisaParaTextfield() {
        try {
            CONEXAO.executaSQL("SELECT * FROM livromovimentacao WHERE titulo LIKE '" + txtPesquisa.getText() + "%' ORDER BY titulo");
            modelo.removeAllElements();
            int v = 0;
            Codig = new String[4];
            while (CONEXAO.rs.next() & v < 4) {
                modelo.addElement(CONEXAO.rs.getString("titulo"));
                Codig[v] = CONEXAO.rs.getString("id");
                v++;
            }
            if (v >= 1) {
                listaPesquisaLivros.setVisible(true);
            } else {
                listaPesquisaLivros.setVisible(false);
            }

            ResultadoPesquisa();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "listaPesquisaParaTextfield em PaginaInicial: " + erro);
        }
    }

    public void MostraPesquisa() {
        int Linha = listaPesquisaLivros.getSelectedIndex();
        if (Linha >= 0) {
            CONEXAO.executaSQL("SELECT * FROM livromovimentacao WHERE id = "+Codig[Linha]+" ");
            ResultadoPesquisa();
        }
    }

    public void ResultadoPesquisa() {
        try {
            CONEXAO.rs.first();
            txtPesquisa.setText(CONEXAO.rs.getString("titulo"));
            txtId.setText(CONEXAO.rs.getString("id"));

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ResultadoPesquisa em PaginaInicial: " + erro);
        }
    }

    //não vou utilizar agora
    /*Vector<Integer> id = new Vector<Integer>();

    public void restaurarBoxLivros() {
        boxLivros.setEditable(true);
        boxLivros.addActionListener(boxLivros);
        try {

            LivroDAO objLivroDAO = new LivroDAO();
            ResultSet rs = objLivroDAO.listarBoxLivros();

            while (rs.next()) {
                id.addElement(rs.getInt(1));
                boxLivros.addItem(rs.getString(2));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "restaurarBoxLivros: " + erro);
        }
    }*/

    //criei esse método para listar os livros do mysql numa tabela da interface
    //ela é atualizada quando a página abre e quando é pressionado o novo botao em baixo dela
    private void listarLivros() {

        try {
            LivroDAO objLivroDAO = new LivroDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaLivro.getModel();
            model.setNumRows(0);

            ArrayList<LivroDTO> lista = objLivroDAO.pesquisarLivroLista();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getTitulo(),
                    lista.get(num).getAutor(),
                    lista.get(num).getIsbn(),
                    lista.get(num).getEditora(),
                    lista.get(num).getData(),
                    lista.get(num).getLocal(),});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "listarLivros TABELA: " + erro);
        }
    }
    
    private void listarLivrosRecentes() {

        try {
            LivroDAO objLivroDAO = new LivroDAO();

            DefaultTableModel modelRecente = (DefaultTableModel) listaLivros.getModel();
            modelRecente.setNumRows(0);

            ArrayList<LivroDTO> listaRecente = objLivroDAO.pesquisarLivroRecente();

            for (int num = 0; num < listaRecente.size(); num++) {
                modelRecente.addRow(new Object[]{
                    listaRecente.get(num).getTitulo(),
                    listaRecente.get(num).getNome_cliente(),
                    listaRecente.get(num).getData_cliente(),
                    listaRecente.get(num).getHora_cliente(),
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "listarLivrosRecentes TABELA: " + erro);
        }
    
    }
    
    private void CarregarIdLivroExcluir(){
        int setar = tabelaLivro.getSelectedRow();
        
        txtExcluirId.setText(tabelaLivro.getModel().getValueAt(setar, 0).toString());
    }
    
    private void LimparCampoId(){
        txtExcluirId.setText("");
    }
    
    private void ExcluirLivro(){
        String tituloExcluir;
        
        tituloExcluir = txtExcluirId.getText();
        
        LivroDTO objLivroExcluir = new LivroDTO();
        objLivroExcluir.setTitulo(tituloExcluir);
        
        LivroDAO objLivroDAOExcluir = new LivroDAO();
        objLivroDAOExcluir.excluirLivro(objLivroExcluir);
        
    }
    
}
