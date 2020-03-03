package com.psych.game.repositories;

import com.psych.game.model.GameMode;
import com.psych.game.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
    //JPA PROVIDES ITS OWN QUERY LANGAUGE - ABSTRACT OUT THE DIFFERENCES
    //JPA-ORM,SO WE CAN CODE DB STUFF IN JAVA
    //ABSTRACT OUT THE DIFFERNCES B/W DB BACKENDS
    //todo
    @Query(value = "select *from questions where gameMode =:gameMode order by RAND() LIMIT 1",nativeQuery = true)
    Question getRandomQuestion(GameMode gameMode);
}
