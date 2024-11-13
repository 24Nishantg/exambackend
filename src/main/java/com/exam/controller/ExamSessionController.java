package com.exam.controller;

//public class ExamSessionController {
//}

//package com.exam.controller;

import com.exam.model.exam.ExamSession;
import com.exam.model.User;
import com.exam.model.exam.Quiz;
import com.exam.service.ExamSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exam-session")
public class ExamSessionController {

    @Autowired
    private ExamSessionService examSessionService;

    @PostMapping("/create")
    public ExamSession createSession(@RequestBody ExamSession examSession) {
        return examSessionService.createSession(examSession);
    }

    @PutMapping("/update")
    public ExamSession updateSession(@RequestBody ExamSession examSession) {
        return examSessionService.updateSession(examSession);
    }

    @GetMapping("/{id}")
    public ExamSession getSession(@PathVariable Long id) {
        return examSessionService.getSession(id);
    }

    @GetMapping("/user/{userId}")
    public List<ExamSession> getSessionsByUser(@PathVariable Long userId) {
        User user = new User();
        user.setId(userId);
        return examSessionService.getSessionsByUser(user);
    }

    @GetMapping("/quiz/{quizId}")
    public List<ExamSession> getSessionsByQuiz(@PathVariable Long quizId) {
        Quiz quiz = new Quiz();
        quiz.setqId(quizId);
        return examSessionService.getSessionsByQuiz(quiz);
    }
}
