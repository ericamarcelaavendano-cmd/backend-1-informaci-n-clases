import java.util.ArrayList;
import java.util.List;

//Trabajo en clase semana03

// Definición de constantes
public static final String GREETING_MESSAGE = "¡Bienvenido al Sistema de Gestión de Estudiantes!";
        static final int CURRENT_YEAR = 2026;

        public static void main(String[] args) {
            // Arreglo de estudiantes
            String[] names = {"Ana", "Luis", "Elena", "Pedro", "Sofía"};
            int[] birthYears = {2000, 1998, 2002, 1995, 2001};

            // Lista de edades
            List<Integer> ages = new ArrayList<>();

            // Ejecución de la lógica
            showMessage(GREETING_MESSAGE);

            // Llenar la lista usando el método solicitado
            fillAgesList(ages, birthYears);

            // Mostrar resultados
            listStudents(names, ages);
        }


        // Muestra mensajes en pantalla
        static void showMessage(String message) {
            System.out.println(message);
        }

        // Calcula la edad: Edad = Año Actual - Año de Nacimiento
        static int calculateAge(int birthYear) {
            return CURRENT_YEAR - birthYear;
        }

        // Llena la lista de edades a partir del arreglo de años
        static void fillAgesList(List<Integer> agesList, int[] birthYears) {
            for (int year : birthYears) {
                agesList.add(calculateAge(year));
            }
        }

        // Muestra el nombre de cada estudiante con su edad
        static void listStudents(String[] names, List<Integer> ages) {
            System.out.println("\nListado de Estudiantes java:");
            for (int i = 0; i < names.length; i++) {
                System.out.println("Estudiante: " + names[i] + " | Edad: " + ages.get(i) + " años");
            }
        }


        //  Creación de la clase Student
        class Student {
            String name;
            int birthYear;

            public Student(String name, int birthYear) {
                this.name = name;
                this.birthYear = birthYear;
            }
        }



