'use strict';


(function(){
  $('#formBusca').submit(function(e){
    var input = new FormData($('#formBusca')[0]).get('busca');
    $.ajax({url: 'https://api.spotify.com/v1/search?q=' + input + '&type=artist', type: 'GET'}).done(function(retorno){
      var urlBanda= retorno.artists.items[0].href;
      $.ajax({url: urlBanda + '/albums?limit=50', type: 'GET'}).done(function(retorno){
        for (var i = 0; i < retorno.items.length; i++) {
          var url = retorno.items[i].images[0].url;
          $('<img>').attr('src', url).appendTo($('#container-imgs'));
        }
      })
    })
    return e.preventDefault();
  })
})();
