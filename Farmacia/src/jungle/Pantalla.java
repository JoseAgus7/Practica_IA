package jungle;


import java.util.Scanner;

import java.util.Vector;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
//import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import java.io.Serializable;

public class Pantalla implements Serializable
{
	public static Scanner s = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		ObjectOutputStream f_salida = null;
		FileInputStream fis = null;
		ObjectInputStream f_entrada = null;
		
		Almacen A;
		Almacen_cli A1 = new Almacen_cli();
		
		try
		{
			fos = new FileOutputStream("C:\\Users\\sauce\\Desktop\\Universidad\\Cuarto\\Segundo semestre\\DSS\\Jungla\\Almacen.dat");
			f_salida = new ObjectOutputStream(fos);
			fis = new FileInputStream("C:\\Users\\sauce\\Desktop\\Universidad\\Cuarto\\Segundo semestre\\DSS\\Jungla\\Almacen.dat");
			f_entrada = new ObjectInputStream(fis);
			
			A = new Almacen();
			f_salida.writeObject(A);
			
			A = (Almacen) f_entrada.readObject();
			
		
		
		int flag1;
		String cad;
		boolean entrada;
		try
		{
			do
			{
				System.out.println("Software de FARMACIA-LA-JUNGLA: Principal");
				System.out.println("--------------------------------------------");
				System.out.println("1: Consultar medicamento");
				System.out.println("2: Realizar compra");
				System.out.println("3: Consulta de clientes");
				System.out.println("4: Introducir medicamento en el almacen");
				System.out.println("5: Mostrar contenido del almacen");
				System.out.println("0: Salir");
				System.out.println("--------------------------------------------");
				System.out.println("Introduzca una opcion: ");
				do
				{
					cad = s.next();
					entrada = comprobar_entero(cad);
					if(!entrada)
					{
						System.out.println("Introduzca un numero por favor");
						System.out.println("");
					}
				}while(!entrada);
				
				flag1 = Integer.parseInt(cad);

				
				switch(flag1)
				{
					case 1: consultar_medicamento(A.getVector_medicamento());
							break;
					case 2: realizar_compra(A.getVector_medicamento());
							break;
					case 3: consultar_cliente(A1.getVector_cliente());
							break;
					case 4: addMedicamento_Almacen(A);
							break;
					case 5: A.mostrar_contenido_almacen();
							break;
					case 0: break;
				}
				
				if(flag1 < 0 || flag1 > 5)
				{
					System.out.println("No existe esa opcion, por favor vuelva a intentarlo");
					System.out.println("");
				}
				
			}while(flag1 != 0);
			
			
			
			System.out.println("Gracias por usar la aplicacion");
			System.out.println("Hasta luego!!!");
		}catch(Exception e)
		{
			System.out.println("No se ha podido ejecutar el main");
		};
		
		
		
		//System.out.println("Antes de guardar el almacen");
		f_salida.writeObject(A);
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				if(fos != null)
				{
					fos.close();
				}
				if(f_salida != null)
				{
					f_salida.close();
				}
				if(fis != null)
				{
					fis.close();
				}
				if(f_entrada != null)
				{
					f_entrada.close();
				}
				
	
			}catch(Exception e)
			{
				System.out.println("Error al cerrar ficheros");
			}
		}
		s.close();
		
	}
	
	
	public static boolean comprobar_entero(String cad)
	{
		boolean salida = true;
		
		for(int i = 0; i < cad.length(); i++)
		{
			if(!Character.isDigit(cad.charAt(i)))
			{
				salida = false;
			}
		}
		
		return salida;
	}

	
	
	public static void menu_consultar_medicamento()
	{
		try
		{
			System.out.println("Software de FARMACIA-LA-JUNGLA: Consultar medicamento");
			System.out.println("--------------------------------------------");
			System.out.println("1: Consultar medicamento por nombre");
			System.out.println("2: Consultar medicamento por categoria");
			System.out.println("3: Consultar medicamento por principio activo");
			System.out.println("0: Volver a la pantalla anterior");
			System.out.println("--------------------------------------------");
			System.out.println("Introduzca una opcion: ");
		}catch(Exception e)
		{
			System.out.println("Ha fallado el menu_consultar_medicamento()");
		}
	}
	
	
	
	public static void consultar_medicamento(Vector<Medicamento> v)
	{
		int flag2,flag3;
		String conv;
		boolean entrada;
		try
		{
			do
			{
				menu_consultar_medicamento();
				
				do
				{
					conv = s.next();
					entrada = comprobar_entero(conv);
					if(!entrada)
					{
						System.out.println("Introduzca un numero por favor");
						System.out.println("");
					}
				}while(!entrada);
				
				flag2 = Integer.parseInt(conv);
				
				String cad;
				String cad2;
				
				Boolean sal = false;
				
				switch(flag2)
				{
					case 1:try
						{
							System.out.println("Introduzca el nombre del medicamento: ");
							System.out.println("--------------------------------------------");
							
							cad = s.next();
							cad = cad.toLowerCase();
							
							for(int i = 0; i < v.size(); i++)
							{
								cad2 = v.get(i).getNombre_med();
								if(cad2.equals(cad))
								{
									if(!sal)
									{
										System.out.println("Software FARMACIA-LA-JUNGLA : Detalles del medicamento");
										System.out.println("-----------------------------------------");
									}
									v.get(i).mostrar_detalles_med();
									sal = true;
								}
							}
							if(sal)
							{
								do
								{
									System.out.println(" ");
									System.out.println("0: Volver a la pantalla anterior");
									System.out.println("--------------------------------------------");
									System.out.println("Introduzca una opcion");
									
									do
									{
										conv = s.next();
										entrada = comprobar_entero(conv);
										if(!entrada)
										{
											System.out.println("Introduzca un numero por favor");
											System.out.println("");
										}
									}while(!entrada);
									
									flag3 = Integer.parseInt(conv);	
									if(flag3 != 0)
									{
										System.out.println("Introduzca el numero 0 para salir, no pulse otro numero");
									}
								}while(flag3 != 0);

							}
							else
							{
								System.out.println("No existe ese medicamento");
								System.out.println("");
							}
							break;
						}catch(Exception e1)
						{
							System.out.println("No se ha podido ejecutar bien el caso 1 de la funcion consultar_medicamento()");
						}
						
						
						
					case 2:try
						{
							System.out.println("Introduzca la categoria del medicamento: ");
							System.out.println("--------------------------------------------");
							cad = s.next();
							cad = cad.toLowerCase();
							
							for(int i = 0; i < v.size(); i++)
							{
								cad2 = v.get(i).getCat_med();
								if(cad2.equals(cad))
								{
									if(!sal)
									{
										System.out.println("Software FARMACIA-LA-JUNGLA : Detalles del medicamento");
										System.out.println("-----------------------------------------");
									}
									v.get(i).mostrar_detalles_med();
									sal = true;
								}
							}
							if(sal)
							{
								do
								{
									System.out.println("0: Volver a la pantalla anterior");
									System.out.println("--------------------------------------------");
									System.out.println("Introduzca una opcion");
									do
									{
										conv = s.next();
										entrada = comprobar_entero(conv);
										if(!entrada)
										{
											System.out.println("Introduzca un numero por favor");
											System.out.println("");
										}
									}while(!entrada);
									
									flag3 = Integer.parseInt(conv);
									if(flag3 != 0)
									{
										System.out.println("Introduzca el numero 0 para salir, no pulse otro numero");
									}
								}while(flag3 != 0);

							}
							else
							{
								System.out.println("No existe ese medicamento");
								System.out.println("");
							}
							break;
						}catch(Exception e2)
						{
							System.out.println("No se ha podido ejecutar bien el caso 2 de la funcion consultar_medicamento()");
						}
						
						
						
					case 3:try
						{
							System.out.println("Introduzca el principio activo del medicamento: ");
							System.out.println("--------------------------------------------");
							cad = s.next();
							cad = cad.toLowerCase();
							
							for(int i = 0; i < v.size(); i++)
							{
								cad2 = v.get(i).getComp_med();
								if(cad2.equals(cad))
								{
									if(!sal)
									{
										System.out.println("Software FARMACIA-LA-JUNGLA : Detalles del medicamento");
										System.out.println("-----------------------------------------");
									}
									v.get(i).mostrar_detalles_med();
									sal = true;
								}
							}
							if(sal)
							{
								do
								{
									System.out.println("0: Volver a la pantalla anterior");
									System.out.println("--------------------------------------------");
									System.out.println("Introduzca una opcion");
									do
									{
										conv = s.next();
										entrada = comprobar_entero(conv);
										if(!entrada)
										{
											System.out.println("Introduzca un numero por favor");
											System.out.println("");
										}
									}while(!entrada);
									
									flag3 = Integer.parseInt(conv);
									if(flag3 != 0)
									{
										System.out.println("Introduzca el numero 0 para salir, no pulse otro numero");
									}
								}while(flag3 != 0);

							}
							else
							{
								System.out.println("No existe ese medicamento");
								System.out.println("");
							}
							break;
						}catch(Exception e3)
						{
							System.out.println("No se ha podido ejecutar bien el caso 3 de la funcion consultar_medicamento()");
						}
						
						
					case 0: break;
				}
				
				if(flag2 < 0 || flag2 > 3)
				{
					System.out.println("No existe esa opcion, por favor vuelva a intentarlo");
					System.out.println("");
				}

				
			}while(flag2 != 0);
		}catch(Exception e)
		{
			System.out.println("No se ha podido ejecutar bien la funcion consultar_medicamento()");
		}
	
	}
	public static void menu_consultar_cliente() 
	{ 
 		try 
 		{ 
  		System.out.println("Software de FARMACIA-LA-JUNGLA: Consultar cliente"); 
  		System.out.println("--------------------------------------------"); 
  		System.out.println("1: Consultar datos del cliente"); 
  		System.out.println("2: Consultar historial de compra"); 
  		System.out.println("0: Volver a la pantalla anterior"); 
  		System.out.println("--------------------------------------------"); 
  		System.out.println("Introduzca una opcion: "); 
	 	}catch(Exception e) 
 		{ 
  			System.out.println("Ha fallado el menu_consultar_cliente()"); 
 		}		 
	} 
	
	public static void realizar_compra(Vector<Medicamento> v) 
{ 
 Compra c = new Compra(); 
 int flag1; 
 String cad; 
 boolean entrada; 
 try 
 { 
  do 
  { 
   System.out.println("Software de FARMACIA-LA-JUNGLA: Realizar Compra"); 
   System.out.println("--------------------------------------------"); 
   System.out.println("1: Add medicamento a la compra"); 
   System.out.println("2: Eliminar medicamento de la compra"); 
   System.out.println("3: Finalizar compra y generar Ticket"); 
   System.out.println("0: Cancelar compra y volver a la pantalla anterior"); 
   System.out.println("--------------------------------------------"); 
   System.out.println("Introduzca una opcion: "); 
   do 
   { 
    cad = s.next(); 
    entrada = comprobar_entero(cad); 
    if(!entrada) 
    { 
     System.out.println("Introduzca un numero por favor"); 
     System.out.println(""); 
    } 
   }while(!entrada); 
   flag1 = Integer.parseInt(cad); 
   switch(flag1) 
   { 
	case 1: addMedicamento(c,v); 
break; 
case 2: eliminar_medicamento(c,v); 
break; 
case 3: c.generateTicket_compra(); //Cambiar el txt a pdf 
flag1 = 0; 
break; 
case 0: cancelar_y_revertir_cambios(c,v); 
break; 
} 
if(flag1 < 0 || flag1 > 3) 
{ 
System.out.println("No existe esa opcion, por favor vuelva a intentarlo"); 
System.out.println(""); 
} 
}while(flag1 != 0); 
}catch(Exception e) 
{ 
System.out.println("Error en funcion realizar_compra()"); 
} 
} 
		
}

public static void consultar_cliente(Vector<Cliente> c)
{
int flag2,flag3;
String conv;
boolean entrada;
try
{
 do
 {
 menu_consultar_cliente();
 do
 {
 conv = s.next();
 entrada = comprobar_entero(conv);
 if(!entrada)
 {
 System.out.println("Introduzca un numero por favor");
 System.out.println("");
 }
 }while(!entrada);
 flag2 = Integer.parseInt(conv);
 String cad;
 String cad2;
 Boolean sal = false;
 switch(flag2)
 {
 case 1:try
13
 {
 System.out.println("Introduzca el DNI del cliente: ");
 System.out.println("--------------------------------------------");
 cad = s.next();
 cad = cad.toLowerCase();
 for(int i = 0; i < c.size(); i++)
 {
 cad2 = c.get(i).getCod_cli();
 if(cad2.equals(cad))
 {
 if(!sal)
 {
 System.out.println("Software FARMACIA-LA-JUNGLA : Detalles del
cliente");
 System.out.println("-----------------------------------------");
 }
 c.get(i).mostrar_detalles_cli();
 sal = true;
 }
 }
 if(sal)
 {
 do
 {
 System.out.println(" ");
 System.out.println("0: Volver a la pantalla anterior");
 System.out.println("--------------------------------------------");
 System.out.println("Introduzca una opcion");
 do
 {
 conv = s.next();
 entrada = comprobar_entero(conv);
 if(!entrada)
 {
 System.out.println("Introduzca un numero por favor");
 System.out.println("");
 }
 }while(!entrada);
 flag3 = Integer.parseInt(conv);
 if(flag3 != 0)
 {
 System.out.println("Introduzca el numero 0 para salir, no pulse otro
numero");
 }
 }while(flag3 != 0);
 }
 else
 {
 System.out.println("No existe ese cliente");
 System.out.println("");
 }
 break;
 }catch(Exception e1)
 {
14
 System.out.println("No se ha podido ejecutar bien el caso 1 de la funcion
consultar_cliente()");
 }
 case 2:try
 {
 System.out.println("Introduzca el DNI del cliente: ");
 System.out.println("--------------------------------------------");
 cad = s.next();
 cad = cad.toLowerCase();
 for(int i = 0; i < c.size(); i++)
 {
 cad2 = c.get(i).getCod_cli();
 if(cad2.equals(cad))
 {
 if(!sal)
 {
 System.out.println("Software FARMACIA-LA-JUNGLA : Detalles del
cliente");
 System.out.println("-----------------------------------------");
 }
 //c.get(i).mostrar_historial_cli();
 sal = true;
 }
 }
 if(sal)
 {
 do
 {
 System.out.println("0: Volver a la pantalla anterior");
 System.out.println("--------------------------------------------");
 System.out.println("Introduzca una opcion");
 do
 {
 conv = s.next();
 entrada = comprobar_entero(conv);
 if(!entrada)
 {
 System.out.println("Introduzca un numero por favor");
 System.out.println("");
 }
 }while(!entrada);
 flag3 = Integer.parseInt(conv);
 if(flag3 != 0)
 {
 System.out.println("Introduzca el numero 0 para salir, no pulse otro
numero");
 }
 }while(flag3 != 0);
 }
 else
 {
 System.out.println("No existe ese medicamento");
 System.out.println("");
 }
 break;
15
 }catch(Exception e2)
 {
 System.out.println("No se ha podido ejecutar bien el caso 2 de la funcion
consultar_cliente()");
 }
 case 0:break;
 }
 if(flag2 < 0 || flag2 > 2)
 {
 System.out.println("No existe esa opcion, por favor vuelva a intentarlo");
 System.out.println("");
 }
 }while(flag2 != 0);
}catch(Exception e)
{
 System.out.println("No se ha podido ejecutar bien la funcion
consultar_cliente()");
}
}

public static void addMedicamento_Almacen(Almacen almacen) {
    Scanner scanner = new Scanner(System.in);
    String input;
    boolean validInput;
    int intFlag;
    float floatFlag;

    Medicamento medicamento = new Medicamento();

    // Solicitar código del medicamento
    System.out.println("Introduzca el código del medicamento:");
    do {
        input = scanner.next();
        validInput = comprobar_entero(input);
        if (!validInput) {
            System.out.println("Por favor, introduzca un número válido.");
        }
    } while (!validInput);
    intFlag = Integer.parseInt(input);
    medicamento.setCod_med(intFlag);

    // Solicitar nombre del medicamento
    System.out.println("Introduzca el nombre del medicamento:");
    input = scanner.next().toLowerCase();
    medicamento.setNombre_med(input);

    // Solicitar composición del medicamento
    System.out.println("Introduzca la composición del medicamento:");
    input = scanner.next().toLowerCase();
    medicamento.setComp_med(input);

    // Solicitar categoría del medicamento
    System.out.println("Introduzca la categoría del medicamento:");
    input = scanner.next().toLowerCase();
    medicamento.setCat_med(input);

    // Solicitar formato del medicamento
    System.out.println("Introduzca el formato del medicamento:");
    input = scanner.next().toLowerCase();
    medicamento.setFormato_med(input);

    // Solicitar si requiere receta
    System.out.println("Introduzca 'si' en caso de necesitar receta o 'no' en caso contrario:");
    boolean recetaValida = false;
    boolean requiereReceta = true;
    do {
        input = scanner.next().toLowerCase();
        if (input.equals("si")) {
            requiereReceta = true;
            recetaValida = true;
        } else if (input.equals("no")) {
            requiereReceta = false;
            recetaValida = true;
        } else {
            System.out.println("Entrada inválida. Por favor, introduzca 'si' o 'no'.");
        }
    } while (!recetaValida);
    medicamento.setReceta_med(requiereReceta);

    // Solicitar stock del medicamento
    System.out.println("Introduzca el stock del medicamento:");
    do {
        input = scanner.next();
        validInput = comprobar_entero(input);
        if (!validInput) {
            System.out.println("Por favor, introduzca un número válido.");
        }
    } while (!validInput);
    intFlag = Integer.parseInt(input);
    medicamento.setStock_med(intFlag);

    // Solicitar precio unitario del medicamento
    System.out.println("Introduzca el precio unitario del medicamento:");
    do {
        input = scanner.next();
        validInput = comprobar_flotante(input); // Asumo que hay un método similar para validar flotantes.
        if (!validInput) {
            System.out.println("Por favor, introduzca un número válido.");
        }
    } while (!validInput);
    floatFlag = Float.parseFloat(input);
    medicamento.setPrecio_med(floatFlag);

    // Añadir el medicamento al almacén
    almacen.introduce_medicamento_Almacen(medicamento);

    // Mostrar detalles del medicamento
    System.out.println("Medicamento añadido al almacén:");
    System.out.println("-----------------------------------------");
    medicamento.mostrar_detalles_med();
    System.out.println("-----------------------------------------");
}


