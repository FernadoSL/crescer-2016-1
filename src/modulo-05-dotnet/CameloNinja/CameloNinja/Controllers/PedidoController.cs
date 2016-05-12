using CameloNinja.Models;
using LojaNinja.Dominio;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace CameloNinja.Controllers
{
    public class PedidoController : Controller
    {
        
        public ActionResult Cadastro()
        {
            return View();
        }

        public ActionResult DetalhesPedido(Pedido model)
        {
            return View(model);
        }
    }
}