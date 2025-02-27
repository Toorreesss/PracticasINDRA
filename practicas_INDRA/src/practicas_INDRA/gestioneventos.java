package practicas_INDRA;
import java.util.*;

public class gestioneventos {
	static ArrayList<String[]> eventos = new ArrayList<>();
    static HashMap<String, ArrayList<String>> inscripciones = new HashMap<>();
    static HashMap<String, String> usuarios = new HashMap<>();
    static HashMap<String, String> organizadores = new HashMap<>();
    static HashMap<String, ArrayList<String>> categorias = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("1. Registrar Usuario\n"+
            				   "2. Registrar Organizador\n"+
            				   "3. Crear Evento\n"+
            				   "4. Inscribirse a Evento\n"+
            				   "5. Listar Eventos\n"+
            				   "6. Cancelar Evento\n"+
            				   "7. Buscar Eventos por Categoria\n"+
            				   "8. Salir\n"+
            				   "Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 
            
            switch (opcion) {
                case 1:
                	registrarUsuario();
                	break;
                case 2:
                	//registrarOrganizador();
                	break;
                case 3:
                	//crearEvento();
                	break;
                case 4:
                	//inscribirseEvento();
                	break;
                case 5:
                	//listarEventos();
                	break;
                case 6:
                	//cancelarEvento();
                	break;
                case 7:
                	//buscarEventosPorCategoria();
                	break;
                case 8:
                	System.out.println("Adios.");
                	break;
                default:
                	System.out.println("Opcion no valida.");
            }
        } while (opcion != 8);
    }
	public static void registrarUsuario() {
		System.out.print("Ingrese correo electronico: ");
		String email = sc.nextLine();
		System.out.print("Ingrese contraseña: ");
		String pass = sc.nextLine();
		usuarios.put(email, pass);
		System.out.println("Usuario registrado con éxito.");
	}
    public static void registrarOrganizador() {
        System.out.print("Ingrese nombre del organizador: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese contacto: ");
        String contacto = sc.nextLine();
        organizadores.put(nombre, contacto);
        System.out.println("Organizador registrado con éxito.");
    }
    public static void crearEvento() {
        System.out.print("Ingrese nombre del evento: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese fecha: ");
        String fecha = sc.nextLine();
        System.out.print("Ingrese duración: ");
        String duracion = sc.nextLine();
        System.out.print("Ingrese ubicación: ");
        String ubicacion = sc.nextLine();
        System.out.print("Ingrese tipo (conferencia/taller): ");
        String tipo = sc.nextLine();
        System.out.print("Ingrese organizador: ");
        String organizador = sc.nextLine();
        System.out.print("Ingrese categoría: ");
        String categoria = sc.nextLine();
        
        if (!organizadores.containsKey(organizador)) {
            System.out.println("El organizador no está registrado.");
        }
        
        eventos.add(new String[]{nombre, fecha, duracion, ubicacion, tipo, organizador, categoria});
        inscripciones.put(nombre, new ArrayList<>());
        if (!categorias.containsKey(categoria)) {
            categorias.put(categoria, new ArrayList<>());
        }
        categorias.get(categoria).add(nombre);
        System.out.println("Evento creado con éxito.");
    }
    public static void inscribirseEvento() {
        System.out.print("Ingrese su email: ");
        String email = sc.nextLine();
        if (!usuarios.containsKey(email)) {
            System.out.println("Usuario no registrado.");
        }
        System.out.print("Ingrese el nombre del evento al que desea inscribirse: ");
        String evento = sc.nextLine();
        if (!inscripciones.containsKey(evento)) {
            System.out.println("Evento no encontrado.");
        }
        inscripciones.get(evento).add(email);
        System.out.println("Inscripción realizada con éxito.");
    }
    
}



