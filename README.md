# Proyecto Git

## Roles
- **Alumno 1**: José Agustín Cabrera Castillo
- **Alumno 2**: Alberto Muñoz Piña

## Ejercicios

### Ejercicio 3: Creación e inicialización de un repositorio (Alumno 1) 
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
### Ejercicio 4: Clonar repositorio (Alumno 2) 
Para clonar el repositorio he usado el comando:
   ```bash
   git clone https://github.com/JoseAgus7/Practica_IA.git
   ```
### Ejercicio 5. Actualización README (Alumno 1)
He realizado la actualizacion del README con los comando utlilizados.
### Ejercicio 6. Información importante (ambos) 
Es una breve nota informativa.
### Ejercicio 7. Creación de ramas (ambos)
Para crear ramas y cambiarnos a la nueva rama hemos usado el comando:
   ```bash
   git checkout -b <nombre_rama>
   ```
Para cambiar el nombre de la rama he usado:
   ```bash
   git branch -m <nombre_nuevo_rama>
   ```
### Ejercicio 8. Listar ramas (ambos) 

Para listar las ramas en tu proyecto y ver el número de ellas, puedes usar el siguiente comando:

```bash
git branch
```

Esto mostrará todas las ramas locales en tu repositorio. Cada rama aparecerá en una nueva línea.

El asterisco `*` al lado de una de las ramas indica la **rama en la que te encuentras actualmente**. Es decir, la rama activa, en la cual se aplicarán los cambios y commits que realices en ese momento.

### Ejercicio 9. Modifica el Alumno 1 y Alumno 2 en sus ramas, archivos distintos (ambos)
He realizado el cambio creando el archivo almacen_cli.java
