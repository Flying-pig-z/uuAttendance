package com.flyingpig.service;

import com.flyingpig.common.PageBean;
import com.flyingpig.dataobject.dto.CourseStudent;
import com.flyingpig.dataobject.dto.StudentAttendanceNow;
import com.flyingpig.dataobject.entity.CourseAttendance;
import com.flyingpig.dataobject.dto.CourseTableInfo;
import com.flyingpig.dataobject.dto.ResultAttendance;
import com.flyingpig.dataobject.vo.CourseAttendanceAddVO;
import com.flyingpig.dataobject.vo.CourseAttendanceQueryVO;
import com.flyingpig.dataobject.vo.SignInVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseAttendanceService {
    List<CourseTableInfo> getCourseTableInfoByWeekAndUserId(Integer studentId, Integer week, Integer year);

    void updateAttendanceStatus(CourseAttendance attendance);

    ResultAttendance getWhoNoCheck(Integer courseId);

    List<ResultAttendance> getresultAttendanceListByCourseId(Integer courseId);

    StudentAttendanceNow getStudentAttendanceNow(String studentId);

    void addCourseAttendances(CourseAttendanceAddVO courseAttendanceAddVO, String teacherId);

    boolean signIn(String userId, SignInVO signInVO);

    List<CourseStudent> getStudentByTeauserIdAndsemesterAndCourseName(String teaUserid, Integer semester, String courseName);

    PageBean pageCourseAttendance(CourseAttendanceQueryVO courseAttendanceQueryVO);

    PageBean pageStudentAttendanceByteaUserIdAndCourseInfoAndStudentNo(Integer teaUserid, String courseName, Integer semester, String studentNo, Integer pageNo, Integer pageSize);
}
