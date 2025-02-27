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
}



