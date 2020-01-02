package org.sid;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServelet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if (action== null) {
			request.setAttribute("vue", "vAcceuil.jsp");
		} else {
			if (action.equals("Scolarite")) {
				
				request.setAttribute("vue", "vAcceuil.jsp");

			} else if (action.equals("Clubs")) {
				request.setAttribute("vue", "vAcceuil.jsp");
				

			} else if (action.equals("DemanderService")) {
							request.setAttribute("vue", "vFormDemande.jsp");
				
			} else if (action.equals("Demandes")) {
			
					request.setAttribute("vue", "vDemandes.jsp");
					
			}
		}
		this.getServletContext().getRequestDispatcher("/gabarit.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		if (action == null) {
			request.setAttribute("vue", "vAcceuil.jsp");
		}else{
			if (action.equals("EnvoyerDemande")) {
				request.setAttribute("vue", "vDemandes.jsp");

			} else if (action.equals("")) {
				request.setAttribute("vue", "vAcceuil.jsp");
			}
		}
	
		this.getServletContext().getRequestDispatcher("/gabarit.jsp").forward(request, response);
	
	}

}
