package com.dio.apprepositories.data.repositories

import com.dio.apprepositories.core.RemoteException
import com.dio.apprepositories.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)

        } catch (ex:HttpException){
            throw RemoteException(ex.message ?: "Não foi possivel fazer a busca no momento!")
        }

    }
}