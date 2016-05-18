using CameloNinja.Models;
using RopositorioUsuarioEF;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Usuario_Dominio;

namespace CameloNinja.Controllers
{
    public class UsuarioController : Controller
    {

        private UsuarioServico _servicoPermissao;
        

        public UsuarioController()
        {
            _servicoPermissao = new UsuarioServico(new ContextoDeDados());
        }


        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Login(DadosUsuario dadosUsuario)
        {
            if(dadosUsuario.Email == _servicoPermissao.BuscarUsuarioPorAutenticacao(dadosUsuario.Email, dadosUsuario.Senha).Email)
            {
                return View("CadastroPedido");
            }
            return View("Login");
        }
    }
}