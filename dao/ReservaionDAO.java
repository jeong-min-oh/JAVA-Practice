package com.java.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.dto.MemberVO;
import com.java.dto.ReservationVO;

public interface ReservationDAO {
	List<ReservationVO> selectSearchReservationList(MemberVO member, String reservationDate) throws SQLException;

	ReservationVO selectReservationByReservation_number(String reservation_number) throws SQLException; // ¿¹¸Å¹øÈ£ Á¶È¸

	void insertReservation(ReservationVO reservation) throws SQLException;

	void updateReservation(ReservationVO reservation) throws SQLException; 

	void deleteReservation(String reservation_number)throws SQLException;
	
	

}
