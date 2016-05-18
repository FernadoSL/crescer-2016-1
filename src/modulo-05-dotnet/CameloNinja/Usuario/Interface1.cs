using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Usuario_Dominio
{
    public interface IUsuarioRepositorio
    {
        Usuario BuscarUsuarioPorAutenticacao(string email, string senha);
    }
}
