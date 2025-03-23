import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Queue<Paciente> filaPrioritaria = new LinkedList<>();
        Queue<Paciente> filaComum = new LinkedList<>();
        Random random = new Random();
        
        int tempo = 0;
        int pacientesAtendidos = 0;
        
        while (pacientesAtendidos < 20) {
            if (tempo % 4 == 0) {
                int rg = 100000 + random.nextInt(900000);
                int idade = 10 + random.nextInt(80);
                Paciente paciente = new Paciente(rg, idade);
                
                if (idade >= 60) {
                    filaPrioritaria.add(paciente);
                } else {
                    filaComum.add(paciente);
                }
                System.out.println("Paciente chegou: " + paciente);
            }
            
            if (tempo % 5 == 0 && (!filaPrioritaria.isEmpty() || !filaComum.isEmpty())) {
                Paciente atendido;
                if (!filaPrioritaria.isEmpty()) {
                    atendido = filaPrioritaria.poll();
                } else {
                    atendido = filaComum.poll();
                }
                System.out.println("Atendendo: " + atendido);
                pacientesAtendidos++;
            }
            tempo++;
        }
        
        System.out.println("Atendimento encerrado.");
    }
}