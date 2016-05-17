using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace CameloNinja.Models
{
    public class DadosUsuario
    {
        [Required(ErrorMessage = "Informe um nome válido")]
        [DisplayName("Nome de Usuário")]
        public string NomeUsuario { get; set; }

        [Required(ErrorMessage = "Informe um e-mail válido")]
        [DisplayName("Email")]
        public string Email { get; set; }

        [Required(ErrorMessage = "Senha inválida")]
        [MinLength(8, ErrorMessage = "Senha muito curta")]
        [DisplayName("Senha")]
        public string Senha { get; set; }

        [Required(ErrorMessage = "Senha incorreta")]
        [DisplayName("Confirmar Senha")]
        public string ConfirmacaoSenha{ get; set; }


    }
}