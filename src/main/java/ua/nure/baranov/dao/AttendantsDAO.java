package ua.nure.baranov.dao;

import java.util.List;

import ua.nure.baranov.entity.User;

public interface AttendantsDAO {

	List<User> getAttendantsOfTeam(int teamId);

}
