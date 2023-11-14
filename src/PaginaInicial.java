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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public PaginaInicial() {

        initComponents();
        //aqui a lista é atualizada assim que a página surge
        listarLivros();
        listarLivrosRecentes();
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
        txtOla = new javax.swing.JLabel();
        btnNovoLivro = new javax.swing.JButton();
        btnEditarDados = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
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
        setMinimumSize(new java.awt.Dimension(1143, 700));
        setModalExclusionType(null);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        txtNomeUsuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        txtNomeUsuario.setForeground(new java.awt.Color(239, 125, 9));
        txtNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNomeUsuario.setToolTipText("");
        getContentPane().add(txtNomeUsuario);
        txtNomeUsuario.setBounds(40, 380, 0, 50);

        txtOla.setFont(new java.awt.Font("Yu Gothic UI", 1, 34)); // NOI18N
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

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 51));
        jLabel14.setText("Movimentações");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(840, 240, 180, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/pngtree-magnifier-and-background-glass-lens-png-image_4944280 1.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(780, 230, 48, 60);

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
        jLabel3.setBounds(420, 240, 280, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder/newpackage/icone atualização (1).png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 230, 80, 50);

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
        jScrollPane1.setBounds(380, 300, 300, 200);

        btnAtualizarTabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAtualizarTabela.setText("Atualizar");
        btnAtualizarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTabelaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarTabela);
        btnAtualizarTabela.setBounds(420, 520, 90, 23);

        btnExcluirLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirLivro.setText("Excluir Livro");
        btnExcluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLivroActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirLivro);
        btnExcluirLivro.setBounds(540, 520, 100, 23);

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
        txtExcluirId.setBounds(550, 550, 80, 22);

        btnAltLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAltLivro.setText("Alterar Estado");
        btnAltLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltLivroActionPerformed(evt);
            }
        });
        getContentPane().add(btnAltLivro);
        btnAltLivro.setBounds(860, 520, 120, 23);
        getContentPane().add(txtAltLivro);
        txtAltLivro.setBounds(860, 550, 120, 22);

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
        jScrollPane2.setBounds(760, 300, 310, 200);

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

    private void btnAtualizarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTabelaActionPerformed
        //botão para atualizar a tabela da interface
        listarLivros();
        listarLivrosRecentes();
    }//GEN-LAST:event_btnAtualizarTabelaActionPerformed

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

    private void btnAltLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltLivroActionPerformed

        CarregarTituloLivroAlt();
        alterarLivroDTO();

    }//GEN-LAST:event_btnAltLivroActionPerformed

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
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaLivros;
    private javax.swing.JTable tabelaLivro;
    private javax.swing.JTextField txtAltLivro;
    private javax.swing.JTextField txtExcluirId;
    public javax.swing.JLabel txtNomeUsuario;
    private javax.swing.JLabel txtOla;
    // End of variables declaration//GEN-END:variables

    public void BotaoEditar(AlterarUsuarioLogado altUsuario) {
        this.altUsuarioFinal = altUsuario;
        altUsuarioFinal.setVisible(false);
    }

    public void setUserDTO(UserDTO objUserDTO) {
        this.objUserDTONovo = objUserDTO;
        try {
            String nomeUsuario;

            nomeUsuario = objUserDTONovo.getNome_completo();

            txtNomeUsuario.setText(nomeUsuario);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "setUserDTO em pagInicial: " + erro);
        }
        // Use o objeto UserDTO dentro deste JFrame
    }

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
                    listaRecente.get(num).getHora_cliente(),});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "listarLivrosRecentes TABELA: " + erro);
        }

    }

    private void CarregarIdLivroExcluir() {
        int setar = tabelaLivro.getSelectedRow();

        txtExcluirId.setText(tabelaLivro.getModel().getValueAt(setar, 0).toString());
    }

    private void CarregarTituloLivroAlt() {
        int setar = listaLivros.getSelectedRow();

        txtAltLivro.setText(listaLivros.getModel().getValueAt(setar, 0).toString());
    }

    private void LimparCampoId() {
        txtExcluirId.setText("");
    }

    private void ExcluirLivro() {
        String tituloExcluir;

        tituloExcluir = txtExcluirId.getText();

        LivroDTO objLivroExcluir = new LivroDTO();
        objLivroExcluir.setTitulo(tituloExcluir);

        LivroDAO objLivroDAOExcluir = new LivroDAO();
        objLivroDAOExcluir.excluirLivro(objLivroExcluir);

    }

    private void alterarLivroDTO() {
        try {
            String tituloAlt;

            tituloAlt = txtAltLivro.getText();

            LivroDAO objLivroDAO = new LivroDAO();
            ResultSet rsLivroDAO = objLivroDAO.compararTituloLivro(tituloAlt);

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
                objLivroDTO.setCelular_cliente(rsLivroDAO.getString("celular_cliente"));
                objLivroDTO.setReservado(rsLivroDAO.getBoolean("reservado"));

                denuncias = new PagMovimento();

                denuncias.setobjLivroDTO(objLivroDTO);
                denuncias.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Livro não encontrado no banco de dados. ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
