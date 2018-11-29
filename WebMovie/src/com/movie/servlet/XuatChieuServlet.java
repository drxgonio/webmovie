package com.movie.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.movie.Controller.ZXuatChieu;
import com.movie.beans.RapChieu;
import com.movie.beans.XuatChieu;



@WebServlet("/XuatChieuServlet")
public class XuatChieuServlet extends HttpServlet {

	ZXuatChieu xuatchieu=new ZXuatChieu();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		String url = "";
		String command=request.getParameter("command");
		try {
			switch(command) {
			case "delete":
				xuatchieu.deleteXuatChieu((Integer.parseInt(id)));
				url = "/Views/TrangXuatChieu.jsp";
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
		String command=request.getParameter("command");
		String idPhim=request.getParameter("idPhim");
		String tieuDe=request.getParameter("tieuDe");
		String tenPhongChieu=request.getParameter("tenPhongChieu");
		String gioChieu=request.getParameter("gioChieu");
		String idPhongChieu=request.getParameter("idPhongChieu");
		String id=request.getParameter("id");
		String url = "";

		try {
			switch(command) {
			case "update":
				xuatchieu.UpdateXuatChieu(new XuatChieu((Integer.parseInt(id)),gioChieu));
					url = "/Views/TrangXuatChieu.jsp";
					break;
			case "insert":
				xuatchieu.InsertXuatChieu(new XuatChieu(tieuDe, gioChieu,tenPhongChieu));
						url = "/Views/TrangXuatChieu.jsp";
						break;
		
			}

			

		} catch (Exception ex) {

		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
