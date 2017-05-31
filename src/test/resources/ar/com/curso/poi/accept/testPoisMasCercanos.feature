# language: es
Característica: Obtener el punto más cercano a mi ubicación
  Para tener que caminar poco
  Como usuario
  Quiero obtener el punto de interes de una determinada capa más cercano a mi ubicación acutal

  Escenario: Obtener el punto más cercano a mi ubicación
    Dado que estoy en -34.638927 y -58.362684
    Cuando pido el POI mas cercano del servicio BSASTURISTICA
    Entonces el servicio devuelve solo Bombonera

  Escenario: Obtener el punto más cercano a mi ubicación
    Dado que estoy en -34.609600 y -58.392595
    Cuando pido el POI mas cercano del servicio BSASHISTORICO
    Entonces el servicio devuelve solo cafe de los angelitos
