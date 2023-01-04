package com.java.controller;

import java.sql.SQLException;
import java.util.Map;

import com.java.dto.MovieVO;
import com.java.service.MovieService;
import com.java.service.MovieServiceImpl;
import com.java.view.MovieView;

public class MovieController {
	
	private MovieService movieService = new MovieServiceImpl();
	private MovieView view = new MovieView();
	
	public void MovieSearch() {
		Map<String, String> controllerRequest = view.MovieSearch();

		try {
			movieService.getMovieList(controllerRequest.get("mt"), controllerRequest.get("movie_title"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void MovieRegist() {



		Map<String, MovieVO> controllerRequest = view.MovieRegist();

		try {
			movieService.regist(controllerRequest.get("movie"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//** 영화 수정부분 선생님 여쭤보기 **//	
	public void MovieMoidfy() {
		
		Map<String, MovieVO> controllerRequest = view.MovieModify();
		
		try {
			movieService.modify(controllerRequest.get("movie"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		
	}

	public void MovieRemove() {

		Map<String, String> controllerRequest = view.MovieRemove();

		try {
			movieService.remove(controllerRequest.remove("movie_identical_number"));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	
}
