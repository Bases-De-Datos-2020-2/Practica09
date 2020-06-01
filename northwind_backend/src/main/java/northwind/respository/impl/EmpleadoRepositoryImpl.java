package northwind.respository.impl;


import northwind.config.DBConfig;
import northwind.model.Empleado;
import northwind.model.Provedor;
import northwind.model.Region;
import northwind.respository.EmpleadoRepostory;
import northwind.respository.ProvedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
@PropertySource("classpath:application.queries.properties")
public class EmpleadoRepositoryImpl implements EmpleadoRepostory {

    //Se inyecta configuracion de la base de datos
    @Autowired
    private DBConfig dbConfig;
    //Objeto que ayuda a cargar configuracion
    @Autowired
    private Environment env;
    //Objeto para crear la conexión
    private Connection connection;
    //Objeto para executar queries
    private Statement stmt;
    //Objeto para prepara un query para ejecución
    PreparedStatement ps;

    @Override
    public List<Empleado> getEmpleados() throws Exception {
        //Leo query a ejecutar
        String query = env.getProperty("empleados");
        //Preparo respuesta
        List  empleadoList = new ArrayList<Empleado>();

        try {

            //Genero conexion
            connection = dbConfig.dataSource().getConnection();
            //Preparo base de datos para una instruccion
            stmt = connection.createStatement();
            //Ejecuto Query
            ResultSet rs = stmt.executeQuery(query);
            //Itero resultado
            while (rs.next()) {
                //Mappeo objetos de la base renglon por renglon

                Empleado empleado = new Empleado(
                        rs.getInt("id_empleado")
                        ,rs.getString("nombre")
                        ,rs.getString("apellido")
                        ,rs.getString("titulo")
                        ,rs.getString("titulo_de_cortesia")
                        ,rs.getString("fecha_nacimiento")
                        ,rs.getString("fecha_contratacion")
                        ,rs.getString("telefono_casa")
                        ,rs.getString("extension")
                        ,rs.getString("email")
                        ,rs.getString("foto")
                        ,rs.getString("notas")
                        ,rs.getInt("reporta_a_empleado")
                        ,rs.getString("path_foto")
                        , new Region(
                                rs.getInt("id_region")
                        ,rs.getString("direccion")
                        ,rs.getString("ciudad")
                        ,rs.getString("codigo_postal")
                        ,rs.getString("region")));

                //agrego objeto a resultado
                empleadoList.add(empleado);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return empleadoList;

    }

    @Override
    public Empleado getEmpleado(Integer idEmpleado) throws Exception {
        //Leo query a ejecutar
        String query = env.getProperty("empleado");
        //Preparo respuesta
      Empleado empleado = null;
        try {
            //Genero conexion
            connection = dbConfig.dataSource().getConnection();
            //Preparo base de datos para una instruccion
            ps =  connection.prepareStatement(query);
            ps.setInt(1,idEmpleado);
            //Ejecuto Query
            ResultSet rs = ps.executeQuery();
            //Itero resultado
            while (rs.next()) {
                //Mappeo objetos de la base renglon por renglon
                empleado = new Empleado(
                        rs.getInt("id_empleado")
                        ,rs.getString("nombre")
                        ,rs.getString("apellido")
                        ,rs.getString("titulo")
                        ,rs.getString("titulo_de_cortesia")
                        ,rs.getString("fecha_nacimiento")
                        ,rs.getString("fecha_contratacion")
                        ,rs.getString("telefono_casa")
                        ,rs.getString("extension")
                        ,rs.getString("email")
                        ,rs.getString("foto")
                        ,rs.getString("notas")
                        ,rs.getInt("reporta_a_empleado")
                        ,rs.getString("path_foto")
                        , new Region(
                        rs.getInt("id_region")
                        ,rs.getString("direccion")
                        ,rs.getString("ciudad")
                        ,rs.getString("codigo_postal")
                        ,rs.getString("region")));


            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return empleado;
    }

    @Override
    public Empleado insertEmpleado(Empleado empleado) throws Exception {
        String query = env.getProperty("insertEmpleado");
        try {
            connection = dbConfig.dataSource().getConnection();
            ps = connection.prepareStatement(query);
            //apellido
            ps.setString(1,empleado.getApellido());
            /*nombre*/
            ps.setString(2,empleado.getNombre());
            /*titulo*/
            ps.setString(3,empleado.getTitulo());
            /*titulo_de_cortesia*/
            ps.setString(4,empleado.getTituloDeCortesia());
            /*fecha_nacimiento*/
            ps.setString(5,empleado.getFechaNacimiento());
            /*fecha_contratacion*/
            ps.setString(6,empleado.getFechaContratacion());
            /*telefono_casa*/
            ps.setString(7,empleado.getTelefonoCasa());
            /*extension*/
            ps.setString(8,empleado.getExtension());
            /*foto*/
            ps.setString(9,empleado.getFoto());
            /*notas*/
            ps.setString(10,empleado.getNotas());
            /*reporta_empleado*/
            ps.setInt(11,empleado.getReportaEmpleado());
            /*path_foto*/
            ps.setString(12,empleado.getFoto());
            /*id_region*/
            ps.setInt(13,empleado.getRegion().getIdRegion());
            /*email*/
            ps.setString(14, empleado.getEmail());

            connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return empleado;

    }

    @Override
    public Empleado updateEmpleado(Integer idEmpleado, Empleado empleado) throws Exception {
        String query = env.getProperty("updateProvedor");
        try {
            connection = dbConfig.dataSource().getConnection();
            ps = connection.prepareStatement(query);

            //apellido
            ps.setString(1,empleado.getApellido());
            /*nombre*/
            ps.setString(2,empleado.getNombre());
            /*titulo*/
            ps.setString(3,empleado.getTitulo());
            /*titulo_de_cortesia*/
            ps.setString(4,empleado.getTituloDeCortesia());
            /*fecha_nacimiento*/
            ps.setString(5,empleado.getFechaNacimiento());
            /*fecha_contratacion*/
            ps.setString(6,empleado.getFechaContratacion());
            /*telefono_casa*/
            ps.setString(7,empleado.getTelefonoCasa());
            /*extension*/
            ps.setString(8,empleado.getExtension());
            /*foto*/
            ps.setString(9,empleado.getFoto());
            /*notas*/
            ps.setString(10,empleado.getNotas());
            /*reporta_empleado*/
            ps.setInt(11,empleado.getReportaEmpleado());
            /*path_foto*/
            ps.setString(12,empleado.getFoto());
            /*id_region*/
            ps.setInt(13,empleado.getRegion().getIdRegion());
            /*email*/
            ps.setString(14, empleado.getEmail());
            /* id_empleado*/
            ps.setInt(15,idEmpleado);
            ps.executeUpdate();
            connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return empleado;
    }

    @Override
    public boolean deleteEmpleado(Integer idEmpleado) throws Exception {
        String query = env.getProperty("deleteEmpleado");
        boolean ok = false;
        try {
            connection = dbConfig.dataSource().getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1,idEmpleado);
            ps.executeUpdate();
            ok = true;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ok;


    }
}
