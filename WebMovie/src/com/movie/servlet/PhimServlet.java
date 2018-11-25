package com.movie.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movie.Controller.ZPhim;
import com.movie.beans.Phim;


@WebServlet("/PhimServlet")
public class PhimServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ZPhim phim=new ZPhim();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String command=request.getParameter("command");
		String id=request.getParameter("id");
		String url = "";
		try {
			switch(command)
			{	
			case "delete":
				phim.deletePhim(Integer.parseInt(id));
				url = "/Views/TrangQuanLyPhim.jsp";
				break;
				
			
			}
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String command=request.getParameter("command");
		String tieuDe=request.getParameter("tieuDe");
		String daoDien=request.getParameter("daoDien");
		String doTuoi=request.getParameter("doTuoi");
		String quocGia=request.getParameter("quocGia");
		String dienVien=request.getParameter("dienVien");
		String urlTrailer=request.getParameter("urlTrailer");
		String linkAnh=request.getParameter("linkAnh");
		
		String moTa=request.getParameter("moTa");
		String giaVe=request.getParameter("giaVe");
		
		String danhMuc=request.getParameter("danhMuc");
		String doDai=request.getParameter("doDai");
		String trangThai=request.getParameter("trangThai");
		
		String url = "";


		try {
			switch(command) {
			case "update":
				phim.updatePhim(new Phim((Integer.parseInt(id)),tieuDe, daoDien,moTa,urlTrailer,(Integer.parseInt(doDai)),quocGia,(Integer.parseInt(giaVe)),linkAnh,(Integer.parseInt(doTuoi)),danhMuc,trangThai));
				
					url = "/Views/TrangQuanLyPhim.jsp";
					break;
			case "insert":
				phim.InsertPhim(new Phim(tieuDe, daoDien,moTa,urlTrailer,(Integer.parseInt(doDai)),quocGia,(Integer.parseInt(giaVe)),linkAnh,(Integer.parseInt(doTuoi)),danhMuc,trangThai));
						url = "/Views/TrangQuanLyPhim.jsp";
						break;
		
			}

			

		} catch (Exception ex) {

		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
