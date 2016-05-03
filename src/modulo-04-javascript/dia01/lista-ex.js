'use strict'
//exercicio 1
var daisyGame = function(numero){
  return 'love me' + (numero%2 === 0 ? ' not': '');
}

//exercicio 2
var maiorTexto = function(arrayDePalavras){
  var maiorPalavra = '';

  for(var i in arrayDePalavras){
    if(arrayDePalavras[i].length > maiorPalavra.length){maiorPalavra = arrayDePalavras[i]};
  }

  return maiorPalavra;
}

//exercicio 3
var instrutor = function(instrutor) {
  console.log('Olá querido instrutor', instrutor);
}
var imprime = function(arrayDeInstrutores, fn) {
  if(typeof(fn) === 'function'){
    for(var i in arrayDeInstrutores){
      fn(arrayDeInstrutores[i]);
    }
  }
}

//exercicio 4
var somar = function(num1){
  return function(num2){
    return num1 + num2;
  };
}

//exercicio 5
var fiboSeq = function(num){
  if(num < 2){
    return num;
  }else{
    return fiboSeq(num-1) + fiboSeq(num-2);
  }
}

var fiboSum = function(num){
  var result = 0;
  for(var i=num; i>0; i--){
    result += fiboSeq(i);
  }
  return result;
}

//exercicio 6
var queroCafe = function(mascada, precos) {
  var result = [];
  for(var i in precos){
    if(precos[i]<=mascada){
      result.push(precos[i]);
    }
  }
  result.sort();
  return result.toString();
}

//exercicio 7
var getTipo = function(num){
  return num === null ? 'null' : typeof num !== 'undefined' && v.constructor === Array ? 'array' : typeof num;
}


var contarPorTipo = function(obj, tipoCampo){
  var cont = 0;
  for(var i in obj){
    if(getTipo(obj[i]) === tipoCampo){
      cont++;
    }
  }
  return cont;
}

//exercicio 8
/*
existe uma variavel global que contém o valor 'gohan', porém a variavel gohan é declarada novamente dentro da função
e não contem valor por isso se concatena 'Son' + undefined, como se a variavel local fosse prioritaria para a função.
*/
var gohan = 'gohan', goku = 'Goku';
function revelarSaiyaman() {
  console.log(gohan);
  goku = 'Son Goku';
  var gohan = 'Son ' + gohan;
  return gohan;
}
console.log(revelarSaiyaman());
console.log(goku);
