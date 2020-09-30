package ru.otus.otuskotlin.user.backend.logics

import ru.otus.otuskotlin.common.cor.cor
import ru.otus.otuskotlin.user.backend.common.UserContext
import ru.otus.otuskotlin.user.backend.common.UserContextStatus
import ru.otus.otuskotlin.user.backend.common.models.UserModel

class UserDeleteChain {

    suspend fun exec(context: UserContext) = chain.exec(context.apply {

    })

    companion object {
        private val chain = cor<UserContext> {
            // Инициализация пайплайна
            exec { status = UserContextStatus.RUNNING }

            // Валидация

            // Обработка и работа с БД

            // Подготовка ответа
            exec {
                responseUser = UserModel(
                        id = requestUserId,
                        fname = "Ivan",
                        mname = "Ivanovich",
                        lname = "Ivanov",
                )
                status = UserContextStatus.SUCCESS
            }
        }
    }
}
