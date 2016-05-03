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
