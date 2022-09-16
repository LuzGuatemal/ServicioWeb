/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Coneccion.User;
import Coneccion.UserDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "Servicios")
public class Servicios {
    
     UserDAO dao = new UserDAO();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Guardarlogin")
    public String Guardarlogin(@WebParam(name = "cedula") int cedula, @WebParam(name = "contrasenia") String contrasenia, @WebParam(name = "cargo") String cargo) {
        //TODO write your implementation code here:
        String datos = dao.GuardarLogin(cedula, contrasenia, cargo);
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Validar")
    public int Validar(@WebParam(name = "cedula") int cedula, @WebParam(name = "contrasenia") String contrasenia, @WebParam(name = "cargo") String cargo) {
        //TODO write your implementation code here:
        int datos = dao.ValidarLogin(cedula, contrasenia, cargo);
        return datos;
    }

    @WebMethod(operationName = "GuardarUsuario")
    public String GuardarUsuario(@WebParam(name = "cedulaU") int cedulaU,
            @WebParam(name = "nombresU") String nombresU,
            @WebParam(name = "apellidosU") String apellidosU,
            @WebParam(name = "correoU") String correoU,
            @WebParam(name = "fk_carreraId") int fk_carreraId,
            @WebParam(name = "fk_nivelAcademicoId") int fk_nivelAcademicoId,
            @WebParam(name = "fk_formacionAcademicaId") int fk_formacionAcademicaId) {
        //TODO write your implementation code here:
        String datos = dao.AgregarUsuario(cedulaU, nombresU, apellidosU, correoU, fk_carreraId, fk_nivelAcademicoId, fk_formacionAcademicaId);
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarUsuarios")
    public List<User> ListarUsuarios() {
        //TODO write your implementation code here:
        List datos = dao.ListadoUsuarios();
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarUsuariosId")
    public User ListarUsuariosId(@WebParam(name = "pk_UsuarioId") int pk_UsuarioId) {
        //TODO write your implementation code here:
        User user=dao.ListadoUsuariosId(pk_UsuarioId);
        return user;
    }
       
    @WebMethod(operationName = "GuardarLibro")
    public String GuardarLibro(@WebParam(name = "codigoM") String codigoM,
            @WebParam(name = "autorM") String autorM,
            @WebParam(name = "edicionM") String edicionM,
            @WebParam(name = "anioPublicacionM") String anioPublicacionM,
            @WebParam(name = "tituloM") String tituloM,
            @WebParam(name = "ciudadM") String ciudadM,
            @WebParam(name = "paisM") String paisM,
            @WebParam(name = "editorialM") String editorialM,
            @WebParam(name = "registroISBNM") String registroISBNM,
            @WebParam(name = "nroPaginasM") int nroPaginasM,
            @WebParam(name = "estadoM") String estadoM,
            @WebParam(name = "nroEjemplaresM") int nroEjemplaresM,
            @WebParam(name = "incluyeCd") String incluyeCd,
            @WebParam(name = "tipoM") String tipoM,
            @WebParam(name = "tiempoVigenciaM") String tiempoVigenciaM) {
        //TODO write your implementation code here:
        String datos = dao.AgregarLibro(codigoM, autorM, edicionM, anioPublicacionM, tituloM, ciudadM, paisM, editorialM, registroISBNM, nroPaginasM, estadoM, nroEjemplaresM, incluyeCd, tipoM, tiempoVigenciaM);
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarLibros")
    public List<User> ListarLibros() {
        //TODO write your implementation code here:
        List datos = dao.Listadolibros();
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarLibrosId")
    public User ListarLibrosId(@WebParam(name = "pkLibroId") int pkLibroId) {
        //TODO write your implementation code here:
        User user=dao.ListadoLibrosId(pkLibroId);
        return user;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "GuardarPrestamo")
    public String GuardarPrestamo(@WebParam(name = "fechaPrestamo") String fechaPrestamo, @WebParam(name = "fkUsuarioId") int fkUsuarioId, @WebParam(name = "fklibroId") int fklibroId) {
        //TODO write your implementation code here:
        String datos = dao.AgregarPrestamo(fechaPrestamo, fkUsuarioId, fklibroId);
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarPrestamos")
    public List<User> ListarPrestamos() {
        //TODO write your implementation code here:
        List datos = dao.ListadoPrestamos();
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarPrestamosId")
    public User ListarPrestamosId(@WebParam(name = "pkUsuarioId") int pkUsuarioId) {
        //TODO write your implementation code here:
        User user=dao.ListadoPrestamosId(pkUsuarioId);
        return user;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "GuardarDevolucion")
    public String GuardarDevolucion(@WebParam(name = "fechaDevolucion") String fechaDevolucion, @WebParam(name = "fkPrestamoId") int fkPrestamoId) {
        //TODO write your implementation code here:
        String datos = dao.AgregarDevolucion(fechaDevolucion, fkPrestamoId);
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarDevoluciones")
    public List<User> ListarDevoluciones() {
        //TODO write your implementation code here:
        List datos = dao.ListadoDevoluciones();
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarUsuario")
    public String ActualizarUsuario(@WebParam(name = "pk_UsuarioId") int pk_UsuarioId, @WebParam(name = "cedulaU") int cedulaU, @WebParam(name = "nombresU") String nombresU, @WebParam(name = "apellidosU") String apellidosU, @WebParam(name = "correoU") String correoU, @WebParam(name = "fkcarreraId") int fkcarreraId, @WebParam(name = "fknivelAcademicoId") int fknivelAcademicoId, @WebParam(name = "fkformacionAcademicaId") int fkformacionAcademicaId) {
        //TODO write your implementation code here:
        String datos=dao.EditarUsuario(pk_UsuarioId, cedulaU, nombresU, apellidosU, correoU, fkcarreraId, fknivelAcademicoId, fkformacionAcademicaId);
        return datos;
    }
    /**
     * Web service operation
     */   
    @WebMethod(operationName = "ActualizarLibro")
    public String ActualizarLibro(@WebParam(name = "pk_librosId") int pk_librosId,
           @WebParam(name = "codigoM") String codigoM,
            @WebParam(name = "autorM") String autorM,
            @WebParam(name = "edicionM") String edicionM,
            @WebParam(name = "anioPublicacionM") String anioPublicacionM,
            @WebParam(name = "tituloM") String tituloM,
            @WebParam(name = "ciudadM") String ciudadM,
            @WebParam(name = "paisM") String paisM,
            @WebParam(name = "editorialM") String editorialM,
            @WebParam(name = "registroISBNM") String registroISBNM,
            @WebParam(name = "nroPaginasM") int nroPaginasM,
            @WebParam(name = "estadoM") String estadoM,
            @WebParam(name = "nroEjemplaresM") int nroEjemplaresM,
            @WebParam(name = "incluyeCd") String incluyeCd,
            @WebParam(name = "tipoM") String tipoM,
            @WebParam(name = "tiempoVigenciaM") String tiempoVigenciaM) {
        //TODO write your implementation code here:
        String datos = dao.EditarLibro(pk_librosId, codigoM, autorM, edicionM, anioPublicacionM, tituloM, ciudadM, paisM, editorialM, registroISBNM, nroPaginasM, estadoM, nroEjemplaresM, incluyeCd, tipoM, tiempoVigenciaM);
        return datos;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarUsuario")
    public User EliminarUsuario(@WebParam(name = "pk_UsuarioId") int pk_UsuarioId) {
        //TODO write your implementation code here:
        User u= dao.DeleteUsuario(pk_UsuarioId);
        return u;
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarLibro")
    public User EliminarLibro(@WebParam(name = "pk_LibroId") int pk_LibroId) {
        //TODO write your implementation code here:
        User u= dao.DeleteLibro(pk_LibroId);
        return u;
    } 
    /**
     * This is a sample web service operation
     *
     * @param fechaPrestamo
     * @param fechaDevolucion
     * @return
     */
   //@WebMethod(operationName = "CalculoFechas")
   // public String CalculoFechas(@WebParam(name = "fechaPrestamo") String fechaPrestamo, @WebParam(name = "fechaDevolucion") String fechaDevolucion) {
        
       // String mensaje = null;        

       // DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy//MM/dd"); //La clase proporciona formato que distingue entre configuraciones regionales para un objeto Date y acceso nombres de campos de fecha

       // LocalDate prestamo = LocalDate.parse(fechaPrestamo, fecha); //La clase LocalDate solo puede contener la fecha
       // LocalDate entrega = LocalDate.parse(fechaDevolucion, fecha);
        
        ////
      //  Period dias = Period.between(prestamo, entrega);
//        DateTimeFormatter formato_Horas = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        LocalTime hora1 = LocalTime.parse(HoraSolicitud, formato_Horas);
//        LocalTime hora2 = LocalTime.parse(HoraEntrega, formato_Horas);
////        hoario de atencion
//        LocalTime horaprestamo = LocalTime.parse("14:30:00", formato_Horas);
//        LocalTime horaentrega = LocalTime.parse("18:30:00", formato_Horas);
        
        //Duration hora = Duration.between(hora1, hora2);
        
//        int contador = 0;
//        int contD = 0;
//        int contM = 0;
//        int conts = 0;
        //int contFinSeman = 0;
//        String mensaje = "";


//        while (!prestamo.plusDays(contador).equals(entrega)) {
//
//            contador = contador + 1;
//            contD = contD + 24; //1 dia 24 horas
//            contM = contM + 1440;  //1 dia 1440 minutos
//            conts = conts + 86400;  //1 dia 86400 segundos
//            mensaje = "";
//
//                       
//        }
        ///
        
      //  LocalDate feriado1 = LocalDate.parse("2022/01/01", fecha); //Año Nuevo
      //  LocalDate feriado2 = LocalDate.parse("2022/02/28", fecha); //Carnaval
//        LocalDate feriado3 = LocalDate.parse("01/03/2022", fecha); //Carnaval
//        LocalDate feriado4 = LocalDate.parse("15/04/2022", fecha); //Viernes Santo
//        LocalDate feriado5 = LocalDate.parse("01/05/2022", fecha); //Día del Trabajador
//        LocalDate feriado6 = LocalDate.parse("24/05/2022", fecha); //Batalla de Pichincha
//        LocalDate feriado7 = LocalDate.parse("10/08/2022", fecha); //Primer Grito de Independencia
//        LocalDate feriado8 = LocalDate.parse("09/10/2022", fecha); //Independencia de Guayaquil
//        LocalDate feriado9 = LocalDate.parse("02/11/2022", fecha); //Día de los Difuntos
//        LocalDate feriado10 = LocalDate.parse("03/11/2022", fecha); //Independencia de Cuenca
//        LocalDate feriado11 = LocalDate.parse("25/12/2022", fecha); //Navidad

        
      //  if(feriado1.equals(prestamo) || feriado1.equals(entrega)){
        //    return "No hay atencion por feriado de 'Año Nuevo' ";
    //    }else if(feriado2.equals(prestamo) || feriado2.equals(entrega)){
        //    return "No hay atencion por feriado de 'Carnaval'";
//        }else if(feriado3.equals(prestamo) || feriado3.equals(entrega)){
//            return "No hay atencion por feriado de 'Carnaval'";
//        }else if(feriado4.equals(prestamo) || feriado4.equals(entrega)){
//            return "No hay atencion por feriado 'Viernes Santo'";
//        }else if(feriado5.equals(prestamo) || feriado5.equals(entrega)){
//            return "No hay atencion por feriado del 'Día del Trabajador'";
//        }else if(feriado6.equals(prestamo) || feriado6.equals(entrega)){
//            return "No hay atencion por feriado de la 'Batalla de Pichincha'";
//        }else if(feriado7.equals(prestamo) || feriado7.equals(entrega)){
//            return "No hay atencion por feriado del 'Primer Grito de Independencia'";
//        }else if(feriado8.equals(prestamo) || feriado8.equals(entrega)){
//            return "No hay atencion por feriado de la 'Independencia de Guayaquil'";
//        }else if(feriado9.equals(prestamo) || feriado9.equals(entrega)){
//            return "No hay atencion por feriado del 'Día de los Difuntos'";
//        }else if(feriado10.equals(prestamo) || feriado10.equals(entrega)){
//            return "No hay atencion por feriado de la 'Independencia de Cuenca'";
//        }else if(feriado11.equals(prestamo) || feriado11.equals(entrega)){
//            return "No hay atencion por feriado de 'Navidad'";
                       
//        //Horario de atencion
//        }else if(hora1.isBefore(horaprestamo)|| hora2.isBefore(horaprestamo)||
//                hora1.isAfter(horaentrega)|| hora2.isAfter(horaentrega))//verifica si esta fecha es anterior a la fecha especificada.         
//        {            
//        return "No es el horario de atencion";
        
        //Fines de semana
       // }else if (String.valueOf(prestamo.getDayOfWeek()).equals("SATURDAY")
       // || String.valueOf(prestamo.getDayOfWeek()).equals("SUNDAY")
       // || String.valueOf(entrega.getDayOfWeek()).equals("SUNDAY")
      //  || String.valueOf(entrega.getDayOfWeek()).equals("SATURDAY")){
         //   return "No se realizan préstamos ni devoluciones en fin de semana";
   
            
       //} else if (prestamo.equals(entrega)) {
           // mensaje = "Gracias por venir" ;
      //  } else if (entrega.equals(prestamo.plusDays(1))) {
          //  mensaje = "Por favor devolver el material bibliografico a tiempo";
      //  } else {
        //    mensaje = "Usted será sancionado";
     //   }      
                
 //  return mensaje;
      
    }   

