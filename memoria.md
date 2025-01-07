# MEMORIA

## OBJETIVO DEL PROYECTO
El objetivo de este proyecto es aprender a generar páginas estáticas a partir de un archivo JSON utilizando Thymeleaf.
## DESCRIPCIÓN DEL PROYECTO
El proyecto consiste en crear una aplicación que lea datos de un archivo JSON que contiene información sobre productos tecnológicos de diferentes marcas. 


### Estructura del Proyecto
El proyecto está estructurado en varias partes:
- **Modelo de Datos**: Clases Java que representan la estructura de los datos en el archivo JSON.
- **Configuración de Thymeleaf**: Configuración del motor de plantillas Thymeleaf para procesar las plantillas HTML.
- **Plantilla HTML**: Plantilla Thymeleaf que define la estructura de la página web.
## ERRORES QUE HAN SURGIDO 
- Empezando diversas excepciones por no poner bien el template para que cogiera bien los datos del json
- Las url no se cogen aunque esten bien implementadas, este fallo no se ha podido arreglar y cuando clicas solo te redirige a la pagina principal
- No se ha podido ponerlo en caché
- El validador ha dado muchos problemas con excepciones 
### Modelo de Datos
Se definieron varias clases Java para representar la estructura de los datos en el archivo JSON:
- `DataModel`: Clase principal que contiene una lista de `BusinessModel`.
- `BusinessModel`: Representa una marca y contiene una lista de `Sells`.
- `Sells`: Representa una categoría de productos (teclados, ratones, monitores, auriculares) y contiene listas de productos específicos.
- `KeyboardModel`, `MouseModel`, `MonitorModel`, `HeadsetModel`: Clases que representan productos específicos y contienen atributos como `name`, `price` y `url`.

### Configuración de Thymeleaf
Se configuró Thymeleaf para procesar plantillas HTML:
- Se utilizó `ClassLoaderTemplateResolver` para resolver las plantillas desde el classpath.
- Se configuró `TemplateEngine` para utilizar el resolver de plantillas.

### Plantilla HTML
El HTML template define la estructura de la página web para poder generar el index:
- Se utilizaron bucles `th:each` para iterar sobre las listas de marcas y productos.
- Se utilizaron expresiones `th:text` y `th:href` para insertar los nombres y URLs de los productos.

## RESULTADOS
El resultado del proyecto es una página web estática que muestra los productos tecnológicos organizados por marca y categoría. Cada producto incluye un enlace a una página de compra. La página web se genera automáticamente a partir del archivo JSON utilizando Thymeleaf.

## CONCLUSIONES
Este proyecto pudo haber estado mejor si se pudiera implementar una api creada por nosotros haciendo el generador es decir un endpoint que te pasara todo el json y a partir de ese json que te ha dado la api generar la pagina estatica, aunque no se si se puede hacer. Bueno esto es todo amigos :D .

