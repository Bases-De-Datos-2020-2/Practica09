package northwind.service;

import northwind.model.Empleado;
import northwind.respository.EmpleadoRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepostory empleadoRepostory;

    public List<Empleado> getEmpleados() throws Exception {
        return empleadoRepostory.getEmpleados();
    }


    public Empleado getEmpleado(Integer idEmpleado) throws Exception {
        return  empleadoRepostory.getEmpleado(idEmpleado);

    }

    public boolean deleteEmpleado(Integer idEmpleado) throws Exception {
        return  empleadoRepostory.deleteEmpleado(idEmpleado);
    }

    public Empleado insertEmpleado(Empleado empleado) throws Exception {
      return   empleadoRepostory.insertEmpleado(empleado);
    }

    public Empleado updateEmpleado(Integer idEmpleado, Empleado empleado) throws Exception {
        return empleadoRepostory.updateEmpleado(idEmpleado,empleado);
    }
}
