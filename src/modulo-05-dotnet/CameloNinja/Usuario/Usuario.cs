using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Usuario_Dominio
{
    public class Usuario
    {
        public int Id { get; set; }
        public string NomeUsuario { get; set; }
        public string Email { get; set; }
        public string Senha { get; set; }

        public IList<Permissao> Permissao { get; set; }

        public Usuario(string nome, string email, string senha, IList<Permissao> permissao)
        {
            NomeUsuario = nome;
            Email = email;
            Senha = senha;
            Permissao = permissao;
        }

    }
}
