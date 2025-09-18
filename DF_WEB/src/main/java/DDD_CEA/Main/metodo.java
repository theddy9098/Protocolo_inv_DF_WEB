package DDD_CEA.Main;

import java.util.ArrayList;
import java.util.List;

public class metodo {
    static class Curso {
        private List<Estudiante> estudiantes;
        private int capacidad;

        public Curso(int capacidad) {
            if (capacidad <= 0) {
                throw new IllegalArgumentException("La capacidad debe ser mayor que 0");
            }
            this.capacidad = capacidad;
            this.estudiantes = new ArrayList<>();
        }

        public void inscribirEstudiante(Estudiante estudiante) {
            if (estudiante == null) {
                throw new IllegalArgumentException("El estudiante no puede ser null");
            }
            if (estudiantes.size() >= capacidad) {
                throw new IllegalStateException("No hay cupos disponibles");
            }
            if (estudiantes.contains(estudiante)) {
                throw new IllegalArgumentException("El estudiante ya está inscrito");
            }
            estudiantes.add(estudiante);
        }

        public int getCapacidad() {
            return capacidad;
        }

        public List<Estudiante> getEstudiantes() {
            return estudiantes;
        }
    }

}
