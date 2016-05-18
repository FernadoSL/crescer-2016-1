using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Data.Entity.ModelConfiguration.Conventions;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Usuario_Dominio;

namespace RopositorioUsuarioEF
{
    public class ContextoDeDados : DbContext
    {
        public ContextoDeDados() : base("CameloNinjaHome")
        {

        }


        public DbSet<Usuario> Usuario { get; set; }
        public DbSet<Permissao> Permissao { get; set; }

        protected override void OnModelCreating(DbModelBuilder modeBuilder)
        {
            modeBuilder.Conventions.Remove<PluralizingTableNameConvention>();
        }
    }

}
