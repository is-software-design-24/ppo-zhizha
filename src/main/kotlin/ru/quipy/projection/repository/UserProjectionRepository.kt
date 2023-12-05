package ru.quipy.projection.repository

import org.springframework.data.mongodb.repository.MongoRepository
import ru.quipy.projection.view.UserView
import java.util.*

interface UserProjectionRepository : MongoRepository<UserView.User, UUID>