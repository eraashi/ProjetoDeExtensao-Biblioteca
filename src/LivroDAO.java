//classe criada para criar métodos com relação aos dados dos livros
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LivroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<LivroDTO> lista = new ArrayList<>();
    //aqui esse método puxa os dados do msql e trás para a classe LivrosDTO
    public void atualizarDadosLivros(LivroDTO objLivroDTO) {
        String sql = "SELECT titulo, autor, isbn, editora, data, local from livromovimentacao";
        conn = new Conexao().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {

                objLivroDTO.setId(rs.getInt("id"));
                objLivroDTO.setTitulo(rs.getString("titulo"));
                objLivroDTO.setAutor(rs.getString("autor"));
                objLivroDTO.setIsbn(rs.getInt("isbn"));
                objLivroDTO.setEditora(rs.getString("editora"));
                objLivroDTO.setData(rs.getInt("data"));
                objLivroDTO.setLocal(rs.getString("local"));

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "atualizarDadosLivros em LivroDAO: " + erro);
        }
    }
    //aqui esse método faz a alteração do DTO para o mysql
    //pega os dados dos livros em LivrosDTO e joga na tabela msql
    public void alterarUsuarioLivro(LivroDTO objLivroDTO) {
        String sql = "insert into livromovimentacao (nome_cliente, cpf_cliente, data_cliente, hora_cliente, celular-cliente, reservado) values (?, ?, ?, ?, ?, ?)";
        conn = new Conexao().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objLivroDTO.getNome_cliente());
            pstm.setInt(2, objLivroDTO.getCpf_cliente());
            pstm.setInt(3, objLivroDTO.getData_cliente());
            pstm.setInt(4, objLivroDTO.getHora_cliente());
            pstm.setInt(5, objLivroDTO.getCelular_cliente());
            pstm.setBoolean(6, objLivroDTO.isReservado());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "alterarUsuarioLivro em LivroDAO: " + erro);
        }

    }
    //aqui é um métodoq ue lista todos os dados da tabela do msql
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
}
