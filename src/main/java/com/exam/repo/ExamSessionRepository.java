package com.exam.repo;

//public class ExamSessionRepository {
//}


//package com.exam.repository;

import com.exam.model.exam.ExamSession;
import com.exam.model.User;
import com.exam.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExamSessionRepository extends JpaRepository<ExamSession, Long> {
    List<ExamSession> findByUser(User user);
    List<ExamSession> findByQuiz(Quiz quiz);
    List<ExamSession> findByUserAndQuiz(User user, Quiz quiz);
}
