package com.issac.tieba.mapper;

import com.issac.tieba.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
}
