package P_SportsPredictor;
import Strategy.*;
import java.util.List;
import java.util.Scanner;

public class Pronostico {
    private String prediccion;
    private CategoriaPronostico categoria;
    private Evento evento;
    private EstadoPronostico estado;
    private PronosticoEstrategia estrategia;

    public Pronostico(String prediccion, CategoriaPronostico categoria, Evento evento, EstadoPronostico estado,
                      PronosticoEstrategia estrategia) {
        this.prediccion = prediccion;
        this.categoria = categoria;
        this.evento = evento;
        this.estado = estado;
        this.estrategia = estrategia;
    }

    public void setEstrategia(PronosticoEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public boolean evaluarPronostico() {
        if (estrategia == null) {
            throw new IllegalStateException("La estrategia no está configurada.");
        }
        return estrategia.evaluarPronostico(this.evento, this);
    }

    public void makePronostico(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);

        List<Evento> eventos = SportsPredictor.getEventos();

        if (eventos.isEmpty()) {
            System.out.println("No hay eventos disponibles para realizar un pronóstico.");
            return;
        }

        System.out.println("Eventos disponibles:");
        for (int index = 0; index < eventos.size(); index++) {
            Evento evento = eventos.get(index);
            System.out.println(index + 1 + ". " + evento.getNombre() + " - " + evento.getFecha());
        }

        int eventoIndex = -1;
        while (eventoIndex < 0 || eventoIndex >= eventos.size()) {
            try {
                System.out.print("Ingrese el número del evento para la predicción: ");
                eventoIndex = Integer.parseInt(scanner.nextLine()) - 1;

                if (eventoIndex < 0 || eventoIndex >= eventos.size()) {
                    System.out.println("Por favor, ingrese un número válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
        }

        Evento eventoSeleccionado = eventos.get(eventoIndex);

        System.out.print("Ingrese la categoría de la predicción: ");
        String categoriaInput = scanner.nextLine().trim();
        CategoriaPronostico categoria = new CategoriaPronostico(categoriaInput, "Descripción");

        System.out.print("Ingrese su predicción: ");
        String prediccion = scanner.nextLine().trim();

        EstadoPronostico estadoInicial = new EstadoPendiente();

        PronosticoEstrategia estrategia = new PronosticoPorResultado(); 
        Pronostico pronostico = new Pronostico(prediccion, categoria, eventoSeleccionado, estadoInicial, estrategia);

        usuario.getPronosticos().add(pronostico);
        System.out.println("Pronóstico creado exitosamente.");
    }

    public String getResultadoEsperado() {
        if (categoria.getNombre().equals("Fútbol") && prediccion != null && !prediccion.isEmpty()) {
            
            String[] partes = prediccion.split("-");
            if (partes.length == 2) {
                try {
                    int golesLocal = Integer.parseInt(partes[0].trim());
                    int golesVisitante = Integer.parseInt(partes[1].trim());
                    return golesLocal + " - " + golesVisitante; 
                } catch (NumberFormatException e) {
                    System.out.println("Formato de predicción no válido.");
                }
            }
        }
        return "Resultado no definido"; 
    }

    public String getPrediccion() {
        return prediccion;
    }

    public void setPrediccion(String prediccion) {
        this.prediccion = prediccion;
    }

    public CategoriaPronostico getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPronostico categoria) {
        this.categoria = categoria;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getEstado() {
        return estado.getEstado();
    }

    public void setEstado(EstadoPronostico estado) {
        this.estado = estado;
    }
}
