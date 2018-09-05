package yonnysanchez;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Inquilino;

/**
 * Servlet implementation class YonnySanchez
 */
@WebServlet("/inquilino")
public class YonnySanchez extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static List<Inquilino> inquilinos = new ArrayList<Inquilino>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public YonnySanchez() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//System.out.println("::: Entro al metdo GET :::");
		// TODO Auto-generated method stub
		response.getWriter().
		append("Inquilinos Registrados: ").
		append(inquilinos.toString()).
		append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("::: Entro al metodo POST :::");
		
		Inquilino nuevoInquilino = new Inquilino();
		nuevoInquilino.setIdInquilino(inquilinos.size() + 1);
		nuevoInquilino.setNombre(request.getParameter("nombre").toUpperCase());
		nuevoInquilino.setApPaterno(request.getParameter("apPaterno").toUpperCase());
		nuevoInquilino.setApMaterno(request.getParameter("apMaterno").toUpperCase());
		nuevoInquilino.setEdad(Integer.parseInt(request.getParameter("edad")));
		nuevoInquilino.setSexo(request.getParameter("sexo").toUpperCase());
		nuevoInquilino.setInmueble(request.getParameter("inmueble").toUpperCase());
		nuevoInquilino.setDireccion(request.getParameter("direccion").toUpperCase());
		nuevoInquilino.setFechaIngreso(LocalDate.now());
		
		System.out.println("Nuevo Inquilino: ");
		System.out.println(nuevoInquilino);
		inquilinos.add(nuevoInquilino);
		
	}

}
