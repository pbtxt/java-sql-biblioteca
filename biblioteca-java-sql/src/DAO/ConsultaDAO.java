package DAO;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import negocio.Autor;
import negocio.Consulta;
import negocio.Material;
import negocio.MaterialAutor;
import negocio.Material_Bibliografico;
import negocio.Prestamo;

public class ConsultaDAO {

    /*
    SELECT m.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, clasificacion
    FROM material m, autor a, material_autor ma, bibliografico b
    WHERE m.id_material = ma.id_material AND a.id_autor = ma.id_autor AND b.id_material = m.id_material;

     */
    public static ArrayList<Consulta> getListConsulta(String au) {
        ArrayList<Consulta> listConsulta = new ArrayList<Consulta>();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        Material material = null;
        Autor autor = null;
        MaterialAutor ma = null;
        Material_Bibliografico mb = null;
        Consulta consulta = null;
        //   String sql = "SELECT m.id_material, nom_material, f_publicacion, a.id_autor, nom_autor, nacionalidad, clasificacion FROM material m, autor a, material_autor ma, bibliografico b WHERE m.id_material = ma.id_material AND a.id_autor = ma.id_autor AND b.id_material = m.id_material AND nom_autor='"+au+"';";

        try {
            pst = cn.prepareStatement(au);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                consulta = new Consulta();

                consulta.setId_material(Long.valueOf(rs.getString(1)));
                consulta.setTitulo(rs.getString(2));
                consulta.setF_publicacion(rs.getString(3));
                consulta.setId_autor(Long.valueOf(rs.getString(4)));
                consulta.setNom_autor(rs.getString(5));
                consulta.setNacionalidad(rs.getString(6));
                consulta.setClasificacion(rs.getString(7));

                if (listConsulta.isEmpty()) {
                    listConsulta.add(0, consulta);
                } else {
                    listConsulta.add(consulta);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        }
        return listConsulta;
    }

    public static ArrayList<Consulta> getListCopia(String sql) {
        ArrayList<Consulta> listConsulta = new ArrayList<Consulta>();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        Consulta consulta = null;
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                consulta = new Consulta();

                consulta.setId_copia(Long.valueOf(rs.getString(1)));
                consulta.setTitulo(rs.getString(2));
                consulta.setEstado_fisico(rs.getString(3));
                consulta.setId_material(Long.valueOf(rs.getString(4)));

                if (listConsulta.isEmpty()) {
                    listConsulta.add(0, consulta);
                } else {
                    listConsulta.add(consulta);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        }
        return listConsulta;

    }

    public String contarCopiasMaterial(Long id_copia) {
        String a = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        Consulta consulta = null;
        String sql = "SELECT COUNT (id_copia) "
                + "FROM copia "
                + "WHERE id_material =" + id_copia;
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }

        return a;
    }

    public Long consultarIdMaterial(Long id_reserva) {
        Long a = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT id_material "
                + "FROM reserva "
                + "WHERE id_reserva =" + id_reserva;
        try {
            pst = cn.prepareStatement(sql);
            System.out.println("1");
            ResultSet rs = pst.executeQuery();
            System.out.println("2");
            while (rs.next()) {
                a = Long.valueOf(rs.getString(1));
            }
            System.out.println("3");

        } catch (SQLException e) {
            System.out.println("Error en el consultar material");
        }
        return a;
    }

    public Long consultarMaterialBibliografico(Long id_reserva) {

        Long b = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "SELECT Bibliografico.id_material FROM Reserva, Material ,Bibliografico "
                + "WHERE Reserva.id_material = Material.id_material "
                + "AND Material.id_material = Bibliografico.id_material "
                + "AND Bibliografico.id_material =" + id_reserva;
        try {
            pst = cn.prepareStatement(sql);
            System.out.println("1");
            ResultSet rs = pst.executeQuery();
            System.out.println("2");
            while (rs.next()) {
                b = Long.valueOf(rs.getString(1));
            }
            System.out.println("3");

        } catch (SQLException e) {
            System.out.println("Error en el consultar material");
        }
        return b;
    }

    public static ArrayList<Prestamo> buscarPrestamo(Long id_prestamo) {
        ArrayList<Prestamo> listaPrestamo = new ArrayList<Prestamo>();
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        Prestamo prestamo;
        System.out.println("" + id_prestamo);
        String sql = "SELECT id_prestamo, ti_prestamo, est_prestamo, f_inicio, f_limite, id_reserva \n"
                + "FROM prestamo\n"
                + "WHERE id_prestamo=" + id_prestamo;
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                prestamo = new Prestamo();
                prestamo.setNum_prestamo(Long.valueOf(rs.getString(1)));
                prestamo.setTi_prestamo(rs.getString(2));
                prestamo.setEst_prestamo(rs.getString(3));
                prestamo.setNum_reserva(Long.valueOf(rs.getString(6)));
                if (listaPrestamo.isEmpty()) {
                    listaPrestamo.add(0, prestamo);
                } else {
                    listaPrestamo.add(prestamo);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        }
        return listaPrestamo;
    }

    public String descargarPrestamo(Long id_prestamo) {

        String a = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "Update prestamo Set f_devolucion = NOW()"
                + "where id_prestamo=" + id_prestamo;
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            a = "Guardado";
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }

        return a;
    }

    public int obtenerDiasPrestamo(Long id_prestamo) {
        int b = 0;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "select date_part('day', now() - f_limite)"
                + "from prestamo "
                + "where id_prestamo=" + id_prestamo;
        try {
            pst = cn.prepareStatement(sql);
            System.out.println("1 antes del query");
            ResultSet rs = pst.executeQuery();
            System.out.println("2");
            System.out.println("antes del while");
            while (rs.next()) {
                b = Integer.parseInt(rs.getString(1));
            }
            System.out.println("3");

        } catch (SQLException e) {
            System.out.println("Error en el consultar material");
        }
        return b;
    }

    public String pagarMulta(Long id_prestamo) {

        String a = null;
        ConexionBD cc = new ConexionBD();
        Connection cn = cc.getConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE multa "
                + "SET est_multa='N', f_pago=now()"
                + "WHERE id_prestamo =" + id_prestamo;
        try {
            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            a = "Guardado";
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }

        return a;
    }

}
