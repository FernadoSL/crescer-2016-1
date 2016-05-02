'use strict'
//exercicio 1
var daisyGame = function(numero){
  if(numero%2 === 0){ return 'love me not'}
  else{return 'love me'};
}

//exercicio 2
var maiorTexto = function(array){
  var maiorPalavra = '';

  for(var i in array){
    if(array[i].length > maiorPalavra.length){maiorPalavra = array[i]};
  }

  return maiorPalavra;
}
