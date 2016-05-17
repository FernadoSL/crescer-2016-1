using LojaNinja.Dominio;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace CameloNinja.Models
{
    public class DadosItem
    {
        public int Id { get; set; }

        [Required(ErrorMessage = "Informe uma data válida")]
        [DisplayName("Data de Entrega")]
        public DateTime DataEntrega { get; set; }

        [Required(ErrorMessage = "Informe o nome do produto")]
        [DisplayName("NomeUsuario do Produto")]
        public string NomeProtuto { get; set; }

        [Required(ErrorMessage = "Informe o valor do produto")]
        [DisplayName("valor do produto")]
        public int valorProduto { get; set; }

        [DisplayName("Tipo de pagamento")]
        public TipoPagamento TipoPagamento { get; set; }

        [Required(ErrorMessage = "Informe o nome do cliente")]
        [DisplayName("NomeUsuario do cliente")]
        public string NomeCliente { get; set; }

        [Required(ErrorMessage = "Informe o nome da Cidade")]
        [DisplayName("NomeUsuario da Cidade")]
        public string Cidade { get; set; }

        [Required(ErrorMessage = "Informe o nome do Estado")]
        [DisplayName("NomeUsuario do Estado")]
        public string Estado { get; set; }
    }
}