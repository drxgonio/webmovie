package com.movie.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.Controller.ZDanhMucPhim;
import com.movie.Controller.ZPhongChieu;
import com.movie.beans.PhongChieu;


@WebServlet("/PhongChieuServlet")
public class PhongChieuServlet extends HttpServlet {
	ZPhongChieu phongchieu = new ZPhongChieu();
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		String url = "";
		String command=request.getParameter("command");
		try {
			switch(command) {
			case "delete":
				phongchieu.deletePhongChieu((Integer.parseInt(id)));
				url = "/Views/TrangQuanLyPhongChieu.jsp";
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
		String tenPhongChieu = request.getParameter("tenPhongChieu");
		String soGheNgoi = request.getParameter("soGheNgoi");
		String tenRap = request.getParameter("tenRap");
		String id = request.getParameter("idRapChieu");
		String command=request.getParameter("command");
		String url = "";
		try {
			switch(command) {
			case "update":
				phongchieu.UpdatePhongChieu(new PhongChieu((Integer.parseInt(id)),tenPhongChieu, (Integer.parseInt(soGheNgoi)),tenRap));
					url = "/Views/TrangQuanLyPhongChieu.jsp";
					break;
			case "insert":
						phongchieu.InsertPhongChieu(new PhongChieu(tenPhongChieu, (Integer.parseInt(soGheNgoi)),tenRap));
						url = "/Views/TrangQuanLyPhongChieu.jsp";
						break;
		
			}

			

		} catch (Exception ex) {

		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);

	}

}
