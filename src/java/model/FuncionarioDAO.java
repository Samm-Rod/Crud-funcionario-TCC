/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Root
 */
public class FuncionarioDAO extends DatabaseDAO{
    
    public FuncionarioDAO() throws Exception{
        
    }
    
    
    public ArrayList<Funcionario> getLista() throws Exception{
        ArrayList<Funcionario> lista = new ArrayList<>();
        
        String sql = "SELECT * FROM funcionario";
        this.conectar();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()){
            Funcionario f = new Funcionario();
            f.setId(rs.getInt("id"));
            f.setNome(rs.getString("nome"));
            f.setDataNasc(rs.getDate("dataNasc"));
            f.setCpf(rs.getString("cpf"));
            f.setTel(rs.getString("tel"));
            f.setMatricula(rs.getString("matricula"));
            lista.add(f);
        }
        this.desconectar();
        return lista;
    }
    
    
    public boolean gravar(Funcionario f){
        try{
            String sql;
            this.conectar();
            
            if(f.getId() == 0){
                sql = "INSERT INTO funcionario(nome, dataNasc, cpf, tel, matricula) VALUES (?,?,?,?,?)";
            }else{
                sql = "UPDATE funcionario SET nome=?, dataNasc=?, cpf=?, tel=?, matricula=? WHERE id=?";
            }
            
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, f.getNome());
            st.setDate(2, (Date) f.getDataNasc());
            st.setString(3, f.getCpf());
            st.setString(4, f.getTel());
            st.setString(5, f.getMatricula());
            if(f.getId()>0){
                st.setInt(6, f.getId());
            }
            st.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        
    }

   
    public Funcionario getCarregaPorId(int id) throws Exception{
        Funcionario f = new Funcionario();
        String sql = "SELECT * FROM funcionario WHERE id=?";
        this.conectar();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1,id);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            f.setId(rs.getInt("id"));
            f.setNome(rs.getString("nome"));
            f.setDataNasc(rs.getDate("dataNasc"));
            f.setCpf(rs.getString("cpf"));
            f.setTel(rs.getString("tel"));
            f.setMatricula(rs.getString("matricula"));
        }
        this.desconectar();
        return f;
    }

    public boolean deletar(Funcionario f){
        
        try{
            this.conectar();
            String sql = "DELETE FROM funcionario WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, f.getId());
            ps.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        
    }
    
    
    
     
}
