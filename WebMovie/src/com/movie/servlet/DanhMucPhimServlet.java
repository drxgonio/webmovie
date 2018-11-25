package com.movie.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.movie.Controller.ZDanhMucPhim;
import com.movie.beans.DanhMucPhim;

@WebServlet("/DanhMucPhimServlet")
public class DanhMucPhimServlet extends HttpServlet {

	ZDanhMucPhim danhmucphim = new ZDanhMucPhim();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		String url = "";
		String command=request.getParameter("command");
		try {
			switch(command) {
			case "delete":
				danhmucphim.deleteDanhMucPhim((Integer.parseInt(id)));
				url = "/Views/TrangDanhMucPhim.jsp";
				break;
			}

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String tenDanhMuc = request.getParameter("tenDanhMuc");
		String moTa = request.getParameter("moTa");
		String command=request.getParameter("command");
		String id = request.getParameter("id");
		String url = "";


		try {
			switch(command) {
			case "update":
					danhmucphim.UpdateDanhMucPhim(new DanhMucPhim((Integer.parseInt(id)),tenDanhMuc, moTa));
					url = "/Views/TrangDanhMucPhim.jsp";
					break;
			case "insert":
						danhmucphim.InsertDanhMucPhim(new DanhMucPhim(tenDanhMuc, moTa));
						url = "/Views/TrangDanhMucPhim.jsp";
						break;
		
			}

			

		} catch (Exception ex) {

		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);

	}

}
