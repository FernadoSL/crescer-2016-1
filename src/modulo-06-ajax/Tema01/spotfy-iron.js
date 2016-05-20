'use strict'

(function(){
  $.ajax({ url : 'https://api.spotify.com/v1/artists/6mdiAmATAx73kdxrNrnlao/albums?limit=50', type: 'GET'}).done(function(retorno){
    for (var i = 0; i < retorno.items.length; i++) {
      var url = retorno.items[i].images[0].url;
      $('<img>').attr('src', url).appendTo($('#container-imgs'));
    }
  })
})();
