package com.java.controller;

import java.sql.SQLException;
import java.util.Map;

import com.java.dto.CinemaVO;
import com.java.service.CinemaService;
import com.java.service.CinemaServiceImpl;
import com.java.view.CinemaView;

public class CinemaController {
	
	private CinemaService cinemaService = new CinemaServiceImpl();
	private CinemaView view = new CinemaView();
	
	public void ManagerSearchCinema() {
		Map<String, String> controllerRequest = view.CinemaSearch();

		try {
			cinemaService.getCinemaList(controllerRequest.get("cn"),controllerRequest.get("cinema_name"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void ManagerRegistCinema() {
		Map<String, CinemaVO> controllerRequest = view.CinemaRegist();

		try {
			cinemaService.regist(controllerRequest.get("cinema"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// ** 영화 수정부분 선생님 여쭤보기 **//
	public void ManagerModifyCinema() {
		Map<String, CinemaVO> controllerRequest = view.CinemaModify();
		
		try {
			cinemaService.modify(controllerRequest.get("cinema"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

		

		}

	public void ManagerRemoveCinema() {
		Map<String, String> controllerRequest = view.CinemaRegist();

		try {
			cinemaService.remove(controllerRequest.remove("cinema_identical_number"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
