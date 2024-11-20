package jungle;

import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private int cod_com;
    private static int num_cod_com = 0;
    private DateTimeFormatter fecha_com;
    private List<LineaDeCompra> lista_compra;
    private float precioTotal_com;

    // Constructor
    public Compra() {
        this.cod_com = num_cod_com++;
        this.fecha_com = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        this.lista_compra = new ArrayList<>();
        this.precioTotal_com = 0;
    }

    // Añadir una línea a la compra
    public void addTo_compra(LineaDeCompra linea) {
        this.lista_compra.add(linea);
        this.precioTotal_com += linea.getPrecio_lc();
    }

    // Eliminar una línea de la compra
    public void removeFrom_compra(LineaDeCompra linea, int index) {
        this.precioTotal_com -= linea.getPrecio_lc();
        this.lista_compra.remove(index);
    }

    // Generar resumen de la compra
    public String resumen_compra() {
        StringBuilder resumen = new StringBuilder("RESUMEN DE LA COMPRA\n");
        resumen.append("---------------\n");
        resumen.append("ID\tNOMBRE\t\tCANTIDAD\tPRECIO\n\n");

        for (int i = 0; i < lista_compra.size(); i++) {
            LineaDeCompra linea = lista_compra.get(i);
            String nombre = linea.getMedicamento().getNombreMedicamento();
            resumen.append(i + 1).append("\t")
                   .append(nombre.length() >= 8 ? nombre
