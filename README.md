# Proyecto Git

## Roles
- **Alumno 1**: José Agustín Cabrera Castillo
- **Alumno 2**: Alberto Muñoz Piña

## Comandos utilizados

1. **Crear un nuevo repositorio en GitHub**:  
   Accede a tu cuenta de GitHub y haz clic en el botón "+" en la parte superior derecha. Selecciona la opción **New repository**. Configura las características del repositorio, elige un nombre, añade una descripción y haz clic en **Create repository**.

2. **Inicializar el repositorio en local**:  
   En tu ordenador, crea una carpeta llamada `Git_IA` (preferiblemente en el directorio `GIT` creado en prácticas anteriores). Descarga la carpeta `Farmacia` desde el campus virtual, descomprímela y coloca los archivos en `Git_IA`.

3. **Inicializar Git en el repositorio local**:  
   Navega a la carpeta `Git_IA` y ejecuta el siguiente comando para iniciar un repositorio local de Git:
   ```bash
   git init
Comprobar el estado del repositorio:
Verifica el estado de los archivos en la carpeta con el siguiente comando:

bash
Copiar código
git status
Agregar archivos al área de preparación:
Añade los archivos de Farmacia al área de staging para prepararlos para el commit:

bash
Copiar código
git add .
Registrar los cambios en el repositorio local:
Realiza un commit de los archivos con el mensaje “Inicialización del repositorio con archivos Farmacia”:

bash
Copiar código
git commit -m "Inicialización del repositorio con archivos Farmacia"
Asociar el repositorio local con el repositorio remoto en GitHub:
Copia la dirección HTTPS del repositorio creado en GitHub y asocia el repositorio local al remoto con el siguiente comando:

bash
Copiar código
git remote add origin [direccionHTTPS]
Verificar el repositorio remoto:
Asegúrate de que el repositorio remoto se ha asociado correctamente usando:

bash
Copiar código
git remote
Si muestra “origin” como salida, la asociación ha sido exitosa.

Enviar archivos al repositorio remoto:
Envía los archivos al repositorio en GitHub:

bash
Copiar código
git push origin master
Solucionar problemas de envío (si es necesario):
Si tienes problemas al realizar el push, investiga la causa y soluciona el problema antes de volver a intentarlo.

Verificar la actualización en GitHub:
Comprueba en GitHub que el repositorio se haya actualizado correctamente con los archivos enviados.

Agregar al compañero al repositorio:
Una vez completados los pasos anteriores, añade a tu compañero al repositorio para comenzar a trabajar en equipo.

Pasos adicionales para asociar el repositorio remoto
Inicializar el repositorio remoto creado en GitHub con el repositorio local:
Para ello, asocia ambos repositorios copiando la dirección “HTTPS” obtenida al crear el repositorio en GitHub y usa el siguiente comando:

bash
Copiar código
git remote add origin [direccionHTTPS]
Revisar si el repositorio remoto se ha agregado correctamente:
Ejecuta el siguiente comando:

bash
Copiar código
git remote
Si aparece “origin” como salida, significa que se ha asociado el remote a tu proyecto de forma satisfactoria.

Enviar archivos al repositorio remoto en GitHub:
Una vez asociada la dirección remota, puedes enviar tus archivos al repositorio de GitHub con:

bash
Copiar código
git push origin master
Confirmación de la actualización del repositorio:
Comprueba en GitHub que el repositorio se haya actualizado con los archivos enviados.

Agregar colaborador:
Finalmente, agrega a tu compañero al repositorio en GitHub para facilitar el trabajo colaborativo. 
