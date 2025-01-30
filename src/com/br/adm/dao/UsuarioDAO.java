/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.adm.dao;

import com.br.adm.jdbc.ConexaoBanco;
import com.br.adm.model.Aluno;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import com.br.adm.model.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dacru
 */
public class UsuarioDAO {
    
    private Connection conn;
    public UsuarioDAO() {
        this.conn = new ConexaoBanco().pegarConexao();
    }
    
public void Salvar (Usuario obj) {
try {
    //1º criar o sql
    String sql = "insert into usuario (nome, cpf, celular, telefone, rua, numero, bairro, cep, email, senha, nivel_acesso)"
            + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    //2ª preparar a conexcao SQL oara se cinectar com o banco
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setString(1, obj.getNome());
    stmt.setString(2, obj.getCpf());
    stmt.setString(3, obj.getCelular());
    stmt.setString(4, obj.getTelefone());
    stmt.setString(5, obj.getRua());
    stmt.setString(6, obj.getNumero());
    stmt.setString(7, obj.getBairro());
    stmt.setString(8, obj.getCep());
    stmt.setString(9, obj.getEmail());
    stmt.setString(10, obj.getSenha());
    stmt.setString(11, obj.getCd_nivelAcesso());
    
    //3º executar sql
    stmt.execute();
    //4º Fecha conexao
    stmt.close();    
    JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
} catch (Exception erro) {
    JOptionPane.showMessageDialog(null, "Erro ao slvar o Usuário " + erro);
}

}

public void Editar (Usuario obj) {
try {
    //1º criar o sql
    String sql = "update usuario set nome=?, cpf=?, celular=?, telefone=?, rua=?, numero=?, bairro=?, cep=?, email=?, senha=?, nivel_acesso=? where id_usuario=?";
    
    //2ª preparar a conexcao SQL oara se cinectar com o banco
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setString(1, obj.getNome());
    stmt.setString(2, obj.getCpf());
    stmt.setString(3, obj.getCelular());
    stmt.setString(4, obj.getTelefone());
    stmt.setString(5, obj.getRua());
    stmt.setString(6, obj.getNumero());
    stmt.setString(7, obj.getBairro());
    stmt.setString(8, obj.getCep());
    stmt.setString(9, obj.getEmail());
    stmt.setString(10, obj.getSenha());
    stmt.setString(11, obj.getCd_nivelAcesso());
    stmt.setInt(12, obj.getId_usuario());
    
    //3º executar sql
    stmt.execute();
    //4º Fecha conexao
    stmt.close();    
    JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
} catch (Exception erro) {
    JOptionPane.showMessageDialog(null, "Erro ao editar o Usuário " + erro);
}

}

public void Excluir(Usuario obj) {
        try {
            String sql = "delete from usuario where id_usuario=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getId_usuario());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso.");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o funcionário." + e);
        }
}


    public Usuario BuscarFuncionarios(String nome){
        try {
            String sql = "select * from usuario where nome = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Usuario obj = new Usuario();
            if (rs.next()) {
                obj.setId_usuario(rs.getInt("id_usuario"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCelular(rs.getString("celular"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setRua(rs.getString("rua"));
                obj.setNumero(rs.getString("numero"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCep(rs.getString("cep"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
            }
            return obj;
                
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro as buscar cliente" + erro);
    }
    return null;
}

    public Usuario BuscarFuncionariosCPF(String cpf){
        try {
            String sql = "select * from usuario where cpf = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            Usuario obj = new Usuario();
            if (rs.next()) {
                obj.setId_usuario(rs.getInt("id_usuario"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCelular(rs.getString("celular"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setRua(rs.getString("rua"));
                obj.setNumero(rs.getString("numero"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCep(rs.getString("cep"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
            }
            return obj;
                
        } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro as buscar cliente" + erro);
    }
    return null;
}    

    public List<Usuario> listar(){
        List<Usuario> lista = new ArrayList<>();
        try {
            String sql = "select * from usuario";
            PreparedStatement stmt =  conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
              Usuario obj = new Usuario();
                obj.setId_usuario(rs.getInt("id_usuario"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCelular(rs.getString("celular"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setRua(rs.getString("rua"));
                obj.setNumero(rs.getString("numero"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCep(rs.getString("cep"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                lista.add(obj);            
                
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro  ao criar a lista: " + e);
        }
        return null;
    } 
    
    public List<Usuario> Filtrar(String nome){
        List<Usuario> lista = new ArrayList<>();
        try {
            String sql = "select * from usuario where nome like ?";
            PreparedStatement stmt =  conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
               Usuario obj = new Usuario();
                obj.setId_usuario(rs.getInt("id_usuario"));
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setCelular(rs.getString("celular"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setRua(rs.getString("rua"));
                obj.setNumero(rs.getString("numero"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCep(rs.getString("cep"));
                obj.setEmail(rs.getString("email"));
                obj.setSenha(rs.getString("senha"));
                lista.add(obj);
                
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro  ao criar a lista: " + e);
        }
        return null;
    }
    
    //Modelo de Login a ser seguido.
    /*
     public void efetuarLogin(String email, String senha){
        try {
            String sql = "select * from tb_funcionarios where email=? and senha=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                
               if(rs.getString("nivel_Acesso").equals("Administrador")){
                AreaTrabalho at = new AreaTrabalho();
                at.usuarioLogado = rs.getString("nome");
                at.txtNivelAcesso.setText("Administrador");
                JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!\n" + at.usuarioLogado);
                at.setVisible(true);                
                FormularioLogin lg = new FormularioLogin();
                lg.dispose();
                
               }else if(rs.getString("nivel_Acesso").equals("Usuário")){
                   
                AreaTrabalho at = new AreaTrabalho();
                at.usuarioLogado = rs.getString("nome");
                at.txtNivelAcesso.setText("Usuário");
                at.menu_funcionario.setEnabled(false);
                at.menu_fornecedores.setEnabled(false);
                at.menu_estoque.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!\n" + at.usuarioLogado);
                at.setVisible(true);         
               
                FormularioLogin lg = new FormularioLogin();
                lg.dispose();
                
               }

            }else{
                //FormularioLogin login = new FormularioLogin();
                JOptionPane.showMessageDialog(null, "Dados inválidos!");                
                new FormularioLogin().setVisible(false);
                new FormularioLogin().setVisible(true);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
}
*/
    
    
}
