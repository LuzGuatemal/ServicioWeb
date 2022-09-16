/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coneccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class UserDAO {
   
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res, cedula1;
    String msj;
    int r = 0;
    User u = new User();

    public String GuardarLogin(int cedula, String contrasenia, String cargo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "insert into login (cedula,contrasenia,cargo) values(?,?,?)";
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cedula);
            ps.setString(2, contrasenia);
            ps.setString(3, cargo);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "REGISTRADO CON ÉXITO";
            } else {
                msj = "ERROR";
            }

        } catch (Exception e) {

        }
        return msj;
    }

    public int ValidarLogin(int cedula, String contrasenia, String cargo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int validar = 0;
        String sql = "select * from  login where cedula=? and contrasenia=? and cargo=?";
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cedula);
            ps.setString(2, contrasenia);
            ps.setString(3, cargo);
            rs = ps.executeQuery();
            if (rs.absolute(1)) {
                validar = 1;
            } else {
                validar = 0;
            }
        } catch (Exception e) {

        }
        return validar;
    }
    
    public String AgregarUsuario(int cedulaU, String nombresU, String apellidosU, String correoU, int fk_carreraId, int fk_nivelAcademicoId,
            int fk_formacionAcademicaId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "insert into usuarios (cedulaU,nombresU,apellidosU,correoU,fk_carreraId,fk_nivelAcademicoId,fk_formacionAcademicaId)"
                + "values(?,?,?,?,?,?,?)";
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cedulaU);
            ps.setString(2, nombresU);
            ps.setString(3, apellidosU);
            ps.setString(4, correoU);
            ps.setInt(5, fk_carreraId);
            ps.setInt(6, fk_nivelAcademicoId);
            ps.setInt(7, fk_formacionAcademicaId);

            res = ps.executeUpdate();
            if (res == 1) {
                msj = "GUARDADO CON ÉXITO";
            } else {
                msj = "ERROR";
            }

        } catch (Exception e) {

        }
        return msj;
    }

    public List ListadoUsuarios() {
        List<User> datos = new ArrayList<>();
        String sql = "select * from usuarios inner join carrera on usuarios.fk_carreraId=carrera.pk_carreraId \n"
                + "inner join nivelacademico on usuarios.fk_nivelAcademicoId=nivelacademico.pk_nivelAcademicoId\n"
                + "inner join formacionacademica on usuarios.fk_formacionAcademicaId=formacionacademica.pk_formacionAcademicaId order by pk_usuariosId"
                + ";";
        try {

            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setPk_usuariosId(rs.getInt("pk_usuariosId"));
                u.setCedulaU(rs.getInt("cedulaU"));
                u.setNombresU(rs.getString("nombresU"));
                u.setApellidosU(rs.getString("apellidosU"));
                u.setCorreoU(rs.getString("correoU"));
                u.setCarreraId(rs.getString("carreraId"));
                u.setNivelAcademicoId(rs.getString("nivelAcademicoId"));
                u.setFormacionAcademicaId(rs.getString("formacionAcademicaId"));

                datos.add(u);
            }
        } catch (Exception e) {

        }
        return datos;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User ListadoUsuariosId(int pk_UsuarioId) {

        String sql = "select * from usuarios inner join carrera on usuarios.fk_carreraId=carrera.pk_carreraId inner join nivelacademico on usuarios.fk_nivelAcademicoId=nivelacademico.pk_nivelAcademicoId inner join formacionacademica on usuarios.fk_formacionAcademicaId=formacionacademica.pk_formacionAcademicaId where pk_usuariosId=" + pk_UsuarioId;
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setPk_usuariosId(rs.getInt("pk_usuariosId"));
                u.setCedulaU(rs.getInt("cedulaU"));
                u.setNombresU(rs.getString("nombresU"));
                u.setApellidosU(rs.getString("apellidosU"));
                u.setCorreoU(rs.getString("correoU"));
                u.setCarreraId(rs.getString("carreraId"));
                u.setNivelAcademicoId(rs.getString("nivelAcademicoId"));
                u.setFormacionAcademicaId(rs.getString("formacionAcademicaId"));
            }
        } catch (Exception e) {
        }
        return u;
    }

    public String AgregarLibro(String codigoM, String autorM, String edicionM, String anioPublicacionM, String tituloM,
            String ciudadM, String paisM, String editorialM, String registroISBNM, int nroPaginasM, String estadoM,
            int nroEjemplaresM, String incluyeCd, String tipoM, String tiempoVigenciaM) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "insert into libros (codigoM,autorM,edicionM,anioPublicacionM,tituloM,ciudadM,paisM,editorialM,registroISBNM,nroPaginasM,estadoM,nroEjemplaresM,incluyeCd,tipoM,tiempoVigenciaM) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.setString(1, codigoM);
            ps.setString(2, autorM);
            ps.setString(3, edicionM);
            ps.setString(4, anioPublicacionM);
            ps.setString(5, tituloM);
            ps.setString(6, ciudadM);
            ps.setString(7, paisM);
            ps.setString(8, editorialM);
            ps.setString(9, registroISBNM);
            ps.setInt(10, nroPaginasM);
            ps.setString(11, estadoM);
            ps.setInt(12, nroEjemplaresM);
            ps.setString(13, incluyeCd);
            ps.setString(14, tipoM);
            ps.setString(15, tiempoVigenciaM);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "GUARDADO CON ÉXITO";
            } else {
                msj = "ERROR";
            }

        } catch (Exception e) {

        }
        return msj;
    }

    public List Listadolibros() {
        List<User> datos = new ArrayList<>();
        String sql = "select * from libros";

        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setPk_librosId(rs.getInt("pk_librosId"));
                u.setCodigoM(rs.getString("codigoM"));
                u.setAutorM(rs.getString("autorM"));
                u.setEdicionM(rs.getString("edicionM"));
                u.setAnioPublicacionM(rs.getString("anioPublicacionM"));
                u.setTituloM(rs.getString("tituloM"));
                u.setCiudadM(rs.getString("ciudadM"));
                u.setPaisM(rs.getString("paisM"));
                u.setEditorialM(rs.getString("editorialM"));
                u.setRegistroISBNM(rs.getString("registroISBNM"));
                u.setNroPaginasM(rs.getInt("nroPaginasM"));
                u.setEstadoM(rs.getString("estadoM"));
                u.setNroEjemplaresM(rs.getInt("nroEjemplaresM"));
                u.setIncluyeCd(rs.getString("incluyeCd"));
                u.setTipoM(rs.getString("tipoM"));
                u.setTiempoVigenciaM(rs.getString("tiempoVigenciaM"));

                datos.add(u);
            }
        } catch (Exception e) {

        }
        return datos;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public User ListadoLibrosId(int pk_LibroId) {

        String sql = "select * from libros where pk_librosId=" + pk_LibroId;
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                u.setCodigoM(rs.getString("codigoM"));
                u.setAutorM(rs.getString("autorM"));
                u.setEdicionM(rs.getString("edicionM"));
                u.setAnioPublicacionM(rs.getString("anioPublicacionM"));
                u.setTituloM(rs.getString("tituloM"));
                u.setCiudadM(rs.getString("ciudadM"));
                u.setPaisM(rs.getString("paisM"));
                u.setEditorialM(rs.getString("editorialM"));
                u.setRegistroISBNM(rs.getString("registroISBNM"));
                u.setNroPaginasM(rs.getInt("nroPaginasM"));
                u.setEstadoM(rs.getString("estadoM"));
                u.setNroEjemplaresM(rs.getInt("nroEjemplaresM"));
                u.setIncluyeCd(rs.getString("incluyeCd"));
                u.setTipoM(rs.getString("tipoM"));
                u.setTiempoVigenciaM(rs.getString("tiempoVigenciaM"));
            }
        } catch (Exception e) {

        }
        return u;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String AgregarPrestamo(String fechaPrestamo, int fkUsuarioId, int fklibrosId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "insert into prestamos (fechaprestamoP,fk_usuariosId,fk_librosId) values(?,?,?)";
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaPrestamo);
            ps.setInt(2, fkUsuarioId);
            ps.setInt(3, fklibrosId);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "GUARDADO CON ÉXITO";
            } else {
                msj = "ERROR";
            }
        } catch (Exception e) {

        }
        return msj;
    }
    
    public List ListadoPrestamos() {
        List<User> datos = new ArrayList<>();
        String sql = "select * from prestamos inner join usuarios on prestamos.fk_usuariosId= usuarios.pk_usuariosId inner join carrera on usuarios.fk_carreraId=carrera.pk_carreraId inner join nivelacademico on usuarios.fk_nivelAcademicoId=nivelacademico.pk_nivelAcademicoId inner join formacionacademica on usuarios.fk_formacionAcademicaId=formacionacademica.pk_formacionAcademicaId inner join libros on prestamos.fk_librosId=libros.pk_librosId order by pk_prestamosId";
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setPk_prestamosId(rs.getInt("pk_prestamosId"));
                u.setFechaPrestamo(rs.getString("fechaprestamoP"));

                u.setPk_usuariosId(rs.getInt("pk_usuariosId"));
                u.setCedulaU(rs.getInt("cedulaU"));
                u.setNombresU(rs.getString("nombresU"));
                u.setApellidosU(rs.getString("apellidosU"));
                u.setCorreoU(rs.getString("correoU"));
                u.setCarreraId(rs.getString("carreraId"));
                u.setNivelAcademicoId(rs.getString("nivelAcademicoId"));
                u.setFormacionAcademicaId(rs.getString("formacionAcademicaId"));

                u.setPk_librosId(rs.getInt("pk_librosId"));
                u.setCodigoM(rs.getString("codigoM"));
                u.setAutorM(rs.getString("autorM"));
                u.setEdicionM(rs.getString("edicionM"));
                u.setAnioPublicacionM(rs.getString("anioPublicacionM"));
                u.setTituloM(rs.getString("tituloM"));
                u.setCiudadM(rs.getString("ciudadM"));
                u.setPaisM(rs.getString("paisM"));
                u.setEditorialM(rs.getString("editorialM"));
                u.setRegistroISBNM(rs.getString("registroISBNM"));
                u.setNroPaginasM(rs.getInt("nroPaginasM"));
                u.setEstadoM(rs.getString("estadoM"));
                u.setNroEjemplaresM(rs.getInt("nroEjemplaresM"));
                u.setIncluyeCd(rs.getString("incluyeCd"));
                u.setTipoM(rs.getString("tipoM"));
                u.setTiempoVigenciaM(rs.getString("tiempoVigenciaM"));

                datos.add(u);
            }
        } catch (Exception e) {
        }
        return datos;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User ListadoPrestamosId(int pk_UsuarioId) {

        String sql = "select * from prestamos inner join usuarios on prestamos.fk_usuariosId= usuarios.pk_usuariosId inner join carrera on usuarios.fk_carreraId=carrera.pk_carreraId inner join nivelacademico on usuarios.fk_nivelAcademicoId=nivelacademico.pk_nivelAcademicoId inner join formacionacademica on usuarios.fk_formacionAcademicaId=formacionacademica.pk_formacionAcademicaId inner join libros on prestamos.fk_librosId=libros.pk_librosId where pk_usuariosId=" + pk_UsuarioId;
        try {
            con = conex.getConnection1();
            // con=conex.getjdbcConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                u.setPk_prestamosId(rs.getInt("pk_prestamosId"));
                u.setFechaPrestamo(rs.getString("fechaprestamoP"));
                u.setPk_librosId(rs.getInt("fk_librosId"));

                u.setPk_usuariosId(rs.getInt("pk_usuariosId"));
                u.setCedulaU(rs.getInt("cedulaU"));
                u.setNombresU(rs.getString("nombresU"));
                u.setApellidosU(rs.getString("apellidosU"));
                u.setCorreoU(rs.getString("correoU"));
                u.setCarreraId(rs.getString("carreraId"));
                u.setNivelAcademicoId(rs.getString("nivelAcademicoId"));
                u.setFormacionAcademicaId(rs.getString("formacionAcademicaId"));

                u.setPk_librosId(rs.getInt("pk_librosId"));
                u.setCodigoM(rs.getString("codigoM"));
                u.setAutorM(rs.getString("autorM"));
                u.setEdicionM(rs.getString("edicionM"));
                u.setAnioPublicacionM(rs.getString("anioPublicacionM"));
                u.setTituloM(rs.getString("tituloM"));
                u.setCiudadM(rs.getString("ciudadM"));
                u.setPaisM(rs.getString("paisM"));
                u.setEditorialM(rs.getString("editorialM"));
                u.setRegistroISBNM(rs.getString("registroISBNM"));
                u.setNroPaginasM(rs.getInt("nroPaginasM"));
                u.setEstadoM(rs.getString("estadoM"));
                u.setNroEjemplaresM(rs.getInt("nroEjemplaresM"));
                u.setIncluyeCd(rs.getString("incluyeCd"));
                u.setTipoM(rs.getString("tipoM"));
                u.setTiempoVigenciaM(rs.getString("tiempoVigenciaM"));

//                u.setFechaingreso(rs.getString("fechaingreso"));
            }
        } catch (Exception e) {

        }
        return u;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String AgregarDevolucion(String fechaDevolucion, int fkPrestamoId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql = "insert into devoluciones (fechadevolucionD,fk_prestamosId)values(?,?)";
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaDevolucion);
            ps.setInt(2, fkPrestamoId);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "GUARDADO CON ÉXITO";
            } else {
                msj = "ERROR";
            }
        } catch (Exception e) {
        }
        return msj;
    }
   
    public List ListadoDevoluciones() {
        List<User> datos = new ArrayList<>();
        String sql = "select * from devoluciones inner join prestamos on devoluciones.fk_prestamosId=prestamos.pk_prestamosId inner join usuarios on prestamos.fk_usuariosId= usuarios.pk_usuariosId inner join carrera on usuarios.fk_carreraId=carrera.pk_carreraId inner join nivelacademico on usuarios.fk_nivelAcademicoId=nivelacademico.pk_nivelAcademicoId inner join formacionacademica on usuarios.fk_formacionAcademicaId=formacionacademica.pk_formacionAcademicaId inner join libros on prestamos.fk_librosId=libros.pk_librosId order by pk_devolucionesId";
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setPk_devolucionesId(rs.getInt("pk_devolucionesId"));
                u.setFechaDevolucion(rs.getString("fechadevolucionD"));
                u.setPk_prestamosId(rs.getInt("pk_prestamosId"));
                u.setFechaPrestamo(rs.getString("fechaprestamoP"));

                u.setPk_usuariosId(rs.getInt("pk_usuariosId"));
                u.setCedulaU(rs.getInt("cedulaU"));
                u.setNombresU(rs.getString("nombresU"));
                u.setApellidosU(rs.getString("apellidosU"));
                u.setCorreoU(rs.getString("correoU"));
                u.setCarreraId(rs.getString("carreraId"));
                u.setNivelAcademicoId(rs.getString("nivelAcademicoId"));
                u.setFormacionAcademicaId(rs.getString("formacionAcademicaId"));

                u.setPk_librosId(rs.getInt("pk_librosId"));
                u.setCodigoM(rs.getString("codigoM"));
                u.setAutorM(rs.getString("autorM"));
                u.setEdicionM(rs.getString("edicionM"));
                u.setAnioPublicacionM(rs.getString("anioPublicacionM"));
                u.setTituloM(rs.getString("tituloM"));
                u.setCiudadM(rs.getString("ciudadM"));
                u.setPaisM(rs.getString("paisM"));
                u.setEditorialM(rs.getString("editorialM"));
                u.setRegistroISBNM(rs.getString("registroISBNM"));
                u.setNroPaginasM(rs.getInt("nroPaginasM"));
                u.setEstadoM(rs.getString("estadoM"));
                u.setNroEjemplaresM(rs.getInt("nroEjemplaresM"));
                u.setIncluyeCd(rs.getString("incluyeCd"));
                u.setTipoM(rs.getString("tipoM"));
                u.setTiempoVigenciaM(rs.getString("tiempoVigenciaM"));

                datos.add(u);
            }
        } catch (Exception e) {
        }
        return datos;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String EditarUsuario(int pk_usuariosId, int cedulaU, String nombresU, String apellidosU, String correoU, int fk_carreraId, int fk_nivelAcademicoId, int fk_formacionAcademicaId) {

        String sql = "update usuarios set pk_usuariosId=?,cedulaU=?,nombresU=?,apellidosU=?,correoU=?,fk_carreraId=?,fk_nivelAcademicoId=?,fk_formacionAcademicaId=? where pk_usuariosId=" + pk_usuariosId;
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pk_usuariosId);
            ps.setInt(2, cedulaU);
            ps.setString(3, nombresU);
            ps.setString(4, apellidosU);
            ps.setString(5, correoU);
            ps.setInt(6, fk_carreraId);
            ps.setInt(7, fk_nivelAcademicoId);
            ps.setInt(8, fk_formacionAcademicaId);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "ACTUALIZADO CON ÉXITO";
            } else {
                msj = "ERROR";
            }
        } catch (Exception e) {
        }
        return msj;

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String EditarLibro(int pk_librosId, String codigoM, String autorM, String edicionM, String anioPublicacionM, String tituloM,
            String ciudadM, String paisM, String editorialM, String registroISBNM, int nroPaginasM, String estadoM,
            int nroEjemplaresM, String incluyeCd, String tipoM, String tiempoVigenciaM) {

        String sql = "update libros set pk_librosId=?,codigoM=?,autorM=?,edicionM=?,anioPublicacionM=?,tituloM=?,ciudadM=?,paisM=?,editorialM=?,registroISBNM=?,nroPaginasM=?,estadoM=?,nroEjemplaresM=?,incluyeCd=?,tipoM=?,tiempoVigenciaM=? where pk_librosId=" + pk_librosId;
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pk_librosId);
            ps.setString(2, codigoM);
            ps.setString(3, autorM);
            ps.setString(4, edicionM);
            ps.setString(5, anioPublicacionM);
            ps.setString(6, tituloM);
            ps.setString(7, ciudadM);
            ps.setString(8, paisM);
            ps.setString(9, editorialM);
            ps.setString(10, registroISBNM);
            ps.setInt(11, nroPaginasM);
            ps.setString(12, estadoM);
            ps.setInt(13, nroEjemplaresM);
            ps.setString(14, incluyeCd);
            ps.setString(15, tipoM);
            ps.setString(16, tiempoVigenciaM);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "ACTUALIZADO CON ÉXITO";
            } else {
                msj = "ERROR";
            }
        } catch (Exception e) {

        }
        return msj;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public User DeleteUsuario(int pk_UsuarioId) {

        String sql = "delete  from usuarios where pk_usuariosId=" + pk_UsuarioId;
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return u;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public User DeleteLibro(int pk_LibroId) {

        String sql = "delete  from libros where pk_librosId=" + pk_LibroId;
        try {
            con = conex.getConnection1();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return u;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
