package com.dio.apprepositories.data.repositories

import com.dio.apprepositories.data.model.Repo
import com.dio.apprepositories.data.services.GitHubService
import kotlinx.coroutines.flow.flow

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {
    override suspend fun listRepositories(user: String) = flow<List<Repo>> {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }
}