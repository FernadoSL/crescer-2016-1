﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Usuario_Dominio
{
    public class Permissao
    {
        public int Id { get; set; }
        public string Nome { get; set; }

        public IList<Usuario> Usuarios { get; set; }
    }
}
