# language: es
Característica: Obtener todos los Pois dependiendo del servicio consultado.

  Escenario: Verificar que los Pois sean los correctos cuando consulto un servicio.
    Dado que estoy utilizando el servicio BSASTURISTICA
    Cuando pido todos los POIs asociados a ese servicio
    Entonces el servicio retorna
      | Las Cuartetas          | -34.603714 | -58.378579 |
      | El Cuartito            | -34.597669 | -58.385478 |
      | Palacio de la Pizza 	 | -34.603069 | -58.377335 |
      | Cancha Velez        	 | -34.635203 | -58.520708 |
      | Bombonera              | -34.635836 | -58.365467 |
      | Ferro       				   | -34.618315 | -58.447630 |
      | Obelisco               | -34.602750 | -58.381485 |


      