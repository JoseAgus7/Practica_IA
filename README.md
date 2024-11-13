# Proyecto Git

## Roles
- **Alumno 1**: José Agustín Cabrera Castillo
- **Alumno 2**: Alberto Muñoz Piña

## Comandos utilizados


10. **Solucionar problemas de envío (si es necesario)**:  
    Si tienes problemas al realizar el push, investiga la causa y soluciona el problema antes de volver a intentarlo.

11. **Verificar la actualización en GitHub**:  
    Comprueba en GitHub que el repositorio se haya actualizado correctamente con los archivos enviados.

12. **Agregar al compañero al repositorio**:  
    Una vez completados los pasos anteriores, añade a tu compañero al repositorio para comenzar a trabajar en equipo.

### Pasos adicionales para asociar el repositorio remoto

1. **Inicializar el repositorio remoto creado en GitHub con el repositorio local**:  
   Para ello, asocia ambos repositorios copiando la dirección “HTTPS” obtenida al crear el repositorio en GitHub y usa el siguiente comando:
   ```bash
   git remote add origin [direccionHTTPS]
   ```

2. **Revisar si el repositorio remoto se ha agregado correctamente**:  
   Ejecuta el siguiente comando:
   ```bash
   git remote
   ```
   Si aparece “origin” como salida, significa que se ha asociado el remote a tu proyecto de forma satisfactoria.

3. **Enviar archivos al repositorio remoto en GitHub**:  
   Una vez asociada la dirección remota, puedes enviar tus archivos al repositorio de GitHub con:
   ```bash
   git push origin master
   ```

4. **Confirmación de la actualización del repositorio**:  
   Comprueba en GitHub que el repositorio se haya actualizado con los archivos enviados.

5. **Agregar colaborador**:  
   Finalmente, agrego a mi compañero.


### Ejercicios

#### Ejercicio 3: Creación e inicialización de un repositorio (Alumno 1) 
1. **Crear un nuevo repositorio en GitHub**:  
   Accede a tu cuenta de GitHub y haz clic en el botón "+" en la parte superior derecha. Selecciona la opción **New repository**. Configura las características del repositorio, elige un nombre, añade una descripción y haz clic en **Create repository**.

2. **Inicializar el repositorio en local**:  
   En tu ordenador, crea una carpeta llamada `Git_IA` (preferiblemente en el directorio `GIT` creado en prácticas anteriores). Descarga la carpeta `Farmacia` desde el campus virtual, descomprímela y coloca los archivos en `Git_IA`.

3. **Inicializar Git en el repositorio local**:  
   Navega a la carpeta `Git_IA` y ejecuta el siguiente comando para iniciar un repositorio local de Git:
   ```bash
   git init
   ```

4. **Comprobar el estado del repositorio**:  
   Verifica el estado de los archivos en la carpeta con el siguiente comando:
   ```bash
   git status
   ```

5. **Agregar archivos al área de preparación**:  
   Añade los archivos de `Farmacia` al área de staging para prepararlos para el commit:
   ```bash
   git add .
   ```

6. **Registrar los cambios en el repositorio local**:  
   Realiza un commit de los archivos con el mensaje “Inicialización del repositorio con archivos Farmacia”:
   ```bash
   git commit -m "Inicialización del repositorio con archivos Farmacia"
   ```

7. **Asociar el repositorio local con el repositorio remoto en GitHub**:  
   Copia la dirección HTTPS del repositorio creado en GitHub y asocia el repositorio local al remoto con el siguiente comando:
   ```bash
   git remote add origin [direccionHTTPS]
   ```

8. **Verificar el repositorio remoto**:  
   Asegúrate de que el repositorio remoto se ha asociado correctamente usando:
   ```bash
   git remote
   ```
   Si muestra “origin” como salida, la asociación ha sido exitosa.

9. **Enviar archivos al repositorio remoto**:  
   Envía los archivos al repositorio en GitHub:
   ```bash
   git push origin master
   ```
#### Ejercicio 4: Clonar repositorio (Alumno 2) 
Para clonar el repositorio he usado el comando:
   ```bash
   git clone https://github.com/JoseAgus7/Practica_IA.git
   ```
#### Ejercicio 5. Actualización README (Alumno 1)
He realizado la actualizacion del README con los comando utlilizados.
#### Ejercicio 6. Información importante (ambos) 
Es una breve nota informativa.
#### Ejercicio 7. Creación de ramas (ambos)
Para crear ramas y cambiarnos a la nueva rama hemos usado el comando:
   ```bash
   git checkout -b <nombre_rama>
   ```
Para cambiar el nombre de la rama he usado:
   ```bash
   git branch -m <nombre_nuevo_rama>
   ```
#### Ejercicio 8. Listar ramas (ambos) 
