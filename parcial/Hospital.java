package parcial;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

    public static void main(String[] args){
        //Variables
        int opcionMenu;
        Scanner leer = new Scanner(System.in);

        System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 • 0362 444-2399");
        System.out.println("Menu:\n" +
                            "1. Listar Doctores\n" +
                            "2. Registrar un nuevo paciente\n" +
                            "3. Actualizar informacion de personal de un paciente\n" +
                            "4. Consultar el historial medico de un paciente\n" +
                            "5. Nuevo historial para un paciente\n" +
                            "6. Guardar Historial de pacientes en archivo\n" +
                            "7. Cargar Historial de pacientes desde archivo\n" +
                            "8. Salir");

        //Carga de Doctores
        Doctor[] doctores = new Doctor[3];
        doctores[0] = new Doctor("Alejandro Perez", 41021611, "11/02/1944", "Pediatra");
        doctores[1] = new Doctor("Ramiro Marra", 25314785, "12/06/1947", "Neumonologo");
        doctores[2] = new Doctor("Ramiro Perez", 11021364, "13/04/1955", "Oftalmologo");

        opcionMenu = leer.nextInt();
        cargarMenu(opcionMenu, doctores);
        leer.close();


    }

    public static void cargarMenu(int n, Doctor[] doc){

        Scanner leer = new Scanner(System.in);
        switch (n){
            case 1:
                for (int i = 0; i < doc.length; i++){
                    System.out.println(doc[i].listar());
                }
                System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 • 0362 444-2399");
                System.out.println("Menu:\n" +
                        "1. Listar Doctores\n" +
                        "2. Registrar un nuevo paciente\n" +
                        "3. Actualizar informacion de personal de un paciente\n" +
                        "4. Consultar el historial medico de un paciente\n" +
                        "5. Nuevo historial para un paciente\n" +
                        "6. Guardar Historial de pacientes en archivo\n" +
                        "7. Cargar Historial de pacientes desde archivo\n" +
                        "8. Salir");
                n = leer.nextInt();
                cargarMenu(n, doc);
                break;
            case 2:
                Paciente paciente = new Paciente();
                System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 • 0362 444-2399");
                System.out.println("Menu:\n" +
                        "1. Listar Doctores\n" +
                        "2. Registrar un nuevo paciente\n" +
                        "3. Actualizar informacion de personal de un paciente\n" +
                        "4. Consultar el historial medico de un paciente\n" +
                        "5. Nuevo historial para un paciente\n" +
                        "6. Guardar Historial de pacientes en archivo\n" +
                        "7. Cargar Historial de pacientes desde archivo\n" +
                        "8. Salir");
                n = leer.nextInt();
                cargarMenu(n, doc);
                break;
            case 3:
                System.out.println("Opcion 3");
                System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 • 0362 444-2399");
                System.out.println("Menu:\n" +
                        "1. Listar Doctores\n" +
                        "2. Registrar un nuevo paciente\n" +
                        "3. Actualizar informacion de personal de un paciente\n" +
                        "4. Consultar el historial medico de un paciente\n" +
                        "5. Nuevo historial para un paciente\n" +
                        "6. Guardar Historial de pacientes en archivo\n" +
                        "7. Cargar Historial de pacientes desde archivo\n" +
                        "8. Salir");
                n = leer.nextInt();
                cargarMenu(n, doc);
                break;
            case 4:
                System.out.println("Opcion 4");
                System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 • 0362 444-2399");
                System.out.println("Menu:\n" +
                        "1. Listar Doctores\n" +
                        "2. Registrar un nuevo paciente\n" +
                        "3. Actualizar informacion de personal de un paciente\n" +
                        "4. Consultar el historial medico de un paciente\n" +
                        "5. Nuevo historial para un paciente\n" +
                        "6. Guardar Historial de pacientes en archivo\n" +
                        "7. Cargar Historial de pacientes desde archivo\n" +
                        "8. Salir");
                n = leer.nextInt();
                cargarMenu(n, doc);
                break;
            case 5:
                System.out.println("Opcion 5");
                System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 • 0362 444-2399");
                System.out.println("Menu:\n" +
                        "1. Listar Doctores\n" +
                        "2. Registrar un nuevo paciente\n" +
                        "3. Actualizar informacion de personal de un paciente\n" +
                        "4. Consultar el historial medico de un paciente\n" +
                        "5. Nuevo historial para un paciente\n" +
                        "6. Guardar Historial de pacientes en archivo\n" +
                        "7. Cargar Historial de pacientes desde archivo\n" +
                        "8. Salir");
                n = leer.nextInt();
                cargarMenu(n, doc);
                break;
            case 6:
                System.out.println("Opcion 6");
                System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 • 0362 444-2399");
                System.out.println("Menu:\n" +
                        "1. Listar Doctores\n" +
                        "2. Registrar un nuevo paciente\n" +
                        "3. Actualizar informacion de personal de un paciente\n" +
                        "4. Consultar el historial medico de un paciente\n" +
                        "5. Nuevo historial para un paciente\n" +
                        "6. Guardar Historial de pacientes en archivo\n" +
                        "7. Cargar Historial de pacientes desde archivo\n" +
                        "8. Salir");
                n = leer.nextInt();
                cargarMenu(n, doc);
                break;
            case 7:
                System.out.println("Opcion 7");
                System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 • 0362 444-2399");
                System.out.println("Menu:\n" +
                        "1. Listar Doctores\n" +
                        "2. Registrar un nuevo paciente\n" +
                        "3. Actualizar informacion de personal de un paciente\n" +
                        "4. Consultar el historial medico de un paciente\n" +
                        "5. Nuevo historial para un paciente\n" +
                        "6. Guardar Historial de pacientes en archivo\n" +
                        "7. Cargar Historial de pacientes desde archivo\n" +
                        "8. Salir");
                n = leer.nextInt();
                cargarMenu(n, doc);
                break;
            case 8:
                System.out.println("Gracias por usar el Sistema");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                System.out.println("Hospital Julio C. Perrando - Av. 9 de Julio 1100 • 0362 444-2399");
                System.out.println("Menu:\n" +
                        "1. Listar Doctores\n" +
                        "2. Registrar un nuevo paciente\n" +
                        "3. Actualizar informacion de personal de un paciente\n" +
                        "4. Consultar el historial medico de un paciente\n" +
                        "5. Nuevo historial para un paciente\n" +
                        "6. Guardar Historial de pacientes en archivo\n" +
                        "7. Cargar Historial de pacientes desde archivo\n" +
                        "8. Salir");
                n = leer.nextInt();
                cargarMenu(n, doc);
        }
    }
}

abstract class Persona{
    //Atributos
    private String nombre;
    private int dni;
    private String fechaNacimiento;

    //Constructor
    public Persona(){}
    public Persona(String nom, int dni, String fNac){
        this.nombre = nom;
        this.dni = dni;
        this.fechaNacimiento = fNac;
    }

    //Propiedades
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

class Doctor extends Persona {
    //Atributo
    private String especialidad;

    //Constructor
    public Doctor(String nom, int dni, String fNac, String espe) {
        super(nom, dni, fNac);
        this.especialidad = espe;
    }

    //Propiedades
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Metodos
    public String listar() {
        return ("Nombre: " + getNombre() + "\n" +
                "DNI: " + getDni() + "\n" +
                "Fecha de Nacimiento:" + getFechaNacimiento() + "\n" +
                "Especialidad: " + getEspecialidad());
    }
}

class Paciente extends Persona{
    //Atributos
    private int nroTelefono;
    private char sangre;
    private ArrayList<Evento> historialMedico;

    //Constructor
    public Paciente(){}
    public Paciente(String nom, int dni, String fNac, int nroTel, char sangre){
        super(nom, dni, fNac);
        this.nroTelefono = nroTel;
        this.sangre = sangre;
    }

    //Propiedades
    public int getNroTelefono() {
        return nroTelefono;
    }
    public void setNroTelefono(int nroTelefono) {
        this.nroTelefono = nroTelefono;
    }
    public char getSangre() {
        return sangre;
    }
    public void setSangre(char sangre) {
        this.sangre = sangre;
    }

    //Metodos
    public void actualizarDatos(String nom,int nroTel){
        super.setNombre(nom);
        setNroTelefono(nroTel);
    }
}

class Evento extends Paciente{
    // Atributos
    private String fecha;
    private String observacion;

    //Contructor
    public Evento(String fecha, String observacion){
        this.fecha = fecha;
        this.observacion = observacion;
    }

    //Propiedades
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    //Metodo
    public void añadirHistorial(String fecha, String obs){

    }
}