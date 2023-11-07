package DAO;

//classe criada para criar métodos com relação aos dados dos livros
import Conexao.Conexao;
import DTO.LivroDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import DTO.LivroDTO;

public class LivroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LivroDTO> lista = new ArrayList<>();
    
    //método que lista id e titulo do banco de dados
    //não está sendo usado
    /*public ResultSet listarBoxLivros(){
        String sql = "SELECT id, titulo FROM livromovimentacao ORDER BY titulo";
        conn = new Conexao().conectaBD();
        
        try{
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "listarBoxLivros: " + erro);
            return null;
        }
    }*/
    
    //esse método aqui tenta comparar um id local com um id do mysql
    public ResultSet compararIdLivro(LivroDTO objLivroDTO){
        conn = new Conexao().conectaBD();
        
        try {
            String sql = "SELECT * from livromovimentacao WHERE id = ?";
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objLivroDTO.getId());
            rs = pstm.executeQuery();
            
            return rs;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "compararIdLivro: " + erro);
            return null;
        }
    }
    
    //aqui esse método puxa os dados do msql e trás para a classe LivrosDTO
    public void resgatarDadosLivro(LivroDTO objLivroDTO) {
        String sql = "SELECT * from livromovimentacao WHERE id = ?";
        conn = new Conexao().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objLivroDTO.getId());
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                objLivroDTO.setId(rs.getInt("id"));
                objLivroDTO.setTitulo(rs.getString("titulo"));
                objLivroDTO.setAutor(rs.getString("autor"));
                objLivroDTO.setIsbn(rs.getInt("isbn"));
                objLivroDTO.setEditora(rs.getString("editora"));
                objLivroDTO.setData(rs.getInt("data"));
                objLivroDTO.setLocal(rs.getString("local"));
                objLivroDTO.setNome_cliente(rs.getString("nome_cliente"));
                objLivroDTO.setCpf_cliente(rs.getInt("cpf_cliente"));
                objLivroDTO.setData_cliente(rs.getInt("data_cliente"));
                objLivroDTO.setHora_cliente(rs.getInt("hora_cliente"));
                objLivroDTO.setCelular_cliente(rs.getInt("isbn"));
                objLivroDTO.setReservado(rs.getBoolean("reservado"));

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "resgatarDadosLivros em LivroDAO: " + erro);
        }
    }
    //aqui esse método faz a alteração do DTO para o mysql
    //pega os dados editáveis dos livros em LivrosDTO e joga na tabela msql
    //utilizando o id como referência
    public void alterarUsuarioLivro(LivroDTO objLivroDTO) {
        String sql = "update livromovimentacao set nome_cliente = ?, cpf_cliente = ?, data_cliente = ?, hora_cliente = ?, hora_cliente = ?, celular-cliente = ? where id = ?";
        conn = new Conexao().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome_cliente());
            pstm.setInt(2, objLivroDTO.getCpf_cliente());
            pstm.setInt(3, objLivroDTO.getData_cliente());
            pstm.setInt(4, objLivroDTO.getHora_cliente());
            pstm.setInt(5, objLivroDTO.getCelular_cliente());
            pstm.setBoolean(6, objLivroDTO.isReservado());
            pstm.setInt(7, objLivroDTO.getId());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alterarUsuarioLivro em LivroDAO: " + erro);
        }

    }
    //aqui é um método que lista TODOS os dados da tabela do msql
    //e joga numa lista array que logo depois é usada na tabela da interface gráfica
    public ArrayList<LivroDTO> pesquisarLivroLista() {
        String sql = "SELECT * from livromovimentacao";
        conn = new Conexao().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                LivroDTO objLivroDTO = new LivroDTO();

                objLivroDTO.setId(rs.getInt("id"));
                objLivroDTO.setTitulo(rs.getString("titulo"));
                objLivroDTO.setAutor(rs.getString("autor"));
                objLivroDTO.setIsbn(rs.getInt("isbn"));
                objLivroDTO.setEditora(rs.getString("editora"));
                objLivroDTO.setData(rs.getInt("data"));
                objLivroDTO.setLocal(rs.getString("local"));

                lista.add(objLivroDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "pesquisarLivroLista em LivroDAO: " + erro);
        }
        return lista;
    }
    
    public ResultSet criarNovoLivro(LivroDTO objLivroDTO) {
            conn = new Conexao().conectaBD();

        try {
            String sql = "INSERT INTO livromovimentacao SET titulo, autor, isbn, editora, data, hora VALUES(?,?,?,?,?,?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getTitulo());
            pstm.setString(2, objLivroDTO.getAutor());
            pstm.setInt(3, objLivroDTO.getIsbn());
            pstm.setString(4, objLivroDTO.getEditora());
            pstm.setInt(5, objLivroDTO.getData());
            pstm.setString(6, objLivroDTO.getLocal());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "criarNovoLivro em LivroDAO: " + erro);
            return null;
        }

    }
    
}
