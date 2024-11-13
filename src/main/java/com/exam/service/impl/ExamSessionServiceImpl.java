package com.exam.service.impl;

//public class ExamSessionServiceImpl {
//}
//package com.exam.service.impl;

import com.exam.model.exam.ExamSession;
import com.exam.model.User;
import com.exam.model.exam.Quiz;
import com.exam.repo.ExamSessionRepository;
import com.exam.service.ExamSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExamSessionServiceImpl implements ExamSessionService {

    @Autowired
    private ExamSessionRepository examSessionRepository;

    @Override
    public ExamSession createSession(ExamSession examSession) {
        return examSessionRepository.save(examSession);
    }

    @Override
    public ExamSession updateSession(ExamSession examSession) {
        return examSessionRepository.save(examSession);
    }

    @Override
    public ExamSession getSession(Long sessionId) {
        return examSessionRepository.findById(sessionId).orElse(null);
    }

    @Override
    public List<ExamSession> getSessionsByUser(User user) {
        return examSessionRepository.findByUser(user);
    }

    @Override
    public List<ExamSession> getSessionsByQuiz(Quiz quiz) {
        return examSessionRepository.findByQuiz(quiz);
    }
}
