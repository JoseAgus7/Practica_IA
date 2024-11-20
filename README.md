# Proyecto Git

## Direccion del repositorio
[GitHub](https://github.com/JoseAgus7/Practica_IA.git)

## Roles
- **Alumno 1**: José Agustín Cabrera Castillo
- **Alumno 2**: Alberto Muñoz Piña
- **Alumno 3**: Jesús García Sánchez
- **Alumno 4**: Jose Antonio Montes Solano y Manuel Pedrajas Ochoa

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

### Ejercicio 9. Modifica el Alumno 1 y Alumno 2 en sus ramas, archivos distintos 
He realizado el cambio creando el archivo almacen_cli.java

### Ejercicio 10. Ver las diferencias (ambos)

Si deseas ver las diferencias entre tu rama actual y la rama `master`, puedes usar el siguiente comando:

```bash
git diff master
```

Este comando mostrará los cambios en tu rama actual en comparación con `master`. Es útil para revisar las modificaciones antes de hacer un merge o subir el código al repositorio común.

Si estás en otra rama y quieres ver las diferencias específicas entre esa rama y `master` sin cambiar de rama, puedes usar:

```bash
git diff nombre-de-tu-rama master
```

Este comando permite ver rápidamente los cambios entre ambas ramas.

### Ejercicio 11.  Merge sin conflictos
No hemos podido hacer de forma idéntica los comandos porque tanto Alumno1 como Alumno2 han estado respondiendo pregunta a pregunta en este README.md, se han aceptado los cambios de Alumno1 y se ha pdido seguir sin problema.

### Ejercicio 12. Credenciales
No nos ha pedido credenciales pero para sacar el log de cada usuario y almacenarlo en LogAlumnoX.txt (siendo X, 1 o 2) hemos usado:
```bash
git log > LogAlumnoX.txt
```

### Ejercicio 13. Entrega Parcial
Para guardar los cambios hemos usado:
```bash
git add .
git commit -m "Entrega parcial"
```

### Ejercicio 15. Crear ramas remotas y rama de investigación
Para guardar los cambios hemos usado:
```bash
git checkout -b ramaAlumnoX
git add .
git commit -m "Nueva rama Alumno X"
git checkout master
git pull
git branch -r
```
### Ejercicio 16. Modifican los alumnos en sus ramas, cada uno en su rama
Cada alumno ha trabajado en su rama.
Para poder añadir los cambios respectivosn en src/jungle ha realizado:
```bash
git add .
git commit -m "Comentario"
```
### Ejercicio 17. ¿Qué ha cambiado?
Utilizamos el siguiente comando:
```bash
git log --pretty=format:"commit %H%nAuthor: %an%nCommitter: %cn%nMessage: %s" --name-only
```
Y nos muestra la sieguiente informacion:
▪ sha1 
▪ autor 
▪ quién hizo el commit 
▪ mensaje del commit

### Ejercicio 18.Merge sin conflictos
Hemos usado  el comando git checkout master para volver a la rama principal, hacemos un git pull para obtener la ultima version, hacemos un git merge ramaAlumnoX para añadir los cambios de cada alumno y luego hacemos un push para subir los cambios
este proceso se ha realizado en el orden: Alumno 3 - Alumno 2 - Alumno 4 - Alumno 1