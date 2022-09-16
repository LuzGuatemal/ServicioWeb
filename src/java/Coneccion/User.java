/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coneccion;

/**
 *
 * @author User
 */
public class User {
    int pk_librosId;
    int pk_usuariosId;
    int pk_prestamosId;
    int pk_devolucionesId;
     
    int cedula, cedulaU, fk_carreraId, fk_nivelAcademicoId, fk_formacionAcademicaId, nroPaginasM, nroEjemplaresM;
    String contasenia;
    String cargo;

    String nombresU;
    String apellidosU;
    String correoU;
    
    String carreraId;
    String nivelAcademicoId;
    String formacionAcademicaId;
    
    String codigoM;
    String autorM;
    String edicionM;
    String anioPublicacionM;
    String tituloM;
    String ciudadM;
    String paisM;
    String editorialM;
    String registroISBNM;
    String estadoM;
    String incluyeCd;
    String tipoM;
    String tiempoVigenciaM;
    String fechaPrestamo;
    String fechaDevolucion;

    public int getPk_librosId() {
        return pk_librosId;
    }

    public void setPk_librosId(int pk_librosId) {
        this.pk_librosId = pk_librosId;
    }

    public int getPk_usuariosId() {
        return pk_usuariosId;
    }

    public void setPk_usuariosId(int pk_usuariosId) {
        this.pk_usuariosId = pk_usuariosId;
    }

    public int getPk_prestamosId() {
        return pk_prestamosId;
    }

    public void setPk_prestamosId(int pk_prestamosId) {
        this.pk_prestamosId = pk_prestamosId;
    }

    public int getPk_devolucionesId() {
        return pk_devolucionesId;
    }

    public void setPk_devolucionesId(int pk_devolucionesId) {
        this.pk_devolucionesId = pk_devolucionesId;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedulaU() {
        return cedulaU;
    }

    public void setCedulaU(int cedulaU) {
        this.cedulaU = cedulaU;
    }

    public int getFk_carreraId() {
        return fk_carreraId;
    }

    public void setFk_carreraId(int fk_carreraId) {
        this.fk_carreraId = fk_carreraId;
    }

    public int getFk_nivelAcademicoId() {
        return fk_nivelAcademicoId;
    }

    public void setFk_nivelAcademicoId(int fk_nivelAcademicoId) {
        this.fk_nivelAcademicoId = fk_nivelAcademicoId;
    }

    public int getFk_formacionAcademicaId() {
        return fk_formacionAcademicaId;
    }

    public void setFk_formacionAcademicaId(int fk_formacionAcademicaId) {
        this.fk_formacionAcademicaId = fk_formacionAcademicaId;
    }

    public int getNroPaginasM() {
        return nroPaginasM;
    }

    public void setNroPaginasM(int nroPaginasM) {
        this.nroPaginasM = nroPaginasM;
    }

    public int getNroEjemplaresM() {
        return nroEjemplaresM;
    }

    public void setNroEjemplaresM(int nroEjemplaresM) {
        this.nroEjemplaresM = nroEjemplaresM;
    }

    public String getContasenia() {
        return contasenia;
    }

    public void setContasenia(String contasenia) {
        this.contasenia = contasenia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombresU() {
        return nombresU;
    }

    public void setNombresU(String nombresU) {
        this.nombresU = nombresU;
    }

    public String getApellidosU() {
        return apellidosU;
    }

    public void setApellidosU(String apellidosU) {
        this.apellidosU = apellidosU;
    }

    public String getCorreoU() {
        return correoU;
    }

    public void setCorreoU(String correoU) {
        this.correoU = correoU;
    }

    public String getCarreraId() {
        return carreraId;
    }

    public void setCarreraId(String carreraId) {
        this.carreraId = carreraId;
    }

    public String getNivelAcademicoId() {
        return nivelAcademicoId;
    }

    public void setNivelAcademicoId(String nivelAcademicoId) {
        this.nivelAcademicoId = nivelAcademicoId;
    }

    public String getFormacionAcademicaId() {
        return formacionAcademicaId;
    }

    public void setFormacionAcademicaId(String formacionAcademicaId) {
        this.formacionAcademicaId = formacionAcademicaId;
    }

    public String getCodigoM() {
        return codigoM;
    }

    public void setCodigoM(String codigoM) {
        this.codigoM = codigoM;
    }

    public String getAutorM() {
        return autorM;
    }

    public void setAutorM(String autorM) {
        this.autorM = autorM;
    }

    public String getEdicionM() {
        return edicionM;
    }

    public void setEdicionM(String edicionM) {
        this.edicionM = edicionM;
    }

    public String getAnioPublicacionM() {
        return anioPublicacionM;
    }

    public void setAnioPublicacionM(String anioPublicacionM) {
        this.anioPublicacionM = anioPublicacionM;
    }

    public String getTituloM() {
        return tituloM;
    }

    public void setTituloM(String tituloM) {
        this.tituloM = tituloM;
    }

    public String getCiudadM() {
        return ciudadM;
    }

    public void setCiudadM(String ciudadM) {
        this.ciudadM = ciudadM;
    }

    public String getPaisM() {
        return paisM;
    }

    public void setPaisM(String paisM) {
        this.paisM = paisM;
    }

    public String getEditorialM() {
        return editorialM;
    }

    public void setEditorialM(String editorialM) {
        this.editorialM = editorialM;
    }

    public String getRegistroISBNM() {
        return registroISBNM;
    }

    public void setRegistroISBNM(String registroISBNM) {
        this.registroISBNM = registroISBNM;
    }

    public String getEstadoM() {
        return estadoM;
    }

    public void setEstadoM(String estadoM) {
        this.estadoM = estadoM;
    }

    public String getIncluyeCd() {
        return incluyeCd;
    }

    public void setIncluyeCd(String incluyeCd) {
        this.incluyeCd = incluyeCd;
    }

    public String getTipoM() {
        return tipoM;
    }

    public void setTipoM(String tipoM) {
        this.tipoM = tipoM;
    }

    public String getTiempoVigenciaM() {
        return tiempoVigenciaM;
    }

    public void setTiempoVigenciaM(String tiempoVigenciaM) {
        this.tiempoVigenciaM = tiempoVigenciaM;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    
}
