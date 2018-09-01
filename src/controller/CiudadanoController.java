package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;

import model.Ciudadano;

/**
 * Servlet implementation class CiudadanoController
 */
@WebServlet("/ciudadano")
public class CiudadanoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static List<Ciudadano> ciudadanos = 
			new ArrayList<Ciudadano>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CiudadanoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entro a metodo GET");

		response.getWriter()
		.append("Ciudadanos Registrados: ")
		.append(ciudadanos.toString())
		.append(request.getContextPath());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(":::: ENTRO A doPost ::::");
		
		Ciudadano nuevoCiudadano = new Ciudadano();
		
nuevoCiudadano.setIdCiudadano(ciudadanos.size() + 1);
nuevoCiudadano.setNombre(request.getParameter("nombre"));
nuevoCiudadano.setApellidos(request.getParameter("apellidos"));
nuevoCiudadano.setEdad(Integer.parseInt(request.getParameter("edad")));
nuevoCiudadano.setSexo(request.getParameter("sexo"));
nuevoCiudadano.setDelegacion(request.getParameter("delegacion"));
		
		System.out.println("Ciudadano registrado:" + nuevoCiudadano);		
		ciudadanos.add(nuevoCiudadano);
	}

}
