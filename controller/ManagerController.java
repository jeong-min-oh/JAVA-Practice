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
				System.out.println("�α��� ����");
				managerloginview.list();
				break;
			case 1:
				System.out.println("������ �ڵ尡 �������� �ʽ��ϴ�.");
				managerlogin();
			case 2:
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
				managerlogin();
			}

		} catch (SQLException e) {
			System.out.println("������ַ� �α����� �Ұ����մϴ�.");
		}

	}

}
