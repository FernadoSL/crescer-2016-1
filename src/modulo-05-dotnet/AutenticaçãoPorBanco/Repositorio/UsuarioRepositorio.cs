using Dominio;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Repositorio
{
    // Nós ainda não temos um banco de dados para guardar nossos dados,
    // Mas sabemos que por enquanto, podemos fingir termos um, com dados fixos. O que acham?
    public class UsuarioRepositorio : IUsuarioRepositorio
    {
        private List<Usuario> _usuarios;

        public UsuarioRepositorio()
        {
   
        }

        public Usuario BuscarUsuarioPorAutenticacao(string email, string senha)
        {
            string connectionString = ConfigurationManager.ConnectionStrings["BancoDotNet"].ConnectionString;
            

            using (var conexao = new SqlConnection(connectionString))
            {
                string sql = "SELECT * FROM Usuarios WHERE email=@p_email and senha=@p_senha";

                var comando = new SqlCommand(sql, conexao);
                comando.Parameters.Add(new SqlParameter("p_email", email));
                comando.Parameters.Add(new SqlParameter("p_senha", senha));

                conexao.Open();

                SqlDataReader leitor = comando.ExecuteReader();

                if (leitor.Read())
                {
                    var usuarioEncontrado = new Usuario();
                    usuarioEncontrado.Email = leitor["email"].ToString();
                    usuarioEncontrado.Email = leitor["senha"].ToString();

                    return usuarioEncontrado;
                }

                return null;
                
            }
        }

    }
}
