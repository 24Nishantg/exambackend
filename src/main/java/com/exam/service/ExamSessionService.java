package com.exam.service;

//public class ExamSessionService {
//}

//package com.exam.service;

import com.exam.model.exam.ExamSession;
import com.exam.model.User;
import com.exam.model.exam.Quiz;
import java.util.List;

public interface ExamSessionService {
    ExamSession createSession(ExamSession examSession);
    ExamSession updateSession(ExamSession examSession);
    ExamSession getSession(Long sessionId);
    List<ExamSession> getSessionsByUser(User user);
    List<ExamSession> getSessionsByQuiz(Quiz quiz);
}
