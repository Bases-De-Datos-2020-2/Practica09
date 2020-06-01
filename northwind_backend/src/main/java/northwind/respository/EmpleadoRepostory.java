package northwind.respository;

import northwind.model.Empleado;


import java.util.List;

public interface EmpleadoRepostory {

    /**
     * Obten todos los registros de la tabla Empleado
     * @return
     */
    List<Empleado> getEmpleados() throws Exception;

    /**
     * Obtiene la informacion de un Empleado
     * @param idEmpleado
     * @return
     */
    Empleado getEmpleado(Integer idEmpleado) throws Exception;

    /**
     * Inserta una nuevo Empleadoa la base de datos
     * @param empleado
     * @return
     */
    Empleado insertEmpleado(Empleado empleado) throws Exception;

    /**
     * Actualiza un Empleado a la base de datos
     * @param idEmpleado
     * @return
     */
    Empleado updateEmpleado(Integer idEmpleado, Empleado empleado) throws Exception;

    /**
     * Elimina un Empleado de la base de datos
     * @param idEmpleado
     * @return
     */
    boolean deleteEmpleado(Integer idEmpleado) throws Exception;
}
