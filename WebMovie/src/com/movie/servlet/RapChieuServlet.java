package com.movie.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.Controller.ZRapChieu;
import com.movie.beans.RapChieu;


@WebServlet("/RapChieuServlet")
public class RapChieuServlet extends HttpServlet {
	ZRapChieu rapChieu=new ZRapChieu();
      	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		String url = "";
		String command=request.getParameter("command");
		try {
			switch(command) {
			case "delete":
				rapChieu.deleteRapChieu((Integer.parseInt(id)));
				url = "/Views/TrangQuanLyRapChieu.jsp";
				break;
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/*String tenDanhMuc = request.getParameter("tenDanhMuc");
		String moTa = request.getParameter("moTa");
		String command=request.getParameter("command");
		String id = request.getParameter("id");*/
		String command=request.getParameter("command");
		String id_TrangThai=request.getParameter("idRapChieu");
		String diaDiem=request.getParameter("diaDiem");
		String tenRap=request.getParameter("tenRap");
		String soLuongRap=request.getParameter("soLuongRap");
		String url = "";


		try {
			switch(command) {
			case "update":
					rapChieu.UpdateRapChieu(new RapChieu((Integer.parseInt(id_TrangThai)),diaDiem, tenRap,(Integer.parseInt(soLuongRap))));
					url = "/Views/TrangQuanLyRapChieu.jsp";
					break;
			case "insert":
				rapChieu.InsertRapChieu(new RapChieu((Integer.parseInt(id_TrangThai)), diaDiem,tenRap,(Integer.parseInt(soLuongRap))));
						url = "/Views/TrangQuanLyRapChieu.jsp";
						break;
		
			}

			

		} catch (Exception ex) {

		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);

	}

}
