# language: es
Característica: Obtener el punto más cercano a mi ubicación
  Para tener que caminar poco
  Como usuario
  Quiero obtener el punto de interes de una determinada capa más cercano a mi ubicación acutal

  Escenario: Obtener el punto más cercano a mi ubicación cuando estoy en Caminito
    Dado que estoy en -34.638927 y -58.362684
    Cuando pido el POI mas cercano del servicio BSASTURISTICA
    Entonces el servicio devuelve solo Bombonera

  Escenario: Obtener el punto más cercano a mi ubicación cuando estoy en el Congreso
    Dado que estoy en -34.609600 y -58.392595
    Cuando pido el POI mas cercano del servicio BSASHISTORICO
    Entonces el servicio devuelve solo cafe de los angelitos

  Escenario: Obtener un resultado vacío cuando consulto el poi más cercano de un servicio inexistente
    Dado que estoy en -34.609600 y -58.392595
    Cuando pido el POI mas cercano del servicio TINTORERIAS
    Entonces el servicio devuelve el resultado vacío

  Escenario: Obtener error al cargar datos inválidos
    Dado que estoy en "6f5d78f65d576f" y "5sd47s45ds6d"
    Cuando pido el POI mas cercano del servicio BSASHISTORICO
    Entonces el servicio devuelve el error: Error en el ingreso de Datos de posición 
    
