'use strict';

$(function() {

  // Adicionando campos para imagens
  var $novasImagens = $('#novasImagens');

  $('#btnAdicionarImg').click(function() {
    var $novoLi = gerarElementoLiComInputs();
    $novasImagens.append($novoLi);
  });

  $('#btnAdicionarGolpe').click(function() {
    $('#novosGolpes').append(gerarElementoLiComInputTexto());
  });

});

function gerarElementoLiComInputs() {
  var $novoTxt = $('<input>').attr('name', 'urlImagem').attr('type', 'text').attr('placeholder', 'Ex: bit.ly/shiryu.png');
  var $novoCheckbox =
    // Dentro de um label para pode vincular o texto ao checkbox
    $('<label>').append(
      $('<input>')
      .attr('type', 'checkbox')
      .attr('name', 'isThumb')
      .attr('checked', 'checked')
    ).append('É thumbnail?');
  return $('<li>').append($novoTxt).append($novoCheckbox);
};

function gerarElementoLiComInputTexto() {
  var $novoTxt = $('<input>').attr('name', 'golpe').attr('type', 'text').attr('placeholder', 'Ex: Pó de diamante');
  return $('<li>').append($novoTxt);
};

function obterThumb(cavaleiro) {
  // Pegando a primeira imagem que é thumbnail
  return cavaleiro.imagens.filter(function(i) {
    return i.isThumb;
  })[0];
};

function cadastrarForm() {
    var formData = new FormData($('#frmNovoCavaleiro')[0])
    return {
        Nome: formData.get('nome'),
        AlturaCm: formData.get('alturaMetros'),
        Signo: formData.get('signo'),
        TipoSanguineo: formData.get('tipoSanguineo'),
        //TODO: implementar outros campos
        DataNascimento: new Date(),
        Golpes: ['Cólera do Dragão', 'Cólera dos 100 dragões'],
        LocalNascimento: {
            Texto: 'Beijing'
        },
        LocalTreinamento: {
            Texto: '5 picos de rosan'
        },
        Imagens: [{
            Url: 'http://images.uncyc.org/pt/3/37/Shiryumestrepokemon.jpg',
            IsThumb: true
        }, {
            Url: 'http://images.uncyc.org/pt/thumb/5/52/Shyryugyarados.jpg/160px-Shyryugyarados.jpg',
            IsThumb: false
        }]
    }
}

$('#frmNovoCavaleiro').submit(function (e) {

    $.ajax({
            url: urlCavaleiroPost,
            type: 'POST',
            data: cadastrarForm()       
        });
        return e.preventDefault();
    });


