package com.java.controller;

import java.sql.SQLException;
import java.util.Map;

import com.java.service.ManagerLoginView;
import com.java.service.ManagerService;
import com.java.service.ManagerServiceImpl;

public class ManagerController {

	private ManagerService mservice = new ManagerServiceImpl();
	private ManagerLoginView managerloginview = new ManagerLoginView();

	public void managerlogin() {

		int result = -1;
		Map<String, String> request = managerloginview.ManagerLogin();

		try {
			result = mservice.managerlogin(request.get("manager_code"), request.get("manager_pwd"));

			switch (result) {
			case 0:
				System.out.println("로그인 성공");
				managerloginview.list();
				break;
			case 1:
				System.out.println("관리자 코드가 존재하지 않습니다.");
				managerlogin();
			case 2:
				System.out.println("패스워드가 일치하지 않습니다.");
				managerlogin();
			}

		} catch (SQLException e) {
			System.out.println("서비스장애로 로그인이 불가능합니다.");
		}

	}

}
