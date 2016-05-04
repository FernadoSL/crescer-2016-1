'use strict';

describe('Ex 1. Doadores de sangue', function() {
  it('obterDoadores retorna array vazio', function() {
    expect(obterDoadores()).not.toEqual([]);
  });
});

describe('Ex 2.  CaniveteSuiço' , function() {
  it('obterCavaleiroComMaisGolpes retorna Shaka', function(){
    expect(obterCavaleiroComMaisGolpes()).toEqual([goldSaints[5]]);
  })
})

describe('Ex 3.  Mes com mais aniversários' , function() {
  it('os Meses com mais aniversários são os meses 3, 5, 11', function(){
    expect(obterMesesMaisAniver()).toEqual([3, 5, 11]);
  })
})

describe('Ex 4.  Media de altura' , function() {
  it('A média da altura dos cavaleiros é 1.86', function(){
    expect(alturaMedia()).toEqual(1.86);
  })
})

describe('Ex 5.  Mediana da altura' , function() {
  it('A mediana da altura dos cavaleiros é 1.85', function(){
    expect(alturaMediana()).toEqual(1.85);
  })
})

describe('Ex 6.a.  Media de peso de todos os cavaleiros' , function() {
  it('A média de peso dos cavaleiros é 84.27Kg', function(){
    expect(obterPesoMedio(false)).toEqual(84.27);
  })
})


describe('Ex 6.b.  Media de peso dos cavaleiros doadores' , function() {
  it('A média de peso dos cavaleiros doadores é 80.67Kg', function(){
    expect(obterPesoMedio(true)).toEqual(80.67);
  })
})

describe('Ex 7.  IMC' , function() {
  it('A array de IMC dos cavaleiros [22.64, 29.48, 24.62, 24.22, 24.84, 20.53, 24.54, 24.31, 23.99, 22.45, 21.5]', function(){
    expect(obterIMC()).toEqual([22.64, 29.48, 24.62, 24.22, 24.84, 20.53, 24.54, 24.31, 23.99, 22.45, 21.5]);
  })
})

describe('Ex 8  Cavaleiros com sobrepeso' , function() {
  it('O cavaleiro de sobre peso é o Aldebaran', function(){
    expect(sobrePeso()).toEqual([goldSaints[1]]);
  })
})
